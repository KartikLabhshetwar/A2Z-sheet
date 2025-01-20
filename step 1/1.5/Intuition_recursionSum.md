# Sum of First N Natural Numbers

## Problem Statement
Given a number 'N', find out the sum of the first N natural numbers.

## Examples

### Example 1:
- Input: N = 5
- Output: 15
- Explanation: 1 + 2 + 3 + 4 + 5 = 15

### Example 2:
- Input: N = 6
- Output: 21
- Explanation: 1 + 2 + 3 + 4 + 5 + 6 = 21

## Intuition and Approach

### Using Recursion
The problem can be solved elegantly using recursion by breaking it down into smaller subproblems:

1. **Base Case**: 
   - When N = 0, return 0 (sum of no numbers is 0)

2. **Recursive Case**:
   - For any number N, the sum can be calculated as: N + sum(N-1)
   - This means: current number + sum of all numbers before it

3. **Recursive Formula**:
   ```
   sum(N) = N + sum(N-1)
   ```

4. **How it works**:
   For N = 5:
   - sum(5) = 5 + sum(4)
   - sum(4) = 4 + sum(3)
   - sum(3) = 3 + sum(2)
   - sum(2) = 2 + sum(1)
   - sum(1) = 1 + sum(0)
   - sum(0) = 0 (base case)
   
   Then it calculates back up:
   - sum(1) = 1 + 0 = 1
   - sum(2) = 2 + 1 = 3
   - sum(3) = 3 + 3 = 6
   - sum(4) = 4 + 6 = 10
   - sum(5) = 5 + 10 = 15

### Time and Space Complexity
- Time Complexity: O(N) - as we make N recursive calls
- Space Complexity: O(N) - due to recursive stack space

### Alternative Approaches
- The sum can also be calculated using the mathematical formula: N * (N + 1) / 2
- This would give O(1) time complexity but doesn't demonstrate recursive problem-solving
