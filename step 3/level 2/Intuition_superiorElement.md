# Superior Elements

## Problem Statement
Given an integer array 'a' of size 'n', find all Superior Elements. A Superior Element is one that is greater than all elements to its right in the array.

**Note**: The last element is always a Superior Element.

## Examples

### Example 1:
```
Input: a = [1, 2, 3, 2], n = 4
Output: 2 3
Explanation: 
- 3 is greater than all elements to its right (2)
- 2 is the last element (automatically Superior)
The output is sorted in ascending order.
```

### Example 2:
```
Input: a = [1, 2, 2, 1], n = 4
Output: 1 2
```

### Example 3:
```
Input: a = [5, 4, 3], n = 3
Output: 3 4 5
```

## Solution Intuition
The problem can be solved efficiently using the following approach:

1. **Right to Left Traversal**:
   - Start from the rightmost element
   - Keep track of the maximum element seen so far

2. **Key Observations**:
   - Last element is always a Superior Element
   - For any element to be Superior, it must be greater than all elements to its right
   - Which means it must be greater than the maximum element seen so far

3. **Algorithm Steps**:
   - Initialize an ArrayList to store Superior Elements
   - Add the last element as it's always Superior
   - Traverse from second last element to first
   - If current element is greater than the maximum seen so far:
     - Add it to the result list
   - Update maximum seen so far
   - Finally, sort the result list

4. **Time Complexity**: O(n)
   - Single pass through the array
   - Additional O(k log k) for sorting, where k is number of Superior Elements

## Constraints
- 1 <= n <= 10^5
- 1 <= a[i] <= 10^9
- Time Limit: 1 sec
