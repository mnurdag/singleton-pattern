package tr.mnurdag.singletonpattern;

public class Application {

    public static void main(String[] args) {

        System.out.println("SingletonEager Demonstration");
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println(singletonEager1 == singletonEager2);

        System.out.println("\n");
        System.out.println("SingletonEagerStaticBlock Demonstration:");
        SingletonEagerStaticBlock singletonEagerStaticBlock1 = SingletonEagerStaticBlock.getInstance();
        SingletonEagerStaticBlock singletonEagerStaticBlock2 = SingletonEagerStaticBlock.getInstance();
        System.out.println(singletonEagerStaticBlock1 == singletonEagerStaticBlock2);

        System.out.println("\n");
        System.out.println("SingletonLazy Demonstration:");
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        System.out.println(singletonLazy1 == singletonLazy2);

    }

}
