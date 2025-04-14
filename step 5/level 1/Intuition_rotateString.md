# Rotate String

## Problem Statement
Given two strings s and goal, determine if s can become goal after performing some number of shifts. A shift operation moves the leftmost character to the rightmost position.

## Examples

### Example 1:
```
Input: s = "abcde", goal = "cdeab"
Output: true
Explanation: After 2 shifts, "abcde" becomes "cdeab"
```

### Example 2:
```
Input: s = "abcde", goal = "abced"
Output: false
Explanation: It's impossible to convert s to goal through any number of shifts
```

## Constraints
- 1 <= s.length, goal.length <= 100
- s and goal consist of lowercase English letters only

## Intuition and Approach
1. First, we check if both strings have equal length. If not, return false as rotation is impossible.
2. The key insight is that if we concatenate string s with itself (s + s), it will contain all possible rotations of s.
   - For example: if s = "abcde", then s + s = "abcdeabcde"
   - This contains all rotations: "abcde", "bcdea", "cdeab", "deabc", "eabcd"
3. Therefore, if goal is a rotation of s, it must be a substring of s + s.
4. We can use Java's contains() method to check if goal is present in the concatenated string.

## Time Complexity
- Time Complexity: O(n), where n is the length of string s
- Space Complexity: O(n) to store the concatenated string

## Code Approach
```java
if(s.length() != goal.length()) return false;
String concatenated = s + s;
return concatenated.contains(goal);
```
