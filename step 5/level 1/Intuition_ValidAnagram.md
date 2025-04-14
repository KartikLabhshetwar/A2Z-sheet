# Valid Anagram

## Problem Statement
Given two strings s and t, determine if t is an anagram of s.

An anagram is a word formed by rearranging the letters of another word, using all the original letters exactly once.

### Examples

**Example 1:**
```
Input: s = "anagram", t = "nagaram"
Output: true
```

**Example 2:**
```
Input: s = "rat", t = "car"
Output: false
```

### Constraints
- 1 <= s.length, t.length <= 5 * 10^4
- s and t consist of lowercase English letters

## Intuition and Approach
The problem can be solved using the following approach:

1. **Length Check**:
   - First, check if both strings have the same length
   - If lengths are different, they cannot be anagrams

2. **Sorting Method**:
   - Convert both strings to character arrays
   - Sort both arrays
   - Compare the sorted arrays
   - If they are identical, the strings are anagrams

3. **Why Sorting Works**:
   - Sorting rearranges all characters in alphabetical order
   - If two strings are anagrams, their sorted versions will be identical
   - Time complexity: O(n log n) due to sorting
   - Space complexity: O(n) for creating character arrays

## Alternative Approaches
You could also solve this using:
1. Character frequency counting using an array or HashMap
2. Using a single integer array of size 26 for lowercase letters

The sorting approach is chosen here for its simplicity and readability, though it's not the most optimal solution.
