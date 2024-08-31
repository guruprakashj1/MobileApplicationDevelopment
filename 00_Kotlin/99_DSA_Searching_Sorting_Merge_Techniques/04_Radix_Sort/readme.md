# Radix Sort

Radix sort is a non-comparative sorting algorithm that sorts integers by processing each digit. It sorts the elements by first grouping the individual digits of the same place value. Then, sort the elements according to their increasing/decreasing order.

## Concept
1. Find the maximum element to know the number of digits.
2. Do counting sort for every digit. Note that instead of passing digit number, exp is passed. exp is 10^i where i is current digit number.
3. Iterate through all digits from least significant to most significant, applying counting sort on each iteration.

## Time Complexity
- Best Case: O(nk) where n is the number of elements and k is the number of digits in the maximum element
- Worst Case: O(nk)
- Average Case: O(nk)

## Space Complexity
- O(n + k) auxiliary space where k is the range of input (typically 10 for decimal system)

## Use Cases
- When the range of input values is large but the number of digits is small
- Sorting strings or fixed length integer keys
- As a stable sorting algorithm when order preservation is important

## Advantages
- Can be faster than O(n log n) algorithms for integers with a limited number of digits
- Stable sorting algorithm
- Works well with fixed-length integer keys

## Disadvantages
- Not suitable for floating point numbers without special modifications
- Inefficient for large keys with many digits
- Uses extra space proportional to the range of input data
