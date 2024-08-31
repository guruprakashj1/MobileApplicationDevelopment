# Linear Search

Linear search is the simplest search algorithm. It sequentially checks each element in the list until a match is found or the whole list has been searched.

## Concept
- Start from the leftmost element of the array and compare each element with the target value.
- If the element matches the target value, return its index.
- If the end of the array is reached without finding a match, return -1.

## Time Complexity
- Best Case: O(1) - when the target is the first element
- Worst Case: O(n) - when the target is the last element or not in the array
- Average Case: O(n)

## Use Cases
- Simple and effective for small or unsorted lists
- When the list is searched only once or very rarely

## Advantages
- Easy to understand and implement
- Works on unsorted arrays

## Disadvantages
- Inefficient for large datasets
- Not suitable for frequently searched lists
