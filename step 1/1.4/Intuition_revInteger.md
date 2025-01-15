## Reverse Integer

### Problem Statement
Given a signed 32-bit integer `x`, return `x` with its digits reversed. If reversing `x` causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

### Examples
- Example 1:
  - Input: x = 123
  - Output: 321
- Example 2:
  - Input: x = -123
  - Output: -321
- Example 3:
  - Input: x = 120
  - Output: 21

### Constraints
- -2^31 <= x <= 2^31 - 1

### Intuition
To reverse the digits of the integer, we can repeatedly extract the last digit of the number and build the reversed number. We need to be careful about the overflow condition. If at any point the reversed number goes beyond the 32-bit signed integer range, we should return 0.

Steps:
1. Initialize `rev` to 0.
2. Loop until `n` becomes 0:
   - Extract the last digit of `n` using `n % 10`.
   - Append this digit to `rev` by multiplying `rev` by 10 and adding the extracted digit.
   - Remove the last digit from `n` using integer division by 10.
3. Check if `rev` is within the 32-bit signed integer range. If not, return 0.
4. Return `rev`.