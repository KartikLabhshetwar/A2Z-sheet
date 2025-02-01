# Maximum Subarray

## Problem Description
Given an integer array `nums`, find the contiguous subarray with the largest sum and return its sum.

### Examples
**Example 1:**
```
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
```

**Example 2:**
```
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
```

**Example 3:**
```
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
```

### Constraints
- 1 <= nums.length <= 10⁵
- -10⁴ <= nums[i] <= 10⁴

## Solution Approach: Kadane's Algorithm

### Intuition
Kadane's algorithm is an efficient way to solve the maximum subarray problem. The core idea is to maintain two variables:
1. `maxEndingHere`: Keeps track of the maximum sum of subarray ending at the current position
2. `maxSoFar`: Keeps track of the overall maximum sum found so far

The algorithm works by:
1. Iterating through the array once
2. At each position, we have two choices:
   - Start a new subarray at the current element
   - Extend the existing subarray by including the current element
3. We make this decision by comparing whether adding the current element improves our current sum

### Algorithm Steps
1. Initialize:
   - `maxSoFar = Integer.MIN_VALUE` (to handle all negative numbers case)
   - `maxEndingHere = 0`

2. For each element in the array:
   - Add the current element to `maxEndingHere`
   - If `maxEndingHere` becomes greater than `maxSoFar`, update `maxSoFar`
   - If `maxEndingHere` becomes negative, reset it to 0 (start a new subarray)

### Time and Space Complexity
- Time Complexity: O(n), where n is the length of the array
- Space Complexity: O(1), as we only use two variables

### Why does this work?
- If `maxEndingHere` becomes negative, there's no point in keeping that subarray because any future subarray would be greater without it
- By resetting `maxEndingHere` to 0, we effectively start considering a new subarray from the next position
- `maxSoFar` ensures we never lose track of the best subarray we've found
