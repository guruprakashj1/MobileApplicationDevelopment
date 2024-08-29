# Special Features in Kotlin

## 1. Elvis Operator (?:)

The Elvis operator is a concise way to handle null values. It's named after Elvis Presley's hairstyle (imagine the ?: as his hair and eyes).

```kotlin
val name: String? = null
val displayName = name ?: "Anonymous"
println(displayName) // Outputs: Anonymous

// Equivalent to:
val displayName2 = if (name != null) name else "Anonymous"
```

## 2. Safe Call Operator (?.)

The safe call operator allows you to safely call methods or access properties on potentially null objects.

```kotlin
val nullableString: String? = null
println(nullableString?.length) // Outputs: null

val nonNullString: String? = "Hello"
println(nonNullString?.length) // Outputs: 5
```

## 3. Not-null Assertion Operator (!!)

This operator converts any value to a non-null type and throws a NullPointerException if the value is null. Use it with caution!

```kotlin
val nullableString: String? = "Hello"
val length: Int = nullableString!!.length
println(length) // Outputs: 5

// But be careful:
val nullString: String? = null
// val length: Int = nullString!!.length  // This would throw NullPointerException
```

## 4. String Templates

Kotlin allows you to embed expressions directly into strings using the $ symbol.

```kotlin
val name = "Kotlin"
println("Hello, $name!") // Outputs: Hello, Kotlin!

val sum = 1 + 2
println("1 + 2 = ${1 + 2}") // Outputs: 1 + 2 = 3
```

## 5. Data Classes

Data classes automatically generate useful methods like equals(), hashCode(), and toString().

```kotlin
data class Person(val name: String, val age: Int)

val john = Person("John", 30)
println(john) // Outputs: Person(name=John, age=30)
```

## 6. Object Declarations

Kotlin has a language construct called 'object declarations' which combines a class declaration and a single instance of that class.

```kotlin
object DatabaseConfig {
    val url = "jdbc:mysql://localhost/test"
    fun connect() = println("Connected to $url")
}

DatabaseConfig.connect() // Outputs: Connected to jdbc:mysql://localhost/test
```

## 7. Companion Objects

Companion objects allow you to define static-like members for a class.

```kotlin
class MyClass {
    companion object {
        fun create(): MyClass = MyClass()
    }
}

val instance = MyClass.create()
```

## 8. Extension Functions

Kotlin allows you to add new functions to existing classes without modifying their source code.

```kotlin
fun String.addExclamation() = "$this!"

println("Hello".addExclamation()) // Outputs: Hello!
```

## 9. When Expression

The 'when' expression is like a switch statement on steroids. It can be used with or without an argument.

```kotlin
val x = 1
when (x) {
    1 -> println("x is 1")
    2 -> println("x is 2")
    else -> println("x is neither 1 nor 2")
}

// When without argument
when {
    x > 0 -> println("x is positive")
    x < 0 -> println("x is negative")
    else -> println("x is zero")
}
```

These special features make Kotlin a powerful and expressive language, enabling developers to write more concise and safer code.

