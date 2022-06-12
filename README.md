# Singleton Pattern
## Advantages of Singleton Pattern
###Saves memory because object is not created at each request. Only single instance is reused again and again.


SingletonEager class is an example for singleton pattern where instance of the class is eagerly initialized at the time
of class loading.

SingletonEagerStaticBlock class is again an example for singleton pattern where instance of the class is eagerly initialized at the time
of class loading, but this time using a static block.

SingletonLazy class is an example for singleton pattern where instance of the class is lazily initialized at the time
of first access to the instance.

It is demonstrated in the Application class that the singleton pattern prevents new instance creation and thus, leads to
usage of the same instance again and again. This is how it saves us the memory. Real life examples could be logging or 
datasource classes.