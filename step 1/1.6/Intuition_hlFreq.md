# Finding Highest and Lowest Frequency Elements

## Problem Statement

Given an array of size N, find the elements with the highest and lowest frequencies.

## Examples

```
Input: array[] = {10,5,10,15,10,5}
Output: 10 15
Explanation: 10 appears 3 times (highest), 15 appears 1 time (lowest)

Input: array[] = {2,2,3,4,4,2}
Output: 2 3
Explanation: 2 appears 3 times (highest), 3 appears 1 time (lowest)
```

## Intuition

The problem can be solved efficiently using a frequency map (HashMap). Here's how:

1. **Frequency Counting**:
   - Use a HashMap to store element-frequency pairs
   - Key: array element
   - Value: frequency of occurrence

2. **Finding Extremes**:
   - Iterate through the frequency map once
   - Track both maximum and minimum frequencies
   - Update corresponding elements when new extremes are found

## Time and Space Complexity

- Time Complexity: O(N), where N is array length
- Space Complexity: O(M), where M is number of unique elements

## Edge Cases to Consider

- Empty array
- Array with all same elements
- Multiple elements with same highest/lowest frequency
