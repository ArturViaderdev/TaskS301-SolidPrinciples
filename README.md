# TaskS301 - Solid Principles

## Introduction

The **SOLID principles** are a set of object-oriented design best practices that help create software that is more:

✅ Maintainable
✅ Scalable
✅ Readable
✅ Robust

They were proposed by **Robert C. Martin (Uncle Bob)** and are widely used in professional software development.[^1][^2]

🧠 **SOLID** is an acronym for the following 5 fundamental principles:


| Letter | Principle | Name in Catalan | Brief Description |
| :-- | :-- | :-- | :-- |
| S | Single Responsibility | Single Responsibility | Each class should have a single responsibility [^3][^4] |
| O | Open/Closed | Open/Closed | Code should be open for extension but closed for modification |
| L | Liskov Substitution | Liskov Substitution | Subclasses must be able to replace superclasses [^5][^6] |
| I | Interface Segregation | Interface Segregation | Don't force dependency on unused interfaces |
| D | Dependency Inversion | Dependency Inversion | Depend on abstractions, not concrete classes [^1] |

## Objective

This [repository](https://github.com/IT-Academy-Back/S3-SOLID-JAVA) will help you learn and apply SOLID principles through practical exercises in Java.

Each principle is located in its own folder:
**S/** → Single Responsibility Principle
**O/** → Open/Closed Principle
**L/** → Liskov Substitution Principle
**I/** → Interface Segregation Principle
**D/** → Dependency Inversion Principle

Inside each directory you'll find:

- **README.md** with a clear explanation and simple examples.
- A Java class that does **not** follow the principle.


## How to Do the Task

1. Read the **README.md** from the folder of the principle you want to study.
2. Analyze the problematic Java class.
3. Identify how it **violates** the principle.
4. Refactor the class to **respect** the SOLID principle.
5. Reflect and explain what was wrong, why it violated the principle, and why you applied your solution.
6. Write a brief explanation in an **EXPLICACIO.md** file inside the exercise folder.

## Level 1

In this level you'll do the exercises from the **S/** and **D/** folders.

You'll work with classes that do too many things at once or are tightly coupled to other components.
Refactor them to separate responsibilities and use abstraction-based dependencies.

## Level 2

In this level you'll do the exercises from the **O/** and **I/** folders.

You'll encounter code that needs modification to add functionality or interfaces that force useless method implementations.
Refactor so the code is easily extensible without modifying it and create more specific interfaces.

## Level 3

In this level you'll do the exercise from the **L/** folder.

You'll work with inheritances that break the expected behavior of the base class.
Refactor to ensure all subclasses can be safely used as their parent class.

## Important

**Recommendations:**

- Don't be afraid to experiment.
- Practice is the best way to learn.
- Compare your solution with your classmates'.
- Use design patterns when helpful.

