# 🧱 S - Single Responsibility Principle (SRP)

## 🧠 What is it?

The **Single Responsibility Principle** states that:

> **A class should have only one reason to change.**

In other words, a class should have **one single responsibility**, or **one single reason to be modified**.

## 👩‍🏫 **Example:**

If you have a `Report` class that:

- generates content,
- prints the report,
- and saves the report.

```java
public class Report {
    private String content;

    public Report(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }

    public void print() {
        System.out.println("Printing report:");
        System.out.println(content);
    }

    public void save(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("Report saved to " + filename);
        } catch (IOException e) {
            System.err.println("Error saving report: " + e.getMessage());
        }
    }
}
```

🔴 **Problem**: Each of these functions **belongs to different responsibilities**, and they should be separated into different classes.

⚠️ You're **violating the principle**!

✅ **Refactored version with SRP applied**: we separate responsibilities into different classes:

- **1️⃣ Report: only holds the content.**

```java
// Class with a single responsibility: maintain content
public class Report {
    private String content;

    public Report(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
```

- **2️⃣ Printer: handles printing.**

```java
// Class with a single responsibility: print reports
public class ReportPrinter {
    public void printReport(Report report) {
        System.out.println("Printing report:");
        System.out.println(report.getContent());
    }
}
```

- **3️⃣ Saver: handles saving the report.**

```java
// Class with a single responsibility: save reports
public class ReportSaver {
    public void saveReport(Report report, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(report.getContent());
            System.out.println("Report saved to " + filename);
        } catch (IOException e) {
            System.err.println("Error saving report: " + e.getMessage());
        }
    }
}
```

- **4️⃣ Usage example:**

```java
public class Main {
    public static void main(String[] args) {
        Report report = new Report("This is the report content.");

        ReportPrinter printer = new ReportPrinter();
        printer.printReport(report);

        ReportSaver saver = new ReportSaver();
        saver.saveReport(report, "report.txt");
    }
}
```


***

## 🎯 Exercise Objective

In the attached Java file you'll find a class that **does not respect this principle**: it does too many things at once.

🔧 Your challenge is:

1. Analyze the multiple responsibilities the class has.
2. Separate them into **different classes**, each with a single clear responsibility.
3. Keep the code readable, modular, and easy to maintain.

***

## 📌 Tips for Applying SRP

✅ Ask yourself: *"What reasons would this class have to change?"* and *"What are this class's responsibilities?"*

✅ If there are more than one... it's time to separate responsibilities!

✅ Don't be afraid to create **more small, focused classes**.

***

## 💬 Reflection

When a class has only one responsibility:

- It's easier to read.
- It's easier to test.
- It's less likely to cause errors when you change one functionality.

🔁 **Less coupling, more cohesion.**

***

🚀 Go ahead! Review the code, apply the SRP principle, and enjoy the refactoring process.

❓ **How many responsibilities does the class have?**

