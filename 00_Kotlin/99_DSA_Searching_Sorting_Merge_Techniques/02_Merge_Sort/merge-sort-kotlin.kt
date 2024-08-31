fun <T : Comparable<T>> mergeSort(arr: Array<T>) {
    if (arr.size <= 1) return

    val mid = arr.size / 2
    val left = arr.sliceArray(0 until mid)
    val right = arr.sliceArray(mid until arr.size)

    mergeSort(left)
    mergeSort(right)

    merge(arr, left, right)
}

fun <T : Comparable<T>> merge(arr: Array<T>, left: Array<T>, right: Array<T>) {
    var i = 0
    var j = 0
    var k = 0

    while (i < left.size && j < right.size) {
        if (left[i] <= right[j]) {
            arr[k] = left[i]
            i++
        } else {
            arr[k] = right[j]
            j++
        }
        k++
    }

    while (i < left.size) {
        arr[k] = left[i]
        i++
        k++
    }

    while (j < right.size) {
        arr[k] = right[j]
        j++
        k++
    }
}

fun main() {
    val numbers = arrayOf(64, 34, 25, 12, 22, 11, 90)
    println("Original array: ${numbers.contentToString()}")
    mergeSort(numbers)
    println("Sorted array: ${numbers.contentToString()}")
}
