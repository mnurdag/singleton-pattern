# Singleton Pattern
## Advantages of Singleton Pattern
###Saves memory because object is not created at each request. Only single instance is reused again and again.


SingletonEager class is an example for singleton pattern where instance of the class is eagerly initialized at the time
of class loading.

SingletonEagerStaticBlock class is again an example for singleton pattern where instance of the class is eagerly initialized at the time
of class loading, but this time using a static block.

SingletonLazyThreadSafe class is an example for singleton pattern where instance of the class is lazily initialized at the time
of first access to the instance. This is a thread safe implementation.

SingletonLazyThreadSafe class is an example for singleton pattern where instance of the class is lazily initialized at the time
of first access to the instance. This is another thread safe implementation named after Bill Pugh who came up with this solution
when the above thread safe implementation approach failed prior to Java 5.

It is demonstrated in the Application class that the singleton pattern prevents new instance creation and thus, leads to
usage of the same instance again and again. This is how it saves us the memory. Real life examples could be logging or 
datasource classes.