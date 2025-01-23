# Bubble Sort: Problem and Solution Approach

## Problem Statement:
Given an array of N integers, sort the array in ascending order using the Bubble Sort algorithm.

Example:
```
Input: arr[] = {5, 4, 3, 2, 1}
Output: arr[] = {1, 2, 3, 4, 5}
```

## Solution Approach:

### 1. Core Logic:
- Start from the end of array (i = n-1)
- For each position i, compare all elements from start till i-1
- If current element is greater than next element, swap them
- Repeat until array is sorted

### 2. Implementation Details:

```java
for(int i = n-1; i >= 0; i--){
    for(int j = 0; j <= i-1; j++){
        if(arr[j] > arr[j+1]){
            swap elements
        }
    }
}
```

### 3. Step-by-Step Example:
Initial Array: [5, 4, 3, 2, 1]

First Pass (i=4):
- Compare (5,4) → [4,5,3,2,1]
- Compare (5,3) → [4,3,5,2,1]
- Compare (5,2) → [4,3,2,5,1]
- Compare (5,1) → [4,3,2,1,5]

Second Pass (i=3):
- Compare (4,3) → [3,4,2,1,5]
- Compare (4,2) → [3,2,4,1,5]
- Compare (4,1) → [3,2,1,4,5]

And so on...

### 4. Time and Space Analysis:
- Time Complexity: O(N²) 
  - Outer loop runs N times
  - Inner loop runs i times for each i
- Space Complexity: O(1) 
  - Only uses a temporary variable for swapping

### 5. Key Points:
1. In your implementation, the outer loop starts from n-1 and goes to 0
2. Inner loop compares adjacent elements and swaps if they're in wrong order
3. After each iteration, one element gets placed in its correct position
4. Process continues until all elements are sorted

### 6. Trade-offs:
Advantages:
- Simple implementation
- No extra space needed
- Stable sorting algorithm

Disadvantages:
- O(N²) complexity makes it inefficient for large arrays
- Not adaptive (same time even if array is partially sorted)
