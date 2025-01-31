# Sort Colors (Dutch National Flag Problem)

## Problem Statement
Given an array `nums` with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

## Examples
### Example 1:
```
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
```

### Example 2:
```
Input: nums = [2,0,1]
Output: [0,1,2]
```

## Constraints
- n == nums.length
- 1 <= n <= 300
- nums[i] is either 0, 1, or 2

## Intuition
This problem is a variation of the Dutch National Flag algorithm. We can solve it in two ways:

### Approach 1: Two-Pass Solution
1. Count the occurrences of 0s, 1s, and 2s
2. Overwrite the array with the correct number of 0s, 1s, and 2s in order

**Time Complexity**: O(2n) = O(n)
**Space Complexity**: O(1)

### Approach 2: One-Pass Solution (Dutch National Flag Algorithm)
1. Use three pointers: low, mid, and high
2. low: tracks position for next 0
3. mid: current element being checked
4. high: tracks position for next 2
5. Traverse array once, swapping elements:
   - if nums[mid] = 0: swap with low pointer
   - if nums[mid] = 2: swap with high pointer
   - if nums[mid] = 1: move to next element

**Time Complexity**: O(n)
**Space Complexity**: O(1)

## Why This Works
The current implementation uses Approach 1, which is easier to understand but makes two passes through the array. The Dutch National Flag algorithm (Approach 2) is more efficient as it only requires one pass, but is slightly more complex to implement.

The counting approach works because:
1. We know exactly how many of each number exists
2. We know their final positions based on these counts
3. We can overwrite the array in sorted order

This guarantees that all 0s come first, followed by all 1s, and finally all 2s.
