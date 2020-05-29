[JAVA设计模式之工厂模式(简单工厂模式+工厂方法模式)](https://blog.csdn.net/jason0539/article/details/23020989)
## Simple Factory
- 简单工厂模式的工厂类一般是使用静态方法，通过接收的参数的不同来返回不同的对象实例。
- 不修改代码的话，是无法扩展的。


## Factory Method
- 一个抽象产品类，可以派生出多个具体产品类。   
- 一个抽象工厂类，可以派生出多个具体工厂类。   
- 每个具体工厂类只能创建一个具体产品类的实例。


## Abstract Factory：(想象一个大工厂有许多的车间，每个车间负责生产某一类的产品)
- 多个抽象产品类，每个抽象产品类可以派生出多个具体产品类。   
- 一个抽象工厂类，可以派生出多个具体工厂类。   
- 每个具体工厂类可以创建多个具体产品类的实例。
   
## 区别：
- 工厂方法模式只有一个抽象产品类，而抽象工厂模式有多个。   
- 工厂方法模式的具体工厂类只能创建一个具体产品类的实例，而抽象工厂模式可以创建多个。
   两者皆可。 
   
## Builder
- Too many fields for a class
- Probably add more fields in the future. Don't want to modify the constructor with params

## StepBuilder
- Advanced Builder pattern. Force user to follow a certain steps to set params
- User cannot call builder without setting all required fields.

## Prototype
- User clone an object (deep copy), especially objects from hierachical class