# Number of Occurrences in Sorted Array

## Problem Statement

Given a sorted array 'arr' of size 'n' and an integer 'x', find the total number of occurrences of 'x' in the array.

### Examples:

**Input:**
```
n = 7, x = 3
arr = [1, 1, 1, 2, 2, 3, 3]
```
**Output:** 2

## Intuition

Since we have a sorted array, we can optimize our search using binary search instead of linear search. The key intuition is:

1. First occurrence and last occurrence of 'x' will give us the total count
2. Use binary search twice:
   - Once to find the first occurrence
   - Once to find the last occurrence
3. Number of occurrences = (last occurrence - first occurrence + 1)

## Detailed Approach

1. **Find First Occurrence:**
   - Use binary search but with a modification
   - When we find 'x', check if it's the first occurrence by verifying if previous element is different
   - If not first occurrence, continue search in left half

2. **Find Last Occurrence:**
   - Similar to first occurrence
   - When we find 'x', check if it's the last occurrence by verifying if next element is different
   - If not last occurrence, continue search in right half

3. **Calculate Count:**
   - If element not found, return 0
   - Otherwise, return (last - first + 1)

## Time Complexity: O(log n)
- Two binary searches: O(log n) + O(log n) = O(log n)

## Space Complexity: O(1)
- Only using constant extra space

## Sample Test Cases

**Test Case 1:**
```
Input: n = 7, x = 3
arr = [1, 1, 1, 2, 2, 3, 3]
Output: 2
```

**Test Case 2:**
```
Input: n = 5, x = 6
arr = [1, 2, 4, 4, 5]
Output: 0
```

## Constraints

- 1 ≤ n ≤ 10^4
- 1 ≤ arr[i] ≤ 10^9
- 1 ≤ x ≤ 10^9
