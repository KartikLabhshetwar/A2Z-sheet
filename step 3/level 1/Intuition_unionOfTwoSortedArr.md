# Union of Two Sorted Arrays

## Problem Statement
Given two sorted arrays `a` and `b` of size `n` and `m` respectively, return their union. The union should contain all unique elements from both arrays in sorted order.

## Examples
### Example 1:
```
Input: 
n = 5, m = 3
a = [1, 2, 3, 4, 6]
b = [2, 3, 5]

Output: [1, 2, 3, 4, 5, 6]

Explanation: 
- Common elements: [2, 3]
- Distinct from a: [1, 4, 6]
- Distinct from b: [5]
```

### Example 2:
```
Input:
n = 4, m = 3
a = [1, 2, 3, 3]
b = [2, 2, 4]

Output: [1, 2, 3, 4]
```

## Intuition
The problem requires finding unique elements from both arrays while maintaining sorted order. Here's how we can solve it:

1. Since we need unique elements, we can use a HashSet to automatically handle duplicates
2. The final result needs to be sorted, so we'll use an ArrayList for the output
3. Steps:
   - Add all elements from first array to HashSet
   - Add all elements from second array to HashSet
   - Convert HashSet to ArrayList for the final result
   - The HashSet automatically:
     - Removes duplicates
     - Maintains unique elements
     - Handles the union operation implicitly

## Time and Space Complexity
- Time Complexity: O(n + m)
  - Adding elements to HashSet: O(n + m)
  - Converting to ArrayList: O(n + m)
- Space Complexity: O(n + m)
  - Space for HashSet and ArrayList

## Code Explanation
1. Create a HashSet to store unique elements
2. Add all elements from first array
3. Add all elements from second array
4. Convert HashSet to ArrayList
5. The ArrayList will automatically be in sorted order since input arrays were sorted

Note: The HashSet approach is chosen for simplicity and readability. For very large arrays, a two-pointer approach might be more memory efficient but more complex to implement.
