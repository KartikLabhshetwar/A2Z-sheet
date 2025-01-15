# Palindrome Number

## Problem Statement
Given an integer x, return true if x is a palindrome, and false otherwise.

### Examples
1. **Example 1:**
   - Input: x = 121
   - Output: true
   - Explanation: 121 reads as 121 from left to right and from right to left.

2. **Example 2:**
   - Input: x = -121
   - Output: false
   - Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

3. **Example 3:**
   - Input: x = 10
   - Output: false
   - Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

### Constraints
- -2^31 <= x <= 2^31 - 1

### Intuition
To solve this problem without converting the integer to a string, we can follow these steps:

1. **Initial Checks:**
   - If number is negative, return false (negative numbers can't be palindromes)
   - If number is 0, return true

2. **Reverse Number Approach:**
   - Keep the original number intact
   - Create a reversed version of the number
   - Compare original with reversed number
   
3. **Algorithm Steps:**
   - Initialize reversed number (rev = 0)
   - While number > 0:
     - Get last digit (n % 10)
     - Build reversed number (rev = rev * 10 + lastDigit)
     - Remove last digit from original (n = n / 10)
   - Compare original with reversed number

4. **Why This Works:**
   - For a palindrome, the reversed number will be equal to original
   - No need to handle overflow as if overflow occurs, reversed number won't equal original
   - Time Complexity: O(log₁₀n) - number of digits in the input
   - Space Complexity: O(1) - using only constant extra space