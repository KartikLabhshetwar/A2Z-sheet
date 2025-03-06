# Ceil The Floor
## Problem Statement

Given a sorted array 'a' of 'n' integers and a target integer 'x', find both the floor and ceiling of 'x' in the array.

- **Floor**: Largest element in the array that is smaller than or equal to x
- **Ceiling**: Smallest element in the array that is greater than or equal to x

## Examples

### Example 1
```
Input: n = 6, x = 5, a = [3, 4, 7, 8, 8, 10]
Output: [4, 7]
Explanation: 
- Floor is 4 (largest number ≤ 5)
- Ceiling is 7 (smallest number ≥ 5)
```

### Example 2
```
Input: n = 6, x = 8, a = [3, 4, 4, 7, 8, 10]
Output: [8, 8]
Explanation: Since x = 8 exists in array, it's both floor and ceiling
```

### Example 3
```
Input: n = 6, x = 2, a = [3, 4, 4, 7, 8, 10]
Output: [-1, 3]
Explanation: No floor exists as no element ≤ 2, ceiling is 3
```

## Approach & Intuition

The problem can be efficiently solved using Binary Search since the array is sorted. We'll implement two separate binary searches:

1. **For Floor:**
   - Initialize result as -1
   - If mid element ≤ target:
     - Update result with current element
     - Search in right half for potentially larger floor
   - Else search in left half

2. **For Ceiling:**
   - Initialize result as -1
   - If mid element ≥ target:
     - Update result with current element
     - Search in left half for potentially smaller ceiling
   - Else search in right half

### Time Complexity: O(log n)
- Both floor and ceiling operations use binary search
- Each binary search takes O(log n) time

### Space Complexity: O(1)
- Only uses a constant amount of extra space

## Constraints
- 1 ≤ n ≤ 2 * 10^5
- 1 ≤ a[i] ≤ 10^9
- Array is sorted in non-decreasing order
