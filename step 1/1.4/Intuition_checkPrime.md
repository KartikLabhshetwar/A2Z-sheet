# Prime Number Checker

## Problem Statement
Given a number 'n', determine whether it is a prime number or not.

A prime number is a positive integer that is divisible by exactly 2 numbers: 1 and itself.

### Examples
1. **Example 1:**
   - Input: n = 5
   - Output: YES
   - Explanation: 5 is only divisible by 1 and 5

2. **Example 2:**
   - Input: n = 6
   - Output: NO
   - Explanation: 6 is divisible by 1, 2, 3, and 6

3. **Example 3:**
   - Input: n = 1
   - Output: NO
   - Explanation: 1 is neither prime nor composite

### Constraints
- 1 ≤ n ≤ 10^9
- Time limit: 1 second

## Intuition
To efficiently check if a number is prime, we can use these key insights:

1. **Base Cases:**
   - Numbers ≤ 1 are not prime
   - 2 is the smallest prime number

2. **Optimization 1: Check up to Square Root**
   - If a number n is not prime, it must have a factor ≤ √n
   - Example: For 36
     - Factors: 1, 2, 3, 4, 6, 9, 12, 18, 36
     - We only need to check up to 6 (√36)

3. **Optimization 2: Skip Even Numbers**
   - After checking 2, we can skip all even numbers
   - Only check odd numbers up to √n

4. **Algorithm Steps:**
    1. If n ≤ 1, return false
    2. If n = 2, return true
    3. If n is even, return false
    4. For i from 3 to √n (step 2):
        - If n is divisible by i, return false
    5. Return true.


### Time Complexity
- O(√n) - We only check numbers up to square root of n
- Much better than O(n) naive approach

### Space Complexity
- O(1) - Only uses a constant amount of extra space