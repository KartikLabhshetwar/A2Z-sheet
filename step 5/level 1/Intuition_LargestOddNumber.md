# Largest Odd Number in String

## Problem Statement
You are given a string `num`, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of `num`, or an empty string `""` if no odd integer exists.

Note: A substring is a contiguous sequence of characters within a string.

## Examples

### Example 1:
- Input: num = "52"
- Output: "5"
- Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.

### Example 2:
- Input: num = "4206"
- Output: ""
- Explanation: There are no odd numbers in "4206".

### Example 3:
- Input: num = "35427"
- Output: "35427"
- Explanation: "35427" is already an odd number.

## Intuition
The key insight to solve this problem efficiently lies in understanding that:

1. A number is odd if and only if its last digit is odd
2. To get the largest possible odd number:
   - We need to include as many digits as possible from the left
   - We just need to find the rightmost odd digit

### Solution Approach
1. Start from the rightmost digit of the string
2. Check if the current digit is odd
   - If it's odd, we can include all digits from start to current position
   - If it's even, we move to the next digit to the left
3. If no odd digit is found, return empty string

### Time and Space Complexity
- Time Complexity: O(n), where n is the length of the input string
- Space Complexity: O(1), as we're only using constant extra space

### Example Walkthrough
For input "4206":
1. Check 6 (last digit) -> even, continue
2. Check 0 -> even, continue
3. Check 2 -> even, continue
4. Check 4 -> even, continue
5. No odd digits found, return ""

For input "52":
1. Check 2 (last digit) -> even, continue
2. Check 5 -> odd, return "5"
