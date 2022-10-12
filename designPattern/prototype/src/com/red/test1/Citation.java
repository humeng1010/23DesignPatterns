package com.red.test1;

import java.io.Serializable;

public class Citation implements Serializable {
    //    申请序列化的版本号，序列化的版本号必须和反序列化的版本号必须一致才不会出错
    private static final long serialVersionUID = 1;
    private Student student;
    //transient 不被序列化 常用于敏感信息
    private transient String password;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void show() {
        System.out.println(student.getName() + "同学在2022年表现优异,特发此奖状鼓励");
    }

    /*@Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }*/
}
