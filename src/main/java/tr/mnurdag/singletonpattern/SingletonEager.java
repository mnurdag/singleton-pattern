package tr.mnurdag.singletonpattern;

public class SingletonEager {

    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return instance;
    }

    public void doSomething() {
        // this is where actual code is written
    }

}
