# Implement Lower Bound

## Problem Statement
Given a sorted array 'arr' in non-decreasing order and a number 'x', find the lower bound of 'x' in the array.

The lower bound is defined as the smallest index 'idx' such that arr[idx] is not less than 'x'.

## Difficulty: Easy
**Time to Solve:** 20 minutes

## Constraints
- 1 <= n <= 10^5
- 0 <= arr[i] <= 10^5
- 1 <= x <= 10^5

## Examples

### Example 1:
```
Input: arr = [1, 2, 2, 3, 3, 5], x = 0
Output: 0
Explanation: Index 0 is the smallest index where arr[0] >= x
```

### Example 2:
```
Input: arr = [1, 2, 2, 3, 3, 5], x = 2
Output: 1
Explanation: Index 1 is the smallest index where arr[1] >= x
```

### Example 3:
```
Input: arr = [1, 2, 2, 3, 3, 5], x = 7
Output: 6
Explanation: No element is >= 7, so we return array length
```

## Intuition
The key to solving this problem efficiently is using binary search since the array is sorted. Here's how we approach it:

1. Since we need the smallest index where arr[idx] >= x, we can use binary search to narrow down our search space.
2. At each step:
   - If the middle element is >= x, it could be our answer, but there might be a smaller valid index to the left
   - If the middle element is < x, we need to look in the right half
3. Keep track of the smallest valid index found so far
4. When the binary search ends, we'll have the lower bound

## Time Complexity
- Time Complexity: O(log n) - Binary Search
- Space Complexity: O(log n) - Recursive stack space

## Implementation Strategy
1. Initialize lower bound as array length (for case when all elements are smaller than x)
2. Use binary search with recursion:
   - If mid element >= x: Update lower bound and search left half
   - If mid element < x: Search right half
3. Base case: When low > high, return the current lower bound
