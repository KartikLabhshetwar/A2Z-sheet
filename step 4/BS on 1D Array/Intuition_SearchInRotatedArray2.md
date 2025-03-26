# Search in Rotated Sorted Array II

## Problem Statement
Given an integer array `nums` sorted in non-decreasing order (not necessarily with distinct values) that has been rotated at an unknown pivot index, and a `target` value, determine if the target exists in the array.

The array may contain duplicates.

## Examples

### Example 1:
```
Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
```

### Example 2:
```
Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
```

## Constraints
- 1 <= nums.length <= 5000
- -104 <= nums[i] <= 104
- nums is guaranteed to be rotated at some pivot
- -104 <= target <= 104

## Intuition
The problem is an extension of "Search in Rotated Sorted Array", but with the added complexity of duplicate elements. Here's how we approach it:

1. **Basic Idea**: Use binary search, but handle duplicates carefully.

2. **Key Observations**:
   - When duplicates exist, we can't always determine which half is sorted
   - Example: [1,1,1,1,2,1] - difficult to determine if mid belongs to left or right sorted portion

3. **Solution Approach**:
   - If mid element equals target, return true
   - Check if left portion is sorted (nums[mid] > nums[low])
     - If target lies in left sorted portion, search there
     - Otherwise, search right portion
   - Check if right portion is sorted (nums[mid] < nums[high])
     - If target lies in right sorted portion, search there
     - Otherwise, search left portion
   - If none of above conditions met (due to duplicates)
     - Reduce search space by one (high--)

4. **Time Complexity**: 
   - Best Case: O(log n) when no or few duplicates
   - Worst Case: O(n) when array contains many duplicates
   - Example worst case: [1,1,1,1,1,1,1] and target = 2

5. **Space Complexity**: O(1)

## Why O(n) in worst case?
Unlike the original problem without duplicates, we might need to linearly search in cases with many duplicates. When we can't determine which half is sorted due to duplicates, we can only reduce the search space by one element at a time.
