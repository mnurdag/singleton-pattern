package tr.mnurdag.singletonpattern;

public class SingletonLazyThreadSafe {

    private static SingletonLazyThreadSafe instance;

    private SingletonLazyThreadSafe() {}

    public static SingletonLazyThreadSafe getInstance() {
        if(instance == null) {
            synchronized (SingletonEager.class) {
                if (instance == null)
                    instance = new SingletonLazyThreadSafe();
            }
        }
        return instance;
    }

    public void doSomething() {
        // this is where actual code is written
    }

}
