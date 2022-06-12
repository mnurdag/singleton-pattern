package tr.mnurdag.singletonpattern;

public class SingletonEagerStaticBlock {

    public static SingletonEagerStaticBlock instance;

    static {
        instance = new SingletonEagerStaticBlock();
    }

    private SingletonEagerStaticBlock() {}

    public static SingletonEagerStaticBlock getInstance() {
        return instance;
    }

    public void doSomething() {
        // this is where actual code is written
    }

}
