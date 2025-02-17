# Binary Search

## Problem Statement
Given an array of integers `nums` which is sorted in ascending order, and an integer `target`, write a function to search `target` in `nums`. If target exists, return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

## Examples

### Example 1:
```
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
```

### Example 2:
```
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
```

## Constraints
- 1 <= nums.length <= 10^4
- -10^4 < nums[i], target < 10^4
- All the integers in nums are unique
- nums is sorted in ascending order

## Intuition
Binary Search is an efficient algorithm for searching a sorted array by repeatedly dividing the search space in half. Here's how it works:

1. Initialize:
   - Set two pointers: `low` at the start and `high` at the end of array
   - Calculate middle index: `mid = (low + high) / 2`

2. Compare:
   - If element at `mid` equals target → return `mid`
   - If target > element at `mid` → search right half (`low = mid + 1`)
   - If target < element at `mid` → search left half (`high = mid - 1`)

3. Repeat:
   - Continue this process until either:
     - Target is found (return index)
     - Search space is exhausted (`low > high`, return -1)

## Time & Space Complexity
- Time Complexity: O(log n)
  - The search space is halved in each step
- Space Complexity: 
  - Iterative: O(1)
  - Recursive: O(log n) due to recursion stack

## Why Binary Search Works Here?
- The array is sorted, which is a prerequisite for binary search
- By comparing the middle element, we can eliminate half of the remaining elements
- This leads to a logarithmic time complexity, much better than linear search O(n)
