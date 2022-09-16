# 单例（Singleton）

## 作用:

确保一个类只有一个实例，并提供该实例的全局访问点

## 描述

使用一个私有构造函数、一个私有静态变量以及一个公有静态函数来实现。

私有构造函数保证了不能通过构造函数来创建对象实例，只能通过公有静态函数返回唯一的私有静态变量。

![image](https://cdn.staticaly.com/gh/redyouzi/images-for-blog@main/img01/image.2hjtqxou65i0.png)

## 实现

### 懒汉式-线程不安全

以下实现中，私有静态变量 uniqueInstance 被延迟实例化，这样做的好处是，如果没有用到该类，那么就不会实例化
uniqueInstance，从而节约资源。

这个实现在多线程环境下是不安全的，如果多个线程能够同时进入` if (uniqueInstance == null) `，并且此时 uniqueInstance 为
null，那么会有多个线程执行 `uniqueInstance = new Singleton();` 语句，这将导致实例化多次 uniqueInstance。

```java
package com.red.singleton;

/**
 * 懒汉单例模式
 */
public class SingletonDemo1 {
    private static SingletonDemo1 uniqueInstance;

    //    私有构造器
    private SingletonDemo1() {
    }

    /**
     * 懒汉式创建单例对象
     * @return
     */
    public static SingletonDemo1 getUniqueInstance() {
//        线程不安全,如果有多个线程到达if判断,而且都是null,就会创建出多个实例对象
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonDemo1();
        }
        return uniqueInstance;
    }
}

```

### 饿汉式-线程安全

线程不安全问题主要是由于 uniqueInstance 被实例化多次，采取直接实例化 uniqueInstance 的方式就不会产生线程不安全问题。

但是直接实例化的方式也丢失了延迟实例化带来的节约资源的好处。

```java
package com.red.singleton;

/**
 * 饿汉式
 */
public class SingletonDemo2 {
    /**
     * 2.定义并初始化静态资源
     */
    private static final SingletonDemo2 uniqueInstance = new SingletonDemo2();

    /**
     * 1.私有构造器
     */
    private SingletonDemo2() {

    }

    /**
     * 3.公开的静态方法 获得初始化的对象
     *
     * @return SingletonDemo2
     */
    public static SingletonDemo2 getUniqueInstance() {
        return uniqueInstance;
    }

}

```

### 懒汉式-线程安全

只需要对 getUniqueInstance() 方法加锁，那么在一个时间点只能有一个线程能够进入该方法，从而避免了实例化多次 uniqueInstance。

但是当一个线程进入该方法之后，其它试图进入该方法的线程都必须等待，即使 uniqueInstance
已经被实例化了。这会让线程阻塞时间过长，因此该方法有性能问题，不推荐使用。

```java
package com.red.singleton;

/**
 * 懒汉式-线程安全的
 */
public class SingletonDemo3 {
    private static SingletonDemo3 uniqueInstance;

    /**
     * 1.私有构造器
     */
    private SingletonDemo3() {

    }

    /**
     * 3.公开的静态方法 获得初始化的对象
     *
     * @return SingletonDemo2
     */
    public static synchronized SingletonDemo3 getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonDemo3();
        }
        return uniqueInstance;
    }


}

```

### 双重校验锁-线程安全

uniqueInstance 只需要被实例化一次，之后就可以直接使用了。加锁操作只需要对实例化那部分的代码进行，只有当 uniqueInstance
没有被实例化时，才需要进行加锁。

双重校验锁先判断 uniqueInstance 是否已经被实例化，如果没有被实例化，那么才对实例化语句进行加锁。

```java
package com.red.singleton;

/**
 * 懒汉式-双重校验锁-线程安全
 */
public class SingletonDemo4 {
    private static SingletonDemo4 uniqueInstance;

    /**
     * 1.私有构造器
     */
    private SingletonDemo4() {

    }

    /**
     * 3.公开的静态方法 获得初始化的对象
     *
     * @return SingletonDemo4
     */
    public static SingletonDemo4 getUniqueInstance() {
        //双重校验锁-线程安全
        if (uniqueInstance == null) {
            synchronized (SingletonDemo4.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonDemo4();
                }
            }
        }
        return uniqueInstance;
    }


}

```

考虑下面的实现，也就是只使用了一个 if 语句。在 uniqueInstance == null 的情况下，如果两个线程都执行了 if 语句，那么两个线程都会进入
if 语句块内。虽然在 if 语句块内有加锁操作，但是两个线程都会执行 uniqueInstance = new Singleton();
这条语句，只是先后的问题，那么就会进行两次实例化。因此必须使用双重校验锁，也就是需要使用两个 if 语句：第一个 if 语句用来避免
uniqueInstance 已经被实例化之后的加锁操作，而第二个 if 语句进行了加锁，所以只能有一个线程进入，就不会出现 uniqueInstance ==
null 时两个线程同时进行实例化操作。

```java
    if(uniqueInstance==null){
synchronized (Singleton.class){
        uniqueInstance=new Singleton();
        }
        }
```







