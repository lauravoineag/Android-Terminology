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
    
   ## INIT 
   When you create an object of that class this init block will run to display immediately(VM).
    
   The primary constructor initializes a class instance and its properties in the class header. The class header can't contain any runnable code. If you want to run some code during object creation, use initializer blocks inside the class body. 
   Initializer blocks are declared with the init keyword followed by curly braces. Write any code that you want to run within the curly braces.
    
   ## Retrofit
   - third party library that helps easily consume REST services. Turns the REST Api into an interface and generates implementation code from that interface. You initialise and use this code to make Http requests to the remote server. Then receive and consume the JSON data from the response. You can then use this data in your app eg to display the list data.
   - creates a Http Request by using the contents from a service.

   1.private const val BASE_URL =  "https://android.."
     private val retrofit = Retrofit.Builder()
     .addConverterFactory(ScalarsConverterFactory.create())
     .baseUrl(BASE_URL)
     .build()
   
   2. interface ApiService {
    @GET("photos") 
    fun getPhotos()}
  
  3. Create a Retrofit service and expose the instance to the api service to the rest of the app
     object MarsApi {
     val retrofitService : MarsApiService by lazy { 
       retrofit.create(MarsApiService::class.java)}
      
   Retrofit creates a network API for the app based on the content from the web service. It fetches data from the web service and routes it through a separate converter library that knows how to decode the data and return it in the form of objects, like String. Retrofit includes built-in support for popular data formats, such as XML and JSON. Retrofit ultimately creates the code to call and consume this service for you, including critical details, such as running the requests on background threads.

   ## Object
   object declarations are used to declare singleton objects. Singleton pattern ensures that one, and only one, instance of an object is created and has one global point of access to that object

   ## "lazy initialization" 
   - is when object creation is purposely delayed, until you actually need that object, to avoid unnecessary computation or use of other computing resources. 


 ## Coroutines 
 [Source](https://developer.android.com/codelabs/basic-android-kotlin-compose-coroutines-kotlin-playground?authuser=1&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-5-pathway-1%3Fauthuser%3D1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-coroutines-kotlin-playground#3)
 ### Concurrency = involves performing multiple tasks in your app at the same time.
 To do work concurrently in your app, you will be using Kotlin coroutines. 
 
  ### Coroutines 
   = allow the execution of a block of code to be suspended and then resumed later, so that other work can be done in the meantime. Coroutines make it easier to write **asynchronous code**, which means one task doesn't need to finish completely before starting the next task, enabling multiple tasks to run concurrently.

### Synchronous code - One task must finish completely before the next one is started.

###  delay() 
   = is actually a special suspending function provided by the Kotlin coroutines library and should be called only from a coroutine or another suspend function.

###  runBlocking() 
   = function from the coroutines library. runBlocking() runs an event loop, which can handle multiple tasks at once by continuing each task where it left off when it's ready to be resumed.

   fun main() {
    runBlocking {
        println("Weather forecast")
        delay(1000)
        println("Sunny")}}

   runBlocking() is synchronous; it will not return until all work within its lambda block is completed. That means it will wait for the work in the delay() call to complete (until one second elapses), and then continue with executing the Sunny print statement. Once all the work in the runBlocking() function is complete, the function returns, which ends the program.
   
   The "co-" in coroutine means cooperative. The code cooperates to share the underlying event loop when it suspends to wait for something, which allows other work to be run in the meantime. (The "-routine" part in "coroutine" means a set of instructions like a function.) In the case of this example, the coroutine suspends when it reaches the delay() call. Other work can be done in that one second when the coroutine is suspended (even though in this program, there is no other work to do). Once the duration of the delay elapses, then the coroutine resumes execution and can proceed with printing Sunny to the output.
   
   ###  Asynchronous code
   
   ###  launch() function from the coroutines library to launch a new coroutine. 
   
   Coroutines in Kotlin follow a key concept called structured concurrency, where your code is sequential by default and cooperates with an underlying event loop, unless you explicitly ask for concurrent execution (e.g. using launch()). The assumption is that if you call a function, it should finish its work completely by the time it returns regardless of how many coroutines it may have used in its implementation details. Even if it fails with an exception, once the exception is thrown, there are no more pending tasks from the function. Hence, all work is finished once control flow returns from the function, whether it threw an exception or completed its work successfully.

   fun main() {
    runBlocking {
        println("Weather forecast")
        launch {printForecast()}
        launch {printTemperature()}
        println("Have a good day!")}}

suspend fun printForecast() {
    delay(1000)
    println("Sunny")}

suspend fun printTemperature() {
    delay(1000)
    println("30\u00b0C")} 

 The output is the same but you may have noticed that it is faster to run the program. Previously, you had to wait for the printForecast() suspend function to finish completely before moving onto the printTemperature() function. Now printForecast() and printTemperature() can run concurrently because they are in separate coroutines.

You can observe that after the two new coroutines are launched for printForecast() and printTemperature(), you can proceed with the next instruction which prints Have a good day!. This demonstrates the "fire and forget" nature of launch(). You fire off a new coroutine with launch(), and don't have to worry about when its work is finished.

Later the coroutines will complete their work, and print the remaining output statements. Once all the work (including all coroutines) in the body of the runBlocking() call have been completed, then runBlocking() returns and the program ends.

###  async()
   You won't know how long the network requests for forecast and temperature will take. If you want to display a unified weather report when both tasks are done, then the current approach with launch() isn't sufficient. That's where async() comes in.

Use the async() function from the coroutines library if you care about when the coroutine finishes and need a return value from it.

The async() function returns an object of type Deferred, which is like a promise that the result will be in there when it's ready. You can access the result on the Deferred object using await().

fun main() {
    runBlocking {
        println("Weather forecast")
        val forecast: Deferred<String> = async {getForecast()}
        val temperature: Deferred<String> = async {getTemperature()}
        println("${forecast.await()} ${temperature.await()}")
        println("Have a good day!")}}

suspend fun getForecast(): String {
    delay(1000)
    return "Sunny"}

suspend fun getTemperature(): String {
    delay(1000)
    return "30\u00b0C"}

  Replace launch with async(). After the two async() calls, you can access the result of those coroutines by calling await() on the Deferred objects. In this case, you can print the value of each coroutine using forecast.await() and temperature.await().
    You created two coroutines that ran concurrently to get the forecast and temperature data. When they each completed, they returned a value. Then you combined the two return values into a single print statement: Sunny 30°C.

  ###  Parallel Decomposition

  Parallel decomposition involves taking a problem and breaking it into smaller subtasks that can be solved in parallel. When the results of the subtasks are ready, you can combine them into a final result.

  fun main() {
    runBlocking {
        println("Weather forecast")
        println(getWeatherReport())
        println("Have a good day!")}}

suspend fun getWeatherReport() = coroutineScope {
    val forecast = async { getForecast() }
    val temperature = async { getTemperature() }
    "${forecast.await()} ${temperature.await()}"
}

suspend fun getForecast(): String {
    delay(1000)
    return "Sunny"}

suspend fun getTemperature(): String {
    delay(1000)
    return "30\u00b0C"}

 coroutineScope() will only return once all its work, including any coroutines it launched, have completed. In this case, both coroutines getForecast() and getTemperature() need to finish and return their respective results. Then the Sunny text and 30°C are combined and returned from the scope. This weather report of Sunny 30°C gets printed to the output, and the caller can proceed to the last print statement of Have a good day!.

With coroutineScope(), even though the function is internally doing work concurrently, it appears to the caller as a synchronous operation because coroutineScope won't return until all work is done.

The key insight here for structured concurrency is that you can take multiple concurrent operations and put it into a single synchronous operation, where concurrency is an implementation detail. The only requirement on the calling code is to be in a suspend function or coroutine. Other than that, the structure of the calling code doesn't need to take into account the concurrency details.

### Exceptions and cancellation
   An exception is an unexpected event that happens during execution of your code. You should implement appropriate ways of handling these exceptions, to prevent your app from crashing and impacting the user experience negatively.

   Exceptions with coroutines

   fun main() {
    runBlocking {
        println("Weather forecast")
        try { println(getWeatherReport())} 
        catch (e: AssertionError) {
            println("Caught exception in runBlocking(): $e")
            println("Report unavailable at this time") }
        println("Have a good day!")}}

suspend fun getWeatherReport() = coroutineScope {
    val forecast = async { getForecast() }
    val temperature = async { getTemperature() }
    "${forecast.await()} ${temperature.await()}"}

suspend fun getForecast(): String {
    delay(1000)
    return "Sunny"}

suspend fun getTemperature(): String {
    delay(500)
    throw AssertionError("Temperature is invalid")
    return "30\u00b0C"}

getTemperature() function, write a throw expression using the throw keyword in Kotlin followed by a new instance of an exception which extends from Throwable. You can throw an AssertionError and pass in a message string that describes the error in more detail: throw AssertionError("Temperature is invalid"). Throwing this exception stops further execution of the getTemperature() function.

You can launch a coroutine (known as the child) from another coroutine (parent). As you launch more coroutines from those coroutines, you can build up a whole hierarchy of coroutines.

The coroutine executing getTemperature() and the coroutine executing getForecast() are child coroutines of the same parent coroutine. The behavior you're seeing with exceptions in coroutines is due to structured concurrency. When one of the child coroutines fails with an exception, it gets propagated upwards. The parent coroutine is cancelled, which in turn cancels any other child coroutines (e.g. the coroutine running getForecast() in this case). Lastly, the error gets propagated upwards and the program crashes with the AssertionError.

getTemperature() throws an exception. In the body of the runBlocking() function, you surround the println(getWeatherReport()) call in a try-catch block. You catch the type of exception that was expected (AssertionError in the case of this example). Then you print the exception to the output as "Caught exception" followed by the error message string. To handle the error, you let the user know that the weather report is not available with an additional println() statement: Report unavailable at this time.

Note that this behavior means that if there's a failure with getting the temperature, then there will be no weather report at all (even if a valid forecast was retrieved).

fun main() {
    runBlocking {
        println("Weather forecast")
        println(getWeatherReport())
        println("Have a good day!")}}

suspend fun getWeatherReport() = coroutineScope {
    val forecast = async { getForecast() }
    val temperature = async {
        try {getTemperature()} 
        catch (e: AssertionError) 
        {println("Caught exception $e")
        "{ No temperature found }"}}
    "${forecast.await()} ${temperature.await()}"}

suspend fun getForecast(): String {
    delay(1000)
    return "Sunny"}

suspend fun getTemperature(): String {
    delay(500)
    throw AssertionError("Temperature is invalid")
    return "30\u00b0C"}

  calling getTemperature() failed with an exception, but the code within async() was able to catch that exception and handle it gracefully by having the coroutine still return a String that says the temperature was not found. The weather report is still able to be printed, with a successful forecast of Sunny. The temperature is missing in the weather report, but in its place, there is a message explaining that the temperature was not found. This is a better user experience than the program crashing with the error.

A helpful way to think about this error handling approach is that async() is the producer when a coroutine is started with it. await() is the consumer because it's waiting to consume the result from the coroutine. The producer does the work and produces a result. The consumer consumes the result. If there's an exception in the producer, then the consumer will get that exception if it's not handled, and the coroutine will fail. However, if the producer is able to catch and handle the exception, then the consumer won't see that exception and will see a valid result.

Within a try-catch statement in your coroutine code, avoid catching a general Exception because that includes a very broad range of exceptions. You could be inadvertently catching and suppressing an error that is actually a bug that should be fixed in your code. Another important reason is that cancellation of coroutines, which is discussed later in this section, depends on CancellationException. So if you catch any type of Exception including CancellationExceptions without rethrowing them, then the cancellation behavior within your coroutines may behave differently than expected. Instead, catch a specific type of exception that you expect will be thrown from your code.

###  Cancellation Coroutine 

A similar topic to exceptions is cancellation of coroutines. This scenario is typically user-driven when an event has caused the app to cancel work that it had previously started.

For example, say that the user has selected a preference in the app that they no longer want to see temperature values in the app. They only want to know the weather forecast (e.g. Sunny), but not the exact temperature. Hence, cancel the coroutine that is currently getting the temperature data.

fun main() {
    runBlocking {
        println("Weather forecast")
        println(getWeatherReport())
        println("Have a good day!")
    }
}

suspend fun getWeatherReport() = coroutineScope {
    val forecast = async { getForecast() }
    val temperature = async { getTemperature() }
    "${forecast.await()} ${temperature.await()}"
}

suspend fun getForecast(): String {
    delay(1000)
    return "Sunny"
}

suspend fun getTemperature(): String {
    delay(1000)
    return "30\u00b0C"
}

   
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




