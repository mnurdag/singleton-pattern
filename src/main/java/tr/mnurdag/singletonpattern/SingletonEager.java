package tr.mnurdag.singletonpattern;

public class SingletonEager {

    public static SingletonEager instance = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return instance;
    }

    public void doSomething() {
        // this is where actual code is written
    }

}
