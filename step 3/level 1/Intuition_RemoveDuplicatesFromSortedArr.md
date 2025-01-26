# Remove Duplicates from Sorted Array

## Problem Statement
Given an integer array `nums` sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Return the number of unique elements in `nums`.

## Examples

### Example 1:
```
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
```

### Example 2:
```
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
```

## Constraints
- 1 <= nums.length <= 3 * 10⁴
- -100 <= nums[i] <= 100
- nums is sorted in non-decreasing order

## Intuition and Approach

### The Two-Pointer Technique
The solution uses a two-pointer approach to solve this problem efficiently:

1. Since the array is sorted, duplicates will always be adjacent to each other.
2. We use two pointers:
   - `i`: iterates through the array to find unique elements
   - `j`: keeps track of where to place the next unique element

### Step-by-Step Process
1. Initialize `j = 1` (as the first element is always unique)
2. Iterate through the array starting from index 1
3. Compare current element with previous element:
   - If different: We found a new unique element
     - Copy it to position j
     - Increment j
   - If same: Skip (as it's a duplicate)
4. The final value of j represents the number of unique elements

### Time and Space Complexity
- Time Complexity: O(n) - single pass through the array
- Space Complexity: O(1) - in-place modification with constant extra space

### Why it Works
- The sorted nature of the array ensures all duplicates are adjacent
- By moving unique elements to the front, we maintain the relative order
- The two-pointer approach allows us to track both the reading and writing positions efficiently
