# Isomorphic Strings

## Problem Description
Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t.

For two strings to be isomorphic:
- All occurrences of a character must be replaced with another character while preserving the order
- No two characters may map to the same character
- A character may map to itself

## Examples

### Example 1:
```
Input: s = "egg", t = "add"
Output: true
Explanation: 
- 'e' maps to 'a'
- 'g' maps to 'd'
```

### Example 2:
```
Input: s = "foo", t = "bar"
Output: false
Explanation: Cannot map 'o' to both 'a' and 'r'
```

### Example 3:
```
Input: s = "paper", t = "title"
Output: true
```

## Constraints
- 1 <= s.length <= 5 * 10^4
- t.length == s.length
- s and t consist of any valid ASCII character

## Intuition
The key insight to solve this problem is to ensure a one-to-one mapping between characters of both strings. Here's how we can think about it:

1. **Character Mapping**:
   - Each character in string s must map to exactly one character in string t
   - The mapping must be consistent throughout the strings
   - No two characters in s can map to the same character in t

2. **Solution Approach**:
   - We use two arrays (map1 and map2) to store the last position where we saw each character
   - For each position i:
     - Compare the previous positions of current characters from both strings
     - If they don't match, strings are not isomorphic
     - Update the position for both characters to current position + 1
   
3. **Why this works**:
   - If characters are mapped consistently, their last positions will always match
   - If a character maps to multiple characters, the positions won't match
   - Using (i+1) instead of i helps distinguish between unvisited positions (0) and first position

## Time and Space Complexity
- Time Complexity: O(n), where n is the length of the strings
- Space Complexity: O(1), as we use fixed-size arrays (size 200 for ASCII)
