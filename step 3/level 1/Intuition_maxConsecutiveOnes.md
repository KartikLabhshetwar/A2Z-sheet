# Maximum Consecutive Ones

## Problem Statement
Given a binary array `nums`, find the maximum number of consecutive 1's in the array.

## Examples
### Example 1:
```
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. 
The maximum number of consecutive 1s is 3.
```

### Example 2:
```
Input: nums = [1,0,1,1,0,1]
Output: 2
```

## Constraints
- 1 <= nums.length <= 10^5
- nums[i] is either 0 or 1

## Intuition
The problem requires finding the longest streak of 1's in the array. We can solve this by:
1. Keeping track of the current count of consecutive 1's
2. Updating a maximum count whenever we find a longer streak
3. Resetting the count when we encounter 0

## Approach
1. Initialize two variables:
   - `count`: to keep track of current consecutive 1's
   - `count2`: to store the maximum consecutive 1's seen so far

2. Iterate through the array:
   - If current element is 1:
     - Increment `count`
     - Update `count2` with maximum of `count` and `count2`
   - If current element is 0:
     - Reset `count` to 0

3. Return `count2` which holds the maximum consecutive ones

## Time and Space Complexity
- Time Complexity: O(n), where n is the length of the array
- Space Complexity: O(1), as we only use two variables

## Code Implementation
Check the accompanying Java file for the complete implementation.
