# Binary Search

Binary search is an efficient algorithm for searching a sorted array by repeatedly dividing the search interval in half.

## Concept
- The array must be sorted before applying binary search.
- Compare the target value to the middle element of the array.
- If they are equal, the search is successful.
- If the target is less than the middle element, repeat the search on the left half.
- If the target is greater than the middle element, repeat the search on the right half.
- Continue this process until the target is found or it's clear the target is not in the array.

## Time Complexity
- Best Case: O(1) - when the target is the middle element
- Worst Case: O(log n)
- Average Case: O(log n)

## Use Cases
- Efficient for large sorted datasets
- When the data is frequently searched

## Advantages
- Very efficient, especially for large datasets
- Logarithmic time complexity makes it much faster than linear search for large arrays

## Disadvantages
- Requires the array to be sorted
- Not suitable for datasets that are frequently updated, as maintaining the sorted order can be costly
