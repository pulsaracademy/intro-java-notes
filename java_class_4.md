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