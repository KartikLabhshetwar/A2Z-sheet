# Second Largest and Second Smallest Element
**Difficulty**: Easy  
**Time to Solve**: 23m  
**Companies**: Various Top Companies

## Problem Statement
Given an array 'a' of 'n' unique non-negative integers, find the second largest and second smallest elements from the array. Return these elements as an array of size 2.

## Examples

### Example 1:
```
Input: n = 5, a = [1, 2, 3, 4, 5]
Output: [4, 2]
Explanation: Second largest element after 5 is 4, and second smallest element after 1 is 2
```

### Example 2:
```
Input: n = 4, a = [3, 4, 5, 2]
Output: [4, 3]
Explanation: Second largest element after 5 is 4, and second smallest element after 2 is 3
```

## Approaches

### 1. Brute Force Approach (Using Sorting)
- **Algorithm**:
  1. Sort the array in ascending order
  2. Second largest = arr[n-2]
  3. Second smallest = arr[1]
- **Time Complexity**: O(n log n)
- **Space Complexity**: O(1)
- **Drawback**: Not efficient for large arrays

### 2. Optimal Approach (Single Pass)
- **Algorithm**:
  1. Initialize four variables:
     - largest = Integer.MIN_VALUE
     - secondLargest = Integer.MIN_VALUE
     - smallest = Integer.MAX_VALUE
     - secondSmallest = Integer.MAX_VALUE
  2. Traverse array once, updating both pairs simultaneously
  3. For each element:
     - Update largest/secondLargest pair
     - Update smallest/secondSmallest pair
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)

## Implementation Details
The optimal solution uses a single pass approach:
1. For second largest:
   - If current > largest: update secondLargest = largest, largest = current
   - If current > secondLargest but < largest: update secondLargest = current
2. For second smallest:
   - If current < smallest: update secondSmallest = smallest, smallest = current
   - If current < secondSmallest but > smallest: update secondSmallest = current

## Constraints
- 2 ≤ n ≤ 10^5
- 0 ≤ a[i] ≤ 10^9
- Time limit: 1 second

## Tips
- Always handle edge cases where array might have duplicates
- Consider using single pass instead of sorting for better efficiency
- Use appropriate initial values (MIN_VALUE/MAX_VALUE) for comparisons
