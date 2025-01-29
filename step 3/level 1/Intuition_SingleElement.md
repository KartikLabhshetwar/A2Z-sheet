# Find The Single Element

## Problem Statement
Given a sorted array 'arr' of positive integers of size 'n', where each number appears exactly twice except for one number that appears exactly once, find that single number.

## Examples

### Example 1:
```
Input: arr = [1, 1, 2, 3, 3, 4, 4]
Output: 2
Explanation: 1, 3, and 4 occur exactly twice. 2 occurs exactly once. Hence the answer is 2.
```

### Example 2:
```
Input: arr = [8, 8, 9, 9, 10]
Output: 10
```

## Constraints
- 1 <= n <= 10^4
- 1 <= arr[i] <= 10^9
- n is always odd
- Time Limit: 1 sec

## Intuition and Approach

### 1. HashMap Approach (O(n) time, O(n) space)
The simplest approach is to use a HashMap to count the frequency of each element:
1. Create a HashMap to store element frequencies
2. Iterate through the array and count occurrences
3. Check the HashMap for the element with frequency 1

### 2. XOR Approach (O(n) time, O(1) space)
A more efficient approach in terms of space:
- XOR of same numbers is 0
- XOR of a number with 0 is the number itself
- XOR all elements - pairs will cancel out, leaving the single element

### 3. Binary Search Approach (O(log n) time, O(1) space)
Since the array is sorted, we can use binary search:
1. In a normal pair sequence, first element is at even index, second at odd
2. When a single element appears, this pattern breaks
3. Compare mid element with neighbors to find break in pattern

## Time Complexity
- HashMap Approach: O(n)
- XOR Approach: O(n)
- Binary Search Approach: O(log n)

## Space Complexity
- HashMap Approach: O(n)
- XOR Approach: O(1)
- Binary Search Approach: O(1)
