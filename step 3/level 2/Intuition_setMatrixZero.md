# Set Matrix Zeroes

## Problem Statement
Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's. You must perform the operation in place.

## Examples

### Example 1:
```
Input: matrix = [
  [1,1,1],
  [1,0,1],
  [1,1,1]
]
Output: [
  [1,0,1],
  [0,0,0],
  [1,0,1]
]
```

### Example 2:
```
Input: matrix = [
  [0,1,2,0],
  [3,4,5,2],
  [1,3,1,5]
]
Output: [
  [0,0,0,0],
  [0,4,5,0],
  [0,3,1,0]
]
```

## Constraints
- m == matrix.length
- n == matrix[0].length
- 1 <= m, n <= 200
- -2³¹ <= matrix[i][j] <= 2³¹ - 1

## Intuition
The problem requires us to modify the matrix in-place while keeping track of which rows and columns need to be set to zero. Here's how we can approach it:

1. **Space Optimization Challenge:**
   - A straightforward solution would use O(mn) extra space
   - We can optimize to O(m + n) using two arrays to track rows and columns
   - The optimal solution uses O(1) extra space

2. **Optimal Approach:**
   - Use the first row and first column as markers
   - Keep separate flags for first row and column
   - When we find a 0 at position (i,j):
     * Mark arr[i][0] = 0 (first column)
     * Mark arr[0][j] = 0 (first row)

3. **Two-Pass Strategy:**
   - First pass: Mark the first row and column
   - Second pass: Use these marks to update the matrix
   - Special handling for first row and column using boolean flags

4. **Time Complexity:** O(m*n)
   - Two passes through the matrix

5. **Space Complexity:** O(1)
   - Only using two boolean variables

This approach is optimal as it uses the matrix itself as storage for tracking which rows and columns need to be zeroed, eliminating the need for extra space.
