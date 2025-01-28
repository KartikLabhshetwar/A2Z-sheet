# Missing Number

## Problem Statement
Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number in the range that is missing from the array.

## Examples

### Example 1:
```
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
2 is the missing number in the range since it does not appear in nums.
```

### Example 2:
```
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 
2 is the missing number in the range since it does not appear in nums.
```

### Example 3:
```
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 
8 is the missing number in the range since it does not appear in nums.
```

## Constraints
- n == nums.length
- 1 <= n <= 10^4
- 0 <= nums[i] <= n
- All the numbers of nums are unique

## Intuition
The solution uses the mathematical approach of finding the missing number:

1. For a sequence of numbers from 0 to n, we can find the expected sum using the formula: n * (n+1) / 2
   - This formula gives us the sum of first n natural numbers

2. The actual sum of the array will be missing one number from this sequence
   - We calculate this by simply adding all numbers in the array

3. The difference between the expected sum and actual sum will give us the missing number
   - missing number = expected sum - actual sum

## Time and Space Complexity
- Time Complexity: O(n) - We only need one pass through the array to calculate the actual sum
- Space Complexity: O(1) - We only use a few variables regardless of input size

## Example Walkthrough
For array [3,0,1]:
1. n = 3 (length of array)
2. Expected sum = 3 * (3+1) / 2 = 6
3. Actual sum = 3 + 0 + 1 = 4
4. Missing number = 6 - 4 = 2
