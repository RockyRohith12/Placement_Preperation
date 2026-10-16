import pypandoc

readme = r"""# Placement Preparation

**Name:** V Rohith  
**Date:** 16 October 2026

This repository documents my Java learning journey as part of my placement preparation.

# Day 1 — Java Fundamentals

## 1. JDK, JRE, and JVM

These are the three important components to understand before learning how Java programs execute.

### JVM — Java Virtual Machine

The JVM is responsible for executing Java bytecode.

- Loads Java `.class` files.
- Verifies bytecode before execution.
- Executes bytecode using an interpreter and Just-In-Time (JIT) compilation.
- Helps Java programs run on different operating systems when a compatible JVM is available.

### JRE — Java Runtime Environment

The JRE provides the runtime components required to run Java applications.

It conceptually includes:

- JVM
- Java libraries and supporting runtime components

**Purpose:** To run Java applications.

### JDK — Java Development Kit

The JDK provides the tools required to develop Java applications.

It includes:

- Java compiler (`javac`)
- Java launcher (`java`)
- JVM and runtime components
- Other development tools

**Purpose:** To write, compile, debug, and run Java programs.

### Difference Between JDK, JRE, and JVM

| Component | Main Purpose |
| --- | --- |
| JDK | Develop and run Java programs |
| JRE | Provide the environment to run Java programs |
| JVM | Execute Java bytecode |

**Remember:** JDK is for development, JRE is for runtime, and JVM executes bytecode. Modern Java distributions may package these components differently.

---

## 2. How a Java Program Executes

A Java program follows this basic execution pipeline:

1. **Source code:** Write the program in a `.java` file.
2. **Compilation:** The Java compiler (`javac`) converts source code into bytecode.
3. **Bytecode:** The compiled program is stored in a `.class` file.
4. **Execution:** The JVM loads and executes the bytecode.
5. **Output:** The program produces its result.

### Example

Source file: `Test.java`

```java
class Test {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

Compile and execute:

```bash
javac Test.java
java Test
```

Output:

```text
Hello World!
```

**Key takeaway:** Java bytecode is platform-independent, while the JVM implementation is platform-specific.

---

## 3. Structure of a Java Program

```java
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello, Rohith!");
    }
}
```

### Important Parts

- `public class Test` — declares a public class named `Test`.
- `public static void main(String[] args)` — declares the main method, the standard entry point for launching a Java application.
- `System.out.println()` — prints a value followed by a new line.
- Curly braces `{ }` — define blocks of code.
- Semicolon `;` — terminates statements such as variable declarations and method calls.

**Important:** If a class is declared `public`, its name must match the filename, including capitalization. For example, `public class Test` belongs in `Test.java`.

---

## 4. Understanding the Main Method

```java
public static void main(String[] args)
```

| Keyword | Meaning |
| --- | --- |
| `public` | Allows the method to be accessed from outside its class |
| `static` | Allows the method to be called without creating an instance of the class |
| `void` | Indicates that the method does not return a value |
| `main` | The method name recognized as the application's entry point |
| `String[] args` | An array that receives command-line arguments |

---

## 5. Understanding `System.out.println()`

```java
System.out.println("Hello World!");
```

- `System` — a class from the `java.lang` package.
- `out` — a static field that refers to the standard output stream.
- `println()` — a method that prints a value followed by a new line.
- `"Hello World!"` — the string being printed.

The semicolon `;` terminates the statement.

---

## 6. Java Primitive Data Types

Java has eight primitive data types.

### A. Integral Types

Used to represent whole numbers.

| Data Type | Size | Description |
| --- | --- | --- |
| `byte` | 1 byte | Small integer values |
| `short` | 2 bytes | Short integer values |
| `int` | 4 bytes | Standard integer type |
| `long` | 8 bytes | Large integer values |

### B. Floating-Point Types

Used to represent decimal and fractional values.

| Data Type | Size | Description |
| --- | --- | --- |
| `float` | 4 bytes | Single-precision floating-point value |
| `double` | 8 bytes | Double-precision floating-point value |

Examples:

```java
float price = 123.45f;
double salary = 45000.75;
```

The `f` suffix indicates a `float` literal. Decimal literals are `double` by default.

### C. Boolean Type

Used for logical values.

```java
boolean isAdult = false;
boolean isR = true;
```

A Boolean value can be either `true` or `false`. Java does not specify a fixed storage size for the `boolean` type.

### D. Character Type

Used to represent a single UTF-16 code unit.

```java
char grade = 'A';
```

The `char` type occupies 2 bytes.

### Complete List

| Type | Size |
| --- | --- |
| `byte` | 1 byte |
| `short` | 2 bytes |
| `int` | 4 bytes |
| `long` | 8 bytes |
| `float` | 4 bytes |
| `double` | 8 bytes |
| `char` | 2 bytes |
| `boolean` | Not precisely specified by the Java language |

---

## 7. Minimum and Maximum Values

Java wrapper classes provide constants for numeric type limits.

```java
System.out.println(Byte.MIN_VALUE);
System.out.println(Byte.MAX_VALUE);

System.out.println(Short.MIN_VALUE);
System.out.println(Short.MAX_VALUE);

System.out.println(Integer.MIN_VALUE);
System.out.println(Integer.MAX_VALUE);

System.out.println(Long.MIN_VALUE);
System.out.println(Long.MAX_VALUE);
```

For floating-point types:

```java
System.out.println("Minimum positive Float value: " + Float.MIN_VALUE);
System.out.println("Maximum positive Float value: " + Float.MAX_VALUE);
System.out.println("Minimum negative Float value: " + (-Float.MAX_VALUE));
System.out.println("Maximum negative Float value: " + (-Float.MIN_VALUE));

System.out.println("Minimum positive Double value: " + Double.MIN_VALUE);
System.out.println("Maximum positive Double value: " + Double.MAX_VALUE);
System.out.println("Minimum negative Double value: " + (-Double.MAX_VALUE));
System.out.println("Maximum negative Double value: " + (-Double.MIN_VALUE));
```

**Important learning point:** `Float.MIN_VALUE` and `Double.MIN_VALUE` represent the smallest positive nonzero values, not the most negative values. To find the most negative values, use `-Float.MAX_VALUE` and `-Double.MAX_VALUE`.

---

## 8. Key Takeaways

- Understood the purpose of the JDK, JRE, and JVM.
- Learned the Java compilation and execution process.
- Practiced writing the main method and printing output.
- Learned the role of semicolons in Java statements.
- Studied all eight primitive data types.
- Practiced checking numeric limits using wrapper classes.

## 9. Next Steps

- Practice type conversion and type casting.
- Learn Java operators.
- Study conditional statements (`if`, `else`, and `switch`).
- Practice writing simple Java programs.
- Begin solving beginner-level programming problems.

---

*Consistency is the key to success. One day at a time, one concept at a time.*
"""

output_path = "/mnt/data/README.md"
pypandoc.convert_text(readme, "md", format="md", outputfile=output_path, extra_args=["--standalone"])
print(f"Updated README.md: {output_path}")
