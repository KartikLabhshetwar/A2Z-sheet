# Insertion Sort Algorithm

## Problem Statement
Given an array of N integers, implement the Insertion sorting algorithm.

## Examples
### Example 1:
- Input: N = 6, array[] = {13,46,24,52,20,9}
- Output: 9,13,20,24,46,52
- Explanation: Array is sorted in ascending order

### Example 2:
- Input: N = 5, array[] = {5,4,3,2,1}
- Output: 1,2,3,4,5
- Explanation: Array is sorted in ascending order

## Intuition
Insertion sort works similar to how we sort playing cards in our hands:
1. We start from the left and move right
2. For each element, we compare it with previous elements
3. We keep shifting elements right until we find the correct position
4. Insert the current element in its correct position

## Approach
1. Start iterating from index 0 to n-1
2. For each element at position i:
   - Compare it with previous elements
   - If previous element is greater, swap them
   - Continue this process until correct position is found
   - This creates a sorted subarray from 0 to i

## Complexity Analysis
- Time Complexity: O(N²) in worst and average cases
  - Best Case: O(N) when array is already sorted
- Space Complexity: O(1) as it's an in-place sorting algorithm

## When to use Insertion Sort?
- Small sized arrays (N < 50)
- Nearly sorted arrays
- When memory space is limited
- When stable sorting is required
