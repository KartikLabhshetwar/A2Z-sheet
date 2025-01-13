# Problem Statement

You are given a number `n`.

Find the number of digits of `n` that evenly divide `n`.

**Note:**
A digit evenly divides `n` if it leaves no remainder when dividing `n`.

## Example

**Input:** `n = 336`

**Output:** `3`

**Explanation:**
336 is divisible by both `3` and `6`. Since `3` occurs twice, it is counted two times.

**Note:**
You don’t need to print anything. Just implement the given function.

## Detailed Explanation

### Input/Output Format

**Sample Input 1:**
 35

**sample Output 1:**
 1


**Explanation of Sample Output 1:**
35 is only divisible by `5`, hence the answer is 1.

**Sample Input 2:**
 373

**Sample Output 2:**
 0


**Explanation of Sample Output 2:**
There’s no digit in 373 that evenly divides it. Hence the output is 0.

### Expected Time Complexity
Try to solve this in O(log(n))

### Constraints
1 <= `n` <= 10^9

Time Limit: 1 sec

# Intuition

To solve this problem, follow these steps:
1. Initialize a count variable to zero.
2. Store the original number `n` in a variable `orgNum`.
3. Loop through each digit of `n`:
   - Extract the last digit of `n`.
   - Check if the digit is not zero and if it divides `orgNum` evenly.
   - If it does, increment the count.
   - Remove the last digit from `n`.
4. Return the count.

This approach ensures that we check each digit of the number to see if it divides the original number evenly.