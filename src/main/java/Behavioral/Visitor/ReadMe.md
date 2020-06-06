##Visitor pattern


###Intent
> Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

为一个class添加一个新的operation，而不去改变原来的类.  
如果系统的数据结构是比较稳定的，但其操作（算法）是易于变化的，那么使用访问者模式是个不错的选择；如果数据结构是易于变化的，则不适合使用访问者模式。

###Liang's thinking process
（1）可以利用组合模式，target class 和 new operation 组合到一个新的class之中。


###Classes
> interface Visitor     
 class ConcreteVisitor （支持的操作，多变）

> Element: has a grader. (visitor可以对数据进行访问)     
ConcreteElement (数据结构，比较稳定)     
Can be a tree

####Scenario:
> 如果老师教学反馈得分大于等于85分、学生成绩大于等于90分，则可以入选成绩优秀奖；如果老师论文数目大于8、学生论文数目大于2，则可以入选科研优秀奖。

####Solution:
> 数据结构比较稳定(Student, Teacher), 但是评奖的标准易变。


###Reference
[设计模式[23]-访问者模式](https://www.jianshu.com/p/cd17bae4e949)



## Real world examples

* [Apache Wicket](https://github.com/apache/wicket) component tree, see [MarkupContainer](https://github.com/apache/wicket/blob/b60ec64d0b50a611a9549809c9ab216f0ffa3ae3/wicket-core/src/main/java/org/apache/wicket/MarkupContainer.java)
* [javax.lang.model.element.AnnotationValue](http://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/AnnotationValue.html) and [AnnotationValueVisitor](http://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/AnnotationValueVisitor.html)
* [javax.lang.model.element.Element](http://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/Element.html) and [Element Visitor](http://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/ElementVisitor.html)
* [java.nio.file.FileVisitor](http://docs.oracle.com/javase/8/docs/api/java/nio/file/FileVisitor.html)
