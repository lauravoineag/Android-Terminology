# Android-Terminology

[Integrated git control in Android Studio](https://betterprogramming.pub/how-to-use-git-in-android-studio-part-1-a8a554006aad) [Another just in case](https://medium.com/dsc-sastra-deemed-to-be-university/a-blog-on-using-git-in-android-studio-33b2125a18df)


# MainActivity
- *onCreate()* fun is the entry point to this Android app & calls other fun() to build the user interface.
- *setContent()* fun within the onCreate() is used to define your layout through composable functions.
- All fun() marked with the @Composable annotation can be called from the setContent().The annotation tells the Kotlin compiler that this fun() is used by Jetpack Compose to generate the UI.
- <img width="693" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/d154bf59-32e1-4a41-b751-deb89f3d2c1e">
[Source](https://developer.android.com/teach)

Encapsulation. Wraps the related properties and methods that perform action on those properties in a class. For example, consider your mobile phone. It encapsulates a camera, display, memory cards, and several other hardware and software components. You don't have to worry about how components are wired internally.

Abstraction. An extension to encapsulation. The idea is to hide the internal implementation logic as much as possible. For example, to take a photo with your mobile phone, all you need to do is open the camera app, point your phone to the scene that you want to capture, and click a button to capture the photo. You don't need to know how the camera app is built or how the camera hardware on your mobile phone actually works. In short, the internal mechanics of the camera app and how a mobile camera captures the photos are abstracted to let you perform the tasks that matter.

Inheritance. Enables you to build a class upon the characteristics and behavior of other classes by establishing a parent-child relationship. For example, there are different manufacturers who produce a variety of mobile devices that run Android OS, but the UI for each of the devices is different. In other words, the manufacturers inherit the Android OS feature and build their customizations on top of it.

Polymorphism. The word is an adaptation of the Greek root poly-, which means many, and -morphism, which means forms. Polymorphism is the ability to use different objects in a single, common way. For example, when you connect a Bluetooth speaker to your mobile phone, the phone only needs to know that there's a device that can play audio over Bluetooth. However, there are a variety of Bluetooth speakers that you can choose from and your phone doesn't need to know how to work with each of them specifically. [Source](https://developer.android.com/codelabs/basic-android-kotlin-compose-classes-and-objects?authuser=1&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%3Fauthuser%3D1%26_gl%3D1*294bh3*_up*MQ..%26gclid%3DCj0KCQiA5rGuBhCnARIsAN11vgTZhn8GKilp9b5Umihe6ZX2e2oK_UUwm9z4gFyEvtMXMYmLUJGjnvUaAvssEALw_wcB%26gclsrc%3Daw.ds%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-classes-and-objects&_gl=1*1sc18vd*_up*MQ..&gclid=Cj0KCQiA5rGuBhCnARIsAN11vgTZhn8GKilp9b5Umihe6ZX2e2oK_UUwm9z4gFyEvtMXMYmLUJGjnvUaAvssEALw_wcB&gclsrc=aw.ds#0)

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

   <img width="888" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/44c2ab69-04ac-401d-abf7-0018d35cae6e">
   <img width="377" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/00e6e4d2-c5b1-4980-9dc5-a8bea816bfcc">

       
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

# App Terms - Kotlin

   ## Class 
   Is a blueprint for an object. [Source](https://developer.android.com/codelabs/basic-android-kotlin-compose-classes-and-objects?authuser=1&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%3Fauthuser%3D1%26_gl%3D1*294bh3*_up*MQ..%26gclid%3DCj0KCQiA5rGuBhCnARIsAN11vgTZhn8GKilp9b5Umihe6ZX2e2oK_UUwm9z4gFyEvtMXMYmLUJGjnvUaAvssEALw_wcB%26gclsrc%3Daw.ds%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-classes-and-objects&_gl=1*1sc18vd*_up*MQ..&gclid=Cj0KCQiA5rGuBhCnARIsAN11vgTZhn8GKilp9b5Umihe6ZX2e2oK_UUwm9z4gFyEvtMXMYmLUJGjnvUaAvssEALw_wcB&gclsrc=aw.ds#2)
   ## Constructor 
   A special member function that creates instances of the class throughout the program in which it's defined.
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
        println("Have a good day!")}}
        
suspend fun getWeatherReport() = coroutineScope {
    val forecast = async { getForecast() }
    val temperature = async { getTemperature() }
    "${forecast.await()} ${temperature.await()}"}

suspend fun getForecast(): String {
    delay(1000)
    return "Sunny"}

suspend fun getTemperature(): String {
    delay(1000)
    return "30\u00b0C"}

  After some delay, cancel the coroutine that was fetching the temperature information, so that your weather report only displays the forecast. Change the return value of the coroutineScope block to only be the weather forecast string.
    
suspend fun getWeatherReport() = coroutineScope {
   val forecast = async { getForecast() }
   val temperature = async { getTemperature() }
  delay(200)
  temperature.cancel()
 "${forecast.await()}"}

  A coroutine can be cancelled, but it won't affect other coroutines in the same scope and the parent coroutine will not be cancelled.


  ###  Coroutine concepts

  ### Job   val job = launch { ... }
   When you launch a coroutine with the launch() function, it returns an instance of Job. The Job holds a handle, or reference, to the coroutine, so you can manage its lifecycle. The Deferred object that is returned from a coroutine started with the async() function is a Job as well, and it holds the future result of the coroutine.

   job.cancel()  The job can be used to control the life cycle, or how long the coroutine lives for, such as cancelling the coroutine if you don't need the task anymore.

   With a job, you can check if it's active, cancelled, or completed. The job is completed if the coroutine and any coroutines that it launched have completed all of their work.

   Job hierarchy
   val job = launch {
    ...             
    val childJob = launch { ... }
    ...}

   When a coroutine launches another coroutine, the job that returns from the new coroutine is called the child of the original parent job. 
   
   This parent-child relationship is important because it will dictate certain behavior for the child and parent, and other children belonging to the same parent.
If a parent job gets cancelled, then its child jobs also get cancelled.
When a child job is canceled using job.cancel(), it terminates, but it does not cancel its parent.
If a job fails with an exception, it cancels its parent with that exception. This is known as propagating the error upwards (to the parent, the parent's parent, and so on). .

   <img width="657" alt="image" src="https://github.com/lauravoineag/Android-Terminology/assets/77536595/0c3ba846-acf7-4b59-aff5-39926f6ddc21">


 ### CoroutineScope

 Coroutines are typically launched into a CoroutineScope. This ensures that we don't have coroutines that are unmanaged and get lost, which could waste resources.

launch() and async() are extension functions on CoroutineScope. Call launch() or async() on the scope to create a new coroutine within that scope.

A CoroutineScope is tied to a lifecycle, which sets bounds on how long the coroutines within that scope will live. If a scope gets cancelled, then its job is cancelled, and the cancellation of that propagates to its child jobs. If a child job in the scope fails with an exception, then other child jobs get cancelled, the parent job gets cancelled, and the exception gets re-thrown to the caller.

### CoroutineScope in Android apps
Android provides coroutine scope support in entities that have a well-defined lifecycle, such as Activity (lifecycleScope) and ViewModel (viewModelScope). Coroutines that are started within these scopes will adhere to the lifecycle of the corresponding entity, such as Activity or ViewModel.

For example, say you start a coroutine in an Activity with the provided coroutine scope called lifecycleScope. If the activity gets destroyed, then the lifecycleScope will get canceled and all its child coroutines will automatically get canceled too. You just need to decide if the coroutine following the lifecycle of the Activity is the behavior you want.


### Implementation Details of CoroutineScope
If you check the source code for how CoroutineScope.kt is implemented in the Kotlin coroutines library, you can see that CoroutineScope is declared as an interface and it contains a CoroutineContext as a variable.

The launch() and async() functions create a new child coroutine within that scope and the child also inherits the context from the scope. What is contained within the context? Let's discuss that next.

###  CoroutineContext
  = provides information about the context in which the coroutine will be running in. It's essentially a map that stores elements where each element has a unique key. These are not required fields, but here are some examples of what may be contained in a context:

name - name of the coroutine to uniquely identify it
job - controls the lifecycle of the coroutine
dispatcher - dispatches the work to the appropriate thread
exception handler - handles exceptions thrown by the code executed in the coroutine

Note: These are default values for the CoroutineContext, which will be used if you don't provide values for them:
"coroutine" for the coroutine name
no parent job
Dispatchers.Default for the coroutine dispatcher
no exception handler

Each of the elements in a context can be appended together with the + operator. For example, one CoroutineContext could be defined as follows:   Job() + Dispatchers.Main + exceptionHandler

ecause a name is not provided, the default coroutine name is used.

Within a coroutine, if you launch a new coroutine, the child coroutine will inherit the CoroutineContext from the parent coroutine, but replace the job specifically for the coroutine that just got created. You can also override any elements that were inherited from the parent context by passing in arguments to the launch() or async() functions for the parts of the context that you want to be different.

scope.launch(Dispatchers.Default) {...}

###  Dispatcher
Coroutines use dispatchers to determine the thread to use for its execution. A thread can be started, does some work (executes some code), and then terminates when there's no more work to be done.

When a user starts your app, the Android system creates a new process and a single thread of execution for your app, which is known as the main thread. The main thread handles many important operations for your app including Android system events, drawing the UI on the screen, handling user input events, and more. As a result, most of the code you write for your app will likely run on the main thread.

There are two terms to understand when it comes to the threading behavior of your code: blocking and non-blocking. A regular function blocks the calling thread until its work is completed. That means it does not yield the calling thread until the work is done, so no other work can be done in the meantime. Conversely, non-blocking code yields the calling thread until a certain condition is met, so you can do other work in the meantime. You can use an asynchronous function to perform non-blocking work because it returns before its work is completed.

In the case of Android apps, you should only call blocking code on the main thread if it will execute fairly quickly. The goal is to keep the main thread unblocked, so that it can execute work immediately if a new event is triggered. This main thread is the UI thread for your activities and is responsible for UI drawing and UI related events. When there's a change on the screen, the UI needs to be redrawn. For something like an animation on the screen, the UI needs to be redrawn frequently so that it appears like a smooth transition. If the main thread needs to execute a long-running block of work, then the screen won't update as frequently and the user will see an abrupt transition (known as "jank") or the app may hang or be slow to respond.

Hence we need to move any long-running work items off the main thread and handle it in a different thread. Your app starts off with a single main thread, but you can choose to create multiple threads to perform additional work. These additional threads can be referred to as worker threads. It's perfectly fine for a long-running task to block a worker thread for a long time, because in the meantime, the main thread is unblocked and can actively respond to the user.

There are some built-in dispatchers that Kotlin provides:

Dispatchers.Main: Use this dispatcher to run a coroutine on the main Android thread. This dispatcher is used primarily for handling UI updates and interactions, and performing quick work.
Dispatchers.IO: This dispatcher is optimized to perform disk or network I/O outside of the main thread. For example, read from or write to files, and execute any network operations.
Dispatchers.Default: This is a default dispatcher used when calling launch() and async(), when no dispatcher is specified in their context. You can use this dispatcher to perform computationally-intensive work outside of the main thread. For example, processing a bitmap image file.
Note: There's also Executor.asCoroutineDispatcher() and Handler.asCoroutineDispatcher() extensions, if you need to make a CoroutineDispatcher from a Handler or Executor that you already have available.

fun main() {
    runBlocking {
        launch {
            withContext(Dispatchers.Default) {
                delay(1000)
                println("10 results found.")}}
        println("Loading...")}}

  = wrap the contents of the launched coroutine with a call to withContext() to change the CoroutineContext that the coroutine is executed within, and specifically override the dispatcher. Switch to using the Dispatchers.Default (instead of Dispatchers.Main which is currently being used for the rest of the coroutine code in the program).
  = Switching dispatchers is possible because withContext() is itself a suspending function. It executes the provided block of code using a new CoroutineContext. The new context comes from the context of the parent job (the outer launch() block), except it overrides the dispatcher used in the parent context with the one specified here: Dispatchers.Default. This is how we are able to go from executing work with **Dispatchers.Main** to using **Dispatchers.Default**

**Add print statements to see what thread you are on by calling Thread.currentThread().name.**

  fun main() {
    runBlocking {
        println("${Thread.currentThread().name} - runBlocking function")
                launch {
            println("${Thread.currentThread().name} - launch function")
            withContext(Dispatchers.Default) {
                println("${Thread.currentThread().name} - withContext function")
                delay(1000)
                println("10 results found.")}
            println("${Thread.currentThread().name} - end of launch function")}
        println("Loading...")}}
    It will Print :   
    
   main @coroutine#1 - runBlocking function
   Loading...
   main @coroutine#2 - launch function
   DefaultDispatcher-worker-1 @coroutine#2 - withContext function
   10 results found.
   main @coroutine#2 - end of launch function

   You can observe that most of the code is executed in coroutines on the main thread. However, for the portion of your code in the withContext(Dispatchers.Default) block, that is executed in a coroutine on a Default Dispatcher worker thread (which is not the main thread). Notice that after withContext() returns, the coroutine returns to running on the main thread (as evidenced by output statement: main @coroutine#2 - end of launch function). This example demonstrates that you can switch the dispatcher by modifying the context that is used for the coroutine.

If you have coroutines that were started on the main thread, and you want to move certain operations off the main thread, then you can use withContext to switch the dispatcher being used for that work. Choose appropriately from the available dispatchers: Main, Default, and IO depending on the type of operation it is. Then that work can be assigned to a thread (or group of threads called a thread pool) designated for that purpose. Coroutines can suspend themselves, and the dispatcher also influences how they resume.

Note that when working with popular libraries like Room and Retrofit (in this unit and the next one), you may not have to explicitly switch the dispatcher yourself if the library code already handles doing this work using an alternative coroutine dispatcher like Dispatchers.IO. In those cases, the suspend functions that those libraries reveal may already be main-safe and can be called from a coroutine running on the main thread. The library itself will handle switching the dispatcher to one that uses worker threads.

Now you've got a high-level overview of the important parts of coroutines and the role that CoroutineScope, CoroutineContext, CoroutineDispatcher, and Jobs play in shaping the lifecycle and behavior of a coroutine.

###  Conclusion Coroutines:
   Coroutines are very useful because their execution can be suspended, freeing up the underlying thread to do other work, and then the coroutine can be resumed later. This allows you to run concurrent operations in your code.
   
   Coroutine code in Kotlin follows the principle of structured concurrency. It is sequential by default, so you need to be explicit if you want concurrency (e.g. using launch() or async()). With structured concurrency, you can take multiple concurrent operations and put it into a single synchronous operation, where concurrency is an implementation detail. The only requirement on the calling code is to be in a suspend function or coroutine. Other than that, the structure of the calling code doesn't need to take into account the concurrency details. That makes your asynchronous code easier to read and reason about.
   
   Structured concurrency keeps track of each of the launched coroutines in your app and ensures that they are not lost. Coroutines can have a hierarchy—tasks might launch subtasks, which in turn can launch subtasks. Jobs maintain the parent-child relationship among coroutines, and allow you to control the lifecycle of the coroutine.
   
   Launch, completion, cancellation, and failure are four common operations in the coroutine's execution. To make it easier to maintain concurrent programs, structured concurrency defines principles that form the basis for how the common operations in the hierarchy are managed:

  1. Launch: Launch a coroutine into a scope that has a defined boundary on how long it lives for.
  2. Completion: The job is not complete until its child jobs are complete.
  3. Cancellation: This operation needs to propagate downward. When a coroutine is canceled, then the child coroutines need to also be canceled.
  4. Failure: This operation should propagate upward. When a coroutine throws an exception, then the parent will cancel all of its children, cancel itself, and propagate the exception up to its parent. This continues until the failure is caught and handled. It ensures that any errors in the code are properly reported and never lost.
Through hands-on practice with coroutines and understanding the concepts behind coroutines, you are now better equipped to write concurrent code in your Android app. By using coroutines for asynchronous programming, your code is simpler to read and reason about, more robust in situations of cancellations and exceptions, and delivers a more optimal and responsive experience for end users.

**Summary**

   Coroutines enable you to write long running code that runs concurrently without learning a new style of programming. The execution of a coroutine is sequential by design.
   Coroutines follow the principle of structured concurrency, which helps ensure that work is not lost and tied to a scope with a certain boundary on how long it lives. Your code is sequential by default and cooperates with an underlying event loop, unless you explicitly ask for concurrent execution (e.g. using launch() or async()). The assumption is that if you call a function, it should finish its work completely (unless it fails with an exception) by the time it returns regardless of how many coroutines it may have used in its implementation details.
   The suspend modifier is used to mark a function whose execution can be suspended and resumed at a later point.
   A suspend function can be called only from another suspending function or from a coroutine.
   You can start a new coroutine using the launch() or async() extension functions on CoroutineScope.
   Jobs plays an important role to ensure structured concurrency by managing the lifecycle of coroutines and maintaining the parent-child relationship.
   A CoroutineScope controls the lifetime of coroutines through its Job and enforces cancellation and other rules to its children and their children recursively.
   A CoroutineContext defines the behavior of a coroutine, and can include references to a job and coroutine dispatcher.
   Coroutines use a CoroutineDispatcher to determine the threads to use for its execution.
   
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




