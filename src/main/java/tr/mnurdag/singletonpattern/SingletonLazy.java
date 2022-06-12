package tr.mnurdag.singletonpattern;

public class SingletonLazy {

    public static SingletonLazy instance;

    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        synchronized (SingletonEager.class) {
            if(instance == null)
                return new SingletonLazy();
            else
                return instance;
        }
    }

    public void doSomething() {
        // this is where actual code is written
    }

}
