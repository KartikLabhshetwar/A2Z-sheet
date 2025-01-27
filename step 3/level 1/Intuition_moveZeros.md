# Move Zeros

## Problem Statement
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note: You must do this in-place without making a copy of the array.

## Examples
### Example 1:
```
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
```

### Example 2:
```
Input: nums = [0]
Output: [0]
```

## Constraints
- 1 <= nums.length <= 10^4
- -2^31 <= nums[i] <= 2^31 - 1

## Intuition
The problem can be solved using a two-pointer approach. Here's how:

1. First, we need to find the first zero in the array (let's call this position j).
2. Then, we use another pointer (i) to scan through the rest of the array.
3. Whenever we find a non-zero element, we swap it with the element at position j.
4. After each swap, we increment j to point to the next zero position.

This approach works because:
- We maintain the relative order of non-zero elements
- We perform swaps in-place, using O(1) extra space
- Each element is moved at most once
- The time complexity is O(n) where n is the length of the array

## Complexity Analysis
- Time Complexity: O(n), where n is the length of the array
- Space Complexity: O(1), as we only use two pointers

## Implementation Details
The solution uses two key steps:
1. Finding the first zero (j pointer)
2. Swapping non-zero elements with zeros (i pointer)

If no zeros are found, the array is already in its final state.
