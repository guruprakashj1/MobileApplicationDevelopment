fun <T : Comparable<T>> binarySearch(arr: Array<T>, target: T): Int {
    var left = 0
    var right = arr.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2
        when {
            arr[mid] == target -> return mid
            arr[mid] < target -> left = mid + 1
            else -> right = mid - 1
        }
    }
    return -1
}

fun main() {
    val numbers = arrayOf(1, 2, 4, 5, 7, 9)
    val target = 7
    val result = binarySearch(numbers, target)
    println(if (result != -1) "Element found at index $result" else "Element not found")
}
