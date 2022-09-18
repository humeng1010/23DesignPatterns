package com.red.test1;

import java.io.Serializable;

public class Citation implements Serializable {
    private Student student;

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
