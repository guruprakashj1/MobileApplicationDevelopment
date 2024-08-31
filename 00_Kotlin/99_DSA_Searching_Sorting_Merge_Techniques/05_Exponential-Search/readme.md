# Exponential Search

Exponential Search is a technique for searching sorted, unbounded/infinite arrays. It works by finding a range where the target value resides and then performing a binary search within that range.

## Concept
- Start with subarray size 1
- Continue doubling the size of subarray until an element greater than the target is found
- Perform binary search in the last subarray (between the previous power of 2 and current power of 2)

## Time Complexity
- Best Case: O(1) - when the target is at the first position
- Worst Case: O(log n)
- Average Case: O(log n)

## Use Cases
- Searching in unbounded/infinite sorted arrays
- When the element being searched for is closer to the beginning of the array
- In situations where accessing elements at later positions is more costly

## Advantages
- More efficient than binary search for bounded arrays, especially when the target is near the beginning
- Works well with infinite arrays
- Performs at most 2*log(position) comparisons where 'position' is the position of the target element

## Disadvantages
- Slightly more complex to implement than binary search
- May perform more comparisons than binary search if the element is near the end of the array
