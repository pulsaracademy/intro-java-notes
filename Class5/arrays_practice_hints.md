# Hints for ArraysPractice

## Part One (Class 3)

### 1: lastIndexOf

Last time I will give a hint for the structure: It takes in an **array of integers** and an **integer value**. It **returns an index,** which is an **integer**. Methods should be **static** and **outside the main method**.

It should look like this:

```java
package ericchen03
    
class ArraysPractice {

    public static void main(String[] args) {
        // stuff
    }
    
    // arr is the array to take in, value is the value we're looking for
    public static int lastIndexOf(int[] arr, int value) {
        // implementation
    }

}
```

Good, now figure it out for the rest.

You will need a for loop to compare each value in the array to the value you're looking for. Think about traversing an array backwards...

**Note: You can have multiple return statements if you have conditions**. Look to the notes, as I have added that section.

It's now on the website...

### 2: Range

Remember how we found the largest value in an array? Well you can do that with the smallest value, but in reverse. Keep track of those numbers when you use a for loop. Return a difference.

It's now on the website...

### 3: isSorted

Well, if an array is sorted, make sure that each number in an index greater than the one before it should be larger. Either **keep track of a variable** or use a **break statement**. Be careful.

It's now on the website...

### 4: kthLargest

There's a default method called `Arrays.sort(int[] arr)`. Feel free to use it...

### 5: percentEven

Keep track of the even numbers. Use the length of the array. Do some number formatting and division. Know `int vs boolean.`

### 6: longestSortedSequence

This one is tricky. Keep track of the current max sequence, the index, and so-on. Create a counter that keeps track of the ongoing sequence. 

### 7: append

Create a new array with the new desired length. Use a for loop to add new elements...

### 8: collapse

Create a new array. Make sure the length is correct for odd vs. even length arrays. Now traverse with a for loop using += 2...

### 9: vowelCount

A E I O U. Create an array. Add one to each element whenever you encounter one in the array (with for loop). **Note: default value of integer array is 0.**

## Part Two

### mode

Literally put up the solution on the website. Make sure you understand why it works (or maybe I made an error, in which case you should fix it).

### stdev

Calculate the mean of all the numbers first, and store it as a double (for loop). Calculate the square of the difference between each element and the mean. Use `x * x` to square a number instead of `Math.pow()`. The square of both a negative and a positive number is positive, so you don't need `Math.abs()`. Take the square root, finally, using `Math.sqrt()`. 

This isn't a hint, I just told you how to do it. 

### isUnique

Use a double for loop for the easiest implementation. Check each other value and check if it is equal to the current value. Return false if it is, otherwise, don't. Try to avoid `Arrays.sort()`. 





 



