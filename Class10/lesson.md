# Last Class: Al Fin

# Reading Files

We can read text files in Java in multiple ways. I'll just be going through one way to do so.

Remember Scanner? We're going to be using it.

## File Object

Java has a default `File` class that lets us create a `File` object. It does what its name entails. Its constructor takes in a file name as a String, and creates a `File` object. 

Remember to import the correct Classes.

```java
import java.io.File;
import java.io.FileNotFoundException;

try {
	File file = new File("filename.txt");
}
catch(FileNotFOundException e) {
    System.out.print("File not found");
    e.printStackTrace();
}
```

Whenever you create a `File` object, you will either need a try/catch statement, or your method must have a throws exception. Either to it the way above or like this:

```java
public static void main(String[] args) throws FileNotFoundException {
    File file = new File("filename.txt");
}
```

The `throws` declaration tells the method that it will be throwing a certain exception. Not all exceptions need this throws declaration, but `File` requires it. 

Some methods:

- `.getName()` : returns name of file
- `.getAbsolutePath()`: returns path location on computer
- `.canWrite()`: whether you can write to the file
- `.canRead()`: whether you can read to the file
- `.length()`: size of the file in bytes

## Scanner Object

You can now use Scanner to read the `File` you just created. It would look something like this:

```java
File file = new File("filename.txt");
Scanner sc = new Scanner(file);
while(sc.hasNextLine()) {
    String line = sc.nextLine();
    System.out.println(line);
}
```

This will print out all the lines in a text file. 

You can also read files using the following Classes:

- `FileReader`
- `BufferedReader`
- `Files`
- `FileInputStream`

If you want to use another class (which could potentially have more useful features), feel free to look up how to use it. 

# Writing to Files

Writing to a file is also quite useful. But first, we should learn how to create a non-existing file.

## File Creation

```java
import java.io.IOException;

try {
    File file = new File("filename.txt");
    file.createNewFile();
}
catch(IOException e) {
    System.out.print("IO Exception");
    e.printStackTrace();
}
```

You must have a `throws` declaration or do a `try/catch` when trying to create a new file.

If the file exists already, the method won't do anything. The file will be created within your project folder.

You can specify a directory location for the file as well (with the write permission) by using the full path of the file you wish to create:

```java
File file = new File("C:\\Users\\ericc\\OneDrive\\Documents\\filename.txt");
```

## `FileWriter`

There are many classes you can use to write to a file as well. There are classes like `FileWriter`, `BufferedWriter`, and more. 

```java
FileWriter f = new FileWriter("filename.txt");
f.write("I am so cool.");
f.close();
```

Assume I have a throws declaration above. It's good practice to close your `FileWriter`. The write call will write over everything that already exists in the file. If you want to have it append instead, you can do this:

```java
FileWriter f = new FileWriter("filename.txt", true);
```

## `BufferedWriter`

`BufferedWriter` uses an internal buffer to write to files. In general, it is more efficient when you have a lot of writes to a file. 

It works very similarly, but takes in a different input:

```java
BufferedWriter b = new BufferedWriter(new FileWriter("filename.txt"));
b.write("Hello I am Barney");
b.close();
```

It needs a `FileWriter` argument. Everything else is essentially the same. 

## Example

Let's read from a file and copy all its contents, but reverse all the words in the original file.

```
Hello my name is Jason and I like cake

becomes:

olleH ym eman si nosaJ dna I ekil ekac
```

Let's read a file named "original.txt" and write to a file named "final.txt".

# `HashMap`

`HashMap` is a Map based collection class that is used for storing Key & value pairs, it is denoted as `HashMap<Key, Value>` or `HashMap<K, V>`. This class makes no guarantees as to the order of the map. 

It's a little something like a dictionary:

| Key      | Value             |
| -------- | ----------------- |
| Tree     | A plant           |
| Cake     | A dessert         |
| Computer | Electronic Device |
| Apple    | Big Company       |

Each key stores a value, and the keys must be unique (no duplicates). The keys all have to be the same data type, and so do all the values. However, they can be different. For example, your keys can be Strings while your values are Integers.

```java
HashMap<String, Integer> hmap = new HashMap<String, Integer>();

// set values
hmap.put("apples", 3);
hmap.put("cake", 9);
hmap.put("brownies", 17);

// get value
int numCake = hmap.get("cake");
int numBrownies = hmap.get("brownies");
```

You can put elements into the map. Using the same key twice will just override the old value. 

## Iterating Through `HashMap`

It isn't as simple as a for loop. However, there is a way to iterate through all the keys and values. We'll use it now, but you don't have to understand 100% what's going on.

```java
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

Iterator iterator = hmap.entrySet().iterator();

while(iterator.hasNext()) {
	Map.Entry entry = (Map.Entry) iterator.next();
    System.out.print("Key: " + entry.getKey() + " Value:" + entry.getValue());
}
```

This is rather informal. The most specific implementation would look like this:

```java
Iterator<Map.Entry<String, Integer>> iterator = hmap.entrySet().iterator();

while(iterator.hasNext()) {
	Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) iterator.next();
	System.out.print("Key: " + entry.getKey() + " Value:" + entry.getValue());
}
```

Well...it's okay to be confused