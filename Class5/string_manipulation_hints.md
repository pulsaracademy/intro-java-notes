# StringManipulation Hints

### numVowels

Convert string to lowercase/uppercase. Create a counter for the vowels. Use `str.charAt(int index)`. Check if the specific character is a vowel using if loops.

### maxChar

This one is tricky. Assume the String **does not contain special characters or numbers**. I will provide you two methods: `charToIndex(char c) and indexToChar(int x)`.

```java
class StringManipulation {
	/**
	 * Maps each character of the alphabet to an index of an array.
	 * The letter A (a) becomes 0, and the letter Z (z) becomes 25. Will throw an error if the input is not a character.
	 * 
	 * @param c: the character
	 * @return int: the index mapping
	 */
	public static int charToIndex(char c) {
		Character.toLowerCase(c); 
		if(!Character.isAlphabetic(c)) {
			throw new IllegalArgumentException("The character is not alphabetic");
		}
	    int index = (int) c - 97;
	    return index;
	}
    /**
	 * Maps each index to the character it was usually converted from. <p>
	 * The index 0 becomes 'a', and the index 25 becomes 'z'. Lowercase and Uppercase should not matter
	 * 
	 * @param index: index of array
	 * @return char: the mapping from index to character
	 */
	public static char indexToChar(int index) {
		char c = (char) (index + 97);
		if(!Character.isAlphabetic(c)) {
			throw new IllegalArgumentException("The number is not convertible to a character");
		}
		
		return c;
	}
    
    
}
```

Use an array of length 26 to keep track of the amount a character has appeared. Use the **mapping method** the same as **mode**, which is on this classes [lesson page](https://pulsaracademy.com/courses/introduction-java/lessons/5/). 

### reverseString

Go through the string backwards, and add characters to a result string as needed.

```
String s = "";
s += 'p';

// s = "p"
```

### removeDuplicates

Should be a method done in less than 5 lines. Use the method `str.replace()`. Should be easy.

### hasString

Use the method `str.contains()`. Should be trivial.

### backwardsSentence

Use the method `str.split()`. If you don't remember what that is, look to previous notes or search online. Then, add words to the back of a string.

