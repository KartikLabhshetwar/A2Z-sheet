# Two Sum

## Problem Description
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

### Examples

**Example 1:**
```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```

**Example 2:**
```
Input: nums = [3,2,4], target = 6
Output: [1,2]
```

**Example 3:**
```
Input: nums = [3,3], target = 6
Output: [0,1]
```

### Constraints
- 2 <= nums.length <= 10^4
- -10^9 <= nums[i] <= 10^9
- -10^9 <= target <= 10^9
- Only one valid answer exists.

## Solution Approaches

### 1. Brute Force Approach
- **Time Complexity:** O(n²)
- **Space Complexity:** O(1)
- Use two nested loops to check every possible pair of numbers
- Not efficient for large inputs

### 2. HashMap Approach (Optimal)
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)
- Use a HashMap to store numbers and their indices
- For each number, calculate the difference needed to reach target
- Check if difference exists in HashMap

#### Algorithm
1. Create an empty HashMap to store number-index pairs
2. Iterate through the array:
   - Calculate difference = target - current number
   - If difference exists in HashMap, we found our pair
   - If not, add current number and its index to HashMap
3. Return the indices if found, empty array otherwise

### Code Explanation
The optimal solution uses a HashMap where:
- Key: Number from the array
- Value: Index of that number

For each number:
1. Calculate what number we need (difference = target - current number)
2. If that number exists in our map, we've found our pair
3. If not, store current number and index in map and continue

This way, we only need to traverse the array once, making it O(n) time complexity.
