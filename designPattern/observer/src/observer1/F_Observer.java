package observer1;

/**
 * 第一个观察者
 */
public class F_Observer extends Observer {
    public void update(String msg) {
        System.out.println(F_Observer.class.getName() + " : " + msg);
    }
}