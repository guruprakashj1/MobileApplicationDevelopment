fun countingSort(arr: IntArray) {
    if (arr.isEmpty()) return

    val max = arr.maxOrNull()!!
    val min = arr.minOrNull()!!
    val range = max - min + 1

    val count = IntArray(range)
    val output = IntArray(arr.size)

    // Store count of each element
    for (i in arr.indices) {
        count[arr[i] - min]++
    }

    // Change count[i] so that count[i] now contains actual
    // position of this element in output array
    for (i in 1 until count.size) {
        count[i] += count[i - 1]
    }

    // Build the output array
    for (i in arr.size - 1 downTo 0) {
        output[count[arr[i] - min] - 1] = arr[i]
        count[arr[i] - min]--
    }

    // Copy the output array to arr, so that arr now
    // contains sorted elements
    for (i in arr.indices) {
        arr[i] = output[i]
    }
}

fun main() {
    val arr = intArrayOf(64, 34, 25, 12, 22, 11, 90)
    println("Original array: ${arr.contentToString()}")
    countingSort(arr)
    println("Sorted array: ${arr.contentToString()}")
}
