# Understanding the Java Scanner Class

This document explains the `Scanner` class in Java, a powerful tool for reading input from various sources, such as the keyboard, files, or strings. It covers what the `Scanner` class is, how it works, and provides examples to demonstrate its usage.

## 1. What is the Scanner Class?

- **Definition**: The `Scanner` class, part of the `java.util` package, is a utility for parsing and reading input from different sources.
- **Purpose**: It simplifies the process of capturing user input (e.g., from the console) or reading data from files, strings, or other input streams.
- **Common Uses**:
  - Reading keyboard input in interactive programs.
  - Parsing text files or strings.
  - Extracting specific data types (e.g., integers, doubles, strings) from input.

## 2. Key Features of the Scanner Class

- **Input Sources**: Can read from:
  - `System.in` (standard input, typically the keyboard).
  - Files (via `File` objects).
  - Strings (via `String` objects).
  - Other input streams (e.g., `InputStream`).
- **Data Type Parsing**: Provides methods to read specific types, such as:
  - `nextInt()`:Reads the next integer and returns it as an int. Throws InputMismatchException if the input isn’t a valid integer.
  - `nextDouble()`: Reads the next double-precision floating-point number and returns it as a double.
  - `nextLine()`: Reads a line of text (up to the next newline character) and returns it as a String.
  - `next()`: Reads the next token (e.g., a word, delimited by whitespace) and returns it as a String.
  - `nextBoolean()`: Reads the next boolean value (true or false) and returns it as a boolean.
  - `hasNext()`: Returns true if there’s more input to read, useful for loops.
  - `hasNextInt(), hasNextDouble(), etc.`: Checks if the next token can be read as the specified type.

- **Delimiter-Based Parsing**: By default, uses whitespace (spaces, tabs, newlines) to separate input tokens, but this can be customized.
- **Error Handling**: May throw exceptions (e.g., `InputMismatchException`) if the input doesn’t match the expected type.

## 3. How to Use the Scanner Class

To use `Scanner`, you need to:
1. Import the class: `import java.util.Scanner;`.
2. Create a `Scanner` object, specifying the input source.
3. Use methods like `nextInt()`, `nextLine()`, etc., to read data.
4. Close the `Scanner` (optional for `System.in`, recommended for files) to free resources.

### Note -
- `Closing Scanners`: Don’t close a Scanner for System.in if you plan to reuse System.in elsewhere, as it closes the underlying stream. For files, always close the Scanner to prevent resource leaks.

### 3.1. Basic Programs
```java

// Example 1: Program to take String Input from the User and display it on the console

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        // Create a Scanner object for keyboard input
        Scanner sc = new Scanner(System.in);
        
        // Use scanner to read input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        // Output the input
        System.out.println("Hello, " + name + "!");
        
        // Close the scanner (optional for System.in)
        scanner.close();
    }
}

// Example 2: Program showing an Integer value Entered by the User

import java.util.Scanner;

public class Program1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  // Creates a reader instance which takes input from standard input - keyboard
        System.out.println("Enter a Number  : ");
        int number = sc.nextInt();
        System.out.println("You Entered Number "+number);

    }
}

// Example 3: Program showing the concept Reading Different Data Types 

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter your height (in meters): ");
        double height = sc.nextDouble();
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        
        sc.close();
    }
}

