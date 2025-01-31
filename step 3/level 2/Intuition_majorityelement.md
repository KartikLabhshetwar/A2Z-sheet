# Majority Element

## Problem Statement
Given an array `nums` of size n, find and return the majority element. The majority element is defined as the element that appears more than ⌊n/2⌋ times in the array. You can assume the majority element always exists.

## Examples

### Example 1:
```
Input: nums = [3,2,3]
Output: 3
```

### Example 2:
```
Input: nums = [2,2,1,1,1,2,2]
Output: 2
```

## Constraints
- n == nums.length
- 1 <= n <= 5 * 10^4
- -10^9 <= nums[i] <= 10^9

## Intuition and Approach

### HashMap Approach
The solution uses a HashMap to keep track of the frequency of each element in the array. Here's how it works:

1. Create a HashMap to store element-frequency pairs
2. Iterate through the array:
   - For each element, increment its count in the HashMap
   - Use getOrDefault() to handle elements appearing for the first time
3. Calculate the threshold (n/2) for majority element
4. Iterate through the HashMap entries:
   - If any element's frequency exceeds n/2, return that element

### Time and Space Complexity
- Time Complexity: O(n) - We iterate through the array once and the HashMap entries once
- Space Complexity: O(n) - In worst case, all elements are unique and stored in HashMap

### Alternative Approaches
There's also a more optimal solution called Boyer-Moore Voting Algorithm that can solve this in O(n) time and O(1) space, but the HashMap approach is more intuitive to understand and implement.

## Code Implementation
The solution uses Java's HashMap to track frequencies and Map.Entry to iterate over the entries. The getOrDefault() method elegantly handles the case of first occurrence of any element.
