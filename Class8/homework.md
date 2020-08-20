# Lesson 8 HW

Name Project: FirstName + LastName + JavaClass08

Create a new package called **shape**

This will be an easier version of what I tried to show you earlier. 

## Step 1: Shape

Create an **interface** called `Shape` with the following methods:

- `public double computeArea()`
- `public double computePerimeter()`

## Step 2: Quadrilateral

Create an abstract class called `Quadrilateral` that **implements** the interface `Shape`

### Instance Variables:

- 4 double variables for the side lengths `s1, s2, s3, s4`

### Methods

Implement the `computePerimeter()` method

## Step 3: Parallelogram

Create a class called `Parallelogram` that **extends** the Quadrilateral Class

### Instance Variables:

- you inherit s1, s2, s3, and s4 
  - you can do `this.s1`
- create `double angle` instance variable that represents the **smallest angle of a parallelogram**
  - in degrees

### Constructor

Create a constructor that takes in 2 sides and an angle

```java
public Parallelogram(double s1, double s2, double angle) {
	this.s1 = s1;
    // implementation
}
```

### Methods

Implement the `computeArea()` method

- Side 1 * Side 2 * sin(smallest angle in radians)
- Use `Math.sin()`
- Use `Math.toRadians(double angle)`

If you don't know how to do this email me lol...this uses Trigonometry

## Step 4: Rectangle and Square

Create two classes named `Rectangle and Square`

`Rectangle` extends `Parallelogram` and `Square` extends `Rectangle`

Only include the constructor (**everything else is already inherited, good for you**)

### Constructors

You need to create constructors for both

`Rectangle` should take in 2 sides and call the super

`Square` should take in 1 side and call the super

**Hint: **what is the angle value for rectangle 

## Step 5: Circle

Create a class called `Circle` that **implements** Shape

### Instance Variable

- `double radius`

### Constructor

Create a constructor that takes in 1 argument: **radius**

### Methods

Implement both

`computePerimeter()`

- return the **circumference**
- use `Math.PI`

`computeArea()`

- use `Math.PI`