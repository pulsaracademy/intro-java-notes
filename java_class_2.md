# Java Class 2

## Project Setup

Let's create a **Java Project** called **JavaLesson02**. 

Let's create a package called. **lesson02**. It doesn't really matter for this project.

Under the package, let's create a class called **Main.java**.

Let's continue!

## Variables Continued...

### Strings

Letters, characters, Unicode, you name it. 

In Python:

```python
s = 'I am the coolest guy on earth.\n\n'
```

In Java:

```java
String s = "This is a string\n\n\n";
```

You might see that it doesn't have the `new ObjectName()` portion. Why? It's because Strings are unique and used very frequently. Java makes an exception to them. String is lucky.

##### Escape Sequences

They are the same as Python

- **\n: new line**
- **\t: tab**
- **\\\: Backslash**
- \b:  backspace in the text
- **\\\": Double quote**
- **\\': Single Quote**
- \f: form feed
- \r: inserts a carriage return in the text

**Bold**: The ones you will likely use.

Note: Chars are **primitive**. Just because they use quotes does not mean they are an object.

Bigger note: Strings **MUST** use** **double quotes** and chars **MUST** use single quotes. This isn't python.

### The Null 

Null is for Java as None is for Python. It assigns "nothing", an empty object to a variable. Essentially, it does not exist yet. We will cover its usage somewhere down the line. Only **objects** can be assigned null. You **cannot assign** `null` to a primitive variable

```java
MyObject obj = null;
```

#### Comments

Comments are made using `//` instead of `#`. Blocks of comments are: `/* */`. 

Docstrings for python are `/** */` for Java. 

Commented code is not run. 

You should comment your code to make things more understandable. 

Create documentation for every project as good practice.

## Manipulating Data

### Arithmetic Operators

Do not try to do arithmetic with different variable types. It will not be good a lot of the time. It is recommended to use casting explicitly (later).

| Operator | Description                                 |
| -------- | ------------------------------------------- |
| +        | Additive operator (or String concatenation) |
| -        | Subtraction operator                        |
| *        | Multiplication operator                     |
| /        | Division Operator                           |
| %        | Remainder Operator (Modular Arithmetic)     |

Remember to follow PEMDAS!

Always choose to use parentheses when you can. It makes the code much easier to read and is good practice.

Integers use concatenation on division

```java
int x = 1;
int y = 2;

System.out.print(x / y);
>>> 0
```

### Unary Operators

| Operator | Description                                               |
| -------- | --------------------------------------------------------- |
| +        | Unary plus operator, indicates positive value (optional)  |
| -        | Unary minus operator; negates an expression               |
| ++       | Increment operator; increments by 1                       |
| --       | Decrement operator; decrements by 1                       |
| !        | Logical complement operator; inverts the value of boolean |

```java
int i = 1;
i++; // i = 2
i--; // i = 1
System.out.print(!true); // false
```

**Increment order** matters:

```java
int x = 1;
System.out.print(++x); // 2
System.out.print(x); //2

int x = 1;
System.out.print(x++); // 1
System.out.print(x); //2
```

This can get confusing:

```java
int a = 10, b = 5, c = 1, result;
result = a-++c-++b;
    	
System.out.println(result);
```

### Operator Precedence

For your reference. You can figure it out by yourself.

![](C:\Users\ericc\AppData\Roaming\Typora\typora-user-images\image-20200727034309460.png)

### Stuff with Strings

`+` is the concatenation operator.

Essentially, it combines Strings.

```java
String message = "Hi, my name is";
String name = "Eric";

System.out.print(message + name); 
// Hi, my name isEric

System.out.print(message + " " + name);
// Hi, my name is Eric

String fullName = name + " Chen";
System.out.print(fullName);
// Eric Chen
```

Nice.

This is the only way to combine strings. There is no fancier method. Python is cooler in that sense.

#### Some Common Methods that Come with Strings

- substring
- replaceAll
- strip
- trim
- indexOf
- getClass
  - default Object method
- charAt
- lastIndexOf
- isEmpty

**Consult Documentation for more!**

### Variable Assignment Shortcut

I want to add something to my variable and assign it to the variable after. Is there a quick way to do this? Yes!

```java
// perfectly valid
int x = 1;
int y = 2;
x = x + y;
// x = 3

// a bit better
int x = 1;
int y = 2;
x += y;
// x = 3
```

Works for all other operators, too!

The right-hand side is calculated first. 

### Order Matters

Don't mess up the order when printing statements or assigning variables.

```java
System.out.print("2 + 2 = " + 2 + 2);
// 2 + 2 = 2 + 2
```

Well that's pretty obvious...

```java
System.out.print("2 + 2 = " + (2 + 2));
// 4
```

Great, make sure to respect your ordering. 

## Scanner for Inputs

Remember "import" from python?

Scanner is essentially the same thing, but Java style. Scanner can be used to receive user input, read files, and more. But we'll use it for user input.

Scanner is not imported by default. Let's import it.

```java
import java.util.Scanner;
```

Great! Now what?

We can see Scanner is a class. That probably means that Scanner is an object. Let's create a Scanner object.

```java
Scanner sc = new Scanner(System.in);
```

What's `System.in`? It's an **input stream.** This stream is already open and ready to supply input data. Typically this stream corresponds to keyboard input or another input source specified by the host environment or user.

Well, it's not doing anything right now. Let's do something!

```java
System.out.print("What's your name? ");
String name = sc.nextLine();
```

You might see other options for different variable types. 

- `sc.nextLine()` expects a **String**
- `sc.nextInt()` expects an **Integer**
- `sc.nextDouble()` expects a **Double**

There are specific methods for reading files. We'll ignore them for now.

Well, what happens after we press enter while running the main method? Nothing... that's because we haven't done anything with the `name`!

```java
System.out.print("Your name is " + name);
```

Cool!

Why am I getting a yellow notification? Scanner's not closed? Why does that matter? 

Answer: It can allow a **resource leak.** Resource leak happens when a program doesn’t release the resources it has acquired. As OS have limit on the number of sockets, file handles, etc., thus its extremely important to manage these non-memory resources explicitly. So we explicitly call the **close() method** free up resources .

```java
sc.close();
```

Does it matter for us? Probably not. But it's best practice.

### Imports

What are imports?

Well, you can load in libraries that aren't automatically loaded. If there's no use for it, then why bother wasting resources. However, if we do need it, then we better import it, otherwise Eclipse will yell at us.

Examples of things to import: `Random, Math, Scanner, ArrayList`

You will import the class based on it's location in the directory. Some files are deep within the JRE library. We'll find them!

```java
import java.util.Random;
```

What if I don't know where the class location is?

Search it up. Google is your friend :). 

Now you can use the **Random** class. 

## The If-Else-If-Else Statement

### Relational Operators

| Symbol     | Meaning                  |
| ---------- | ------------------------ |
| ==         | Equal to (primitive)     |
| !=         | Not Equal to (primitive) |
| >          | Greater than             |
| <          | Less than                |
| >=         | Greater than or Equal to |
| <=         | Less than or Equal to    |
| instanceof | Object Class association |

You're probably familiar with these already. Use them normally. 

```java
System.out.print(1 == 1);
// true
System.out.print(3 <= 1);
// false
System.out.print("hello" instanceof String);
// true
System.out.print("hello" instanceof Object);
// true
```

### Objects

Use **equals()** to compare objects. It's not the same as `==` for python or `==` for JavaScript. Why? Well, I'll show you why! Testing object **equality** signifies that they are the exact same object in **memory**,  whether they **point** to the same object. What if you want to test if they have the same attributes? Exactly, it fails. 

Instead, **equals()** allows you to compare **aspects** of the objects (override if necessary). More on this when we learn how to create objects. Here's an example:

```java
// Right implementation
String s = "string";
System.out.print(s.equals("string"));
// true

// Wrong implementation, even if it works
String s = "string";
System.out.print(s == "string");
// won't work, since they will be different objects techincally
```

### Syntax

Most of the time, an if statement will look like this:

```java
if(expression1) {
    // Do something
}
else if(expression2) {
    // Do something
}
else {
    // Do something
}
```

Expressions must return `true` or `false`.

Unlike Python, Java uses `else if ` instead of `elif`. Otherwise, they are identical. 

It goes top down. Everything on top should be more specific than what's below it, otherwise, it will not work out the way you want it to. (We'll do an example)

If you have many else ifs, consider using a **switch statement** (future).

That's it!

If you've never programmed before, this is pretty intuitive. Let's do an example with **pseudocode**:

```java
if("I have more than 3 apples") {
    print("You have more than 3 apples")
}
else if("If I have more than 2 apples") {
    print("You have more than 2 apples")
}
else if("If I have more than 1 apple") {
    print("You have more than 1 apple")
}
else {
    print("You have 1 or fewer apples.")
}
```

#### Nested If Statements

You can put **if statements** inside other **if statements**. Makes sense, right?

```java
if(statement) {
	if(statement) {
		// Do something
	}
	else {
		// Do something
	}
}
else {
    // Do something
}
```

If **A is true**, then **let me test if B is true.**

#### And and Or

What if you have more conditions?

Well, good for you! We have `&&` and `||` for **and** + **or**.

This can save you from doing **nested if statements** or just makes your code more efficient!

```java
// AND example
System.out.print((3  >= 1) && (4 == (2 * 2))); 
//true 

// OR example
System.out.print(("Eric".toLowerCase().equals("eric")) || (3 > 6));
//true
```

## Guess the die using Random, Scanner, and If Statements

Let's have the computer roll a random die, and we'll try to guess it. 

We know we need to get user input...so we need **Scanner**. One way to generate random numbers is using the **Random** class.

#### Random

Let's create our virtual dice. We know we want a number between 1 and 6, inclusive. 
$$
1 \leq x \leq 6
$$
Let's create a **Random object**. We want to generate a random **integer**, so we can use Random's nextInt() function.

**nextInt(int bound)** returns a number between **0** and **bound-1**, inclusive. So, if we did **random.nextInt(6)**, it would return a number between **0** and **5**. Since we want 1 through 6, we can just add 1 to the total.

Let's implement that!

``` java
Random random = new Random();
int num = random.nextInt(6) + 1;
```

Note how we can use the variable ***random***. We cannot use a variable called"Random", since that is the name of the class, and that it is capitalized. You cannot use the word "int" as a variable since the data type is already lowercase. That's a difference between primitives and objects.

#### Scanner

Now we want the user to make a guess! Let's use **Scanner**. Same deal as the examples from earlier

```java
Scanner sc = new Scanner();
int guess = sc.nextInt();
sc.close();
```

#### Let's check!

We need to compare the actual **num** and the **guess** to see if they're equal. How do we do that? Right! If statements! Let's have the program tell us it we guessed write or wrong.

```java
if(num == guess) {
	System.out.print("You guessed the number right!");
}
if(num != guess) {
    System.out.print("You guessed the number wrong!");
}
```

You can see that this works perfectly. But realize, this is not **optimized**. We can improve it. Instead of checking whether **num** is not equal to **guess**, let's just use an **else** statement.

Also, let's tell the user what the correct number was! 

```java
if(num == guess) {
    System.out.print("You guessed the number right! It was " + num);
}
else {
    System.out.print("You guessed the number wrong. The correct answer was " + num)
}
```

Finished!

## The For Loop

The **for-loop** is essential to any programming language. It iterates through a number of cycles. 

Google says: In computer science, a **for-loop** is a control flow statement for specifying iteration, which allows code to be executed repeatedly.

It probably makes more sense in an example.

```java
for(int i = 0; i < 5; i++) {
	System.out.print(i);
}
```

The variable **i** is the object that is being incremented. The most common iterated variables are **i, j, and k**, but you can choose whatever variable you want. They only exist within the **scope** of the loop, but it is not advised to use them outside the loop. 

The iterator always begins at a **number**. As long as it meets the **condition**, the for-loop will **continue**. Once it does not meet the condition, it **breaks**. It keeps **incrementing** until the loop breaks. If the condition is **never met**, it is called an **infinite loop**. This is **not desirable**, so make sure it **never happens while you are using a for loop**. If you see that it keeps running, then something with your logic is flawed.

Remember, the conditions in a for loop are separated by **semi-colons**. This will always be the format.

```java
for(statement1; statement2; statement3) {
	// code goes here
}
```

- **Statement1**: The initial value for the iterator
- **Statement2**: The condition the iterator must meet for the for-loop to continue.
- **Statement3**: The increment of the iterator
  - Add 1 each time
  - Subtract 3 each time
  - Multiply by 5 each time (not recommended for most situations)

The most common increment is either adding or subtracting.

### Examples

#### **Let's print even numbers less than 10.** 

We can just increment **i** by 1 starting from 0, and check if it is evenly divisible by 2. If it is, we can print it to the console.

```java
for(int i = 0; i < 10; i++) {
	if(i % 2 == 0) {
        System.out.print(i);
    }
    // we don't need an else statement, since it won't print anything
}
```

This is **not efficient**. Why don't we just increment by 2 each time, since we know even numbers are just numbers divisible by 2? This removes the if statement completely.

```java
for(int i = 0; i < 10; i+=2) {
	System.out.print(i);
}
```

#### **Let's print the odd numbers less than 10.** 

There are actually two good ways of doing this.

```java
for(int i = 0; i < 10; i+=2) {
    // even number + 1 = odd number
	System.out.print(i + 1);
}
```

This works. We know odd numbers are just even numbers plus or minus 1. Since we can't go negative, we add 1 to each "i". 

Or, we could try to print **i** directly.

```java
for(int i = 1; i < 10; i+=2) {
	System.out.print(i);
}
```

Great!

#### Let's sum all the numbers from 1 to 100. 

We want to keep track of of counter, the sum of all the numbers up to what we have so far. Let's call that counter the **sum**.

We want to cycle through each number between 1 and 100. Every time we reach a new number, we add it to the ongoing sum, until we reach 100.

```java
int sum = 0;
// loop
for(int i = 1; i <= 100; i++) {
	// Add i to the sum. Or we could do sum = sum + 1 if we wanted.
    sum += i; 
}

System.out.print("The sum is: " + sum);
// The sum is 5050
```

## Arrays

What is an array? An **array** is a data structure, which can store a fixed-size collection of elements of the same data type. An **array** is used to store a collection of data, but it is often more useful to think of an **array** as a collection of variables of the same type.

It's essentially a list of items of a fixed length.

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

![](C:\Users\ericc\OneDrive\Documents\PulsarAcademy\IntroJava1\array-index.gif)

Therefore, we need to use **n-1** to get the **nth** element. 

So, as you can see from above, we can access the element using the variable name + [index we want].

For the **nth-element**, that would look like

```java
// n is the index you want
dataType[] array = {// stuff};
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

### Iterating through an array

What if we want to print all the elements in an array?

Use a for loop. But how? Simple:

```java
int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

for(int i = 0; i < arr.length; i++) {
	System.out.print(arr[i]);
}
```

Note how we can use `length` instead of `length - 1`, since we are using "less than". 

## Exporting a Java Project

Go to File >> **Export**

Search: **Archive File**

Select the Project to export. 

Enter in the **Destination Location**.

Leave the default .ZIP and other options. 

**Export!**

This allows you to **condense** and **save a project** for other people to use. It'll mainly be used for you to submit homework. We'll learn how to import a Project as well. Don't worry. 

## Homework

Create a Project named: **FirstNameLastNameClass02**

Create a package named: **firstnamelastname**

Choose 2 of 3

### Part 1

Create a class named: **RockPaperScissors.java**

Create a **rock-paper-scissors** program in the **main method**. It should take in a user input, and it should compare it to a randomly generated one. If you win, it should tell you that you won. Do the same if you tie, or lose. Play 3 games, and print out how many you won at the end. Print out the # of each match. Match the formatting below! Assume the user enters in valid values (no extra spaces/capital letters, numbers, etc.).

Example situation:

```
Match #1. 
Rock, paper, or scissors: rock // you enter
You lost! The computer picked paper!

Match #2.
Rock, paper, or scissors: scissors
You won! The computer picked paper!

Match #3.
Rock paper, or scissors: scissors
You tied! The computer picked scissors!

You won 1 game(s). 
```

**Hints:** You will need to use **Scanner, Random**, **if statements**, and a **for loop**. There are many ways to do this. Since you have 3 options, you can generate the random choice using `Random.randInt(3)`, and convert the number to either rock, paper, or scissors. 

Remember that you can create a variable without setting it to anything yet.

```java
int x;
if(something) {
    x = 1;
}
else if(something else) {
    x = 2;
}
else {
    x = 3;
}
```

### Part 2

Create a class named: **PrimeNumbers.java**

Implement the problem in the **main method**. 

The computer should ask the user to enter in a **positive integer**. Assume the person enters in a valid number. The computer should print out whether the number entered is **prime**.

A **prime number** is a number that has no other factors other than **1** and **itself** (exception: the number **1**).

Examples include: **2,** **5**, **107**, and **29**. Note how **2** is the only even prime.

Non-prime numbers have other factors. For example, 4 is not prime. 4 is divisible by 2. **20** is not prime: 20 is divisible by 1, 2, 4, 5, 10, and 20.

You only need to run the program once.

Example result:

```
// Example 1
Enter in a positive integer: 13

13 is a prime number.

//Example 2
Enter in a positive integer: 25

25 is not a prime number.
```

 **Strategy: Let **n** be the number the user chooses. We can manually check every single number less than **n** and count if there are any numbers that divide **n**. If there are, then **n** is not prime, and vice versa.

If you are familiar with prime rules, you might know that you only need to check up to numbers less than the **square-root of n**. You can try this if you want. The **square-root** function in java is **Math.sqrt(int num)**. Note that Math is capitalized, as it is class.

**Bonus:** If you have time. Print out all numbers less than 100 that are **prime** by using a loop. 

**Hint:** you will probably need nested for loops. 

## I have a question!

Well, ask us! We have a forum! Email me!

You can also ask Google!

Or consult the documentation! **This is useful. Mostly once you don't have a teacher**.

Good places to ask once you are more advanced: **Stack Overflow, Reddit**

Ask your parents if they know how to code. Watch YouTube videos. Re-watch our lesson videos. 

Most of my stuff will probably end up on the **GitHub Repository.** I'll send out an email when that's configured. It will be on https://github.com/pulsaracademy. 

I'll teach you how to use one near the end. It's important to **back-up** any projects.