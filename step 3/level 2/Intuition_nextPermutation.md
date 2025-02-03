# Next Permutation

## Problem Statement
Given an array of integers, find the next lexicographically greater permutation of the array. If such arrangement is not possible, rearrange it to the lowest possible order (ascending order).

The replacement must be in-place and use only constant extra memory.

### Examples:
1. Input: nums = [1,2,3]
   Output: [1,3,2]

2. Input: nums = [3,2,1]
   Output: [1,2,3]

3. Input: nums = [1,1,5]
   Output: [1,5,1]

### Constraints:
- 1 <= nums.length <= 100
- 0 <= nums[i] <= 100

## Intuition
To find the next permutation, we need to follow these steps:

1. Find the first pair from the right where arr[i] < arr[i+1]. Let's call this index 'ind1'.
   - This identifies the point where the descending order breaks.
   - If no such pair exists, the array is in descending order, meaning it's the last permutation.

2. If ind1 is found:
   - Find the smallest number greater than arr[ind1] to its right. Let's call this index 'ind2'.
   - Swap elements at ind1 and ind2.
   - Reverse all elements after ind1+1 to get the smallest arrangement.

3. If ind1 is not found:
   - Simply reverse the entire array to get the first permutation.

## Example Walkthrough
Let's take array [2,1,5,4,3]:
1. Starting from right, find first pair where left < right
   - We find 1 < 5 at index 1 (ind1)
2. Find smallest number greater than 1 from right of ind1
   - 3 is the smallest number greater than 1
3. Swap 1 and 3: [2,3,5,4,1]
4. Reverse elements after ind1+1: [2,3,1,4,5]

This gives us the next lexicographically greater permutation.

## Time and Space Complexity
- Time Complexity: O(n), where n is the length of array
- Space Complexity: O(1) as we are modifying array in-place
