# Kotlin Advanced Topics

## 1. Coroutines

Coroutines are Kotlin's way of handling asynchronous programming. They allow you to write asynchronous code in a sequential manner, making it easier to read and maintain.

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

## 2. Data Classes

Data classes are a concise way to create classes that are used to hold data.

```kotlin
data class User(val name: String, val age: Int)

val user1 = User("Alice", 29)
val user2 = User("Alice", 29)

println(user1 == user2) // true
println(user1) // User(name=Alice, age=29)
```

Data classes automatically implement `equals()`, `hashCode()`, and `toString()` methods.

## 3. Sealed Classes

Sealed classes are used for representing restricted class hierarchies. They're particularly useful for state machines.

```kotlin
sealed class Result
class Success(val data: String) : Result()
class Error(val message: String) : Result()

fun handleResult(result: Result) = when (result) {
    is Success -> println("Success: ${result.data}")
    is Error -> println("Error: ${result.message}")
}
```

## 4. Inline Functions

Inline functions can improve performance by inlining the function's bytecode at the call site.

```kotlin
inline fun operation(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

val result = operation(5, 3) { x, y -> x + y }
```

## 5. Delegation

Kotlin supports delegation patterns out of the box using the `by` keyword.

```kotlin
interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

class Derived(b: Base) : Base by b

fun main() {
    val b = BaseImpl(10)
    Derived(b).print() // prints 10
}
```

## 6. Type Aliases

Type aliases provide alternative names for existing types, which can be useful for shortening long generic types.

```kotlin
typealias NodeSet = Set<Network.Node>
typealias FileTable<K> = MutableMap<K, MutableList<File>>
```

## 7. Operator Overloading

Kotlin allows you to provide implementations for a predefined set of operators on your types.

```kotlin
data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point) = Point(x + other.x, y + other.y)
}

val p1 = Point(10, 20)
val p2 = Point(30, 40)
println(p1 + p2) // Point(x=40, y=60)
```

## 8. Scope Functions

Kotlin provides several functions to execute a block of code within the context of an object: `let`, `run`, `with`, `apply`, and `also`.

```kotlin
data class Person(var name: String, var age: Int)

Person("Alice", 20).apply {
    age = 21
    name = name.toUpperCase()
}.let {
    println(it) // Person(name=ALICE, age=21)
}
```

## 9. Reified Type Parameters

Reified type parameters allow you to use the actual type passed as a type parameter inside a function at runtime.

```kotlin
inline fun <reified T> printType() {
    println(T::class.java)
}

printType<String>() // class java.lang.String
printType<Int>()    // class java.lang.Integer
```

These advanced topics showcase some of Kotlin's more powerful features. Each of these concepts opens up new possibilities in how you can structure and write your code, making it more expressive, safe, and efficient.
