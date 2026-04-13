# 🧲 D - Dependency Inversion Principle (DIP)

## 🧠 What is it?

The **Dependency Inversion Principle (DIP)** states that:

> **Classes should depend on abstractions, not on concrete classes.**

In other words, code should **rely on interfaces or abstract classes, not specific implementations**. This allows different parts of the system to be **decoupled**, making it easier to **change, replace, and reuse** components.

📌 This can be summed up in two key rules:

- 1 **High-level modules** (business logic) **should not depend on low-level modules** (implementations).
- 2 **Both should depend on abstractions**.


## 🚨 Why is it important?

Without DIP, high-level components can become **tightly coupled to concrete implementations**, making the system **hard to modify, test, or extend**.

When DIP is properly applied:

- ✅ Code becomes more flexible and easier to test.
- ✅ Implementations can be swapped without affecting core logic.
- ✅ It promotes dependency injection and programming toward abstractions.


### 👩‍🏫 **Example:**

Suppose you have an application that manages notifications, always sent via email:

```java
public class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}
```

```java
public class NotificationManager {
    private EmailService emailService;

    public NotificationManager() {
        this.emailService = new EmailService();
    }

    public void notify(String message) {
        emailService.sendEmail(message);
    }
}
```

🔴 Problem:
`NotificationManager` depends directly on `EmailService` (a concrete implementation). If you want to add other channels like SMS, WhatsApp, or Push, you must modify the class.

⚠️ This violates the **OCP** and also the **DIP**.

✅ Solution with DIP:

- **1️⃣ Create an abstraction (interface) for the notification service:**

```java
public interface NotificationChannel {
    void send(String message);
}
```

- **2️⃣ Make EmailService implement the interface:**

```java
public class EmailService implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
```

- **3️⃣ Modify NotificationManager to depend on the abstraction:**

```java
public class NotificationManager {
    private NotificationChannel channel;

    public NotificationManager(NotificationChannel channel) {
        this.channel = channel;
    }

    public void notify(String message) {
        channel.send(message);
    }
}
```

- **4️⃣ Now you can inject different channels without modifying NotificationManager:**

```java
public class Main {
    public static void main(String[] args) {
        NotificationChannel channel = new EmailService(); // or new SmsService(), new PushService(), etc.
        NotificationManager manager = new NotificationManager(channel);
        manager.notify("Hello world!");
    }
}
```


***

## 🎯 Exercise Objective

In the Java file included in this directory, you’ll find a class that **directly depends on another concrete class**.

🔧 Your challenge is:

1. Identify this direct dependency.
2. Create an appropriate **interface or abstraction**.
3. Refactor the classes so they **depend on the abstraction**, not on the concrete implementation.
4. Apply **dependency injection** (via constructor, setter, or method).

***

## 📌 Tips for Applying DIP

✅ High-level classes should be **independent from technical details**.

✅ Use **interfaces or abstract classes** to decouple code.

✅ Apply patterns like **Dependency Injection (DI)** or **Factory**.

✅ Writing unit tests becomes much easier when **DIP** is applied.

***

## 💬 Reflection

When you follow **DIP**:

- Your code becomes **modular and maintainable**.
- You can add **new features without breaking existing ones**.
- You promote a **cleaner, more testable, and scalable** system.

🔁 **Change implementations, not designs.**

***

🚀 Go ahead! Refactor with the DIP principle in mind and improve your code structure.

❓ **Are you depending on concrete classes? How could you invert that dependency?**
***