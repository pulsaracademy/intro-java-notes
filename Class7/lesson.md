# Class 7: Inheritance

## A brief use of objects to do stuff

Let's create a class called **Point**

```java
public class Point {
	double x;
	double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
}
```

What if we want to use these points to create a line on a Cartesian Plane?

Let's do this:

- create a Line Class that expresses lines as slope-intercept form
- Constructor takes in a slope and intercept or two points

```java
public class Line {
	double slope;
	double intercept;
	
	public Line(double slope, double intercept) {
		this.slope = slope;
		this.intercept = intercept;
	}
	
	public Line(Point p1, Point p2) {
		
		if(p1.x == p2.x) {
			throw new IllegalArgumentException("Cannot be represented in slope-intercept format");
		}
		
		double slope = (p2.y - p1.y)/(p2.x - p1.x);
		double intercept = p1.y - slope * p1.x;
		
		this.slope = slope;
		this.intercept = intercept;
		
		
	}
	
	public String toString() {
		return "y = " + slope + "x + " + intercept;
	}

}
```

## Setup

### Dog Class

Let's include these attributes:

- breed
- number of legs
- size
- gender
- color
- whether dog is short hair
- whether dog chases balls

Let's add some random methods:

- move
- bark
- walk

```java
public class Dog {
    
    public String breed;
    public int legs;
    public int size;
    public String color;
    public String gender;
    public boolean isShortHair;
    public boolean chaseBalls;
    
    public Dog(String breed, int legs, int size, String color, String gender, boolean isShortHair, boolean chaseBalls) {
        // implementation
    }
    
    public void move() {
        System.out.print("Dog is moving");
    }
    public void walk() {
        System.out.print("Dog is walking");
    }
    
    public void bark() {
        System.out.print("Dog is barking");
    }
}
```

### Cat Class

Let's include these attributes:

- breed
- legs
- size
- gender
- color
- whether cat has short hair
- whether cat goes outdoors

Methods:

- move
- meow
- walk

```java
public class Cat {
    
    public String breed;
    public int legs;
    public int size;
    public String color;
    public String gender;
    public boolean isShortHair;
    public boolean goesOutDoors;
    
    public Cat(String breed, int legs, int size, String, color, String gender, boolean isShortHair, boolean goesOutdoors) {
        // implementation
    }
    
    public void move() {
        System.out.print("Cat is moving");
    }
    public void walk() {
        System.out.print("Cat is walking");
    }
    
    public void bark() {
        System.out.print("Cat is meowing");
    }
}
```

Wait... these are shocking similar

## Establishing a Super Class

In our example, dogs and cats share almost all the same features. How do I simplify this process? I don't want to repeat shared methods and attributes, that takes a lot of time!

Good thought! Why don't we add a parent class!

What does that mean?

A **super class** is the top of the hierarchy, which contains generalized information that can be **inherited** by its child classes

**Inheritance**: **Inheritance** in **Java** is a mechanism in which one object acquires all the properties and behaviors of a parent object. ... The idea behind **inheritance** in **Java** is that you can create new classes that are built upon existing classes. When you **inherit** from an existing class, you can reuse methods and fields of the parent class.

So what could be a parent class to Dogs and Cats? How about **Animals**?

Let's create an animal class

```java
public class Animal {
    
    public int legs;
    public int size;
    public String color;
    public String gender;
    
    public Animal(int legs, int size, String color, String gender) {
        // implementation
    }
    
    public void move() {
        System.out.print("Animal is moving");
    }
     
}
```

This looks like a pretty solid implementation. It has what most animals would probably have. Obviously it could be better, but this represents the basic idea.

What now?

Let's do some inheritance:

```java
public class Dog extends Animal {
   	public String breed;
    public boolean isShortHair;
    public boolean chaseBalls;
    
    public Dog(String breed, int legs, int size, String color, String gender, boolean isShortHair, boolean chaseBalls) {
        super(legs, size, color, gender);
        this.breed = breed;
        this.isShortHair = isShortHair;
        this.chaseBalls = chaseBalls;
    }
    
    public void bark() {
    	System.out.print("Dog is Barking");

    }
    
    @Override
    public void move() {
    	System.out.print("Dog is Moving");

    }
    
    public void walk() {
    	System.out.println("Dog is walking");
    }
    
    public static void main(String[] args) {
		Dog dog = new Dog("Shorthair", 4, 75, "blue", "male", true, false);
		
		dog.move();
	}
}
```

Keywords: 

- extends (tells Java you are inheriting from a class)
- Override: tells Java you are overriding an existing method within the Super Class
- super: references the super class 

It's the same process for Cat. 

![](./typesofinheritance.jpg)

### Things to Note

You might've realized that Animal is not a good super class for things like Dogs and Cats. There need to be way more layers than that to make it useful. There's actually a much better way to make a generalized Animal class, but we'll talk about it later. 

### Why is this useful?

Well, we can avoid repetition for things that are very similar. For example, if you wanted to create a Parent Child Relationship...

Let's do that, actually. 

## We will continue from here...I'll update the notes soon. 



