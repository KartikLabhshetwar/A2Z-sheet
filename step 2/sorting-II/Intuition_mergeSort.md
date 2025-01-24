# Merge Sort - Detailed Problem & Solution

## Problem Statement
Given an unsorted array of integers, implement the Merge Sort algorithm to sort the array in ascending order.

### Input Format
- First line contains N, the size of array
- Second line contains N space-separated integers

### Output Format
- Array elements in sorted order

### Examples
```
Input: N = 5
Array: [4, 2, 1, 6, 7]
Output: [1, 2, 4, 6, 7]

Input: N = 9
Array: [3, 1, 2, 4, 1, 5, 2, 6, 4]
Output: [1, 1, 2, 2, 3, 4, 4, 5, 6]
```

## Detailed Solution

### Approach
The solution uses divide-and-conquer strategy with these key steps:
1. Divide: Split array into two halves
2. Conquer: Recursively sort the sub-arrays
3. Combine: Merge the sorted sub-arrays

### Implementation Details

#### 1. Main Recursive Function (mergeSrt)
```java
static void mergeSrt(int[] arr, int low, int high) {
    if(low >= high) return;  // Base case
    
    int mid = low + (high - low)/2;  // Find middle point
    mergeSrt(arr, low, mid);         // Sort left half
    mergeSrt(arr, mid+1, high);      // Sort right half
    merge(arr, low, mid, high);      // Merge sorted halves
}
```

#### 2. Merging Process (merge)
```java
static void merge(int[] arr, int low, int mid, int high) {
    // Create temporary arrays
    int[] leftArray = new int[mid - low + 1];
    int[] rightArray = new int[high - mid];
    
    // Copy data to temporary arrays
    // Merge back into original array
    // Handle remaining elements
}
```

### Time & Space Complexity Analysis

#### Time Complexity: O(N log N)
- Dividing array: O(log N) levels
- Merging at each level: O(N)
- Total: O(N) × O(log N) = O(N log N)

#### Space Complexity: O(N)
- Temporary arrays in merge function: O(N)
- Recursion stack: O(log N)
- Maximum space used: O(N)

### Key Points
1. Stable sorting algorithm
2. Divide & Conquer approach
3. Not in-place sorting
4. Predictable performance O(N log N)

### Common Pitfalls
1. Array index handling during merge
2. Memory allocation for temporary arrays
3. Base case in recursive function

### Optimization Tips
1. Use insertion sort for small subarrays
2. Avoid creating temporary arrays repeatedly
3. Use iterative version for better space complexity
