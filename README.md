# Android-Terminology

# Function
- is a segment of a program that performs a specific task (camelCase)
- define a function - name(verb or verb phrase), 
                    - parameters(inputs - piece of data a fun needs to perform), 
                    - body(instructions about how to perform a task) 
                    - fun name(inputs){body}

# Variable

- *Var* is mutable, value can change
- *Val*(read-only) keyword - when you expect the value not to change (e.g if value is 10 you cannot change to 11)
  - cannot be reassigned, cannot edit or modify.
  - is like declaring a constant value [constants](https://developer.android.com/kotlin/style-guide?authuser=1#constant_names)

- container for a piece of data - refer to it by name to access it's value (camelCase)
- you *define/declare* a variable to uniquely identify it.(what data to hold, data type, provide an initial value(optional))
- declaration: val count: Int = 2. This statement creates an Int value that holds 2.
- when you use the variable you tell Kotlin compilet you want to use the variable's value.
- value is *initialized* to 2. This means that 2 is the first value stored in the variable when the variable is declared.
- var x = 10 // x was initialised to 10
- x = 20 // x has been reassigned to 20 (we assigned 20 to x)
<img width="654" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/bea41c4a-3da3-4d08-8d48-1f7442379996">
<img width="654" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/bfc8cba0-f6c9-4da4-89ed-c1b00bb04626">
<img width="654" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/c50f4dc1-43bc-4835-be5e-00e74f1f4540">


# Incrementing (++)
- count = count + 1


# Expression
- is a small unit of code that evaluates to a value. Expression can be made of variables, functions etc. 
-  count(expression) = 2(value). The expression evaluates to 2. Evaluates means determining the value of the expression.  
<img width="654" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/8d9ecae6-8980-462b-86f4-37d2b3cb716f">
<img width="654" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/3f3544c5-914a-414a-b48e-c8f05c99874f">

# Data Types
- Basic Types (String, Int, Double(Double Precision), Float(simple precision), Boolean)
  - Precision = how many decimals they can hold
  - val trip1: Double = 3.20

  
# String Template
- contains a template expression($) followed by a variable name.
- A template expression is evaluated, and its value gets substituted into the string.

# Coding Conventions
<img width="654" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/e603c71e-6c88-415e-9bec-79dc4c18364a">


