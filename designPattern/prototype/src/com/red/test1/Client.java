package com.red.test1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 通过对象序列化的方式实现深拷贝
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //创建原型对象
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);


        //序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/humeng/Github/Java/designPattern/designPattern/prototype/src/com/red/test1/a.txt"));
        oos.writeObject(citation);
        oos.close();
        //反序列化对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/humeng/Github/Java/designPattern/designPattern/prototype/src/com/red/test1/a.txt"));
        Citation citation1 = (Citation) ois.readObject();
        ois.close();

        Student student1 = citation1.getStudent();
        student1.setName("李四");

        citation.show();
        citation1.show();


    }
}
