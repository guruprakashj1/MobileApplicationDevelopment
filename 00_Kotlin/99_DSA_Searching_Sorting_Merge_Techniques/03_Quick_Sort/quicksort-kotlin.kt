fun <T : Comparable<T>> quicksort(arr: Array<T>, low: Int = 0, high: Int = arr.size - 1) {
    if (low < high) {
        val pivotIndex = partition(arr, low, high)
        quicksort(arr, low, pivotIndex - 1)
        quicksort(arr, pivotIndex + 1, high)
    }
}

fun <T : Comparable<T>> partition(arr: Array<T>, low: Int, high: Int): Int {
    val pivot = arr[low]
    var i = low + 1
    var j = high

    while (true) {
        while (i <= j && arr[i] <= pivot) i++
        while (arr[j] > pivot) j--
        if (i <= j)
            arr[i].also { arr[i] = arr[j]; arr[j] = it }
        else
            break
    }

    arr[low].also { arr[low] = arr[j]; arr[j] = it }
    return j
}

fun main() {
    val arr = arrayOf(64, 34, 25, 12, 22, 11, 90)
    println("Original array: ${arr.contentToString()}")
    quicksort(arr)
    println("Sorted array: ${arr.contentToString()}")
}
