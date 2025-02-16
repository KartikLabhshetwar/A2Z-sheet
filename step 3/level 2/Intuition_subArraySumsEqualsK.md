# Subarray Sum Equals K

## Problem Statement
Given an array of integers `nums` and an integer `k`, return the total number of subarrays whose sum equals `k`.

A subarray is a contiguous non-empty sequence of elements within an array.

## Examples

### Example 1:
```
Input: nums = [1,1,1], k = 3
Output: 2
Explanation: The subarrays with sum 2 are [1,1] and [1,1].
```

### Example 2:
```
Input: nums = [1,2,3], k = 3
Output: 2
Explanation: The subarrays with sum 3 are [1,2] and [3].
```

## Constraints
- 1 <= nums.length <= 2 * 10^4
- -1000 <= nums[i] <= 1000
- -10^7 <= k <= 10^7

## Intuition and Approach

### The Key Idea
The problem can be solved efficiently using the concept of cumulative sum and a HashMap. Here's how:

1. **Cumulative Sum**: 
   - As we traverse the array, we keep track of the cumulative sum.
   - For any index i, the cumulative sum represents the sum of all elements from index 0 to i.

2. **HashMap Usage**:
   - We use a HashMap to store the frequency of cumulative sums encountered so far.
   - Key: Cumulative sum
   - Value: Frequency of occurrence of that sum

3. **Finding Subarrays**:
   - At any point, if (currentSum - k) exists in the HashMap, it means we've found subarrays that sum to k.
   - This is because: currentSum - (currentSum - k) = k

### Why This Works
- If at some point we have a cumulative sum 'sum', and we've seen a cumulative sum of 'sum-k' before, it means the elements between these points sum to k.
- The frequency stored in the HashMap helps us count multiple such subarrays.

### Time and Space Complexity
- Time Complexity: O(n) where n is the length of the array
- Space Complexity: O(n) for storing the HashMap

### Edge Cases
- We initialize the HashMap with (0,1) to handle cases where the entire subarray from start sums to k
- The solution handles both positive and negative numbers
