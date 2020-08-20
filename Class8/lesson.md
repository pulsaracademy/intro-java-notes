# Class 8: Interfaces, Abstract Classes, and Polymorphism

Create new Java Project and package.

# Principles of OOP

OOP is **Object-Oriented Programming**. Java is an Object-Oriented Language. It is a feature that not all programming languages have. **OOPS** is about developing an application around its data, i.e. objects which provides the access to their properties and the possible operations in their own way.

Languages that are Object-Oriented:

- Java
- Python
- C++
- JavaScript
- R 
- PHP
- C#

OOPS in Java has a few principles to follow:

### Abstraction

**Abstraction** is a process where you show only “relevant” data and “hide” unnecessary details of an object from the user. 

For example, when you login to your Amazon account online, you enter your user_id and password and press login, what happens when you press login, how the input data sent to amazon server, how it gets verified is all abstracted away from the you.

Examples: abstract classes or interfaces

### Encapsulation

Encapsulation is:

- Binding the data with the code that manipulates it.
- It keeps the data and the code safe from external interference

In **encapsulation**, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class.

Example: **variable and method scope**, getters and setters

### Inheritance

- Inheritance is the mechanism by which an object acquires the some/all properties of another object.
- It supports the concept of hierarchical classification.

We've done this already.

### Polymorphism

**Polymorphism** is the ability of an object to take on many forms. The most common use of **polymorphism** in OOP occurs when a parent class reference is used to refer to a child class object.

We'll discuss this shortly.

Example: `Person p = new Child("Timothy");`

# Interfaces

An `interface` is a completely "**abstract class**" that is used to group related methods with empty bodies:

```java
interface Animal {
	public void makeNoise(); // interface method (does not have a body)
  	public void move(); // interface method (does not have a body)
}
```

To access the interface methods, the interface must be "implemented" (a sort of inheritance) by another class with the `implements` keyword (instead of `extends`). The body of the interface method is provided by the "implement" class:

```java
class Dog implements Animal {
	@Override
    public void makeNoise() {
        System.out.println("Dog barks");
    }
}
```

The `@Override` argument is **optional**, but recommended. As you can see, none of the interface methods are actually implemented in the interface. Interfaces **cannot create methods**. You also **cannot make an object using an interface**.

```java
// Invalid
Animal a = new Animal();
```

If a class implements an **interface**, there is no need for its subclasses to implement the interface, as those methods will be inherited anyway. You can implement the interface anyway, but it doesn't do anything insofar as its superclass already implemented it.

## Implementing Multiple Interfaces

You only need to add a comma between interfaces:

```java
public class Dog implements Animal, Comparable {
	// TODO implementation
}
```

**Note:** You **cannot extend multiple classes**. It is not a feature in **Java**. Just implement it in a way that you do not need multiple inheritance.

### Implementing Interface and Extending a Class

```java
public class PoliceDog extends Dog implements Animal {
	// TODO implementation
}
```

Just add both keywords `extends` and `implements.`

## Notes

- Methods must be non-static (might have changed, but usually not used)
- No Constructor
- No method implementation
- methods and class are assumed **public**
- methods **must be implemented** for classes that **implement** the interface

## When to Use Interfaces

1. You expect that unrelated classes would implement your interface. For example, the interfaces Comparable and Cloneable are implemented by many unrelated classes.
2. You want to specify the behavior of a particular data type, but not concerned about who implements its behavior.
3. You want to take advantage of multiple inheritances.

# Abstract Classes

Another form of **abstraction**, hence, **abstract classes**. 

```java
public abstract class Animal {
	public abstract void makeNoise();
    public void sleep() {
        System.out.print("Zzzzz");
    }
}
```

In abstract classes, you can have two types of methods: **abstract** and **regular**

### **Abstract Methods**

They are the same as **interface methods**, essentially. They have no implementation, and rely on its subclasses to implement these methods. 

```java
public abstract void doSomething();
```

### Regular Methods

Well, these are just regular methods. They are usually methods than can be **generalized** for all subclasses.

For example,

```java 
public void sleep() {
	System.out.print("Zzzz");
}
```

These methods are **inherited** like normal methods for its child classes.

## Notes

- abstract classes can have any scope
- cannot extend normal classes
- can implement interfaces
  - **does NOT need** to IMPLEMENT THEM
- Cannot be created into an object 
  - you can create a constructor, but it's not something we will cover 
    - there is a constructor that is called when creating a child object
  - constructor is **not used to** **build the object**
  - must use **polymorphism** to use abstract class as variable type

You cannot do this:

```java
// invalid, Animal is an abstract class
Animal a = new Animal();
```

## When to Use Abstract Class

1. You want to share code among several closely related classes.
2. You expect that classes that extend your abstract class have many common methods or fields or require access modifiers other than public (such as protected and private).
3. You want to declare non-static or non-final fields. This enables you to define methods that can access and modify the state of the object to which they belong.

**Note: **Security is also a big reason. However, this is more important for access and control within things like apps, games, websites, etc. You would probably only need to worry when designing one of these things for a company or something.

# Polymorphism

What is polymorphism?

Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

Like we specified in the previous chapter; **Inheritance** lets us inherit attributes and methods from another class. **Polymorphism** uses those methods to perform different tasks. This allows us to perform a single action in different ways.

```java
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Cat extends Animal {
    
}
```

Calling these methods will have different effects for different types of objects. 

```java
Animal a = new Animal();

Pig p = new Pig();

Dog d = new Dog();

Cat c = new Cat();

a.animalSound();
p.animalSound();
d.animalSound();
c.animalSound();
```

```
Output:
The animal makes a sound
The pig says: wee wee
The dog says: bow wow
The animal makes a sound
```

Animals can take on many forms here: dogs, pigs, cats, etc. By default, classes that extend a superclass inherit those methods. They can invoke those methods or override them. The class will search for the **most specific implementation**.

All these animals that extend the Animal class are **still animals**.

## Variable Type

Looking above, these are all valid:

```java
Animal d = new Dog();
Animal p = new Pig();

Dog d = new PoliceDog("Dave");
```

Why? Because of inheritance and Logic. The only reason `Dog` and `Pig` extend `Animal` is because they are both animals lol.

Same with `PoliceDog` being a `Dog`.

However, these are invalid:

```java
Dog d = new Animal();
Cat c = new Animal();

PoliceDog d = new Dog("Dave");
```

Why not? It's the same logical issue as: 

<blockquote>A square is a rectangle but a rectangle is not necessarily a square</blockquote>

Yes. A dog is an animal but not all animals are necessarily dogs. A Dog can be a Police Dog, but a dog isn't necessarily a police dog.

In Java, you can assign a more specific class to any of its superclasses. 

**Looking back at the homework...**

```java
Employee e = new Teacher();
Person p = new Teacher();
Object o = new Teacher();
```

This works. 

### Abstract Classes and Interfaces

This also works with Abstract Classes and Interfaces. Even though you cannot create an object using a constructor and interface, you can use **polymorphism** as long as the right-hand side is a valid object.

Assume Animal is an Interface, then you can do this:

```java
Animal a = new Pig();
Animal b = new Dog();
```

Assume Polygon is an abstract class. You can do this:

```java
Polygon p = new Square();
Polygon g = new Parrallelogram();
```

## What are these objects then? 

You might be wondering. For something like

```java
Dog a = new PoliceDog();
```

Is this a Pig or an Animal? If I call a method that exists in `Dog` and is overridden in `PoliceDog`, which method would it call?

**It will still print the most specific method**. For example, if we have this structure:

```java
Person -> Employee -> Teacher
Person p = new Teacher();
p.printName();
```

It will print the most specific one. If there is a `printName()` within Person, Employee, and Teacher, it will run the one within Teacher. If the method only exists in Teacher then it will still only print the method in Teacher. 

So, this object is a Person, an Employee, and Teacher, and has access to everything within all 3 classes essentially (given scope). 

If you did this:

```java
Dog a = new PoliceDog();
System.out.print(a.getClass());
// PoliceDog
```

It will say the most specific thing. This method is all the way up in the `Object` Class that governs all objects. 

Even if we do 

```java
Employee e = new Teacher();
```

The object still has access to super methods within Person.

## Why is this useful?

For example, if you wanted to create methods...

```java
public boolean compareTo(Employee e) {
	// TODO
}
```

You can pass in any type of object into that method as long as it is an `Employee` object or a subclass of the `Employee` class.

Also, if you know you have a bunch of objects that are `Employee` but could be more specific (you aren't sure), you can just use the `Employee` type when creating variables.

Also it allows you to group objects, when you want to be more clear about things like:

```java
Employee[] e = new Employee[5];

List<Employee> l = new ArrayList<Employee>();
```

Those require Employee objects. All subclasses of Employee are also Employees. Nice.

## Casting

Sometimes you have object mismatches. For example:

```java
Person p = new Teacher();

Employee e = p;
// syntax error
```

Although the Person object is indeed a Teacher as well, Java also treats it as a Person. 

Remember, an Employee is a Person but a Person is not necessarily an Employee, even if we are using polymorphism. 

We can do this:

```java
Person p = new Teacher();

Employee e = (Employee) p;

//or 

Employee e1 = (Teacher) p;
```

Casting works if you go down the hierarchy. 

You cannot do this:

```java
Person p = new Employee();

Employee e = (Teacher) p;
```

# Quick Discussion About Pointers

![](../Class5/pointer1.png)

If you set objects equal to one another, they are the exact same object. Modifying one will modify the other. This same thing applies when casting. They are still the same location in memory.

Assume the Person Class takes in a `name` parameter

```java
Person p = new Teacher("Jared");

Employee e = (Employee) p;

e.setName("Dave");

System.out.println(e.getName());
System.out.println(p.getName());
// Dave
// Dave
```

Be careful

## Methods

This phenomenon is possible:

```java
public static Person changeName(Person p) {
	p.setName("Dave");
    return p;
}

public static void main(String[] args) {
    Person person = new Person("Kanye");
    person = changeName(person);
    // person = Dave
    
    
}
```

```java
public static void changeName(Person p) {
    p.setName("Dave");
}
public static void main(String[] args) {
	Person pp = new Person("Kanye");
    changeName(pp);
    // pp = Dave
}
```

These have the same effect. Why? 

When you pass in the object into the method, it will assign the variable `Person p` to the object you pass in. So, changing one will change the other. Cool!

However, pointers only apply to objects. 

These are not equivalent:

```java
public static int changeNum(int x) {
	x = 3;
	return x;
}
public static void main(String[] args) {
	int x = 5;
    x = changeNum(x);
    // x = 3
}
```

```java
public static void changeNum(int x) {
	x = 5;
    changeNum(x);
    // x = 5;
}
```

Primitives pass **value**. Not the location in memory. Changing one does not change the other.

```java
int x = 5;
int y = x;
y = 12;
// x is still 5
```

