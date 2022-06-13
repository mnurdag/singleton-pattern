package tr.mnurdag.singletonpattern;

public class SingletonLazyBillPugh {

    private SingletonLazyBillPugh() {}

    private static final class InstanceHolder {
        static final SingletonLazyBillPugh instance = new SingletonLazyBillPugh();
    }

    public static SingletonLazyBillPugh getInstance() {
        return InstanceHolder.instance;
    }

    public void doSomething() {
        // this is where actual code is written
    }

}
