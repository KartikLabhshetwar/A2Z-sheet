# Longest Common Prefix

## Problem Statement
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

## Examples

### Example 1:
```
Input: strs = ["flower","flow","flight"]
Output: "fl"
```

### Example 2:
```
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
```

## Constraints
- 1 <= strs.length <= 200
- 0 <= strs[i].length <= 200
- strs[i] consists of only lowercase English letters if it is non-empty.

## Intuition
The solution uses a clever approach by sorting the array of strings first. Here's why this works:

1. When we sort the array lexicographically:
   - All strings with common prefixes will be grouped together
   - The first and last strings in the sorted array will have the least in common

2. Key insights:
   - We only need to compare the first and last strings after sorting
   - Any common prefix between these two strings will be common to all strings
   - We can compare characters one by one until we find a mismatch

3. Algorithm steps:
   - Sort the array of strings
   - Take the first string (s1) and last string (s2)
   - Compare characters from left to right
   - Stop when either:
     - We find a mismatch
     - We reach the end of either string
   - Return the common prefix found

## Time Complexity
- O(NlogN) for sorting the array
- O(M) for comparing characters, where M is the length of the shortest string
- Overall: O(NlogN + M)

## Space Complexity
- O(1) as we only use a few variables regardless of input size
