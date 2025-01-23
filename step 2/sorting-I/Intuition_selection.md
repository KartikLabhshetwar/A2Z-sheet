# Selection Sort Algorithm

## Problem Statement
Given an array of N integers, implement the Selection Sort algorithm to sort the array in ascending order.

## Examples

### Example 1:
**Input:** N = 6, array[] = {13, 46, 24, 52, 20, 9}  
**Output:** 9, 13, 20, 24, 46, 52  
**Explanation:** The array is sorted in ascending order.

### Example 2:
**Input:** N = 5, array[] = {5, 4, 3, 2, 1}  
**Output:** 1, 2, 3, 4, 5  
**Explanation:** The array is sorted in ascending order.

## Intuition

Selection Sort works on a simple principle: repeatedly finding the minimum element from the unsorted portion of the array and placing it at the beginning.

### How it works:
1. **Divide the array:** The array is conceptually divided into two parts:
   - Sorted portion (initially empty)
   - Unsorted portion (initially the entire array)

2. **Selection process:**
   - In each iteration, find the minimum element from the unsorted portion
   - Swap it with the first element of the unsorted portion
   - The sorted portion grows by one element

3. **Time Complexity Analysis:**
   - Outer loop runs (N-1) times
   - Inner loop runs (N-i-1) times for each i
   - Total comparisons: (N-1) + (N-2) + ... + 1 = N(N-1)/2
   - Therefore, Time Complexity: O(N²)

### Advantages:
- Simple implementation
- Works well with small arrays
- Requires minimal memory space (in-place sorting)

### Disadvantages:
- O(N²) complexity makes it inefficient for large arrays
- Not stable by default
- Always takes quadratic time even if array is nearly sorted

## Real-life Analogy
Think of arranging a deck of cards. You scan through all cards to find the smallest one and put it first, then scan the remaining cards for the second smallest, and so on.
