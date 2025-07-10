## 📄 Description – Exercise Statement

- Create a class `Product` with the following attributes:
    - `name`
    - `price`

- Create another class `Sale` with:
    - A collection of products
    - An attribute to store the total price of the sale

- The `Sale` class must include a method `calculateTotal()` that:
    - Throws a custom exception called `EmptySaleException` if the product collection is empty
    - If the collection contains products, it iterates through them and stores the sum of their prices in the total price attribute

- The custom exception `EmptySaleException` must extend `Exception` and receive a message in its constructor:
  > "To make a sale you first have to add products"

- When the exception is caught, the message should be printed using the `getMessage()` method

- Finally, write code that triggers and catches an `IndexOutOfBoundsException` to demonstrate the ability to handle built-in exceptions as well

This exercise focuses on **custom exception creation and handling**, **defensive programming**, and **error management in collection-based operations**.

---

## 💻 Technologies Used

- Java 21
- IntelliJ IDEA (or any other Java IDE)
- Git & GitHub (optional, for version control)

---

## 📋 Requirements

- Java SDK 21 or higher
- An IDE like IntelliJ IDEA or Eclipse
- Git installed (optional)

---

## 🛠️ Installation

1. Clone the repository (if available):

   ```bash
   git clone https://github.com/alaw810/1.2-JavaLanguage-Level1.git

2. Open the project in IntelliJ IDEA:

File → Open → Select the project folder

3. Set the correct Java SDK:

File → Project Structure → SDKs → Java 21+

---

## ▶️ Execution

1. Open the Main.java file

2. Run the main() method

3. You should see output similar to:

>Error: To make a sale you first have to add products  
The final total is: 6.09  
Value at: 0 = Product{name='Apple', price=0.89}  
Value at: 1 = Product{name='Banana', price=0.3}  
Value at: 2 = Product{name='Pineapple', price=4.9}  
IndexOutOfBoundsException: Index 3 out of bounds for length 3


--- 

## 🌐 Deployment
This is a Java console-based educational exercise and doesn't require production deployment.
If desired, you can compile and run it manually:

    javac *.java
    java Main

Or export it as a `.jar` file using IntelliJ IDEA.

---

## 🤝 Contributions
This is a learning exercise intended for individual academic practice.
However, pull requests with enhancements or improvements are welcome!

1. Fork the repo

2. Create a new branch (`git checkout -b feature/your-feature`)

3. Commit and push your changes

4. Open a Pull Request