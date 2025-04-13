# Java Hello World Program

This is a basic Java program to print "Hello World!" to the console.

## 📌 Syntax Note:
- `public class HelloWorld` defines the class.
- `public static void main(String[] args)` is the entry point of the program.
- `System.out.println()` is used to print text.
- `curly braces {}` Code blocks are enclosed in curly braces {}
- `semicolons ;` Statements end with semicolons ;


#### Points to Remember:

- `public:` An access modifier that indicates the class or method is accessible from everywhere, with no restrictions.
- `static:` A keyword that means the method belongs to the class itself, not an instance of the class. It allows the method to be called without creating an object of the class.
- `void:` The return type of the method, indicating that the method does not return any value.
main: The name of the method. It’s the entry point of a Java program, where execution begins when the program is run.
- `String[]:` An array of String objects. It represents a collection of strings (text) passed to the program as command-line arguments.
- `args:` The parameter name for the String[] array. It holds the command-line arguments provided when the program is executed.
- `System:` A built-in Java class in the java.lang package. It provides access to system-level resources and utilities, like input/output streams.
- `out:` A static field in the System class, of type PrintStream. It represents the standard output stream, typically the console.
- `println:` A method of the PrintStream class (accessed via System.out). It prints the given argument to the console and adds a new line.

### 💻 Code:

```java
// Program to display Hello World!
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
