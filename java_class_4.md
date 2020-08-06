# Class 4: Arrays Practice, Casting, JavaDocs

## Going over Homework...

We'll go through all the problems so you get the hang of it for now. 

## Primitive Wrappers and Default Methods

Wrapper classes are those whose objects wraps a primitive data type within them.

In the **java.lang** package java provides a separate class for each of the primitive data types namely Byte, Character, Double, Integer, Float, Long, Short.

Essentially, these are **objects** that **represent primitives**. Why would we need this?  They are used in other objects and are vital to **generic variables**. More on that later...

### Syntax

These wrapper classes are **special**. They behave like String, unlike most other **objects**.

```java
// new Java
Integer x = 1;

// old Java
Integer x = new Integer(1);
```

They behave almost exactly like integers too.

```java
Integer x = 1;
x += 3;
// x = 4
```

### Default Methods

These Classes have **default methods** and **variables** included in them. Some examples:

```java
// max int value (32-bit integer)
int i = Integer.MAX_VALUE;
// i = 2147483647; (2^31 - 1)

// convert String to integer
int x = Integer.parseInt("35");
// x = 35

// returns maximum
int num = Integer.max(3, 5);
// num = 5
```

There are many for each class. You can always search up what they all are; Something like: **Java Integer Class default methods**. I don't know all of them, and neither should you. 

#### A different kind of default method

The first index of a string is **ZERO**. Remember that.

You can also use default methods on Strings. I've showed you a couple: 

- substring
- replaceAll
- split
- trim/strip
  - strip strips ALL SPACE, trim only trims (not all whitespace (read documentation))
- indexOf
- getClass
  - default Object method
- charAt
- lastIndexOf

Some methods are applicable to **all objects**. I'll address this some day.

```java
// length: returns length of string. NOTE HOW THERE ARE PARENTHESES
String s = "Eric Chen";
System.out.print(s.length());
// 9

// substring: returns a substring... lol
String s = "Eric Chen";
String firstName = s.substring(0, 4);
// you can also do s.substring(5, s.length())
String lastName = s.substring(5);
System.out.print(firstName + "\n" + lastName);
// firstName = Eric
// lastName = Chen

// split(String regex): splits a string into an array
String s = "Eric is the  coolest guy on earth";
String[] parts = s.split(" ");
// ["Eric", "is", "the", "", "coolest", "guy", "on", "earth"]

//indexOf(char or String): returns the first index of the thing you search for
// returns -1 if it can't find the search
String s = "eric eric eric";
System.out.print(s.indexOf("eric") + "\n" + s.indexOf('r'));
// 0
// 1

// lastIndexOf: opposite of indexOf
// returns -1 if it can't find the search
String s = "eric eric eric";
System.out.print(s.lastIndexOf("eric") + "\n" + s.indexOf('r'));
// 10
// 11

// getClass(): returns the class of any object
System.out.print("string".getClass());
// java.lang.String

// charAt(int index): returns the character at a given index of the String
String s = "potato";
System.out.print(s.charAt(4));
// t
```

There are **many others**. Take a peek at the **documentation.**

One unique feature of arrays

```
String[] arr = {"one", "two", "three"};
System.out.print(arr.length);
// 3

```

Note how Strings use length() while arrays use length. This is because it is an **attribute** of the Array Class, but **not the String class**. More on this in the future.

### Things you may have noticed

**You can use the same method, but with different arguments.** 

Example:

```java
String s = "potato";

// different parameter type: char vs String
System.out.println(s.indexOf('p'));
System.out.println(s.indexOf("pot"));

// 0
// 0

// different number of arguments: 1 vs. 2
System.out.println(s.substring(4));
System.out.println(s.substring(0,4));
// to
// pota
```

This is called method **overloading**. You can have **multiple instances** of a method given **you have either different types or a different number of parameters**.

```java
public static void print(String s) {
	System.out.println(s);
}

public static void print(char c) {
	System.out.println(c);
}

public static void print(String s, char c) {
	System.out.println(s + " " + c);
}

public static void print(int i) {
	System.out.println(i);
}
```

**String methods DO NOT USE the STRING CLASS**

What?

Well, take a look again...

When we used the Integer methods, we did `Integer.method_or_variable`. 

For example:

```java
Integer i = Integer.max(1, 2);
// 2
```

But for Strings, we did `variable.method_or_variable`.

For example:

```java
String s = "string";
s = substring(0, 3);
// str
```

The methods for strings are **Instance methods**. They can only be called when you have **created an object already**. The methods for the **wrapper classes** are **static methods**. They can be called **without an object**. More on this in the future...

### Important Thing to Consider

Using a method won't change it.

Example:

```java
String s = "possess";
s.replaceAll('s', "cool");
System.out.print(s);
// possess
```

Did the method do nothing? No. The method actually **returned something**. It's just that **we didn't assign it to anything.** It's like using a method we created earlier (such as power), but not setting it to anything once we **invoking it.**

```java
String s = "possess";
s.replaceAll('s', " cool");
System.out.print(s);
// po cool coole cool cool
```

Also, a early look into objects: **Strings are immutable**. They cannot change. Any modification is just creating **a new string**. More on this later...

### Chaining

You can chain methods if you would like.

```java
String s = "hello my name is eric chen";

s = s.substring(1).replaceAll('e', 'b');
// s = "bllo my namb is bric chbn"
```

You can chain as many methods as you would like. It operates right-side first. 

## Casting

How do we convert between data types?

By **casting!** The reason we would want to is because you already know we can't do arithmetic with primitives (for the most part, but don't do it anyway). 

```java
int x = 1;
double d = 3.75;
x += d;
// 4
x = 1 + d;
// Type mismatch: cannot convert from double to int
```

There are some situations where Java lets you interchange data types, but don't rely on it. But realize how it truncates the number, from 3.75 to 4.

Doubles can always deal with integers (since integers are a **subdomain** of the integer **domain**). But cast to be explicit.

### Syntax

The most common conversion is between **double** and **int**. It should apply for everything else (except boolean and char). 

```java
int x = 1; 
double d = 3.75; 

// casting
int dInt = (int) d;
double xDouble = (double) 1;
// dInt = 3
// xDouble = 1.0

// Cast the variable in line
x = 1 + (int) d;
// x = 4
```

If you convert an integer to a double, it can usually do it by default, but you can add the `(double)` to make the code more readable. 

You should find examples by yourself. Understand you must cast within `print()` if you want it to display things correctly.

```java
System.out.print(1/4 + 3);
// 3

// works but not recommended
System.out.println(1.0/4 + 3);
System.out.println(1/4.0 + 3.0);
// 3.25
// 3.25

// Recommended
System.out.print(1.0/4.0 + 3.0);
// 3.25
```

In summary, just be **careful**. If you ever see something without a ".0" at the end, it is **an integer**. Java will print a **".0"** for integers that are **double type** in code.

You can use `Double.ParseDouble()` for Doubles and other types.

#### Integer to String and Vice Versa

Use the `Integer.parseInt(String s)` method. It only works if `s` is a **String**...

```java
String s = "1234";
int i = Intger.parseInt(s);
// i = 1234

System.out.print(Integer.parseInt("abc"));
// java.lang.NumberFormatException
```

You can convert an integer to a String as well:

```java
int i = 345;
String s = Integer.toString(i);
// s = "1345"

// Another approach 
String s1 = "" + i;
s1 = "1234"
```

Use what you want. Works for doubles and other types as well. 

## JavaDocs

What is a **JavaDoc?** JavaDoc stands for Java Documentation,  for generating API documentation in HTML format from Java source code. It is a way to let people know what your methods do in a **readable format**. It's generally used for other people or yourself when you need to figure out what **something does**. 

JavaDocs are placed before methods or classes in a comment-like syntax. It contains things like **parameters, return type, exceptions, description, input, and more**.

Here's an example for a method called **factorial**, which returns the factorial of an integer.

```java
class Main {
	/** 
	 * This method returns the factorial of an integer, a mathematical operator.
	 * The factorial of a non-negative integer n returns the product of every positive 		 * integer less than or equal to n. 0! = 1.
	 * </p>
	 * @param n - integer
	 * @return n! - the factorial of the integer n
	*/
    public static int factorial(int n) {
        // implementation
    }
}
```

As you can see, the way to start a JavaDoc is using `/** */`. You put them above the class/method you are writing it for.

You can see the JavaDoc in HTML format if you go to Window -> Show View -> JavaDoc, or Alt + Shift + Q.

There are special attributes that can be assigned to make things easier to see. They are added by putting an @ sign before the special keyword.

The most common ones are:

- @param: for addressing all parameters. Each parameter gets a @param classifier
- @return: tells the user what is returned by the method
- @throws or @exception: declares the specific errors thrown by the method
- @author: your name so people know who created the method

### When should I use a JavaDoc?

Create a JavaDoc for each class and method that you create. It's good practice. It is tedious, but it will help in the future if you ever look back on your work.

### Rule of Thumbs

For **Class JavaDocs**,  include the following:

- @author
- Your Name, the date, and the Project name
- What the Class is intended to do: a brief description of what is inside the class, and what the purpose is

For **Method JavaDocs,** include the following:

- The description of the method; what is is supposed to do
- @param: for each parameter, and its meaning within the domain of the method
- @return: what the method returns, and the data type
- @throws: what are the exceptions to the method? What is not allowed? Why would it throw this error?
  - for custom errors, generally

### Documentation

https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html

Take a look if you're confused.

## Exceptions 

What are exceptions? An **exception** is an event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions. When an error occurs within a method, the method creates an object and hands it off to the runtime system.

Basically, it's an error in your program unrelated to syntax.

Here is a relatively straightforward exception

```java
int[] arr = {1, 2, 3, 4, 5};

int fifthElement = arr[5];
System.out.print(fifthElement);
```

```
Output:
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at homework.LoopsPractice.main(LoopsPractice.java:10)
```

Well, what's the error? Well, we tried to access an element illegally. There is no index 5 in an array of length 5. We did an illegal call.

The error was handled by the JDK, and gave us an `java.lang.ArrayIndexOutOfBoundsException`.  We can see how the exception is **capitalized**. This means that it is a **class** that dictates the error. This tells us we could create our own exceptions if we wanted. We'll discuss this later.

There are exceptions for most basic programming tools, which are relatively easy to understand: 

- `StringIndexOutOfBoundsException`
- `IllegalArgumentException`
- `ArithmeticException`
- `NumberFormatException`
- `StringIndexOutOfBoundsException`

You can generally figure out what you did wrong. Furthermore, the console will usually tell you the line number the **exception was called**.

Java will only return one exception at the **first place **it finds an error. You could have many, but it will do it **top down**.  

### Try/Catch

Sometimes, you can expect an exception based on something **another person might do**. It can be valid for certain inputs if you know what the **boundaries are**. But in case someone else wants to use your program, you want to make sure it doesn't crash.

For example, let's talk about the "Guess the Number". You ask the user to a number. What if they don't? Well, your program will either crash or it won't be accurate. 

For example:

```
Enter in your guess: Potato

Output:
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at homework.LoopsPractice.main(LoopsPractice.java:13)
```

Well, obviously we can't assign an integer a string value.

That's where Try/Catch comes in:

```java
// import java.util.InputMismatchException

Scanner sc = new Scanner(System.in);
try {
    int userGuess = sc.nextInt();
}
catch(InputMismatchException e) {
    System.out.print("You did not enter a valid integer");
}
```

We caught the `InputMismatchException`. 

#### So, how does this work?

The `try` statement allows you to define a block of code to be tested for errors while it is being executed.

The `catch` statement allows you to define a block of code to be executed, if an error occurs in the try block.

The `try` and `catch` keywords come and **must be** in **pairs.**

We can either catch a specific exception (if you know what type and the name) or a exception in general. You will need to **import the exception** if you are using a specific one not imported by default. You can tell by whether Eclipse highlights the exception name.

For example, `IllegalArgumentException` is used by default (under java.lang), but `InputMismatchException` (java.util) is not. Most of them are, so it should be okay.

For catching any exception, you can use `catch(Exception e)`. This will catch **any exception.** 

The reason we use a variable name `Exception e` is because we can use it within the catch statement. For example:

```java
// import java.util.InputMismatchException

Scanner sc = new Scanner(System.in);
System.out.print("Enter your number: ");
try {
    int userGuess = sc.nextInt();
}
catch(InputMismatchException e) {
    System.out.print(e);
}

output:
Enter your number: fd
java.util.InputMismatchException

```

#### Finally Clause

You can add a finally clause after the try catch.

```java
try {
	// stuff
}
catch(Exception e) {
    // stuff
}
finally {
    // stuff
}
```

Finally we be executed after the try catch. It will be executed **even if an error is thrown**. It always executes whether the try **block** terminates normally or terminates due to an exception. The main **purpose** of **finally block** is to release the system resources.

### Throwing Exceptions 

You can throw an exception if you want based on certain conditions using `throw new Exception(e)`. It allows granular control over your program. It is most often used in **methods**.

For example, say we are trying to create a method called **factorial**. Factorial only works on integers greater than or equal to **0**. So, what if the user inputs a number less than 0? Well, we should throw an error.

```java
public static int factorial(int n) {
    if(n < 0) {
        throw new IllegalArgumentException("Inputs must be non-negative integers");
    }
    // rest of the code
}

public static void main(String[] args) {
    factorial(-1);
}
```

```
Output:
Exception in thread "main" java.lang.IllegalArgumentException: Inputs must be non-negative integers
	at homework.LoopsPractice.factorial(LoopsPractice.java:26)
	at homework.LoopsPractice.main(LoopsPractice.java:12)
```

As we can see, it will throw a custom exception with our custom text. 

Do this for situations where a user might call the method with an improper input. 

**Exceptions are Objects**. That's important for you to keep in mind. That's why we see throw `new Exception("Blah").` 

We can throw the exception in a try/catch if we wanted:

```java
try {
	// stuff
}
catch(Exception e) {
	throw(e); 
}
```

`Exception e` is just like `String s`, but obviously, catch only works with Exceptions.

## Homework

Since I went over the homework completely, you should be able to complete it now. Turn it in the following class.

Rename the project to **FirstName + LastName Class04**. Leave the package name, I don't really care. 

Right Click Project -> Refactor -> Rename

### Things to add

Create a **JavaDoc** for **each method** following the rules above. Create a **JavaDoc** for each **class**. Handle situations in your methods where an **exception should be thrown**. Make sure you implement it correctly. 

I want you to complete **7 of 9 methods** of **ArraysPractice.java**, and complete **all first 5 methods of LoopsPractice.java**. 

**And complete the following new ones in ArraysPractice.java:**

### mode

Write a **static method called mode** that **returns the most frequently occurring element of an array of integers.** Assume that the array has at least one element and that every element in the array has a value between 0 and 100 inclusive. **Break ties by choosing the lower value**. For example, if the array passed contains the values {27, 15, 15, 11, 27}, your method should return 15.

### stdev

Write a static method called **stdev** that **returns the standard deviation of an array of integers.** Standard deviation is computed by **taking the square root of the sum of the squares of the differences between each element and the mean, divided by one less than the number of elements.** (It's just that simple!) More concisely and mathematically, the standard deviation of an array a is written as follows: standard deviation 

For example, if the array passed contains the values {1, -2, 4, -4, 9, -6, 16, -8, 25, -10}, your method should return approximately 11.237. 

Here's why: 

The average of those numbers is 25/10 == 2.5. 

Then add up (number - average)^2 for each number. (1 - 2.5)^2 + (-2 - 2.5)^2 + (4 - 2.5)^2 + ... + (-10 - 2.5)^2 = 1136.5 Then divide by (a.length - 1) 1136.5 / 9 = 126.2778 

Finally, take the square root. sqrt(126.28) = 11.237 

This is the standard deviation of those numbers. It's how far, on average, one of those numbers is from the mean. You may assume that the array passed is non-null and contains at least two values, because the standard deviation is undefined otherwise. (Note: you might fail the last two tests because of rounding, but as long as it's close, then your algorithm is probably correct.)

**Hint:** deal with casting properly

### isUnique

Write a **static method named isUnique** that takes an **array of integers as a parameter** and that **returns a boolean value indicating whether or not the values in the array are unique** (true for yes, false for no). **The values in the list are considered unique if there is no pair of values that are equal**.

For example, if a variable called list stores the following values: int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4}; Then the call of isUnique(list) should return true because there are no duplicated values in this list. If instead the list stored these values: int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74}; Then the call should return false because the value 3 appears twice in this list. Notice that given this definition, a list of 0 or 1 elements would be considered unique.

### String Manipulation

Create a new class within the package named **StringManipulation.java**. 

Implement these methods:

### numVowels

Write a method called **numVowels** that returns the number of vowels given a String. Ignore 'y' as a vowel.

```
numVowels("Tree") = 2

numVowels("Orange is my favOritE") = 8

numVowels("sky") = 0
```

### maxChar

Write a **method named maxChar** that **takes in a String** and **returns the character that appears the most frequently.** If there are ties, return the one with the first appearance within the string. In this scenario, **capitalized characters are equivalent to lowercase characters**. 

If a person enters in special characters or numbers other than the hyphen character should throw an `IllegalArgumentException`. 

```
maxChar("Hello world!") returns 'l'.

maxChar("oopsies") returns 'o'

maxChar("123401;fdf") throws an exception.

maxChar("good-bye") returns 'o'
```

**Hint**: Use the methods that come with strings or the Character class.

To convert a string to lowercase, you can use `s.toLowerCase()`. To convert a character to lowercase, use `Character.toLowerCase(c)`. This is because String is an object. 

### reverseString

Write a method named **reverseString** that takes in a String and returns the string in reverse. 

```
reverseString("hello") = "olleh"

reverseString("name") = "eman"
```

### removeDuplicates

Write a method named **removeDuplicates** that **takes in a String and a character** and returns a String with **all the instances of the character removed.**

```
removeDuplicates("hello", 'l') = "heo"

removeDuplicates("mississippi", 'i') = "msssspp"

removeDuplicates("candy", 'r') = "candy"
```

### hasString

Write a method named **hasString** that **takes in two strings**, and checks **whether the first string contains the second string.** Do not throw exceptions, only return true or false.

```
hasString("hello", "candy") = false

hasString("trickster", "trick") = true

hasString("witches", "witch") = true
```

#### backwardsSentence

Write a method named **backwardsSentence** that takes in a sentence (String), and returns the sentence with words in reverse. Ignore special characters other than the hyphen.

```
backwardsSentence("Hello my name is Eric") = "Eric is my name my Hello"

backwardsSentence("tree") = "tree"

backwardsSentence("the park was closed today") = "today closed was park the"
```

### FOLLOW INSTRUCTIONS

**EXPORT THE PROJECT** and hand in a zip file **WITH YOUR NAME** + **THE CLASS #**. Please follow instructions. 