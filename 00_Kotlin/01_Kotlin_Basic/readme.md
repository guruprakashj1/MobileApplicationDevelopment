# Kotlin Basic Tutorial

## 1. Basic Syntax and Variables

Kotlin is a statically-typed language, which means the type of a variable is known at compile time. However, Kotlin can infer types, so you don't always have to specify them explicitly.

```kotlin
// Variable declaration
val immutableVar: String = "I can't be changed"
var mutableVar: Int = 42

// Type inference
val inferredType = "Kotlin will infer this as String"
var inferredNumber = 10 // Inferred as Int

// Basic types
val myInt: Int = 10
val myLong: Long = 100L
val myFloat: Float = 3.14f
val myDouble: Double = 3.14159
val myBoolean: Boolean = true
val myChar: Char = 'A'
```

## 2. Control Flow

### If Expression

In Kotlin, `if` is an expression, which means it returns a value.

```kotlin
val max = if (a > b) a else b
```

### When Expression

`when` is Kotlin's version of a switch statement, but more powerful.

```kotlin
val result = when (x) {
    1 -> "x is 1"
    2 -> "x is 2"
    else -> "x is neither 1 nor 2"
}
```

### Loops

Kotlin supports `for` and `while` loops.

```kotlin
// For loop
for (i in 1..5) {
    println(i)
}

// While loop
var x = 0
while (x < 5) {
    println(x)
    x++
}
```

## 3. Functions

Functions in Kotlin are declared using the `fun` keyword.

```kotlin
fun greet(name: String): String {
    return "Hello, $name!"
}

// Function with expression body
fun double(x: Int) = x * 2

// Function with default parameters
fun greetWithDefault(name: String = "World") = "Hello, $name!"

println(greet("Kotlin")) // Output: Hello, Kotlin!
println(double(5)) // Output: 10
println(greetWithDefault()) // Output: Hello, World!
```

## 4. Classes and Objects

Kotlin makes it easy to create classes and objects.

```kotlin
class Person(val name: String, var age: Int) {
    fun introduce() = "Hi, I'm $name and I'm $age years old."
}

val Guru = Person("Guru", 30)
println(Guru.introduce()) // Output: Hi, I'm Guru and I'm 30 years old.

// Object declaration (Singleton)
object DatabaseConfig {
    val url = "jdbc:mysql://localhost/test"
    fun connect() = println("Connected to database")
}

DatabaseConfig.connect() // Output: Connected to database
```

## 5. Null Safety

Kotlin's type system is aimed to eliminate null pointer exceptions.

```kotlin
var nullableString: String? = "This can be null"
nullableString = null // This is okay

// Safe call operator
println(nullableString?.length) // Prints null if nullableString is null

// Elvis operator
val length = nullableString?.length ?: -1

// Non-null assertion operator (use carefully!)
val definitelyNotNull: String = nullableString!!
```

## 6. Extensions

Kotlin allows you to add new functionality to existing classes without inheriting from them.

```kotlin
fun String.addExclamation() = this + "!"

println("Hello".addExclamation()) // Output: Hello!
```

This tutorial covers some of the basic concepts of Kotlin. Each concept is explained with a practical example to help you understand how it works in practice. As you continue learning, you'll discover more advanced features that make Kotlin a powerful and expressive language.
