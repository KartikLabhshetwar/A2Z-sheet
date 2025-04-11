# Reverse Words in a String

## Problem Statement
Given an input string s, reverse the order of the words. A word is defined as a sequence of non-space characters, separated by at least one space. Return a string with the words in reverse order concatenated by a single space.

**Note:** The input string may contain:
- Leading/trailing spaces
- Multiple spaces between words
The output should:
- Have words in reverse order
- Have single space between words
- No leading/trailing spaces

## Examples

### Example 1:
```
Input: s = "the sky is blue"
Output: "blue is sky the"
```

### Example 2:
```
Input: s = "  hello world  "
Output: "world hello"
```

### Example 3:
```
Input: s = "a good   example"
Output: "example good a"
```

## Constraints
- 1 <= s.length <= 10^4
- s contains English letters (upper-case and lower-case), digits, and spaces
- At least one word exists in s

## Intuition
The problem can be solved in following steps:

1. **String Preprocessing:**
   - Trim the input string to remove leading/trailing spaces
   - Split the string into words using regex or string split
   - This automatically handles multiple spaces between words

2. **Word Reversal:**
   - Use two-pointer technique to reverse the array of words
   - Initialize two pointers: start (i) and end (j)
   - Swap words at i and j until pointers meet
   - This gives us words in reverse order

3. **Final String Formation:**
   - Join the reversed words with a single space
   - This automatically ensures single space between words

## Time and Space Complexity
- Time Complexity: O(n), where n is the length of string
- Space Complexity: O(n) to store the array of words

## Follow-up
For languages with mutable strings, an in-place solution with O(1) extra space would require:
1. Reverse the entire string
2. Reverse each word individually
3. Handle spaces during the process
