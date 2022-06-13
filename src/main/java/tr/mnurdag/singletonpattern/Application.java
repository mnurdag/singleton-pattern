package tr.mnurdag.singletonpattern;

public class Application {

    public static void main(String[] args) {

        System.out.println("SingletonEager Demonstration");
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println(singletonEager1 == singletonEager2);

        System.out.println();
        System.out.println("SingletonEagerStaticBlock Demonstration:");
        SingletonEagerStaticBlock singletonEagerStaticBlock1 = SingletonEagerStaticBlock.getInstance();
        SingletonEagerStaticBlock singletonEagerStaticBlock2 = SingletonEagerStaticBlock.getInstance();
        System.out.println(singletonEagerStaticBlock1 == singletonEagerStaticBlock2);

        System.out.println();
        System.out.println("SingletonLazyThreadSafe Demonstration:");
        SingletonLazyThreadSafe singletonLazyThreadSafe1 = SingletonLazyThreadSafe.getInstance();
        SingletonLazyThreadSafe singletonLazyThreadSafe2 = SingletonLazyThreadSafe.getInstance();
        System.out.println(singletonLazyThreadSafe1 == singletonLazyThreadSafe2);

        System.out.println();
        System.out.println("SingletonLazyBillPugh Demonstration:");
        SingletonLazyBillPugh singletonLazyBillPugh1 = SingletonLazyBillPugh.getInstance();
        SingletonLazyBillPugh singletonLazyBillPugh2 = SingletonLazyBillPugh.getInstance();
        System.out.println(singletonLazyBillPugh1 == singletonLazyBillPugh2);

    }

}
