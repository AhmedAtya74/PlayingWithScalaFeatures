## Singleton Object and companion class

Singleton object is an object which is declared by using object keyword instead by class. No object is required to call methods declared inside singleton object.

In scala, there is no static concept. So scala creates a singleton object to provide entry point for your program execution.

If you don't create singleton object, your code will compile successfully but will not produce any output. Methods declared inside Singleton Object are accessible globally. A singleton object can extend classes and traits.

In scala, when you have a class with same name as singleton object, it is called companion class and the singleton object is called companion object.
