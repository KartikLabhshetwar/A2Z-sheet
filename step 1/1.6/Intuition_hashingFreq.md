# Counting Frequency of Array Elements

## Problem Statement
Given an array of integers, find the frequency (number of occurrences) of each element in the array.

## Examples

### Example 1:
```
Input: arr[] = {10, 5, 10, 15, 10, 5}
Output: 
10  3
5   2
15  1
```
Explanation: 10 appears three times, 5 appears twice, and 15 appears once in the array.

### Example 2:
```
Input: arr[] = {2, 2, 3, 4, 4, 2}
Output:
2  3
3  1
4  2
```
Explanation: 2 appears three times, 3 appears once, and 4 appears twice in the array.

## Intuition and Approach

### The Problem
We need to count how many times each unique element appears in the array. This requires:
1. Identifying unique elements
2. Keeping track of their count
3. Displaying the results

### Solution Using HashMap
The most efficient approach is to use a HashMap where:
- Keys store the unique elements from the array
- Values store the frequency count of each element

### Why HashMap?
1. **Fast Access**: O(1) time complexity for insertions and lookups
2. **Dynamic Storage**: Automatically handles unique elements
3. **Easy Updates**: Simple to increment counters for existing elements

### Algorithm Steps
1. Create an empty HashMap
2. Iterate through the array:
   - If element exists in HashMap, increment its count
   - If element is new, add it to HashMap with count 1
3. Display the element-frequency pairs from HashMap

### Time Complexity
- O(n) for building the frequency map
- O(k) for printing results, where k is number of unique elements
- Overall complexity: O(n)

### Space Complexity
- O(k) where k is number of unique elements in array
