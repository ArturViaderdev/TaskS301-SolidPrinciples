# 🚪 O - Open/Closed Principle (OCP)

## 🧠 What is it?

The **Open/Closed Principle** states that:

> **Code should be open for extension, but closed for modification.**

This means we should be able to **add new functionality** to our system **without having to modify existing code**.

### 👩‍🏫 **Example:**

Suppose you have a `DiscountCalculator` class with this method:

```java
public double calculateDiscount(Product product) {
    if (product.getType().equals("Christmas")) {
        return product.getPrice() * 0.2;
    } else if (product.getType().equals("BlackFriday")) {
        return product.getPrice() * 0.3;
    }
    return 0;
}
```

🔴 **Problem**: Every time you want to add a new discount type, **you have to modify this class**.
⚠️ This **violates the OCP**, because the code is not closed for modification.

✅ The solution is to use **polymorphism** or **design patterns** (like **Strategy** or **Factory**) that allow adding new behaviors without touching existing code:

- **1️⃣ Define a common interface:**

```java
public interface DiscountStrategy {
    double applyDiscount(Product product);
}
```

- **2️⃣ Implement concrete strategies:**

```java
public class ChristmasDiscount implements DiscountStrategy {
    public double applyDiscount(Product product) {
        return product.getPrice() * 0.2;
    }
}

public class BlackFridayDiscount implements DiscountStrategy {
    public double applyDiscount(Product product) {
        return product.getPrice() * 0.3;
    }
}

public class AnniversaryDiscount implements DiscountStrategy {
    public double applyDiscount(Product product) {
        return product.getPrice() * 0.1;
    }
}
```

- **3️⃣ Flexible and extensible DiscountCalculator class:**

```java
public class DiscountCalculator {
    public double calculateDiscount(Product product, DiscountStrategy strategy) {
        return strategy.applyDiscount(product);
    }
}
```

- **4️⃣ Usage example:**

```java
public class Main {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000);

        DiscountCalculator calculator = new DiscountCalculator();
 
        double discount = calculator.calculateDiscount(product, new ChristmasDiscount());
        System.out.println("Applied discount: " + discount);
    }
}
```


***

## 🎯 Exercise Objective

In the attached Java file you'll find a class that **does not respect the OCP principle**: it needs to be modified every time there's a change or functional extension.

🔧 Your challenge is:

1. Identify which part of the code is **too exposed to modifications**.
2. Refactor it to be **easily extensible** without altering existing behavior.
3. Apply **abstractions and polymorphism** to make the code more flexible and robust.

***

## 📌 Tips for Applying OCP

✅ **Avoid conditional statements (if/else, switch)** to decide behaviors that may vary over time.

✅ **Define interfaces or abstract classes** that allow adding new functionality without touching existing code.

✅ **Use patterns like Strategy, Factory, or Chain of Responsibility** depending on the context.

***

## 💬 Reflection

When a system is well-designed according to **OCP**:

- You can add **new functionality** easily.
- Your code is **more stable** and less vulnerable to regressions*.
- You improve **reuse** and **maintainability**.

🔁 **Extensible**, but **safe**. This is the power of OCP.

* **Regression** means that a functionality that **previously worked correctly now fails** after code changes have been made.

***

🚀 Go ahead! Review the code, detect how it can be improved, and apply the OCP principle to make it more modular and future-proof.

❓ **Can you add a new product without changing the code?**

