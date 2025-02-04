# Longest Consecutive Sequence

## Problem Statement

Given an unsorted array of integers `nums`, return the length of the longest consecutive elements sequence.

The algorithm must run in `O(n)` time complexity.

### Examples

**Example 1:**
```
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
```

**Example 2:**
```
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
```

### Constraints
- 0 <= nums.length <= 10⁵
- -10⁹ <= nums[i] <= 10⁹

## Solution Approaches

### 1. Brute Force Approach (Not Optimal)
- Sort the array first
- Iterate through the sorted array and count consecutive sequences
- Time Complexity: O(nlogn) due to sorting
- Space Complexity: O(1)

### 2. Optimal Approach using HashSet
- Use HashSet to store all numbers for O(1) lookup
- For each number, check if it's the start of a sequence
- If it is, count the length of consecutive sequence starting from that number
- Time Complexity: O(n)
- Space Complexity: O(n)

## Detailed Intuition

1. Why HashSet?
   - HashSet provides O(1) lookup time
   - Automatically handles duplicates
   - Makes it easy to check for existence of numbers

2. Key Strategy:
   - Only start counting sequence from numbers that are the beginning of a sequence
   - A number is the beginning of a sequence if (number-1) doesn't exist in the set

3. Algorithm Steps:
   1. Create a HashSet and add all numbers
   2. For each number n in set:
      - Check if (n-1) exists in set
      - If not, n is start of a sequence
      - Keep checking for (n+1) while it exists
      - Update longest streak if current streak is longer

4. Example Walkthrough:
   ```
   nums = [100,4,200,1,3,2]
   HashSet = {1,2,3,4,100,200}
   
   Check 1: (1-1=0) not in set → start counting: 1,2,3,4 → streak=4
   Check 2: (2-1) in set → skip
   Check 3: (3-1) in set → skip
   Check 4: (4-1) in set → skip
   Check 100: (99) not in set → streak=1
   Check 200: (199) not in set → streak=1
   
   Result: 4
   ```

## Key Points
- Don't need to sort the array
- Each number is only visited a constant number of times
- Solution is optimal with O(n) time complexity
