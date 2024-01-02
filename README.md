# Android-Terminology


# MainActivity
- *onCreate()* fun is the entry point to this Android app & calls other fun() to build the user interface.
- *setContent()* fun within the onCreate() is used to define your layout through composable functions.
- All fun() marked with the @Composable annotation can be called from the setContent().The annotation tells the Kotlin compiler that this fun() is used by Jetpack Compose to generate the UI.

# Compiling Code
    - The compiler takes the Kotlin code you wrote, looks at it line by line, and translates it into something that the computer can understand. This process is called compiling your code.

# Lambdas
    1. Kotlin treats functions like first class contructors.Functions are treated like data types like int and Strings. This means you can store functions in variables and later call this function.
    
    fun printHello() { "Hi there" }
    val callMeLater = ::printHello
    callMeLater() // "Hi there"

    2. You can pass functions as aguments to other functions and return fuctions from other functions.
    someOtherFunction(callMeLater)
    someOtherFunction(callMeLater:() -> Unit ) { callMeLater() }

    3. Lambdas expressions
     fun printHello() { println("Hi there") }
     
     A lambda expression can be stored in a variable that refers to the function
     val helloLambda = { println("Hi there") }
      someOtherFunction(helloLambda) //can be provided as an argument
      someOtherFunction({ println("Hi there") }) //it can be used as an argument without providing a function name
     

# Trailing lambda syntax
    - When you pass a function as that parameter, you can use trailing lambda syntax. Last parameter is a fun().
    - Instead of putting the function body along with the function name within the parentheses({}), you put the parentheses along with the function body after the function name. 
<img width="607" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/cd4ce90c-e4f2-4d1f-8232-dd9f438dfe89">

 # Conditionals
 
  ## If
     "==' comparison operators
     condition = boolean
     The statement/expressions only execute when the condition is met(true).
     if(condition) { body }
    
   ## When
       Program looks more complex with multiple conditions, also known as branching. You may wonder whether you can simplify a program with an even larger number of branches.
       
    When (parameter) {
    condition 1 -> body
    condition 2 -> body}
    The program evaluates each condition one-by-one in sequence.
    A body was executed, so the program ignores the third and fourth branches, and leaves the when statement.

    fun main() {
    val trafficLightColor = "Yellow"
    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")}} //Slow
  
   [Docs - When Expressions](https://kotlinlang.org/docs/control-flow.html)

   ## Conditional expressions
    The last expression of the branch that matched will return snd assign to variable
    Expressions must return a value

    Expressions with _when_ statements
    val name =  when (parameter) {
    condition 1 -> body
    condition 2 -> body}
  
    val name = if (condition){ body1 } else { body2 }
      
[Docs](https://developer.android.com/codelabs/basic-android-kotlin-compose-conditionals?authuser=1&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%3Fauthuser%3D1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-conditionals#1)

# App Terms
 
   ## Constructor 
    Constructors that are automatically executed every time you create an object. The purpose of a constructor is to construct an object and assign values to the object's members and does not return any values. 
    
   ## INIT = when you create an object of that class this init block will run to display immediately(VM) - 
   The primary constructor initializes a class instance and its properties in the class header. The class header can't contain any runnable code. If you want to run some code during object creation, use initializer blocks inside the class body. Initializer blocks are declared with the init keyword followed by curly braces. Write any code that you want to run within the curly braces.
   
 # Compose
 
   ## Surface
   - is a container that represents a section of UI where you can alter the appearance, eg. background color
   - like a box

   ## Modifier
       - Used to decorate a composable, optional parameter
       
   ## Padding(add space around the element) 
<img width="769" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/52c4ed0d-4064-47d8-b927-302efcfe51ac">


   ## Sp & Dp
       - sp ( scalable pixels)s a unit of measure for the font size. SP unit is the same size as the DP unit, but it resizes based on the user's preferred text size under phone settings.
       - dp (nt: density-independent pixels) for layout
   ## UI Hierarchy
       - based on containment (one comp can contain another). The parent UI elements contain children UI elements, which in turn can contain children UI elements.
    
   ## 3 LayoutElements: Column, Row(horizontally), Box
   - Modifiers to layouts to position the child elements using arrangement and alignment properties.
    <img width="663" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/15d1c0d1-52b3-4dab-8f60-f9374c981c2c">
    <img width="663" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/a7c11988-d2ba-4875-9363-322d0a3751fa">


   

   ## A Composable
  <img width="785" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/a54d48ae-25c6-4eb7-8412-81ad1240658c">
  - a composable describes what this piece of the UI should look like
  - is declarative(you declare how your app should look like)
  - Doesn't return anything
  - is immutable - there is no way to update a composable once created, instead when the app data is updated and the UI needs refreshed.Compose re-executes the composable fun() and transforms this new State into new UI representation. This is called recomposition.
  - uses built in layouts(Columns, Images, Buttons)
  - can use parameters to build the UI. Takes some input and generates what's shown on the screen.
  - Naming:
      - must be a noun, may be prefixed by adjectives(RoundIcon)


# Intent
- describe intention - I want to view "https..LinkedIn.."
- val bestIntent = Intent(Intent.Action_View).setData(uri.parse("https..LinkedIn.."))
- then you can launch your startActivity(bestIntent)

- for navigation in your app if you have Main and SecondActivity
- startActivity(Intent(this,SecondActivity::class.java))

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


# IMAGES

  ## Download the image(png)
- click View > Tool Windows > Resource Manager > Import Drawables > Density = no density > drawable-nodpi (which stops the resizing behavior)
- Android Studio creates a drawable-nodpi folder and places your image in it. In Android Studio project view, the resource name is displayed as androidparty.png (nodpi) --> *Drawable tab*
- Resource Manager is a tool window that lets you import, create, manage, and use resources in your app.

  ## Add an Image composable -- Image()
  <img width="450" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/8c5252f2-db62-4078-a71c-72453c754128">

  ## Scale the image
  - adjust the scale type of the image, which says how to size the image, to make it fullscreen.
  -  ContentScale types -> Use ContentScale.Crop parameter, -> which scales the image uniformly to maintain the aspect ratio so that the width and height of the image are equal to, or larger than, the corresponding dimension of the screen.
    
  ## Change Opacity
  Image(painter = image,contentDescription = null,contentScale = ContentScale.Crop,
   *alpha = 0.5F*)
  

  ## Resources in Jetpack
  - Resources are the additional files and static content that your code uses, such as bitmaps, user-interface strings, animation instructions etc. You should always separate app resources, such as images and strings, from your code so that you can maintain them independently. At runtime, Android uses the appropriate resource based on the current configuration. For example, you might want to provide a different UI layout based on the screen size or different strings based on the language setting.
  - Accessing resources can be accessed with resource IDs that are generated in your project's *R* class.
  - An *R* class is an automatically generated class by Android that contains the IDs of all resources in the project. In most cases, the resource ID is the same as the filename
 
    ## DESIGN
    # Create a low-fidelity prototype
    - If you don't work with a designer, you can create a low-fidelity, or low-fi, prototype on your own. Low-fi prototype refers to a simple model, or drawing, that provides a basic idea of what the app looks like.ou can simply use a pen and paper, [Slides](http://slides.google.com/?authuser=1), or [Drawings](https://docs.google.com/drawings/?authuser=1) to help you build it.
      
        <img width="286" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/b0225ae6-6a2d-4bb0-ac28-0981b6e2dbc7"> <img width="676" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/e8b97eb0-10b0-4560-9918-7058be877db5">
        <img width="676" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/005cbd36-036b-4c6a-9f83-3cae26dad416">
        <img width="676" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/83dd2cc7-fb9d-42a0-a099-1e02c2851f9f">




    - Principles that help make design better for users - (Understanding layout)[https://m3.material.io/foundations/layout/understanding-layout/overview]

# Coding Conventions
<img width="654" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/e603c71e-6c88-415e-9bec-79dc4c18364a">

# What makes a great app
- effective - clear about what you need to do
- efficient - no unnecessary steps from what you want to accomplish to having it done
- accessible - easy to use

# Android Studio
Android Studio(AS) (will look for something that'll let it understand what kind of project it's dealing with, since it is AS, it defaults to automatically looking for gradle files, specifically build.gradle and settings.gradle.

Those two files describe to it:
- What gradle plugins to use (build.gradle)
- Where to get dependencies (build.gradle & settings.gradle sometimes)
- Which modules to import (settings.gradle 'include(":app")'

Disclaimer: This is the content summarised from [Android Courses](https://developer.android.com/courses/android-basics-compose/course)




