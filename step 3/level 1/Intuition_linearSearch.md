# Linear Search

## Problem Statement
Given an array and an element `num`, find if `num` is present in the given array. If present, return its index; otherwise, return -1.

## Examples

### Example 1:
**Input:** 
- arr[] = [1, 2, 3, 4, 5]
- num = 3

**Output:** 2

**Explanation:** Element 3 is present at index 2.

### Example 2:
**Input:**
- arr[] = [5, 4, 3, 2, 1]
- num = 5

**Output:** 0

**Explanation:** Element 5 is present at index 0.

## Intuition and Approach

Linear Search is the simplest searching algorithm that searches for an element by checking each element in the array sequentially until a match is found or the array is exhausted.

### How it works:
1. Start from the first element (index 0)
2. Compare the current element with the target number
3. If they match, return the current index
4. If they don't match, move to the next element
5. Repeat steps 2-4 until either:
   - The element is found (return its index)
   - The array ends (return -1)

### Time Complexity
- **Worst Case:** O(n) - when element is at the last position or not present
- **Best Case:** O(1) - when element is at the first position
- **Average Case:** O(n)

### Space Complexity
- O(1) - only uses a constant amount of extra space

## Code Implementation
The implementation uses a simple for loop to traverse the array and return the index when the element is found. If the loop completes without finding the element, it returns -1.
