fun <T : Comparable<T>> quickSort(arr: Array<T>, low: Int = 0, high: Int = arr.size - 1) {
    if (low < high) {
        val pivotIndex = partition(arr, low, high)
        quickSort(arr, low, pivotIndex - 1)
        quickSort(arr, pivotIndex + 1, high)
    }
}

fun <T : Comparable<T>> partition(arr: Array<T>, low: Int, high: Int): Int {
    val pivot = arr[high]
    var i = low - 1

    for (j in low until high) {
        if (arr[j] <= pivot) {
            i++
            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
        }
    }

    val temp = arr[i + 1]
    arr[i + 1] = arr[high]
    arr[high] = temp

    return i + 1
}

fun main() {
    val numbers = arrayOf(64, 34, 25, 12, 22, 11, 90)
    println("Original array: ${numbers.contentToString()}")
    quickSort(numbers)
    println("Sorted array: ${numbers.contentToString()}")
}
