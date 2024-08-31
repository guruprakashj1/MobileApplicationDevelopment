fun <T : Comparable<T>> bubbleSort(arr: Array<T>) {
    val n = arr.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                // Swap elements
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}

fun main() {
    val numbers = arrayOf(64, 34, 25, 12, 22, 11, 90)
    println("Original array: ${numbers.contentToString()}")
    bubbleSort(numbers)
    println("Sorted array: ${numbers.contentToString()}")
}
