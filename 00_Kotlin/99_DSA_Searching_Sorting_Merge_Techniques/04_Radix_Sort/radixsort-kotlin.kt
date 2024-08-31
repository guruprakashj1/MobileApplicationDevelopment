fun radixSort(arr: IntArray) {
    val max = arr.maxOrNull() ?: return
    var exp = 1
    while (max / exp > 0) {
        countingSort(arr, exp)
        exp *= 10
    }
}

fun countingSort(arr: IntArray, exp: Int) {
    val output = IntArray(arr.size)
    val count = IntArray(10) { 0 }

    // Store count of occurrences in count[]
    for (i in arr.indices) {
        count[(arr[i] / exp) % 10]++
    }

    // Change count[i] so that count[i] now contains
    // actual position of this digit in output[]
    for (i in 1 until 10) {
        count[i] += count[i - 1]
    }

    // Build the output array
    for (i in arr.size - 1 downTo 0) {
        output[count[(arr[i] / exp) % 10] - 1] = arr[i]
        count[(arr[i] / exp) % 10]--
    }

    // Copy the output array to arr[], so that arr[] now
    // contains sorted numbers according to current digit
    for (i in arr.indices) {
        arr[i] = output[i]
    }
}

fun main() {
    val arr = intArrayOf(170, 45, 75, 90, 802, 24, 2, 66)
    println("Original array: ${arr.contentToString()}")
    radixSort(arr)
    println("Sorted array: ${arr.contentToString()}")
}
