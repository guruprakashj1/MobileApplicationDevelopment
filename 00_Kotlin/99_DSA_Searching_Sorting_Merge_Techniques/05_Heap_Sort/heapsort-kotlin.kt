fun <T : Comparable<T>> heapsort(arr: Array<T>) {
    val n = arr.size

    // Build max heap
    for (i in n / 2 - 1 downTo 0) {
        heapify(arr, n, i)
    }

    // Extract elements from heap one by one
    for (i in n - 1 downTo 1) {
        // Move current root to end
        arr[0] = arr[i].also { arr[i] = arr[0] }

        // Max heapify on the reduced heap
        heapify(arr, i, 0)
    }
}

fun <T : Comparable<T>> heapify(arr: Array<T>, n: Int, i: Int) {
    var largest = i
    val left = 2 * i + 1
    val right = 2 * i + 2

    if (left < n && arr[left] > arr[largest])
        largest = left

    if (right < n && arr[right] > arr[largest])
        largest = right

    if (largest != i) {
        arr[i] = arr[largest].also { arr[largest] = arr[i] }
        heapify(arr, n, largest)
    }
}

fun main() {
    val arr = arrayOf(64, 34, 25, 12, 22, 11, 90)
    println("Original array: ${arr.contentToString()}")
    heapsort(arr)
    println("Sorted array: ${arr.contentToString()}")
}
