# Java Class 3

## Project Setup

Let's create a **Java Project** called **JavaLesson03**. 

Let's create a package called. **lesson03**. It doesn't really matter for this project.

Under the package, let's create a class called **Main.java**.

Let's continue!

## Nested For Loops

### Syntax

```java
for(int i = 0; i < m; i++) {
	// stuff
	for(int j = 0; j < n; j++) {
		// stuff
	}
}
```

These can get confusing. You can also use `j` relative to `i`.

#### Example:

```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

Let's do this. We can see, that there are a different number of items per row, from 1 - 5. This tells us that we probably need nested for loops. 

Let's handle the outside first:

```java
for(int i = 1; i <= 5; i++) {
	// stuff
}
```

So, we know we will go through the outside 5 times, since we have 5 rows. Let's see how to add the inner stuff. 

```java
for(int i = 1; i <= 5; i++) {
	for(int j = 1; j <= 5; j++) {
		System.out.print(j + " ");
	}
    System.out.println();
}
```

```
Output:

1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
```

Well, that's not right...how do we limit what `j` can be?

Let's look at a table

| i's value | j's maximum |
| --------- | ----------- |
| 1         | 1           |
| 2         | 2           |
| 3         | 3           |
| 4         | 4           |
| 5         | 5           |

Well, what do we see? A pattern. J can only go up to `i`! Let's just do that, then!

```java
for(int i = 1; i <= 5; i++) {
	for(int j = 1; j <= i; j++) {
		System.out.print(j + " ");
	}
    System.out.println();
}
```

```
Output:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
```

Yay! Let's move on.

## While Loop

**While Loop**: In most computer programming languages, a **while loop** is a control flow statement that allows code to be executed repeatedly based on a given **Boolean condition**. The **while loop** can be thought of as a repeating if statement.

English analogy: 

- If you don't tell me to stop eating candy, I will keep eating candy. 
- As long as I have less than $5, I will keep working

### Syntax

```java
while(boolean_statement_or_quantity) {
	// do stuff
}
```

Pretty straightfoward.

Examples:

**Act like a for loop**

```java
int count = 0;
while(count < 5) {
	System.out.print(count);
	count++; 
}
```

**Keep asking user for input**

```java
Scanner sc = new Scanner(System.in);
String username = sc.nextLine();
// while the user doesn't enter quit
while(!username.equals("quit")) {
    System.out.println("Your name is: " + username);
    
    username = sc.nextLine();
}
```

### Break Statement

You can **break** outside of a loop, which will exit a loop completely if **break** is called. Usually, it is used after a condition is met. It is usually not recommended if you have another way to break out of a while look, as it is **not logic**.

```java
int count = 0;
while(count < 100) {
	if(count == 3) {
        break;
    }
    System.out.print(count);
	count++;
}

// 012
```

Be careful when you use the break statement. It can also be used in a **for loop**. 

### While True

A while true loop will run forever unless the **program is terminated** or if a **break** statement is reached.

Generally, do not use a while true loop unless you absolutely need to. Try to implement a logical way to do it instead. 

```java
while(true) {
	System.out.println("hello!")
}
// hello
// hello
// ...
```

**Avoid using it**.

### Continue Statement

A continue statement** skips to the next iteration. It can be used for both **for and while loops**. I have never used one before, so I assume it's **not very necessary** other than specific situations...

```java
int [] numbers = {10, 20, 30, 40, 50};
for(int x : numbers) {
	if(x == 30) {
		continue;
    }
    System.out.println(x);
}

// 10
// 20
// 40
// 50
```

We can simply do the opposite here. If you can think of a situation when to use it, tell me!

### When to Use While Loop?

Why would I use a while loop if I can easily use a for loop?

**Answer:** If you know the number of iterations the loop should run beforehand, I would recommend the `for` construct. While loops are good for when the loop's terminating condition happens at some yet-to-be determined time.

If you can use either, use a for loop. For loops generally makes the code more **readable**.

### Do while

There is another loop, called a do-while loop. I don't think it's that important, but maybe you care. I won't cover it in class.

A **do...while** loop is similar to a while loop, except that a do...while loop is guaranteed to execute at least one time.

```java
int x = 10;

do {
	System.out.print("value of x : " + x );
	x++;
    System.out.print("\n");
}while( x < 20 );
```

```
Output: 

value of x : 10
value of x : 11
value of x : 12
value of x : 13
value of x : 14
value of x : 15
value of x : 16
value of x : 17
value of x : 18
value of x : 19
```

## Arrays

What is an array? An **array** is a data structure, which can store a fixed-size collection of elements of the same data type. An **array** is used to store a collection of data, but it is often more useful to think of an **array** as a collection of variables of the same type.

It's essentially a list of items of a fixed length. It is an **OBJECT**. 

For example, here are a couple arrays of length 5, so 5 **elements**.

`[1, 2, 3, 4, 5]`

`["banana", "orange", "apple", "banana", "peach"]`

`[true, true, false, false, true]`

We can see, the first array is an array of integers. The second one is an array of strings. The third is an array of boolean values.

There are a few ways to define an array.

```java
// No initial values
int[] intArray = new int[5];
String[] stringArray = new String[10];
boolean[] booleanArray = new boolean[21];

// Pre-Set Values
int[] intArray = new int[]{1, 2, 3, 4, 5};
int[] intArray2 = {1, 2, 3, 4, 5};
```

We can see the general form is `type[] array = new type[length];` or `type[] array = {// stuff};`. 

**Once the size is set, it cannot be changed**. This applies to both arrays with no pre-set values and arrays with pre-set values. 

### Default Values

There are default values for all array types, if you don't set them. This happens when you create an array without initial values:

```java
int[] intArray = new int[5];
```

Here's a list

| Array Type | Initial Value |
| ---------- | ------------- |
| int        | 0             |
| double     | 0.0           |
| boolean    | false         |
| float      | 0.0           |
| short      | 0             |
| byte       | 0             |
| long       | 0             |
| char       | ' ' (space)   |
| String     | null          |
| Object     | null          |

### Accessing Elements

I want the 4th element of an array.

```java
int[] array = {1, 2, 3, 4, 5, 6};
int fourthElement = array[3];
// fourthELement = 4
```

Huh? Why did we pick 3?

It's because of **indexing**.

The first index in an array is **0**.

![](C:/Users/ericc/OneDrive/Documents/PulsarAcademy/IntroJava1/array-index.gif)

Therefore, we need to use **n-1** to get the **nth** element. 

So, as you can see from above, we can access the element using the variable name + [index we want].

For the **nth-element**, that would look like

```java
// n is the index you want
dataType[] array = {stuff};
dataType nthIndex = array[n - 1];
```

**Note how the nth element is not the same as the nth index.** 

Accessing the last element in the array, we can use an array's **length**. 

However, note that the length will be **one more** than the last index of the array, so we must subtract 1.

You can get the length of the array using the **length attribute**. 

```java
int[] arr = new int[6];

System.out.print("Length: " + arr.length);
// Length: 6
```

So, essentially, it is `arrayName.length`. 

Note how length is not a method. There are **no parentheses.**

To get the last element:

```java
// array of length "n"
int[] arr = {n elements};

// last element
int lastElement = arr[arr.length - 1];
```

**You cannot access an element outside the array's length. This includes negative numbers.** It will return an **ArrayIndexOutOfBounds** error.

## Iterating through an array

What if we want to print all the elements in an array?

Use a for loop. But how? Simple:

```java
int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

for(int i = 0; i < arr.length; i++) {
	System.out.print(arr[i]);
}
```

Note how we can use `length` instead of `length - 1`, since we are using "less than".

### Using the For-Each Loop

There's an easier way to **access elements** from an array in Java, but it has its shortcomings. It is called a **for-each loop**.

Let's do an example:

```java
// String array of foods
String[] food = {"banana", "cake", "apple", "steak", "chicken", "ice cream"};

// iterate through
for(String item: food) {
    // note how item is already a variable
    System.out.println(item);
}
// banana
// cake
// apple
// steak
// ice cream
```

If you're familiar with python:

```python
food = ["banana", "cake", "apple", "steak", "chicken", "ice cream"]

for item in food:
	print(item)
    
# banana
# cake
# apple
# steak
# ice cream
```

The general form is just `for(data_type variable: array) {}`. Pretty simple. 

#### First weakness of the For-Each Loop

Why don't we just use this all the time? Unfortunately, for-each loops only use a **copy** of the actual value

Let me demonstrate:

```java
String[] food = {"banana", "cake", "apple", "steak", "chicken", "ice cream"};

// change all the items to pizza
for(String item: food) {
    item = "pizza";
}

// Print the items in array
for(String item: food) {
    System.out.println(item)
}

// banana
// cake
// apple
// steak
// ice cream
```

Uh oh! Why didn't this work? It's because `String item` returns a **copy** of the actual value. It isn't the same as changing the actual value. 

**Analogy**: Give a copy of your homework to your friend. If your friend edits the copy you gave him, it won't edit the homework you already have. 

Essentially, that's what is happening. **How do we combat this?**

Just use a "normal" for loop.

```java
String[] food = {"banana", "cake", "apple", "steak", "chicken", "ice cream"};

// normal for loop
for(int i = 0; i < food.length; i++) {
	food[i] = "pizza";
}

// check our results
for(String item: food) {
    System.out.println(item);
}

// pizza
// pizza
// pizza
// pizza
// pizza
```

#### Second Weakness of the For-Each Loop

**It doesn't give you an index value.** This means you can't keep track of the index number and you can't perform calculations with them either. 

#### When do I use the For-Each Loop?

When you only care about the values, and nothing else, I recommend the For-Each Loop. It won't mess up your original array, and is a bit easier to work with. It allows easier access to arrays within arrays, and probably other occasions. If you want a method that never fails, use a normal for loop.

### You Can't Print an Array Outright

**An array is an object**. By default, objects will print their object Class + their **location in memory**. 

```java
String[] food = {"banana", "cake", "apple", "steak", "chicken", "ice cream"};

System.out.print(food);
// [Ljava.lang.String;@59f95c5d
```

What in the world is this?

Object Class: `[Ljava.lang.String`. 

- [ represents an **array**
- L: object (changes based on the array type)
- java.lang.String: the Class of the object (obj.getClass())

Memory Location: `@59f95c5d`

- Probably requires knowledge of **hardware** and bytecode to completely understand

You can employ a **method** to help you print the items in an array. Java does provide one (cover later), but you can generally make your own. 

### You can't compare arrays using ==

Use `array1.equals(array2)`. It's a default method built in. 

```
String[] arr1 = {"hello", "bye", "hello again"};
String[] arr2 = {"hello", "bye", "hello again"};

System.out.print(arr1 == arr2);
// false
System.out.print(arr1.equals(arr2));
// true
```

Reason? Because they **not the same object in memory**. This is a brief look into **pointers**. Just be mindful for now.

## Methods

What is a method?

**Short answer:**... a method is something that performs an action.

**Long answer** (Google): A **method** is a block of code which only runs when it is called. You can pass data, known as parameters, into a **method**. **Methods** are used to perform certain actions, and they are also known as **functions.**

Examples of methods:

- Find largest element in an array
- Remove the period from the end of a sentence
- Convert a string to lowercase 
- Add two numbers
- Sort the elements in an array

There are infinite options!

Let's analyze the structure

### Structure

Here is an example of a method. We'll analyze each part separately.

```java
public static int addNumbers(int x, int y) {
    return x + y;
}
```

<u>**Scope**:</u> This sets the **scope** of the method. Who can access this method? Well, since it's public in the situation above, any **class** within this project. 

Types and who has access:

- Public: **any** class
- Private: only **this** class
- Protected: classes within the same **package** or **subclasses** of the Class (can be in different package)
- Default: classes in the same **package**

<u>**Static vs Non-static**</u>

`static` means that the method belongs to the Class and not an object of the Class. You will learn more about objects and how to access methods through objects later. **Static methods can be called without instantiating an object.**

**Return Type**

It determines what the method **returns**. **You must guarantee you are returning something within a non-void method**. There are a few types:

- Primitive types
  - int, double, boolean, etc.
- Objects
  - String, int[], Potato, etc.
- **void**
  - doesn't return anything
  - performs non-returnable action
  - prints something

<u>**Method Name**:</u>

The name of the Method. It follows **lowerCamelCasing**, just like variable names. You cannot use names that are already defined, such as **int, break, or if**.

<u>**Parameters**</u>

Methods can take in a variable to use. You must declare the **type**, and you can use it assuming it exists within the method itself. You do not need to have parameters. **They only exist within the scope of the method!**

### How to Use

You can call a method anywhere, as long as it is defined and you can reach it. This includes the **main, other methods, and different classes** (with the right scope). You can even call a method within itself (**recursion**). Let's do an example:

```java
public static void printName(String name) {
	System.out.println(name);
}
public static int getLength(String s) {
    printName(s);
    return s.length();
}

public static void main(String[] args) {
    printName("Eric");
    
    // you can use the same variable name as the parameter of the method
    String name = "Bob Tucker";
    printName(name);
    
    // it will print, but also return a number
    int length = getLength("Ice Cream");
    System.out.println(length);
}

// Eric
// Bob Tucker
// Ice Cream
// 9
```

Easy! 

### When would you want to use a method?

Use it when:

- you have code that is repeated a lot (such as adding a number, printing an array)
- Keep code more concise
- have complicated actions to perform
- Recursion
- Probably more stuff

You'll probably know when it will be useful. 

### Let's try some:

#### Example 1

Raise an integer to a positive integer power. 
$$
f(m,n) = m^n
$$
See why it's called a function now?

There's a default method called **Math.pow(double m, double n)**. Only use it **when necessary**. If you have a number squared, prefer x*x over x^2. But we can do this one for fun.

**Format: ** `public static int power(int m, int n)`

#### Example 2

Return largest number in an integer array. 

**Format**: `public static int arrayMax(int[] arr)`

#### Example 3

Find if an integer is repeated in an array

**Format:** `public static boolean hasRepeat(int[] arr)`

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

## Questions?

Dedicated question time!

## Homework

### Part 1: Arrays

Create a new Project named: **FirstNameLastNameClass03.java**.

Create a package named: **firstnamelastname03**

Create a class named: ArraysPractice.java

#### Methods to Create

**Choose 6 of 9**

Create these methods without using the default methods included. For example, don't use `lastIndexOf` to create `lastIndexOf`.

#### 1: lastIndexOf

Write a static method named `lastIndexOf` that accepts an **array of integers** and **an integer value** as its parameters and r**eturns the last index** at which the value occurs in the array. The method should **return -1 if the value is not found.** 

For example, in the list containing {74, 85, 102, 99, 101, 85, 56}, the last index of the value 85 is 5.

#### 2: Range

Write a static method named **range** that takes **an array of integers** as a parameter and **returns the range of values contained in the array.** The range of an array is defined to be one more than the difference between its largest and smallest element. 

For example, if the largest element in the array is 15 and the smallest is 4, the range is 12. If there is only one element, the range is 1. The following table shows some calls to your method and their results (the largest and smallest values are underlined):

#### 3: isSorted

Write a static method named **isSorted** that accepts **an array of doubles** as a parameter and **returns true if the list is in sorted** (nondecreasing) order and **false otherwise**. 

For example, if arrays named list1 and list2 store {16.1, 12.3, 22.2, 14.4} and {1.5, 4.3, 7.0, 19.5, 25.1, 46.2} respectively, the calls isSorted(list1) and isSorted(list2) should return false and true respectively. Assume the array has at least one element. A one-element array is considered to be sorted.

#### 4: kthLargest

Write a static method called **kthLargest** that **accepts an integer k** and an **integer array** as its parameters and returns the element such that **k elements have greater or equal value.** If k == 0, return the largest element; if k == 1, return the second largest element, and so on. 

For example, if the array passed contains the values {74, 85, 102, 99, 101, 56, 84} and the integer k passed is 2, your method should return 99 because there are two values at least as large as 99 (101 and 102). If the array passed contains the values {4, 6, 12, 7, 12, 12} and the integer k passed is 1, your method should return 12, because 12 is the 0th largest element and the 1st largest element. (It also happens to be the 2nd largest element. 7 is the 3rd largest element.) Assume that 0 <= k < a.length. (Hint: Consider sorting the array, or a copy of the array first.)

#### 5: percentEven

Write a static method called **percentEven** that **accepts an array of integers** as a parameter and **returns the percentage of even numbers in the array as a real number.** 

For example, if the array stores the elements {6, 2, 9, 11, 3}, then your method should return 40.0. If the array contains no even elements or no elements at all, return 0.0.

#### 6: longestSortedSequence

Write a static method named **longestSortedSequence** that accepts **an array of integers** as a parameter and that **returns the length of the longest sorted (nondecreasing) sequence of integers** in the array. 

For example, if a variable named arraystores the following values: int[] array = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12}; then the call of longestSortedSequence(array) should return 4 because the longest sorted sequence in the array has four values in it (the sequence -3, 0, 14, 207). Notice that sorted means nondecreasing, which means that the sequence could contain duplicates. For example, if the array stores the following values: int[] array2 = {17, 42, 3, 5, 5, 5, 8, 2, 4, 6, 1, 19} Then the method would return 5 for the length of the longest sequence (the sequence 3, 5, 5, 5, 8). Your method should return 0 if passed an empty array.

#### 7: append

Write a static method called **append** that **accepts two integer arrays as parameters** and **returns a new array that contains the result of appending the second array's values at the end of the first array**. 

For example, if arrays list1 and list2 store {2, 4, 6} and {1, 2, 3, 4, 5} respectively, the call of append(list1, list2) should return a new array containing {2, 4, 6, 1, 2, 3, 4, 5}. If the call instead had been append(list2, list1), the method would return an array containing {1, 2, 3, 4, 5, 2, 4, 6}.

#### 8: Collapse

Write a static method called **collapse** that accepts **an array of integers as a parameter** and **returns a new array containing the result of replacing each pair of integers with the sum of that pair.**

For example, if an array called list stores the values {7, 2, 8, 9, 4, 13, 7, 1, 9, 10}, then the call of collapse(list) should return a new array containing {9, 17, 17, 8, 19}. The first pair from the original list is collapsed into 9 (7 + 2), the second pair is collapsed into 17 (8 + 9), and so on. If the list stores an odd number of elements, the final element is not collapsed. For example, if the list had been {1, 2, 3, 4, 5}, then the call would return {3, 7, 5}. Your method should not change the array that is passed as a parameter

#### 9: vowelCount

Write a static method named **vowelCount** that accepts a **String as a parameter** and **returns an array of integers representing the counts of each vowel in the String.** The array returned by your method should hold 5 elements: the first is the count of As, the second is the count of Es, the third Is, the fourth Os, and the fifth Us. Assume that the string contains no uppercase letters. For example, the call vowelCount("I think, therefore I am") should return the array {1, 3, 3, 1, 0}.

**Hint:** use `string.toLowerCase()` to make things easier.

### Part 2

These don't have arrays. You will practice loops within loops and while loops. 

Create a class in the package named **LoopsPractice.java**.

### Methods to Create

Try coding one with a while loop instead of a for loop. You must do 1-5. You must **attempt** either 6 or 7. If you can get number 6, you will get cool points.

#### 1: Factorial

Write a method named **factorial** that finds the factorial of some integer **n**. 
$$
n! = n\times(n-1)\times\dots\times2\times1
$$

```
Output:
factorial(3) = 3 x 2 x 1 = 6

factorial(9) = 9 x 8 x 7 x 6 x 5 x 4 x 3 x 2 x 1 = 362880
```

#### 2: Reverse

Write a method named **reverse** that takes in an integer and returns the integer in reverse. 

```
Output:
reverse(12345) = 54321

reverse(1) = 1

reverse(1223) = 3221
```

Try doing the same with **strings** without recursion if you know that already.

#### 3: Triangles

Write a method named **printTriangle(int n)** that prints out a triangle in the shape below with **n** rows. It should return **void**.

```
Output:

n = 5
*
* * 
* * *
* * * *
* * * * *

n = 1
*
```

#### 4: Upside-down Triangles

Write a method named **printDownTriangle(int n)** that prints out a triangle in the shape below with **n** rows. It should return **void**.

```
Output:

n = 5
* * * * * 
* * * * 
* * * 
* *
*

n = 3
* * *
* *
*
```

#### 5: Guess my Number!

Write the program in the **main method**. The computer will generate a random number from 0 - 1000 (Random), and you will try to guess. If your guess is too low or too high, the computer should tell you "Guess Higher" or "Guess Lower" (or something like that) until you get the correct number. It should then print how many tries it took for you to get it. Below is a basic example between 0 and 10. 

Use Scanner to get user input. Use Random to generate the computer's number

```
Guess: 1
Too Low! Guess Higher!

Guess: 3
Too Low! Guess Higher!

Guess: 9
Too High! Guess Lower!

Guess: 4
That's right! The number was 4. It took you 4 tries to guess the number!
```

**Hint: uses a while loop.**

#### 6: Reverse-Triangles

This is a hard question. It's a USACO Bronze question. **This is just a bonus.** See if you can get it.

Create a method named **printUpsideDownTriangle**(int rows, int start_value) that takes in two parameters, **rows,** and the **starting value**.

```
Output:
rows = 5, starting_value = 1
		6 
      1 5 
    6 9 4 
  3 5 8 3 
1 2 4 7 2 

rows = 7, starting_value = 5
			5 
          7 4 
        1 6 3 
      5 9 5 2 
    1 4 8 4 1 
  7 9 3 7 3 9 
5 6 8 2 6 2 8 

rows = 3, starting_value = 1
    6
  3 5
1 2 4 
```

If you rotate it 90 degrees clockwise, you will see that it increments in rows. This is that, but sideways. The initial value is on the bottom left. It goes up vertically and increments by 1. If the number increments from 9, it will go back to 1. 

1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, ...

#### 7: Minimum Distance

Create a method called minDistance(String word, char regex). It should find the minimum distance between    multiple occurrences of the regex (difference between the indices). If there is an `'a'` at index 0, 5, and 7, it should return 2, since 7 - 5 < 5 - 0. If there is only one instance of the regex, return -1. 

```
Output:

minDistance("hello my name is eric", 'e') = 5 (last two e's).

minDistance("ababbabbbba", 'a') = 2 (index 0 and index 2)

minDistance("potato", 'r') = -1
```

**Hint: ** You might want to use `Integer.MAX_VALUE` or `Integer.MIN_VALUE`. You will also need `str.charAt(int index)` to use a for loop. You will likely need two for loops. If you only use 1, I will be impressed. 

#### Hints

If you want any hints, post in the forum! I will send out hints for each one you need. These aren't trivial. You might have to google some stuff, but please try it on your own first...

**Test your methods. Try various situations. Make sure you account for outlier conditions or strange inputs (that are legal, obviously).**

Don't be afraid to work together. I'll send you a Discord link.

### Export the file and hand in before class on Thursday.