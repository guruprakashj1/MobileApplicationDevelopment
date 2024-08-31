fun <T : Comparable<T>> exponentialSearch(arr: Array<T>, target: T): Int {
    if (arr[0] == target) return 0

    var i = 1
    while (i < arr.size && arr[i] <= target) {
        i *= 2
    }

    return binarySearch(arr, target, i / 2, minOf(i, arr.size - 1))
}

fun <T : Comparable<T>> binarySearch(arr: Array<T>, target: T, left: Int, right: Int): Int {
    var l = left
    var r = right

    while (l <= r) {
        val mid = l + (r - l) / 2
        when {
            arr[mid] == target -> return mid
            arr[mid] < target -> l = mid + 1
            else -> r = mid - 1
        }
    }
    return -1
}

fun main() {
    val arr = arrayOf(2, 3, 4, 10, 40)
    val target = 10
    val result = exponentialSearch(arr, target)
    if (result != -1)
        println("Element found at index $result")
    else
        println("Element not found")
}
