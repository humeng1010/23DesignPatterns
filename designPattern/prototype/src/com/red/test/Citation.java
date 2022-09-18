package com.red.test;

public class Citation implements Cloneable {

    //三好学生姓名
    /*private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

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

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
