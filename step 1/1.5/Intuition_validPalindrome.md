# Valid Palindrome

## Problem Statement
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Examples:
1. Input: s = "A man, a plan, a canal: Panama"
   Output: true
   Explanation: "amanaplanacanalpanama" is a palindrome.

2. Input: s = "race a car"
   Output: false
   Explanation: "raceacar" is not a palindrome.

3. Input: s = " "
   Output: true
   Explanation: Empty string is a palindrome.

Constraints:
- 1 <= s.length <= 2 * 105
- s consists only of printable ASCII characters

## Detailed Intuition

Let's break down how we can solve this problem step by step:

1. Understanding Palindrome:
   - A palindrome is like a mirror image of itself
   - For example: "radar" reads the same forward and backward
   - Even after removing spaces and special characters, it should maintain this property

2. How Our Solution Works:
   - We use two pointers approach but in a recursive way
   - Start checking from both ends of the string
   - Move towards the center with each recursive call

3. Step-by-Step Process:
   a) Base Case:
      - When we reach the middle of the string (i >= length/2)
      - At this point, if we haven't found any mismatches, it's a palindrome
   
   b) For Each Position:
      - Compare character at position 'i' from start
      - Compare with character at position 'length-i-1' from end
      - If they match, move to next position (i+1)
      - If they don't match, return false

4. Example Walkthrough:
   For string "radar":
   - First call: compare 'r' with 'r' (first and last) → match
   - Second call: compare 'a' with 'a' (second and fourth) → match
   - Third call: reach 'd' (middle) → base case, return true

## Time & Space Complexity
- Time: O(n/2) which simplifies to O(n)
  - We only need to check half the string
  - Each character comparison takes O(1) time

- Space: O(n/2) 
  - Due to recursive call stack
  - Maximum depth will be half the string length

## Why Recursive Approach?
1. Clean Code: Makes the solution more readable and elegant
2. Natural Flow: Follows the natural way of checking palindrome
3. Easy to Understand: Each recursive call handles one pair of characters

The solution is efficient for most practical purposes, though it could be optimized for space by using an iterative approach if needed.
