# Rotate Image by 90 Degrees (Clockwise)

## Problem Description
Given an n x n 2D matrix representing an image, rotate the image by 90 degrees clockwise in-place.

### Examples

**Example 1:**
```
Input: matrix = [
  [1,2,3],
  [4,5,6],
  [7,8,9]
]
Output: [
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
```

**Example 2:**
```
Input: matrix = [
  [5,1,9,11],
  [2,4,8,10],
  [13,3,6,7],
  [15,14,12,16]
]
Output: [
  [15,13,2,5],
  [14,3,4,1],
  [12,6,8,9],
  [16,7,10,11]
]
```

### Constraints
- n == matrix.length == matrix[i].length
- 1 <= n <= 20
- -1000 <= matrix[i][j] <= 1000

## Intuition
The problem can be solved in two steps:

1. **Transpose the matrix**
   - First, we transpose the matrix (convert rows to columns)
   - This is done by swapping elements across the main diagonal
   - We only need to traverse the upper triangle of the matrix to avoid double swapping

2. **Reverse each row**
   - After transposing, we reverse each row of the matrix
   - This completes the 90-degree clockwise rotation

### Visual Example
For matrix:
```
1 2 3
4 5 6
7 8 9
```

After transpose:
```
1 4 7
2 5 8
3 6 9
```

After reversing rows:
```
7 4 1
8 5 2
9 6 3
```

### Time and Space Complexity
- Time Complexity: O(n²), where n is the dimension of the matrix
- Space Complexity: O(1) as we are performing the rotation in-place

### Why this approach works?
A 90-degree clockwise rotation can be achieved by:
1. Converting rows to columns (transpose)
2. Then reversing each row
This mathematical property helps us perform the rotation without using extra space.
