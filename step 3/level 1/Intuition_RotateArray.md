# Rotate Array

## Problem Description
Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

## Examples

### Example 1:
```
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
```

### Example 2:
```
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
```

## Constraints
- 1 <= nums.length <= 10^5
- -2^31 <= nums[i] <= 2^31 - 1
- 0 <= k <= 10^5

## Intuition
The solution uses a clever approach of array reversal to achieve array rotation in O(1) extra space. Here's how it works:

1. First, we handle the case where k might be larger than array length by doing k = k % n
2. The algorithm performs three steps:
   - Reverse the entire array
   - Reverse first k elements
   - Reverse remaining (n-k) elements

### Example walkthrough:
Array: [1,2,3,4,5,6,7], k = 3

1. After reversing entire array: 
   [7,6,5,4,3,2,1]
2. Reverse first k elements (0 to k-1):
   [5,6,7,4,3,2,1]
3. Reverse remaining elements (k to n-1):
   [5,6,7,1,2,3,4]

### Time Complexity: O(n)
### Space Complexity: O(1)

## Follow-up
There are several other approaches to solve this problem:
1. Using extra array (O(n) space)
2. One by one rotation (O(n*k) time)
3. Using cyclic replacements
4. The reversal algorithm (current solution)
