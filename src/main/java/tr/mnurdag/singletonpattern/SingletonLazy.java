package tr.mnurdag.singletonpattern;

public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        synchronized (SingletonEager.class) {
            if(instance == null) {
                instance = new SingletonLazy();
                return instance;
            } else {
                return instance;
            }
        }
    }

    public void doSomething() {
        // this is where actual code is written
    }

}
