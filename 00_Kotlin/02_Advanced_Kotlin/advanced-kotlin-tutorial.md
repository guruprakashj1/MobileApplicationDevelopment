# Advanced Kotlin Tutorial

## 1. Coroutines

Coroutines are Kotlin's way of handling asynchronous programming. They allow you to write asynchronous code in a sequential manner, making it easier to read and maintain.

### Example:

```kotlin
import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello")
}
```

This code prints "Hello", waits for a second, then prints "World!".

## 2. Sealed Classes

Sealed classes are used for representing restricted class hierarchies. They're particularly useful for state machines.

### Example:

```kotlin
sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val message: String) : Result()
}

fun handleResult(result: Result) = when(result) {
    is Result.Success -> println("Success: ${result.data}")
    is Result.Error -> println("Error: ${result.message}")
}
```

## 3. Inline Classes

Inline classes allow you to create a type that doesn't allocate memory overhead but still provides type safety.

### Example:

```kotlin
inline class Password(val value: String)

fun login(username: String, password: Password) {
    // Implementation
}

// Usage
login("user", Password("secret"))
```

## 4. Delegation

Kotlin supports delegation pattern out of the box, allowing you to implement interfaces by delegating method calls to another object.

### Example:

```kotlin
interface Engine {
    fun start()
}

class ElectricEngine : Engine {
    override fun start() = println("Electric engine starting")
}

class Car(engine: Engine) : Engine by engine

// Usage
val car = Car(ElectricEngine())
car.start() // Prints: Electric engine starting
```

## 5. Extension Receivers

Extension receivers allow you to extend a class with new functionality without inheriting from it.

### Example:

```kotlin
fun String.isPalindrome(): Boolean {
    return this.toLowerCase().reversed() == this.toLowerCase()
}

// Usage
println("Radar".isPalindrome()) // true
println("Hello".isPalindrome()) // false
```

## 6. Higher-Order Functions and Lambdas

Kotlin treats functions as first-class citizens, allowing you to pass functions as arguments and return them from other functions.

### Example:

```kotlin
fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

// Usage
val sum = operation(5, 3) { a, b -> a + b }
println(sum) // 8
```

These are just a few of the advanced topics in Kotlin. Each of these concepts opens up powerful new ways to write clean, efficient, and expressive code.

