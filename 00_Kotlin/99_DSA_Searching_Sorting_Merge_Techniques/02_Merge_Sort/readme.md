# Merge Sort

Merge Sort is an efficient, stable sorting algorithm that uses a divide-and-conquer strategy to sort elements.

## Concept
- Divide the unsorted list into n sublists, each containing one element (a list of one element is considered sorted).
- Repeatedly merge sublists to produce new sorted sublists until there is only one sublist remaining.

## Time Complexity
- Best Case: O(n log n)
- Worst Case: O(n log n)
- Average Case: O(n log n)

## Use Cases
- When stability is needed (preserving the relative order of equal elements)
- External sorting (when dealing with massive amounts of data)
- Sorting linked lists (as it doesn't require random access to elements)

## Advantages
- Stable sort
- Guaranteed O(n log n) performance
- Works well for external sorting

## Disadvantages
- Requires O(n) extra space
- Generally slower than Quick Sort for arrays (due to the extra memory allocation)
