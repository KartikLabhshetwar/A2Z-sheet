# Search Insert Position

## Problem Statement
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

**Note:** You must write an algorithm with O(log n) runtime complexity.

### Examples

**Example 1:**
```
Input: nums = [1,3,5,6], target = 5
Output: 2
```

**Example 2:**
```
Input: nums = [1,3,5,6], target = 2
Output: 1
```

**Example 3:**
```
Input: nums = [1,3,5,6], target = 7
Output: 4
```

### Constraints
- 1 <= nums.length <= 10^4
- -10^4 <= nums[i] <= 10^4
- nums contains distinct values sorted in ascending order
- -10^4 <= target <= 10^4

## Intuition and Approach

### Key Insights:
1. Since the array is sorted, we can use binary search to achieve O(log n) complexity
2. We need to find either:
   - The exact position of the target if it exists
   - The position where it should be inserted if it doesn't exist

### Solution Approach:
1. We use a modified binary search that implements the lower bound concept
2. The lower bound is the position of the first element that is greater than or equal to the target
3. If the target exists, this will give us its position
4. If the target doesn't exist, this will give us the position where it should be inserted

### How it works:
1. Initialize low = 0 and high = array length - 1
2. Initialize ans = array length (for case where target is larger than all elements)
3. While low <= high:
   - Calculate mid = (low + high) / 2
   - If array[mid] >= target:
     - This could be our answer, so store it
     - Look in left half for potentially smaller index
   - If array[mid] < target:
     - Look in right half

### Time and Space Complexity:
- Time Complexity: O(log n) due to binary search
- Space Complexity: O(1) as we only use a few variables

### Why this works:
The algorithm maintains the invariant that the answer will always be the leftmost position where an element is greater than or equal to the target. This naturally handles both cases:
- When the target exists in the array
- When the target needs to be inserted
