# Reverse an Array

## Problem Statement
Given an array, reverse its elements and print the reversed array.

## Examples

### Example 1:
**Input:** 
- N = 5
- arr[] = {5, 4, 3, 2, 1}

**Output:** {1, 2, 3, 4, 5}

**Explanation:** 
The array elements are reversed so that:
- First element (5) moves to last position
- Second element (4) moves to second last position
- And so on...

### Example 2:
**Input:**
- N = 4
- arr[] = {10, 20, 30, 40}

**Output:** {40, 30, 20, 10}

**Explanation:**
Similar to Example 1, elements are reversed in order.

## Detailed Intuition

### Understanding the Problem
When we need to reverse an array, we're essentially trying to flip the positions of elements from start to end. This means:
- The first element should become the last
- The second element should become the second last
- And so on until we reach the middle of the array

### Solution Approach: Two-Pointer Recursive Method

#### Basic Concept
We use two pointers that start from opposite ends and move towards each other, swapping elements along the way.

#### Step-by-Step Breakdown
1. **Initial Setup**
   - Start pointer (s) → points to the first element (index 0)
   - End pointer (e) → points to the last element (index n-1)

2. **Recursive Process**
   ```
   Original Array: [1, 2, 3, 4, 5]
   
   Step 1: s=0, e=4
   [1, 2, 3, 4, 5] → [5, 2, 3, 4, 1]
   
   Step 2: s=1, e=3
   [5, 2, 3, 4, 1] → [5, 4, 3, 2, 1]
   
   Step 3: s=2, e=2
   Stop as start >= end
   ```

3. **Base Case**
   - When start >= end, we stop
   - This happens when we've processed all elements or reached the middle

### Why Recursion Works Here
1. **Divide and Conquer**
   - Each recursive call handles a smaller portion of the array
   - The array section between start and end keeps shrinking

2. **State Maintenance**
   - Each recursive call maintains its own state of start and end positions
   - This eliminates need for external variables

3. **Natural Termination**
   - Process naturally terminates when pointers meet or cross

### Memory Stack Visualization
```
revArray(arr, 0, 4)
    └── revArray(arr, 1, 3)
        └── revArray(arr, 2, 2)
            └── return (base case reached)
```

### Optimization Notes
1. **Space Efficiency**
   - While recursive solution is elegant, it uses O(N/2) stack space
   - Can be optimized to iterative version for O(1) space complexity

2. **Time Efficiency**
   - Only half of array elements are processed
   - Each element is swapped exactly once

## Time and Space Complexity
- Time Complexity: O(N/2) ≈ O(N), where N is the size of array
- Space Complexity: O(N/2) ≈ O(N) due to recursive stack space

## Implementation Details
- We use a recursive function `revArray` that takes array, start index, and end index as parameters
- Each recursive call swaps elements and moves pointers inward
- Process continues until pointers meet or cross each other
