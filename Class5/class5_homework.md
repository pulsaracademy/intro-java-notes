# Homework

So, since it's gotten a bit confusing, I'll clarify the homework due. You should have a lot of it done. Please catch up if you haven't. It's been 2 weeks. If you're confused, it's because you haven't asked for enough help.

Go to [lesson 3](https://pulsaracademy.com/courses/introduction-java/lessons/3/). Do 7 of 9 methods in **ArraysPractice**. Do the **first 5** of **LoopsPractice**. 

Go to [lesson 4](https://pulsaracademy.com/courses/introduction-java/lessons/4/). Do the additional methods under **ArraysPractice**. Do all the methods under **StringManipulation** except for **maxChar**, which I will provide a code snippet for you by tomorrow night (hints page). Look at the hints I provided for you for ArraysPractice and LoopsPractice, which you can find on the GitHub Repository. 

### This Class's Stuff

This wont be much. It shouldn't take you any more than 30-60 minutes. Try to finish on time. 

**Create a class called Arrays2DPractice.java** in a new package called **javalesson05**. 

**Write JavaDocs for this class and the methods below.** Make sure they make sense, and cover all aspects. Do not do it for the other classes (ArraysPractice etc.), that would be unfair.

#### contains

Write a method called **contains** that takes in a 2D array and a 1D array, and returns whether that 1D array exists within the 2D array. You've done this for normal arrays, just convert that to a 2D implementation. Assume **integer** arrays. 

#### maxArray

Write a method called **maxArray** that takes in a 2D array, and returns the 1D array **within the 2D array** that has values with the greatest sum. Again, assume integer arrays. Throw an exception if the array is **empty** (no arrays within).

```java
int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {2, 4, 6, 8}};

int[] result = maxArray(arr);

System.out.print(Arrays.toString(result));
// [5, 6, 7, 8]
// 5 + 6 + 7 + 8 > 1 + 2 + 3 + 4 > 2 + 4 + 6 + 8
```

#### swap

Write a method called **swap** that takes in a 2D array, and returns the 2D array, except now that the rows and columns are flipped. Assume rectangular 2D arrays. Assume integer arrays.

```
Pseudocode

int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

print(swap(arr));

Output:
{{1, 5, 9}, {2, 6, 10}, {3, 7,11}, {4, 8, 12}}
```

**Hint:** what would be the relation between rows and columns when accessing an element?

**That's it. **