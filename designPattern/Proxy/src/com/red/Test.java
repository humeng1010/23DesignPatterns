package com.red;

public class Test {
    public static void main(String[] args) {
        //        1.创建一个类对象，对象的类必须实现接口
        Star star = new Star("明星");
//        为明星对象生成一个代理对象
        Skill star2 = StarAgentProxy.getProxy(star);
        star2.jump();//走代理
        star2.sing();
    }
}
