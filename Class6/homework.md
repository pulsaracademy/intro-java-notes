# Lesson 6 Homework

Create a project called **FirstName + LastName + Lesson06**

Create a package called **firstName + lastName**

## Part 1

This is very similar to what I needed to do to make each course on Pulsar Academy. I created a class with some of these attributes (way more), but they will be similar.

Create a class in the package called **Course.java**

### Attributes

Create these instance variables (make them `private`):

- String: `courseName`
- String: date (just format it MM/DD/YY)
- Integer: `difficulty` 
  - Assume it's on a scale 1-5
- Double: `cost`
- String: `Instructor`
  - Assume "Eric" or "Maxwell"
- String: `Programming Language`

### Constructors

1. Create a constructor that uses all of those attributes/parameters. Make it public
2. Create a constructor with no parameters. Assign defaults to whatever you would like
3. Create a constructor with just the course name, and set the rest to values of your choosing except programming language
   1. Set programming language to the last word of the course name. If the course name is **Intro to Java**, the programming language should be set to "Java" without you manually doing it. If the course name is "Intermediate Python", it should be set to "Python" by default.

### Getters and Setters

Create getters and setters for all of the attributes.

Make them all public

```java
// Repeat for all variables
public getCourseName() {
	return this.courseName;
}
```

### Instance Methods

#### toString

Create a public instance method that returns the `courseName`.

#### equals

Create a public instance method that returns true if all the attributes are equal, or false if they are not equal.

Hint: It should look like this:

```java
public boolean equals(Course c) {
	// implementation
}
```

#### isDifficult

Create a public instance method that returns whether the course is difficult. 

If the course difficulty is greater than 3, return true. Otherwise, return false.

