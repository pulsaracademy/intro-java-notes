# Java Class 1

Welcome to the Introduction to Java Course!

All the notes will look somewhat like this, so start getting used to it. I'll also make a presentation on Google Drive, which will also be sent to all of you.

### A Brief Description and History of Java

The Java language project was initiated at Sun Microsystems in 1991 and developed by James Gosling, Mike Sheridan, and Patrick Naughton. It was originally designed for interactive television, but it was too advanced for the digital cable industry at the time. It is named after **Java Coffee** from Indonesia, and has similar qualities to C and C++, as its creators wanted it to be familiar to its users. 

Its first public release as Java 1.0 was released in 1996, promising a **Write Once, Run Anywhere (WORA)** functionality, providing no-cost run-times on popular platforms (e.g. an OS). The original Java 1.0 compil.er was re=written in Java by Arthur van Hoff to comply strictly with the Java 1.0 language specification.

In 2006, Sun Microsystems released much of the JVM as free open-source software under the GNU General Public License (GPL under FSF). It became open-source and free software in 2007.  

Sun was acquired by **Oracle** in 2009. Ever since, all updates to Java have been made by the Oracle Corporation. 

### A Technical Standpoint

**Java** is a general-purpose programming language that is **class-based**, **object-oriented**, and designed to have as few implementation dependencies as possible. It is both an **interpreted** and **compiled** language. It is converted to bytecode so the JRE can understand it, and it is interpreted by the JVM. 

Its syntax is very similar to that of C++, but requires much fewer low-level facilities. Java is one of the most popular programming languages. 

The **Java Development Kit (JDK)** is an implementation of either one of the Java Platform, Standard Edition, Java Platform, Enterprise Edition, or Java Platform, Micro Edition platforms released by Oracle Corporation in the form of a binary product aimed at Java developers on Solaris, Linux, macOS or Windows.

Essentially, it is a software development kit (SDK) that allows Java development, including a collection of programming tools, such as dependencies and libraries. It includes the Java compiler, the interface that allows the code to be read by a computer. It includes the JRE, JVM, documentation generator, and all the things necessary for Java development. 

There is also the **Java Runtime Environment**. It is a software layer that runs on top of a computer's operating system (such as MacOS or Windows), providing additional services specific to Java. The JRE allows Java to be run on any OS without modification, adhering to the WORA rule. It consists of the Java Virtual Machine, core classes, and supporting files. 

Java runs off of the **Java Virtual Machine (JVM)**, a virtual machine that enables a computer to run Java programs as well as programs written in other languages that are also compiled to **Java bytecode**. The JVM is responsible for executing the java program line by line hence it is also known as **interpreter.** 

### Elements of a Project

Projects are divided into a couple elements.

1. Java Project
2. Packages 
3. Classes

You create a new Java Project for each project you create. All your code goes inside. After you create the project, you need at least one package, which goes under the "src/" folder. The package is essentially a folder that holds similar classes (programs). You can have multiple packages. For most of our lessons, you will most likely only need one. However, we will go through the situations where you might need more.

Finally, the Class. Unlike Python, all Java code goes inside files called "classes". They contain all the code you will type, generally named things like "HelloWorld.java". You will soon see that it looks a bit different than your average .py file. 

Other files that you might need should usually go in directory under the project or within the root of the project. (MyProject01 or MyProject01/Images/). 

## How to Setup A Project

#### Java Project

Open up Eclipse. From there, you should go to File >> New >> **Java Project.** Name your projects with the following conventions (Upper Camel Casing):

1. All one string

2. Use capitalized letters to separate important words. 

3. Don't use special characters like !@#$%^&*()<>""?/\. You can use numbers, but generally don't make them the start of the name. 

4. Avoid abbreviations unless the abbreviated word is more common (URL, HTML, PDF)

   | Good                                              | Bad                                                |
   | ------------------------------------------------- | -------------------------------------------------- |
   | <span style="color: green;">HelloWorld</span>     | <span style="color: red;">candyCanesaregood</span> |
   | <span style="color: green;">MyProject01</span>    | <span style="color: red;">123EyesOnMe</span>       |
   | <span style="color: green;">MyNameIsBatman</span> | <span style="color: red;">WhatTheH*#)!%*@#</span>  |
   | <span style="color: green;">Class1Homework</span> | <span style="color: red;">I_Am_Cool</span>         |
   | <span style="color: green;">Candy</span>          | <span style="color: red;">Project Number 1</span>  |

    

If it asks to create a module, just click "Don't Create". Don't worry too much about this. 

#### Package

Now, open your Project using the Package Explorer on the left-hand side. Go to File >> New >> **Package.** Name your package. There are a few rules:

1. Everything should be lowercase
2. There are some reserved words, such as "package" and "int". Don't use them.
3. Use _ or . to separate words
4. Cannot begin with number

| Good                                                   | Bad                                       |
| ------------------------------------------------------ | ----------------------------------------- |
| <span style="color: green;">com.example.website</span> | <span style="color: red;">i'mCool</span>  |
| <span style="color: green;">eric.ps04</span>           | <span style="color: red;">potat*3o</span> |
| <span style="color: green;">school</span>              | <span style="color: red;">123_123</span>  |

Sometimes, people will use their domain name backwards if they distribute the packages. 

#### Class

Click on the Package you just created. Now go to File >> New >> Class. Name the class with the same conventions as the Project name (Upper Camel Casing), but try not to use numbers if you don't have to. 

Now, if you click on the class you just created, you should see code that looks somewhat like this:

```java
package helloworld;

public class HelloWorld {
    //code goes here
}
```

Note: you must have these elements when creating a Java class. It is usually auto-generated. Don't modify it unless changing its visibility (more on this in the future). 

## Time to Code!

Unlike Python, most code in Java needs to run within a method. Java code isn't read top-to-bottom. Instead, it's compiled, which allows you to place methods in any order. 

We will cover this more in the IDE.

Let's start!

### Syntax

Java requires a semi-colon after each line if it is not a class or method declaration.

For example:

```java
int i = 1;
```

Methods, statements, and loops use braces:

```java
if(3 > 1) {
	System.out.print("hello");
}

//next 
public static String returnName(String x) {
    return x;
}
```



### The Main Method

This is where your driver code will be run. Unlike Python, you must do all the important coding inside the **main method** of your Class. If you have multiple classes to use in your main method, you can have a driver class called "Main.java", but it doesn't really matter. All your methods and instance variables go outside the main method (more on this later).

The main method will **always** look the same: 

```java
public static void main(String[] args) {
	//implementation goes here
}
```

You can see a couple of elements here. The first is "public". A brief summary: the class is visible to all other classes in the project folder. They can access fields directly. We will cover the other types eventually. (default, public, private, protected). 

The other is "static". Static indicates that the method is not an instance method; it doesn't relate to the object of the class. More on this in the future. Use it for now.

"Void". This means the method does not return anything. You **must** declare the return value of any method in your class, which you don't need for Python. 

"main": This is the name of the method. We will cover more about methods in the future. The best practice for naming methods is Upper Camel Casing (look to Java Project Name).

#### Printing Stuff to the Console

You can see the results of your code in the console, just like you do in Python. 

The command is the following:

```java
System.out.print("Hello, World!");
System.out.println("Hello, World!");
```

It's a bit longer than `print('hello')`, I know. 

`println` prints a newline after the statement is printed.

### Variables and Comments

Variables will look like this, almost always:

```java
int myNumber = 1;
Person person = new Person("Candy", "Apple");
String s = "String String String. See how I'm capitalized? I'm special";
```

Wrappers and Strings are unique, and so are generic variable types (later).

Variables must always have a type. You only need to use them once, when you are initializing/instantiating the variable. You can use the name after you create the variable. **You cannot try to initialize/instantiate the variable once it's created. You cannot switch the variable's type locally.** Names follow **Lower Camel Casing**. They can only use numbers, letters, and underscores. Avoid underscores most of the time. 

| Good                                           | Bad                                                |
| ---------------------------------------------- | -------------------------------------------------- |
| <span style="color:green;">x</span>            | <span style="color:red;">321good_bye</span>        |
| <span style="color:green;">myNameIsCool</span> | <span style="color: red;">hellovariablename</span> |
| <span style="color:green;">variable3</span>    | <span style="color: red;">*#fjdf_3j2</span>        |

You can set variables early on without setting them to anything yet. You can set multiple of the same data type in one line as well.

```java
// setting variables on a different line
int x;
x = 1;

// multiple creation
String s1, s2, s3;
int a = 1, b = 2, c = 3;
```

#### Primitive Data Types

They are the most basic types of variables within the java language. You **initialize** primitive type variables. There** are 8:

- **boolean**: true/false
- **byte**: 1-byte/8-bit integer (-128 to +127)
- **char**: All Unicode characters
- **short**:  2-byte/16-bit integer (-32,768 to +32,767)
- **int**: 4-byte/32-bit integer (-2^31 to 2^31-1)
- **long**: 8-byte/64-bit integer (-2^64 to 2^64-1)
- **float**: 4-byte/32-bit decimal
- **double**: 8-byte/64-bit decimal

Most people use int and double for most purposes.

Try to make double and float assignments clear:

```java
// good 
double x = 1.0;
// perfectly valid, but it's not as explicit
double y = 1;
```

Look online to understand binary and how computers see numbers. 

Here's a good link: [https://en.wikibooks.org/wiki/Java_Programming/Primitive_Types#:~:text=Primitive%20types%20are%20the%20most,simple%20values%20of%20a%20kind.](https://en.wikibooks.org/wiki/Java_Programming/Primitive_Types#:~:text=Primitive types are the most,simple values of a kind.)

#### Objects

You might know them from Python as 

```python
myObj = Obj(name="Chris", height="67")
```

Java is an Object-Oriented Language. You can create Objects based on your Class. That's the whole purpose. More on this in the future. You **instantiate** objects. 

They will always look like this (outside of wrapper functions and strings):

```java
ObjectName obj1 = new ObjectName();
ObjectName obj2 = new ObjectName("Banana", "Corn", 13, false);
```

See how they're **capitalized**? Yes, they are. Primitives will **always** have lowercase types. Objects will always be capitalized, including **strings**. 

What is an object?

Complicated answer: Object (computer science) From Wikipedia, the free encyclopedia. In computer science, an object can be a variable, a data structure, a function, or a method, and as such, is a value in memory referenced by an identifier.

Simple Answer: It's a variable that represents something.

Examples:

- Person: name, weight, height, age
- Car: Brand, type, number of wheels, etc.

We will cover objects in the future lessons.

## I have a question!

Well, ask us! We have a forum! Email me!

You can also ask Google!

Or consult the documentation! **This is useful. Mostly once you don't have a teacher**.

Good places to ask once you are more advanced: **Stack Overflow, Reddit**

Ask your parents if they know how to code. Watch YouTube videos. Re-watch our lesson videos. Ask your sibling. **Alex Dong** should be an expert. 

Most of my stuff will probably end up on the **GitHub Repository.** I'll send out an email when that's configured. It will be on https://github.com/pulsaracademy. 

I'll teach you how to use one near the end. It's important to **back-up** any projects.

## Homework

Create a program using **Scanner, If statements, Nested-If statements, And-Or,** and **multiple data types**. I'll teach you how to submit work sometime!

## Congratulations!

You're done with your first class. I know it's a lot. But it's over!