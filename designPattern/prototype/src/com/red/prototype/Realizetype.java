package com.red.prototype;

/**
 * 实现可克隆的接口
 * <p>
 * 一个类实现了Cloneable接口，以向Object.clone()方法指示该方法可以合法地对该类的实例进行逐个字段的复制。
 * <p>
 * 在未实现Cloneable接口的实例上调用 Object 的 clone 方法会导致抛出异常CloneNotSupportedException 。
 * <p>
 * 按照惯例，实现此接口的类应使用公共方法覆盖Object.clone （受保护的）。有关覆盖此方法的详细信息，请参阅Object.clone() 。
 * <p>
 * 请注意，此接口不包含clone方法。因此，不可能仅凭借实现该接口的事实来克隆对象。即使以反射方式调用 clone 方法，也不能保证它会成功。
 */
public class Realizetype implements Cloneable {
    
    public Realizetype() {
        System.out.println("具体原型对象创建完成");
    }

    /**
     * 重写clone方法 并公开 由于克隆出来的就是这个对象本身 所有返回值改为该对象 并强转类型
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (Realizetype) super.clone();
    }
}
