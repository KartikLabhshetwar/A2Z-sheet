# Find First and Last Position of Element in Sorted Array

## Problem Statement
Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return `[-1, -1]`.

The algorithm must have O(log n) runtime complexity.

## Examples

### Example 1:
```
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
```

### Example 2:
```
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
```

### Example 3:
```
Input: nums = [], target = 0
Output: [-1,-1]
```

## Constraints
- 0 <= nums.length <= 10⁵
- -10⁹ <= nums[i] <= 10⁹
- nums is a non-decreasing array
- -10⁹ <= target <= 10⁹

## Intuition

The key to solving this problem efficiently is to use Binary Search twice:
1. First to find the leftmost occurrence
2. Then to find the rightmost occurrence

### For Finding First Occurrence:
1. Use binary search but with a modification
2. When we find the target:
   - Store the current index as a potential answer
   - Continue searching in the left half to find any earlier occurrence
3. When current element ≥ target:
   - Look in left half
4. Otherwise:
   - Look in right half

### For Finding Last Occurrence:
1. Similar binary search with modification
2. When we find the target:
   - Store the current index as potential answer
   - Continue searching in the right half to find later occurrence
3. When current element ≤ target:
   - Look in right half
4. Otherwise:
   - Look in left half

### Time Complexity: O(log n)
- We perform two binary searches
- Each binary search takes O(log n)
- Total: O(log n)

### Space Complexity: O(1)
- We only use a constant amount of extra space

## Code Implementation
The solution uses two separate binary searches:
1. `startIdx()` finds the first occurrence
2. `endIdx()` finds the last occurrence

Both functions follow the binary search template but with modified conditions to find the respective positions.
