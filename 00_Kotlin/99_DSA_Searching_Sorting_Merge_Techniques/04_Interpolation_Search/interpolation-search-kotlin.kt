fun interpolationSearch(arr: IntArray, target: Int): Int {
    var low = 0
    var high = arr.size - 1

    while (low <= high && target >= arr[low] && target <= arr[high]) {
        if (low == high) {
            if (arr[low] == target) return low
            return -1
        }

        // Probing the position with keeping uniform distribution in mind
        val pos = low + ((target - arr[low]) * (high - low) / (arr[high] - arr[low]))

        when {
            arr[pos] == target -> return pos
            arr[pos] < target -> low = pos + 1
            else -> high = pos - 1
        }
    }
    return -1
}

fun main() {
    val arr = intArrayOf(10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47)
    val target = 18
    val index = interpolationSearch(arr, target)
    if (index != -1)
        println("Element found at index $index")
    else
        println("Element not found")
}
