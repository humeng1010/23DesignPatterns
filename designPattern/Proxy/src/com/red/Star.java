package com.red;

/**
 * 明星类 必须实现技能接口
 */
public class Star implements Skill {

    private String name;

    public Star() {
    }

    public Star(String name) {
        this.name = name;
    }


    @Override
    public void jump() {
        System.out.println(this.name + "开始跳舞");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void sing() {
        System.out.println(this.name + "开始唱歌");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
