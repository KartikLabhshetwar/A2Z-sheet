# Search in Rotated Sorted Array

## Problem Statement
Given a sorted array `nums` that has been rotated at some unknown pivot point, and a target value, return the index of the target value if it exists in the array. If not, return -1.

The array may be rotated at a pivot point k where 1 <= k < nums.length.

## Examples
```
Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

Example 3:
Input: nums = [1], target = 0
Output: -1
```

## Constraints
- 1 <= nums.length <= 5000
- -104 <= nums[i] <= 104
- All values of nums are unique
- nums is an ascending array that is possibly rotated
- -104 <= target <= 104

## Intuition
The key insight to solve this problem efficiently is:
1. In a rotated sorted array, when we take any mid point, at least one half of the array is always sorted.
2. Using binary search, we can:
   - Find which half is sorted by comparing mid with start element
   - Check if target lies in the sorted half
   - If yes, search in that half
   - If no, search in the other half

### How it works:
1. If nums[mid] >= nums[low]:
   - Left half is sorted
   - Check if target lies between nums[low] and nums[mid]
   - If yes, search in left half
   - If no, search in right half

2. If nums[mid] < nums[low]:
   - Right half is sorted
   - Check if target lies between nums[mid] and nums[high]
   - If yes, search in right half
   - If no, search in left half

## Time and Space Complexity
- Time Complexity: O(log n) - Binary Search
- Space Complexity: O(1) - Only constant extra space is used

## Code Approach
1. Initialize low = 0 and high = nums.length - 1
2. While low <= high:
   - Calculate mid
   - If nums[mid] is target, return mid
   - Determine which half is sorted
   - Check if target lies in sorted half
   - Adjust low or high accordingly
3. If target not found, return -1
