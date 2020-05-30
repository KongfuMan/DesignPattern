## Bridge

### Intent
- Decouple an abstraction from its implementation so that the two can vary independently.

- 对于两个独立变化的维度，使用桥接模式再适合不过了。


### Further understanding
对于两个独立变化的维度，可以看做两个独立的集合{A,B,C...} 和 {1,2,3...}.
要求这两个独立的维度可以任意组合，就类似于两个集合的笛卡尔积{{A,1}, {A,2}, {A,3}, {B,1}...}

### Example

假设需要为咖啡店设计一个设计咖啡系统，咖啡有多个属性（维度)，比如:
- 咖啡种类(拿铁，卡布奇诺...)
- size(大中小),
- 添加剂(milk, sugar, ice...)
   
Solution:
- 咖啡种类利用继承关系表示;
- size 使用 bridge pattern，即将咖啡种类和size看做两个独立变化的维度，然后利用Bridge模式将二者进行组合。
- 添加剂使用decorator design pattern


   
   