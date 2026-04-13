# 🧬 L - Liskov Substitution Principle (LSP)

## 🧠 What is it?

The **Liskov Substitution Principle (LSP)** states that:

> **Subclasses must be able to replace their superclasses without altering the program's behavior.**

This means that any child class should **behave like its parent class**. If a subclass **breaks contracts or behaviors** defined in the base class, it violates this principle.

In other words, if a program is designed to work with an object of a base class, it should work correctly if that object is replaced with any object from a derived class.

## 🚨 Why is it important?

When using **inheritance**, we expect a subclass to **extend the superclass's behavior, not break it**. If LSP is not respected, we can have hard-to-detect errors and systems that are difficult to maintain or extend.

### 👩‍🏫 **Example:**

Suppose you're designing an application that works with various **cryptocurrencies** and offers an **API** like this:

```java
public class Wallet {
    private String cryptoName;
    private String cancelCode;

    public Wallet(String cryptoName, String cancelCode) {
        this.cryptoName = cryptoName;
        this.cancelCode = cancelCode;
    }

    public void sendMoney(String destination, double amount) {
        System.out.println("Sending money through the " + cryptoName + " blockchain");
    }

    public void cancelTransaction(String transactionId) {
        if (AuthorizationCancel.cancel(cancelCode, transactionId))
            System.out.println("Cancelling transaction " + transactionId + " with code " + cancelCode);
        else throw new TransactionCancelException("Transaction could not be cancelled");
    }
}
```

**Your API works with:**

- `Tezos`
- `Ethereum`
- `Monero`

```java
public class TezosWallet extends Wallet{
    public TezosWallet(){
        super("Tezos", "TEZ_0974_BLCH");
    }
}

public class EthereumWallet extends Wallet{
    public EthereumWallet(){
        super("Ethereum", "ETH_7637_BLCH");
    }
}

public class MoneroWallet extends Wallet{
    public MoneroWallet(){
        super("Monero", null); // Monero does not allow transaction cancellations
    }
}
```

🔴 Problem: `MoneroWallet` inherits from `Wallet`, but when someone calls `cancelTransaction()` with a `MoneroWallet` instance, the **program will always crash** because Monero doesn't allow cancellations.

⚠️ Therefore, `MoneroWallet` cannot be used in contexts expecting `Wallet.cancelTransaction()` to work correctly → this **breaks LSP**.

✅ Solution: apply LSP with a **clear hierarchy**:
> The key is to **separate responsibilities**: not all cryptocurrencies allow cancellations, so not all wallets should have this method.

- **1️⃣ Create the cancellation interface:**

```java
public interface CancellationStrategy {
    void cancel(String id);
}
```

- **2️⃣ Implement the real strategy and the null object:**

```java
public class AllowedCancellationStrategy implements CancellationStrategy {
    private String cancelCode;

    public AllowedCancellationStrategy(String cancelCode) {
        this.cancelCode = cancelCode;
    }

    @Override
    public void cancel(String id) {
        System.out.println("Cancelling transaction " + id + " with code " + cancelCode);
    }
}

public class NotAllowedCancellationStrategy implements CancellationStrategy {
    @Override
    public void cancel(String id) {
        // Does nothing, simply ignores the cancellation.
        System.out.println("Cancellation not supported for this wallet, ignoring transaction: " + id);
    }
}
```

- **3️⃣ Modify the Wallet class to use the cancellation strategy:**

```java
public class Wallet {
    private String cryptoName;
    private CancellationStrategy cancellationStrategy;

    public Wallet(String cryptoName, CancellationStrategy cancellationStrategy) {
        this.cryptoName = cryptoName;
        this.cancellationStrategy = cancellationStrategy;
    }

    public void sendMoney(String destination, double amount) {
        System.out.println("Sending money through the " + cryptoName + " blockchain");
    }

    public void cancelTransaction(String id) {
        cancellationStrategy.cancel(id);
    }
}
```

- **4️⃣ Create wallets with the appropriate strategy:**

```java
public class TezosWallet extends Wallet {
    public TezosWallet() {
        super("Tezos", new AllowedCancellationStrategy("TEZ_0974_BLCH"));
    }
}

public class EthereumWallet extends Wallet {
    public EthereumWallet() {
        super("Ethereum", new AllowedCancellationStrategy("ETH_7637_BLCH"));
    }
}

public class MoneroWallet extends Wallet {
    public MoneroWallet() {
        super("Monero", new NotAllowedCancellationStrategy());
    }
}
```


***

## 🎯 Exercise Objective

You'll find a Java class that **misuses inheritance** and, as a consequence, **violates the Liskov principle**.

🔧 Your challenge is:

1. Identify the hierarchy that **breaks expected behavior**.
2. Refactor the code to ensure **subclasses are substitutable without breaking** the logic.
3. Apply **abstractions and polymorphism** to make the code more flexible and robust.

***

## 📌 Tips for Applying LSP

✅ **Ensure all subclasses fulfill the superclass contract.**

✅ **Don't use inheritance just for code reuse.**

✅ **Consider patterns like Composition* over Inheritance when there's no clear "is-a" relationship.**

* **"Composition"** is an **OOP** concept that means building a class using other objects (from other classes) as internal parts, instead of creating an inheritance hierarchy (subclasses).

***

## 💬 Reflection

When you correctly apply **the Liskov principle**:

- You avoid unexpected behavior during execution.
- Your code is more predictable, safe, and reusable.
- You can use polymorphism without surprises.

🔁 **Inheriting** behavior means **respecting it**, **not breaking it**.

***

🚀 Go ahead! Review the code, identify the error, and refactor the hierarchy to comply with **LSP**.

❓ **Can a subclass be used in place of its superclass without issues?**
