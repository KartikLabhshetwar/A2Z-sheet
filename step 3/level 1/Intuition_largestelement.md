# Largest Element in Array

## Problem Statement
Given an array 'arr' of size 'n', find the largest element in the array.

## Difficulty: Easy
- Time to solve: 10 minutes
- Success Rate: High

## Constraints
- 1 <= n <= 10^5
- 1 <= arr[i] <= 10^9
- Time Limit: 1 sec

## Examples

### Example 1:
```
Input: n = 6, arr = [4, 7, 8, 6, 7, 6]
Output: 8
Explanation: From the array {4, 7, 8, 6, 7, 6}, 8 is the largest element.
```

### Example 2:
```
Input: n = 8, arr = [5, 9, 3, 4, 8, 4, 3, 10]
Output: 10
Explanation: From the array {5, 9, 3, 4, 8, 4, 3, 10}, 10 is the largest element.
```

## Intuition
The problem requires finding the maximum element in an array. The intuitive approach is to:
1. Assume the first element as the maximum
2. Iterate through the array
3. Update maximum if we find a larger element

## Approach
1. Initialize a variable 'max' with the first element of array (prevents issues with negative numbers)
2. Traverse the array from index 1 to n-1
3. For each element, compare it with max
4. If current element is greater than max, update max
5. After complete traversal, max will contain the largest element

## Time Complexity
- O(n), where n is the size of input array
- We do a single traversal of the array

## Space Complexity
- O(1), as we only use a single variable regardless of input size
