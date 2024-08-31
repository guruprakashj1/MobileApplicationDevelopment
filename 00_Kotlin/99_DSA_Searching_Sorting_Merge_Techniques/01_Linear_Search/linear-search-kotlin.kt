fun <T : Comparable<T>> linearSearch(arr: Array<T>, target: T): Int {
    for (i in arr.indices) {
        if (arr[i] == target) {
            return i
        }
    }
    return -1
}

fun main() {
    val numbers = arrayOf(4, 2, 7, 1, 9, 5)
    val target = 7
    val result = linearSearch(numbers, target)
    println(if (result != -1) "Element found at index $result" else "Element not found")
}
