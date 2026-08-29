# ☕ Day 1 — Java Fundamentals

Day 1 covers the fundamental concepts required to start programming in Java.

The goal is to understand the basics instead of simply memorizing Java syntax.

---

## 📚 Topics Covered

* What is Java?
* Java features
* JDK
* JRE
* JVM
* Bytecode
* Java program structure
* Class
* `main()` method
* `System.out.println()`
* Comments
* Variables
* Data Types
* Primitive Data Types
* Reference Types
* String
* Constants
* Type Casting
* Basic User Input
* `Scanner`

---

# 1. What is Java?

Java is a high-level, object-oriented, general-purpose programming language.

Java is widely used for:

* Backend development
* Enterprise applications
* APIs
* Banking systems
* Desktop applications
* Large-scale applications

One of Java's famous principles is:

> Write Once, Run Anywhere.

Java programs are compiled into bytecode, which can be executed by the JVM on different platforms.

---

# 2. How Java Works

The basic Java execution flow is:

```text
Java Source Code
       ↓
     javac
       ↓
    Bytecode
       ↓
      JVM
       ↓
Program Execution
```

Example:

```text
HelloWorld.java
      ↓
HelloWorld.class
      ↓
      JVM
      ↓
Hello World
```

---

# 3. JDK, JRE and JVM

## JDK

**JDK = Java Development Kit**

JDK provides tools required to develop and run Java applications.

It includes the Java compiler and runtime components.

---

## JRE

**JRE = Java Runtime Environment**

JRE provides the environment required to run Java applications.

Conceptually:

```text
JRE
 ├── JVM
 └── Java Libraries
```

---

## JVM

**JVM = Java Virtual Machine**

JVM executes Java bytecode.

```text
Java Bytecode
      ↓
     JVM
      ↓
Machine-level execution
```

---

## Relationship

A simplified conceptual relationship:

```text
JDK
 └── JRE
      └── JVM
```

Remember:

```text
JDK → Development
JRE → Runtime
JVM → Executes Bytecode
```

---

# 4. First Java Program

```java
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");

    }
}
```

Output:

```text
Hello World
```

---

# 5. Java Class

A class is a blueprint/template used to create objects.

Example:

```java
class Student {

}
```

Later, objects can be created from the class.

```text
Class
  ↓
Objects
```

---

# 6. main() Method

The `main()` method is the entry point of a standard Java application.

Basic structure:

```java
public static void main(String[] args) {

}
```

Meaning:

```text
public
→ access modifier

static
→ can be used without creating an object

void
→ doesn't return a value

main
→ method name

String[] args
→ command-line arguments
```

---

# 7. Printing Output

Use:

```java
System.out.println("Hello");
```

`println()` prints the value and moves to the next line.

Example:

```java
System.out.println("Hello");
System.out.println("World");
```

Output:

```text
Hello
World
```

`print()` does not automatically move to the next line.

```java
System.out.print("Hello");
System.out.print("World");
```

Output:

```text
HelloWorld
```

---

# 8. Comments

Comments are notes written inside source code.

They are not executed by the program.

### Single-line

```java
// This is a comment
```

### Multi-line

```java
/*
   This is a
   multi-line comment
*/
```

---

# 9. Variables

A variable is a named storage location used to hold a value.

Example:

```java
int age = 22;
```

Breakdown:

```text
int  → data type
age  → variable name
22   → value
```

Another example:

```java
String name = "Ankit";
```

---

# 10. Data Types

Java provides different data types for different kinds of values.

## Primitive Data Types

Java has 8 primitive data types:

```text
byte
short
int
long
float
double
char
boolean
```

Common examples:

```java
int age = 22;

double percentage = 85.5;

char grade = 'A';

boolean passed = true;
```

---

# 11. String

`String` is used to represent text.

```java
String name = "Ankit";
String city = "Indore";
```

Example:

```java
System.out.println("My name is " + name);
```

Output:

```text
My name is Ankit
```

`String` is a reference type, not one of Java's 8 primitive data types.

---

# 12. Primitive vs Reference Types

### Primitive Types

```text
byte
short
int
long
float
double
char
boolean
```

### Reference Types

Examples:

```text
String
Arrays
Classes
Objects
```

Primitive types represent basic values, while reference variables refer to objects.

---

# 13. Constants

The `final` keyword can be used when a variable should not be reassigned.

Example:

```java
final int DAYS_IN_WEEK = 7;
```

This is not allowed:

```java
DAYS_IN_WEEK = 8;
```

Constants are commonly written using uppercase letters:

```java
MAX_VALUE
DAYS_IN_WEEK
PI
```

---

# 14. Type Casting

Type casting means converting a value from one data type to another.

### Widening

```java
int x = 10;
double y = x;
```

An `int` can automatically be converted to `double`.

### Narrowing

```java
double price = 99.99;
int x = (int) price;
```

The result is:

```text
99
```

The decimal part is removed.

---

# 15. User Input

Java commonly uses the `Scanner` class for basic console input.

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
```

For integer input:

```java
int age = scanner.nextInt();
```

For decimal input:

```java
double percentage = scanner.nextDouble();
```

---

# 16. Complete Example

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your percentage: ");
        double percentage = scanner.nextDouble();

        System.out.println();
        System.out.println("----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);
    }
}
```

---

# 🧠 Important Terms

| Term           | Meaning                             |
| -------------- | ----------------------------------- |
| Java           | Programming language                |
| JDK            | Java Development Kit                |
| JRE            | Java Runtime Environment            |
| JVM            | Java Virtual Machine                |
| Bytecode       | Compiled Java code                  |
| Compiler       | Converts source code into bytecode  |
| Class          | Blueprint/template                  |
| Object         | Instance of a class                 |
| Method         | Block of code that performs a task  |
| Variable       | Named storage for a value           |
| Data Type      | Defines the type of data            |
| Primitive Type | One of Java's 8 basic data types    |
| Reference Type | Type that refers to an object       |
| String         | Text                                |
| `main()`       | Program entry point                 |
| `Scanner`      | Common class for console input      |
| Casting        | Converting one data type to another |
| `final`        | Prevents reassignment               |

---

# 🏋️ Practice Questions

## Basic

### Q1

Print:

```text
Hello, I am learning Java.
```

### Q2

Create variables for:

* Name
* Age
* City
* College

and print them.

### Q3

Create two integers and print:

* Sum
* Difference
* Product

### Q4

Create a `double` variable for percentage.

### Q5

Create a `char` variable for grade.

---

## Understanding

### Q6

Predict the output:

```java
int a = 10;
int b = 20;

System.out.println(a + b);
System.out.println("a + b = " + a + b);
```

### Q7

Explain the difference between:

```java
char c = 'A';
```

and:

```java
String c = "A";
```

### Q8

Identify the data type, variable and value:

```java
double salary = 50000.50;
```

---

## User Input

### Q9

Take name and age as input and print:

```text
Hello Ankit, you are 22 years old.
```

### Q10

Take two numbers as input and print their sum.

---

# 🔥 Challenge

Build a Student Information Program.

Take the following inputs:

```text
Name
Age
College
Course
Percentage
```

Expected output:

```text
===== Student Information =====

Name: Ankit
Age: 22
College: XYZ
Course: Computer Science
Percentage: 85.5
```

---

# ✅ Day 1 Checklist

* [ ] Understand what Java is
* [ ] Understand JDK
* [ ] Understand JRE
* [ ] Understand JVM
* [ ] Understand Java execution flow
* [ ] Understand classes
* [ ] Understand methods
* [ ] Understand `main()`
* [ ] Understand `System.out.println()`
* [ ] Understand variables
* [ ] Understand data types
* [ ] Understand primitive types
* [ ] Understand reference types
* [ ] Understand String
* [ ] Understand `final`
* [ ] Understand type casting
* [ ] Understand basic Scanner input
* [ ] Complete all practice questions
* [ ] Complete the Student Information challenge

---

## 🎯 Day 1 Goal

By the end of Day 1, you should be able to write a basic Java program **without copying the syntax blindly** and explain what the important parts of the program mean.

> **Don't memorize Java. Understand Java.**
