# Longest Subarray with Sum K

## Problem Statement

Given an array `a` of size `n` and an integer `k`, find the length of the longest subarray whose sum equals `k`.

### Examples

**Example 1:**
```
Input: n = the7, k = 3
Array: [1, 2, 3, 1, 1, 1, 1]
Output: 3
Explanation: Subarrays with sum = 3 are:
- [1, 2] (length = 2)
- [3] (length = 1)
- [1, 1, 1] (length = 3)
- [1, 1, 1] (length = 3)
The longest length is 3.
```

## Approach and Intuition

### Using HashMap Approach
This solution works for arrays containing both positive and negative numbers.

1. **Key Idea**: Use prefix sum and HashMap to track cumulative sums
   - HashMap stores: <prefixSum, index>
   - For each position, we check if (currentSum - k) exists in map

2. **Algorithm Steps**:
   - Initialize HashMap to store prefix sums and their indices
   - Track running sum while iterating through array
   - For each position i:
     - Add current element to sum
     - If sum == k, update maxLen with (i+1)
     - Calculate remainder (sum - k)
     - If remainder exists in map, update maxLen
     - Store current sum in map if not already present

3. **Why it works**:
   - If (sum - k) exists in map, it means we found a subarray with sum k
   - Length = current_index - index_where_remainder_was_found
   - We only store first occurrence of sum to get maximum length

### Time and Space Complexity
- Time Complexity: O(n) - Single pass through array
- Space Complexity: O(n) - HashMap storage

## Code Implementation
```java
HashMap<Long, Integer> preMap = new HashMap<>();
long sum = 0;
int maxLen = 0;

for(int i = 0; i < nums.length; i++) {
    sum += nums[i];
    
    if(sum == k) maxLen = Math.max(maxLen, i+1);
    
    long rem = sum - k;
    if(preMap.containsKey(rem)) {
        maxLen = Math.max(maxLen, i - preMap.get(rem));
    }
    
    if(!preMap.containsKey(sum)) {
        preMap.put(sum, i);
    }
}
```

## Constraints
- 1 ≤ n ≤ 5 × 10⁶
- 1 ≤ k ≤ 10¹⁸
- 0 ≤ a[i] ≤ 10⁹
- Time Limit: 1 second
