import kotlin.math.floor
import kotlin.math.min
import kotlin.math.sqrt

fun <T : Comparable<T>> jumpSearch(arr: Array<T>, target: T): Int {
    val n = arr.size
    var step = floor(sqrt(n.toDouble())).toInt()
    var prev = 0

    while (arr[min(step, n) - 1] < target) {
        prev = step
        step += floor(sqrt(n.toDouble())).toInt()
        if (prev >= n) return -1
    }

    while (arr[prev] < target) {
        prev++
        if (prev == min(step, n)) return -1
    }

    if (arr[prev] == target) return prev

    return -1
}

fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val target = 7
    val result = jumpSearch(numbers, target)
    println(if (result != -1) "Element found at index $result" else "Element not found")
}
