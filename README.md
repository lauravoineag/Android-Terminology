# Android-Terminology

# MainActivity
- *onCreate()* fun is the entry point to this Android app & calls other fun() to build the user interface.
- *setContent()* fun within the onCreate() is used to define your layout through composable functions.
- All fun() marked with the @Composable annotation can be called from the setContent().The annotation tells the Kotlin compiler that this fun() is used by Jetpack Compose to generate the UI.

  # Compiling Code
    - The compiler takes the Kotlin code you wrote, looks at it line by line, and translates it into something that the computer can understand. This process is called compiling your code.


# Function
- is a segment of a program that performs a specific task (camelCase)
- define a function - name(verb or verb phrase), 
                    - parameters(inputs - piece of data a fun needs to perform), 
                    - body(instructions about how to perform a task) 
                    - fun name(inputs){body}
 - the function signature: the fun name with its inputs (parameters), consists of everything before the return type.  E.g *fun birthdayGreeting(name: String, age: Int)*

# Parameters 
- pass a value to a function(add a parameter): name & data type that you pass in a function to access inside of it
- parameters are declared/defined (inside the parenthesis)
- parameters in Kotlin are immutable. You cannot reassign the value of a parameter from within the function body.

# Named Arguments
- When you include the parameter name when you call a function, it's called a named argument.
- you may want to pass your arguments in a different order, such as putting one parameter in front of another
- <img width="441" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/840fac5d-8c75-4c0d-b78d-446e039d1109">

# Default Arguments
- When you call a function, you can choose to omit arguments for which there is a default, in which case, the default is used. E.g below  *println(birthdayGreeting(age = 5))*
<img width="580" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/360110b1-b6b5-478b-be3b-bc14cb349df5">

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


