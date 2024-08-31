# Interpolation Search

Interpolation Search is an improved variant of binary search for uniformly distributed sorted arrays. It works by calculating where a target value might be, based on the distribution of values in the array.

## Concept
- Works on sorted arrays.
- Estimates the position of the target value using the formula:
  pos = low + ((target - arr[low]) * (high - low) / (arr[high] - arr[low]))
- This formula assumes a uniform distribution of elements.
- If the target is not at the estimated position, the search continues in the appropriate sub-array.

## Time Complexity
- Best Case: O(1) - when the target is at the estimated position
- Worst Case: O(n) - when the distribution is not uniform
- Average Case: O(log log n) for uniformly distributed data

## Use Cases
- When searching in a sorted array with uniformly distributed values
- In systems where searching is a frequent operation and the data set is relatively static

## Advantages
- Can be much faster than binary search for uniformly distributed sorted arrays
- Works well with large datasets that are uniformly distributed

## Disadvantages
- Performance degrades when the data is not uniformly distributed
- More complex to implement than binary search
- Can be slower than binary search if the distribution assumption is incorrect
