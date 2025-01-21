# 509. Fibonacci Number

## Problem Statement
Calculate the nth number in the Fibonacci sequence, where each number is the sum of the two preceding ones, starting from 0 and 1.

**Fibonacci Sequence**: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...

## Examples
1. F(2) = F(1) + F(0) = 1 + 0 = 1
2. F(3) = F(2) + F(1) = 1 + 1 = 2
3. F(4) = F(3) + F(2) = 2 + 1 = 3

## Intuition
The Fibonacci sequence has a natural recursive pattern:
- Each number depends on the sum of its two previous numbers
- We can break down the problem into smaller subproblems
- Base cases are F(0) = 0 and F(1) = 1

## Approach
1. **Base Cases**:
   - If n ≤ 1, return n directly
   - This handles both F(0) = 0 and F(1) = 1

2. **Recursive Case**:
   - For n > 1, calculate F(n) = F(n-1) + F(n-2)
   - Break down into smaller subproblems until reaching base cases

## Time & Space Complexity
- Time Complexity: O(2ⁿ) - exponential due to recursive calls
- Space Complexity: O(n) - due to recursive call stack

## Code Walkthrough
```java
static int fibonacci(int n) {
    // Base cases
    if (n <= 1) return n;
    
    // Recursive calls
    int f1 = fibonacci(n-1);
    int f2 = fibonacci(n-2);
    
    // Combine results
    return f1 + f2;
}
```

## Example Flow
For n = 4:
```
fibonacci(4)
├── fibonacci(3)
│   ├── fibonacci(2)
│   │   ├── fibonacci(1) = 1
│   │   └── fibonacci(0) = 0
│   │   Returns: 1
│   └── fibonacci(1) = 1
│   Returns: 2
└── fibonacci(2)
    ├── fibonacci(1) = 1
    └── fibonacci(0) = 0
    Returns: 1
Returns: 3
```
