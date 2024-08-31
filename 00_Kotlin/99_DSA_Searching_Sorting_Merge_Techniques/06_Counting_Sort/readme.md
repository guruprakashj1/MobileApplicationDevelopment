# Counting Sort

Counting sort is a non-comparison-based sorting algorithm that works well when there is limited range of input values. It works by counting the number of objects having distinct key values, and using arithmetic to determine the positions of each key value in the output sequence.

## Concept
1. Find the range of input values.
2. Count the occurrences of each value in the input range.
3. Calculate the position of each element in the sorted array.
4. Build the output array using the above information.

## Time Complexity
- Best Case: O(n + k) where n is the number of elements and k is the range of input
- Worst Case: O(n + k)
- Average Case: O(n + k)

## Space Complexity
- O(n + k) auxiliary space

## Use Cases
- When the range of potential items in the input is known and reasonably small compared to the number of items
- As a subroutine in radix sort
- When stability (maintaining the relative order of records with equal keys) is important

## Advantages
- Linear time complexity when k = O(n)
- Stable sorting algorithm
- Efficient for datasets with small ranges

## Disadvantages
- Inefficient if the range of elements is very large compared to the number of elements
- Not an in-place sorting algorithm (requires additional space)
- Only works for non-negative discrete values (can be modified for negative values)
