##Composite design pattern

###Intent
```
The composite pattern is a partitioning design pattern. 
The composite pattern describes that a group of objects is to be treated in the
 same way as a single instance of an object. The intent of a composite is 
 to "compose" objects into tree structures to represent part-whole hierarchies. 
 Implementing the composite pattern lets clients treat individual objects and 
 compositions uniformly.
 ```
 
### Liang
其实是了用了递归的思想，比如Linux文件系统，一个dEntry包含了若干child Nodes,

```
class dEntry{
    List<dEntry> children;
    iNode inode;
}
```
 
###Example
Suppose a  
 