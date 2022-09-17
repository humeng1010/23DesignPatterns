package com.red.simpleFactory2.config_factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * 模式扩展(简单工厂+配置文件 解除耦合)
 */
public class CoffeeFactory {
    //加载配置文件获取配置文件中配置的全类名,并创建该类的对象进行存储
    //1.定义容器对象存储咖啡对象
    private static HashMap<String, Coffee> map = new HashMap<>();

    //2.加载配置文件并创建配置文件的全类名的对象,并存储在容器中(只需要加载一次)
    static {
        //2.1.创建Properties对象
        Properties properties = new Properties();
        //2.2.调用properties对象中的load方法进行配置文件的加载
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(is);
            //从properties中获取全类名并创建对象
            //获取所有的键
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                String className = properties.getProperty((String) key);
                //通过反射技术创建对象
                Class clazz = Class.forName(className);
                //调用该类的无参构造创建对象
                Coffee coffee = (Coffee) clazz.newInstance();
                //将名称和对象存储到容器中
                map.put((String) key, coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 根据名称获取对象
     *
     * @param name
     * @return Coffee
     */
    public static Coffee createCoffee(String name) {
        return map.get(name);
    }
}
