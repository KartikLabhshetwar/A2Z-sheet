# Check Armstrong Number

## Problem Statement
Given an integer N, determine if it is an Armstrong number. 

An Armstrong number is a number (with k digits) such that the sum of its digits raised to kth power equals the number itself.

For example: if N = 371, since it has 3 digits, we check if 3³ + 7³ + 1³ = 371

## Examples

### Example 1
- Input: `n = 1`
- Output: `true`
- Explanation: 1¹ = 1

### Example 2
- Input: `n = 371` 
- Output: `true`
- Explanation: 3³ + 7³ + 1³ = 27 + 343 + 1 = 371

### Example 3
- Input: `n = 103`
- Output: `false`
- Explanation: 1³ + 0³ + 3³ = 1 + 0 + 27 = 28 ≠ 103

## Edge Cases
- Single digit numbers: Each number from 0-9 is an Armstrong number
- Leading zeros don't count towards digit length
- Negative numbers are not Armstrong numbers

## Constraints
- 1 ≤ N ≤ 10⁹

## Intuition
1. **Digit Count**
   - First, count total digits in number (k)
   - For 371: k = 3 digits

2. **Process Each Digit**
   - Extract each digit
   - Raise it to power k
   - For 371: (3^3, 7^3, 1^3)

3. **Sum and Compare**
   - Add all powered digits
   - Compare with original number
   - 371: 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371

## Examples
- 371 = 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371 ✓
- 1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634 ✓
- 103 ≠ 1^3 + 0^3 + 3^3 = 1 + 0 + 27 = 28 ✗

## Time Complexity: O(log n)
## Space Complexity: O(1)