# Upper Bound Implementation

## Problem Statement
Given a sorted array `arr` of size `n` and a value `x`, find the index of the first element in the array that is greater than `x`.

### Input Format
- First line contains two integers `n` and `x`
- Second line contains `n` space-separated integers representing the sorted array

### Output Format
- Single integer representing the index of upper bound

### Constraints
- 1 ≤ n ≤ 10^5
- 1 ≤ x ≤ 10^9
- 1 ≤ arr[i] ≤ 10^9
- Time Limit: 1 sec

## Sample Test Cases

### Test Case 1
```
Input:
5 7
1 4 7 8 10

Output:
3

Explanation: First element greater than 7 is 8, which is at index 3
```

### Test Case 2
```
Input:
5 10
1 2 5 6 10

Output:
5

Explanation: No element greater than 10 exists, so return array length (5)
```

## Intuition and Approach

The upper bound problem can be efficiently solved using binary search because the input array is sorted. Here's how the algorithm works:

1. **Initialize Variables:**
   - Set `low = 0` and `high = array.length - 1`
   - Initialize `up = array.length` as default answer

2. **Binary Search:**
   - Calculate mid point: `mid = low + (high - low)/2`
   - If `arr[mid] > x`:
     - This could be a potential upper bound
     - Store `mid` as current answer
     - Look in left half to find a smaller upper bound
   - If `arr[mid] <= x`:
     - Upper bound must be in right half
     - Update low = mid + 1

3. **Recursion:**
   - Continue until low > high
   - Return the stored upper bound

## Time Complexity
- O(log n) as we're using binary search
- Space Complexity: O(log n) due to recursion stack

## Implementation Notes
- The solution uses recursion for binary search
- We keep track of the current upper bound in the `up` variable
- The algorithm handles edge cases where:
  1. Target is smaller than all elements
  2. Target is larger than all elements
  3. Target exists in array
