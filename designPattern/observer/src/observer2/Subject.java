package observer2;

import java.util.Observable;

/**
 * 一
 * 被观察者:主题
 */
public class Subject extends Observable {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.setChanged();
        this.notifyObservers();
    }
}