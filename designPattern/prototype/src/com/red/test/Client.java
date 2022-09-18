package com.red.test;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建原型对象
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);

        //克隆奖状对象
        Citation citation1 = citation.clone();

        /*citation.setName("张三");
        citation1.setName("李四");*/

        Student student1 = citation1.getStudent();
        student1.setName("李四");

        citation.show();
        citation1.show();
        /*
            李四同学在2022年表现优异,特发此奖状鼓励
            李四同学在2022年表现优异,特发此奖状鼓励
            因为是对象拷贝,所以需要使用深拷贝,见test1包下的代码
         */

    }
}
