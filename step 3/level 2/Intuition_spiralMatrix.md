# Spiral Matrix

## Problem Statement
Given an m x n matrix, return all elements of the matrix in spiral order.

### Examples:

**Example 1:**
```
Input: matrix = [[1,2,3],
                 [4,5,6],
                 [7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
```

**Example 2:**
```
Input: matrix = [[1,2,3,4],
                 [5,6,7,8],
                 [9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
```

### Constraints:
- m == matrix.length
- n == matrix[i].length
- 1 <= m, n <= 10
- -100 <= matrix[i][j] <= 100

## Intuition
To solve this problem, we can use a four-pointer approach that defines the boundaries of our current spiral path. The key idea is to traverse the matrix in a spiral order by:
1. Moving left to right along the top row
2. Moving top to bottom along the rightmost column
3. Moving right to left along the bottom row
4. Moving bottom to top along the leftmost column

We maintain four pointers:
- `top`: Points to the topmost unprocessed row
- `bottom`: Points to the bottommost unprocessed row
- `left`: Points to the leftmost unprocessed column
- `right`: Points to the rightmost unprocessed column

## Approach
1. Initialize four pointers (`top`, `bottom`, `left`, `right`) to mark the boundaries
2. While there are elements to process:
   - Traverse from left to right (top row)
   - Traverse from top to bottom (right column)
   - Traverse from right to left (bottom row)
   - Traverse from bottom to top (left column)
3. After each traversal:
   - Update the corresponding boundary pointer
   - Check if boundaries are still valid
4. Continue until all elements are processed

## Time Complexity
- Time Complexity: O(m × n), where m is the number of rows and n is the number of columns
- Space Complexity: O(1), excluding the space required for output

## Space Complexity
- O(1) for variables
- O(m × n) for storing the result

## Code Implementation
The implementation uses an ArrayList to store the spiral order traversal. We use a while loop that continues until all elements are processed, with boundary checks after each direction traversal.
