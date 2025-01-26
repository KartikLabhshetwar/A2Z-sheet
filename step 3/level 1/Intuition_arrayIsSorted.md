# Check if Array Is Sorted and Rotated

## Problem Statement
Given an array `nums`, determine if it was originally a sorted array (in non-decreasing order) that was rotated some number of positions. Return `true` if it was, `false` otherwise.

Note: Array rotation means moving elements to the right by x positions, where elements that move past the end wrap around to the beginning.

## Examples
### Example 1:
```
Input: nums = [3,4,5,1,2]
Output: true
Explanation: Original sorted array: [1,2,3,4,5]
After rotating by 3 positions: [3,4,5,1,2]
```

### Example 2:
```
Input: nums = [2,1,3,4]
Output: false
Explanation: No rotation of a sorted array can produce this sequence
```

### Example 3:
```
Input: nums = [1,2,3]
Output: true
Explanation: Already sorted, rotation of 0 positions
```

## Intuition
To solve this problem, we need to understand two key observations:
1. In a sorted and rotated array, there can be at most one position where the array elements are not in increasing order
2. If we consider the array as circular (by connecting the last element to the first), this property still holds true

### Solution Approach
1. Use a counter to track the number of positions where array elements are not in increasing order
2. Check if first element is less than last element (counts as one irregularity if true)
3. Iterate through array comparing adjacent elements
4. If current element is greater than next element, increment counter
5. If counter exceeds 1, array cannot be sorted and rotated
6. Return true if counter is 0 or 1, false otherwise

### Time & Space Complexity
- Time Complexity: O(n) where n is the length of the array
- Space Complexity: O(1) as we only use a single counter variable

## Constraints
- 1 <= nums.length <= 100
- 1 <= nums[i] <= 100
