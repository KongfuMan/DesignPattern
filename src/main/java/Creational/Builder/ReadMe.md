假设一个user class:
```
public class User {

    private final String firstName;     // 必传参数
    private final String lastName;      // 必传参数
    private final int age;              // 可选参数
    private final String phone;         // 可选参数
    private final String address;       // 可选参数
}
```
在这个类中，有些参数是必要的，而有些参数是非必要的。就好比在注册用户时，用户的姓和名是必填的，而年龄、手机号和家庭地址等是非必需的。那么问题就来了，如何创建这个类的对象呢？

一种可行的方案就是实用构造方法。第一个构造方法只包含两个必需的参数，第二个构造方法中，增加一个可选参数，第三个构造方法中再增加一个可选参数，依次类推，直到构造方法中包含了所有的参数。
```
    public User(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }

    public User(String firstName, String lastName, int age) {
        this(firstName, lastName, age, "");
    }

    public User(String firstName, String lastName, int age, String phone) {
        this(firstName, lastName, age, phone, "");
    }

    public User(String firstName, String lastName, int age, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }
```

这样做的好处只有一个：可以成功运行。但是弊端很明显：

参数较少的时候问题还不大，一旦参数多了，代码可读性就很差，并且难以维护。
对调用者来说也很麻烦。如果我只想多传一个address参数，还必需给age、phone设置默认值。而且调用者还会有这样的困惑：我怎么知道第四个String类型的参数该传address还是phone？
第二种解决办法就出现了，我们同样可以根据JavaBean的习惯，设置一个空参数的构造方法，然后为每一个属性设置setters和getters方法。就像下面一样：

```
public class User {

    private String firstName;     // 必传参数
    private String lastName;      // 必传参数
    private int age;              // 可选参数
    private String phone;         // 可选参数
    private String address;       // 可选参数

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
```

这种方法看起来可读性不错，而且易于维护。作为调用者，创建一个空的对象，然后只需传入我感兴趣的参数。那么缺点呢？也有两点：

对象会产生不一致的状态。当你想要传入5个参数的时候，你必需将所有的setXX方法调用完成之后才行。然而一部分的调用者看到了这个对象后，以为这个对象已经创建完毕，就直接使用了，
其实User对象并没有创建完成。
****User****类是可变的了，不可变类所有好处都不复存在。

```
public class User {

    private final String firstName;     // 必传参数
    private final String lastName;      // 必传参数
    private final int age;              // 可选参数
    private final String phone;         // 可选参数
    private final String address;       // 可选参数

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
```
