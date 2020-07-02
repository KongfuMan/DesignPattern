##Abstract Document Pattern
> The object for javascript as a dynamic language is very flexible, because
extra fields can be added into the object at runtime.

```
class User{
    constructor(){
        this.name="default";
        this.password = "123456";
    }
}

let user = new User();
user["gender"] = "Female";
console.log(user);
```

> Output: User { name: 'default', password: '123456', gender: 'Female' }

