# 🔌 I - Interface Segregation Principle (ISP)

## 🧠 What is it?

The **Interface Segregation Principle (ISP)** states that:

> **A class should not be forced to implement methods it does not need.**

This means that interfaces **should be specific and well-defined according to functionality**. If an interface is too large or too generic, it can force classes to implement methods that do not make sense for them.

⚠️ This problem is known as **fat interfaces** or a **code smell** `*` of **bloated interfaces** or interfaces with too many responsibilities.

`*` **“Code smell”** refers to a characteristic of source code that suggests a deeper problem or a **possible flaw in the design or structure of the code**.

## 🚨 Why is it important?

Having **smaller, more specific interfaces** makes it easier to **reuse** the same interfaces in different parts of the system **without causing compatibility issues**.

### 👩‍🏫 **Example:**

Suppose you are designing an application that works with **several types of printers** and you offer an interface like this:

```java
public interface Printer {
    void print(String document);
    void scan(String document);
    void fax(String document);
}

public class BasicPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scan(String document) {
        throw new UnsupportedOperationException("This printer does not scan.");
    }

    @Override
    public void fax(String document) {
        throw new UnsupportedOperationException("This printer does not fax.");
    }
}
```

🔴 The problem with this interface is that it groups **too many responsibilities into a single interface**. Not all printers can scan or fax, but they are still **forced to implement these methods**.

⚠️ This violates the **Interface Segregation Principle (ISP)**.

✅ Solution with ISP:
> Split the `Printer` interface into **smaller, more specific interfaces** (`Printer`, `Scanner`, `Fax`), and make **each class implement only the ones it needs**.

- **1️⃣ Segregated interfaces by functionality:**

```java
public interface Printer {
    void print(String document);
}

public interface Scanner {
    void scan(String document);
}

public interface Fax {
    void fax(String document);
}
```

- **2️⃣ Basic printer: only prints:**

```java
public class BasicPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }
}
```

- **3️⃣ Printer with scanner: prints and scans:**

```java
public class PrinterScanner implements Printer, Scanner {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }
}
```

- **4️⃣ Multifunction printer: prints, scans, and faxes:**

```java
public class MultifunctionPrinter implements Printer, Scanner, Fax {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }

    @Override
    public void fax(String document) {
        System.out.println("Sending fax: " + document);
    }
}
```


***

## 🎯 Exercise Objective

In the attached Java file you will find a class or class hierarchy that implements a **too-large interface**.

🔧 Your challenge is:

1. Detect which methods **do not make sense** for some of the classes.
2. Refactor the interface into **smaller, focused interfaces**.
3. Make each class implement **only the interfaces it needs**.

***

## 📌 Tips for Applying ISP

✅ If a class has to implement a method that only throws an exception or is left empty... you may be violating ISP.

✅ Prefer several specific interfaces over a single generic one.

✅ Small, focused interfaces promote a more flexible and maintainable design.

***

## 💬 Reflection

When **ISP** is followed:

- Classes are simpler and more coherent.
- We avoid absurd or unnecessary implementations.
- It becomes easier to use composition instead of forced inheritance.

🔁 **More modularity, less coupling.**

***

🚀 Go ahead! Review the interface, apply the **ISP** principle, and refactor elegantly.

❓ **Does your interface do too much? Which parts could be split apart?**

***
