# Rearrange Array Elements by Sign

## Problem Statement
Given a 0-indexed integer array `nums` of even length consisting of an equal number of positive and negative integers, rearrange the array such that:
- Every consecutive pair of integers has opposite signs
- For all integers with the same sign, their relative order is preserved
- The array must begin with a positive integer

Return the modified array after rearranging the elements.

## Examples

### Example 1
```
Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation: 
Positive integers: [3,1,2]
Negative integers: [-2,-5,-4]
[3,-2,1,-5,2,-4] satisfies all conditions:
- Alternating signs
- Original order preserved
- Starts with positive
```

### Example 2
```
Input: nums = [-1,1]
Output: [1,-1]
Explanation: Only possible arrangement since array must start with positive.
```

## Constraints
- 2 <= nums.length <= 2 * 10^5
- nums.length is even
- 1 <= |nums[i]| <= 10^5
- nums consists of equal number of positive and negative integers

## Solution Approaches

### 1. Brute Force Approach
- **Intuition**: Separate positive and negative numbers while maintaining their order
- **Algorithm**:
  1. Create two separate lists for positive and negative numbers
  2. Iterate through original array to populate these lists
  3. Merge back alternately starting with positive number
- **Time Complexity**: O(N) 
- **Space Complexity**: O(N)

### 2. Optimized Two Pointer Approach
- **Intuition**: Use the fact that positive numbers need even indices and negative numbers need odd indices
- **Algorithm**:
  1. Create a result array of same size
  2. Use two pointers: pos = 0 (for even indices) and neg = 1 (for odd indices)
  3. Iterate through original array:
     - If number is positive, place at pos and increment pos by 2
     - If number is negative, place at neg and increment neg by 2
  4. Return result array
- **Time Complexity**: O(N)
- **Space Complexity**: O(N)
- **Advantage**: Single pass through array, more efficient than brute force

## Code Implementation
Check the accompanying Java file for implementation details.
