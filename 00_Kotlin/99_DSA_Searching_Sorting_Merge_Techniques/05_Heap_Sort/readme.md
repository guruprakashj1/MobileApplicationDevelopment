# Heapsort

Heapsort is a comparison-based sorting algorithm that uses a binary heap data structure. It divides its input into a sorted and an unsorted region, and iteratively shrinks the unsorted region by extracting the largest element and moving it to the sorted region.

## Concept
1. Build a max heap from the input data.
2. The largest item is stored at the root of the heap. Replace it with the last item of the heap followed by reducing the size of heap by 1. Finally, heapify the root of the tree.
3. Repeat step 2 while the size of the heap is greater than 1.

## Time Complexity
- Best Case: O(n log n)
- Worst Case: O(n log n)
- Average Case: O(n log n)

## Space Complexity
- O(1) auxiliary space

## Use Cases
- When a stable sort is not needed
- When guaranteed O(n log n) performance is needed
- In embedded systems with memory constraints

## Advantages
- Efficient for large data sets
- In-place sorting algorithm
- Consistent performance regardless of data distribution

## Disadvantages
- Not stable (doesn't preserve the relative order of equal elements)
- Poor cache performance due to its non-localized memory access
