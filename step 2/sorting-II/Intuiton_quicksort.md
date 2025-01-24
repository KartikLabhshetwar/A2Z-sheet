# Quick Sort Algorithm

## Problem Statement
Given an array of n integers, sort the array using the Quicksort method.

## Approach
1. Choose a pivot element from the array.
2. Partition the array into two sub-arrays: elements less than the pivot and elements greater than the pivot.
3. Recursively apply the above steps to the sub-arrays.

## Complexity Analysis
- Time Complexity: O(n log n) on average, O(n^2) in the worst case.
- Space Complexity: O(log n) due to the recursion stack.

## Examples

### Example 1:
**Input:**
N = 5
arr[] = {4, 1, 7, 9, 3}

**Output:**
1 3 4 7 9

**Explanation:** 
The array is sorted in ascending order.

### Example 2:
**Input:**
N = 8
arr[] = {4, 6, 2, 5, 7, 9, 1, 3}

**Output:**
1 2 3 4 5 6 7 9

**Explanation:**
The array is sorted in ascending order.

## Implementation Details

### Partition Logic
1. Select first element as pivot
2. Initialize two pointers: i (from left) and j (from right)
3. Move i until we find element > pivot
4. Move j until we find element ≤ pivot
5. Swap elements at i and j if i < j
6. Repeat steps 3-5 until i crosses j
7. Finally, place pivot at its correct position

### Recursive Strategy
1. Base case: If array size ≤ 1, return
2. Find partition index using partition function
3. Recursively sort left subarray (elements before partition index)
4. Recursively sort right subarray (elements after partition index)

## Key Points
1. In-place sorting algorithm
2. Not stable sorting algorithm
3. Efficient for random data
4. Poor performance for already sorted arrays
5. Partition strategy is crucial for performance

## Common Optimizations
1. Random pivot selection
2. Three-way partitioning for duplicate elements
3. Using insertion sort for small subarrays
4. Tail-call optimization
