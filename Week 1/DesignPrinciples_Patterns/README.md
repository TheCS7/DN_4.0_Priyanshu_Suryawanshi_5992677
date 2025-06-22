# This week we implemented two important **creational design patterns** in Java:

- ✅ Singleton Pattern
- ✅ Factory Method Pattern


##  Exercise 1: Singleton Pattern

What We Did
We created a Logger class that ensures only one instance can ever exist in the entire program.

###  What We Learned:

- Singleton ensures only one instance of a class is created.
- Useful for logging, configuration, or database connections.
- Requires:
  - Private constructor
  - Static instance variable
  - Static getter method

###  How to Run:

javac Logger.java

javac Testclass.java

java Testclass

### Output:

Logger instance created. 

Same instance? true

[LOG] Test message 1

[LOg] Test message 2

## Exercise 2: Factory Method Pattern

 What We Learned:

Factory Method lets subclasses decide which class to instantiate.

### We created a base interface Document and concrete types like:

WordDocument

PdfDocument

ExcelDocument

Factory classes were used to create these document objects.

###  How to Run:

javac main/*.java

java -cp . main.Test

###  Output:


Opening a Word document.

Opening a PDF document.

Opening an Excel document.
