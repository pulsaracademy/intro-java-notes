# The 9th Circle

Almost Done!

# `ArrayLists`

What is an array list?

The `ArrayList` class is a resizable array, which can be found in the `java.util` package.

It is similar to that of a `list` in Python.

## Creation and Syntax

```java
ArrayList<String> cars = new ArrayList<String>();
ArrayList<String> cars = new ArrayList<>();
```

Note how the second `String` argument is optional. 

Remember to import it:

```java
import java.util.ArrayList;
```

## Adding Elements

There is nothing to initialize in an `ArrayList`. You can however add as many elements as you please. 

```java
ArrayList<String> cars = new ArrayList<String>();

// adds element to end of list 
cars.add("BMW");
cars.add("Telsa");
cars.add("Mercedes");
cars.add("Audi");
```

The elements will be added in the order you input them into the `List`.

### Adding Elements to a specific index

You can also add elements by the index. Indices work the same as they do for Arrays. 

```java
ArrayList<String> fruits = new ArrayList<String>();

fruits.add("Apple");
fruits.add("Orange");
fruits.add(0, "Pumpkin");

// [Pumpkin, Apple, Orange]
```

The elements will be shifted to the right. You can only add elements from index 0 to the length of the list. For example, if there are 3 elements, you can add elements at index 0 - index 3 inclusive.

### Adding a list to an `ArrayList`

You can also add a whole `ArrayList` to an `ArrayList`.

It takes in a `Collections<> Object.` That shows you that `ArrayList` is a subclass of the `Collections` class. It does not work for Arrays. It uses the `addAll()` method.

```java
ArrayList<String> fruits = new ArrayList<String>();

fruits.add("Apple");
fruits.add("Orange");
fruits.add(0, "Pumpkin");

ArrayList<String> food = new ArrayList<String>();
food.add("Pizza");
food.addAll(food);
[Pizza, Apple, Orange, Pumpkin]
```

## Printing an `ArrayList`

Unlike normal arrays, `ArrayLists` have a `toString` method that prints out the array in a standard format.

```java
System.out.println(cars);
// [BMW, Tesla, Mercedes, Audi]
```

Nice.

## Removing An Element

Unlike Arrays, `ArrayLists` sizes are dynamic. The length will always be the same as the number of elements inside the `ArrayList`. You can remove an element as well as add them.

You can remove either an index or an object using the `.remove()` method.

```java
// remove a specific index
cars.remove(0);
// [Tesla, Mercedes, Audi]

// removes first instance of this object
cars.remove("Audi");
// [Tesla, Mercedes]
```

Notice how the `ArrayList` resizes. That's something you need to keep in mind when iterating through an `ArrayList`. 

## Getting an Element

You can obtain an element by an index using the `.get(int index)` method.

```java
ArrayList<String> cars = new ArrayList<String>();

// adds element to end of list 
cars.add("BMW");
cars.add("Telsa");
cars.add("Mercedes");
cars.add("Audi");

cars.get(0);
// BMW
```

## Modifying an Element

You can change an existing element by modifying it's index using the `.set()` method.

```java
ArrayList<String> cars = new ArrayList<String>();

// adds element to end of list 
cars.add("BMW");
cars.add("Telsa");
cars.add("Mercedes");
cars.add("Audi");

cars.set(0, "Ferrari");
// [Ferrari, Tesla, Mercedes, Audi]
```

## Converting to an Array

You can convert a list to an array using the `.toArray()` method.

The `.toArray()` method will return an `Object[]` object, so you will need to cast. 

```java
ArrayList<String> cars = new ArrayList<String>();

// adds element to end of list 
cars.add("BMW");
cars.add("Telsa");
cars.add("Mercedes");
cars.add("Audi");

String[] carsArray = (String[]) cars.toArray();
```

## Other Types

Notice how `ArrayLists` use the `<>` symbols to set the type. Unlike arrays, `ArrayLists` expect an `Object`. 

Something like this is invalid:

```java
ArrayList<int> nums = new ArrayList<int>();
```

Oh no! Does this mean we can't create `ArrayLists` with primitives?

Actually, we can. Good thing we know about wrapper classes!

```java
ArrayList<Integer> nums = new ArrayList<Integer>();
```

Just use the wrapper classes in place of the type. Guaranteed to work. 

### A Note

A lot of the time, people will use this syntax to create an `ArrayList.`

```java
List<String> list = new ArrayList<String>();
```

`List` is an abstract class that represents List type objects. I believe it is a subclass of `Collections`. People like to do this to generalize the `ArrayList`. You can decide whether or not to do this.

# Iterating through an `ArrayList`

### The `.size()` method.

This is the same as `.length` for Arrays and `.length()` for Strings. It returns the size of the `ArrayList` following the same rules. 

With this info, we can iterate through an `ArrayList` simply with a for loop.

```java
for(int i = 0; i < cars.size(); i++) {
    System.out.print(cars.get(i) + " ");
}
```

A For Each Loop also works:

```java
for(String s: cars) {
	System.out.print(s);
}
```

### Exercises

`avg`: Find average number in a list

`max`: Find maximum number in list

`swapPairs`: Swap every two pairs of arguments in a list

`removeEvenLength`: Remove all strings in list with an even length

- note how you have to modify the index

`removeDuplicates`: Removes all duplicate objects in a list

# Recursion

Recursion is a way where a method calls itself. 

## Brief Explanation

Do you know the Fibonacci Sequence? It's a sequence where the next number in the sequence is the sum of the previous two, starting with two 1's.

```
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
```

It goes on forever. 

In math, it can be represented as this:
$$
a_n=a_{n-1} + a_{n-2}
$$
Where n is the nth term in the sequence. As you can see, the sequence calls on itself. 

Let `fib(int n)` represent the the nth Fibonacci number. This is how **you** would calculate the 5th Fibonacci number purely following the math rules:

```
Step 1
fib(5) = fib(4) + fib(3)

Step 2
fib(4) = fib(3) + fib(2)
fib(3) = fib(2) + fib(1)

Step 3: These are predefined
fib(1) = 1
fib(2) = 1

Step 4:
fib(3) = 1 + 1 = 2
fib(4) = 2 + 1 = 3

Step 5:
fib(5) = fib(3) + fib(4) = 2 + 3 = 5
```

A computer would similarly do this, but even less efficiently. However, recursion is very important to solve many problems. It comes up a ton in an algorithms class.

Note how Fibonacci has an endpoint. `fib(1)` and `fib(2)` must be defined, otherwise the method will run forever (`fib(-1) = fib(-2) + fib(-3)`). So we must set it to our values of 1 and 1. 

**Note: **All recursive methods **must have an endpoint**.

### Implementation of Fibonacci

```java
public static int fib(int n) {
	if(n == 1) {
        return 1;
    }
    if(n == 2) {
        return 1;
    }
    
    return fib(n - 1) + fib(n - 2);
}
```

You can call yourself by invoking the method name. In this case, we inputted `fib(n-1)` and `fib(n-2)`. You must have the right amount of arguments and such. 

Note how many calculations something like fib(100) would need to do. It would need to cascade down the from fib(100) to fib(1). It is `O(2^n)` time, if that means anything to you. 

This is definitely not the best way to implement Fibonacci, but it demonstrates a principle. 

I think the best way to demonstrate recursion is through examples rather than lecture. Let's do a few:

## Examples

### `sumDigits`

Sums digits of an integer

### `count7`

counts the number of sevens in a number

### `powerN`

Exponentiation of two positive integers. 

### `countVowels`

Counts the number of vowels in a String

### `reverseString`

Method name