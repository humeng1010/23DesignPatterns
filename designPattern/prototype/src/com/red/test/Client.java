package com.red.test;

/**
 * 如果克隆对象中含有引用对象,则被克隆对象与克隆对象中的引用对象是同一个(地址是同一份),如果想要深度克隆那么需要使用对象的序列化与反序列化,见test1
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建原型对象
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);
        System.out.println(citation);//Citation{student=Student{name='张三'}}

        //克隆奖状对象
        Citation citation1 = citation.clone();

        /*citation.setName("张三");
        citation1.setName("李四");*/

        Student student1 = citation1.getStudent();
        student1.setName("李四");
        System.out.println(citation1);//Citation{student=Student{name='李四'}}

        System.out.println(student1 == student);//即student对象还是同一个对象
        citation.show();
        citation1.show();
        /*
            李四 同学在2022年表现优异,特发此奖状鼓励
            李四 同学在2022年表现优异,特发此奖状鼓励
            因为是对象拷贝,所以需要使用深拷贝,见test1包下的代码
         */

    }
}
