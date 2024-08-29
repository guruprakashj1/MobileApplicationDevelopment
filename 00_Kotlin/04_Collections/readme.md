# Kotlin Collections

Kotlin provides a rich set of collection types, including both mutable and immutable versions of lists, sets, and maps.

## 1. Lists

Lists are ordered collections of items.

```kotlin
// Immutable list
val numbers = listOf(1, 2, 3, 4, 5)
println(numbers[0]) // Output: 1

// Mutable list
val mutableNumbers = mutableListOf(1, 2, 3)
mutableNumbers.add(4)
println(mutableNumbers) // Output: [1, 2, 3, 4]
```

## 2. Sets

Sets are collections that contain no duplicate elements.

```kotlin
// Immutable set
val uniqueNumbers = setOf(1, 2, 3, 3, 4)
println(uniqueNumbers) // Output: [1, 2, 3, 4]

// Mutable set
val mutableSet = mutableSetOf(1, 2, 3)
mutableSet.add(4)
println(mutableSet) // Output: [1, 2, 3, 4]
```

## 3. Maps

Maps store key-value pairs.

```kotlin
// Immutable map
val ages = mapOf("Alice" to 20, "Bob" to 22)
println(ages["Alice"]) // Output: 20

// Mutable map
val mutableAges = mutableMapOf("Alice" to 20, "Bob" to 22)
mutableAges["Charlie"] = 25
println(mutableAges) // Output: {Alice=20, Bob=22, Charlie=25}
```

## 4. Collection Operations

Kotlin provides many useful operations for working with collections:

### Filtering
```kotlin
val numbers = listOf(1, 2, 3, 4, 5)
val evenNumbers = numbers.filter { it % 2 == 0 }
println(evenNumbers) // Output: [2, 4]
```

### Mapping
```kotlin
val doubled = numbers.map { it * 2 }
println(doubled) // Output: [2, 4, 6, 8, 10]
```

### Sorting
```kotlin
val sorted = numbers.sorted()
println(sorted) // Output: [1, 2, 3, 4, 5]
```

### Grouping
```kotlin
val grouped = numbers.groupBy { if (it % 2 == 0) "even" else "odd" }
println(grouped) // Output: {odd=[1, 3, 5], even=[2, 4]}
```

### Folding
```kotlin
val sum = numbers.fold(0) { acc, num -> acc + num }
println(sum) // Output: 15
```

These are just a few examples of the many operations available for Kotlin collections. The standard library provides a rich set of functions for working with collections efficiently and expressively.
