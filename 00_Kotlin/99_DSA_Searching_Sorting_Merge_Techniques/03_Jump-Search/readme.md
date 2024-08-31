# Jump Search

Jump Search is an algorithm for searching a sorted array by skipping a fixed number of elements and then performing a linear search.

## Concept
- Works on sorted arrays.
- The basic idea is to check fewer elements than linear search by jumping ahead by fixed steps.
- The optimal jump size is √n, where n is the length of the array.
- Jump until an element greater than the target is found.
- Perform a linear search in the previous block.

## Time Complexity
- Best Case: O(1) - when the target is at the first position
- Worst Case: O(√n)
- Average Case: O(√n)

## Use Cases
- When the array is sorted and relatively small
- As a middle ground between linear search and binary search

## Advantages
- Better than linear search for sorted arrays
- Doesn't require "random access" like binary search, making it suitable for searching on data structures like linked lists

## Disadvantages
- Not as efficient as binary search for large datasets
- Requires the array to be sorted
