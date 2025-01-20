# Factorial of a Number using Recursion

## Problem Statement

Given a positive integer X, calculate its factorial (X!).

The factorial of a number is the product of all positive integers less than or equal to that number.
Mathematically, X! = X × (X-1) × (X-2) × ... × 2 × 1

### Examples

1. Input: X = 5
   Output: 120
   Explanation: 5! = 5 × 4 × 3 × 2 × 1 = 120

2. Input: X = 3
   Output: 6
   Explanation: 3! = 3 × 2 × 1 = 6

## Detailed Intuition

### Understanding Factorial

Before diving into the solution, let's understand what factorial means:
- The factorial of a number is the product of all positive integers from 1 up to that number
- It's denoted by the symbol '!'
- For example: 5! means 5 × 4 × 3 × 2 × 1
- Special case: 0! is defined as 1 (mathematical convention)

### Why Recursion Works Here
Factorial has a natural recursive structure:
1. Pattern Recognition:
   - 5! = 5 × 4!
   - 4! = 4 × 3!
   - 3! = 3 × 2!
   - 2! = 2 × 1!
   - 1! = 1 × 0!
   - 0! = 1 (base case)

2. Breaking Down the Problem:
   ```
   factorial(5) can be broken down as:
   = 5 × factorial(4)
   = 5 × (4 × factorial(3))
   = 5 × (4 × (3 × factorial(2)))
   = 5 × (4 × (3 × (2 × factorial(1))))
   = 5 × (4 × (3 × (2 × (1 × factorial(0)))))
   = 5 × (4 × (3 × (2 × (1 × 1))))
   ```

### Recursive Function Analysis

1. Base Case:
   - When n = 0, return 1
   - This is crucial to stop the recursion
   - Without it, the function would recurse infinitely

2. Recursive Case:
   - For any n > 0: return n × factorial(n-1)
   - Each call reduces the problem size by 1
   - The function calls itself with a smaller input

### Memory Stack Visualization

For factorial(4):
```

Stack Frame 4: factorial(4) → waiting for factorial(3)
Stack Frame 3: factorial(3) → waiting for factorial(2)
Stack Frame 2: factorial(2) → waiting for factorial(1)
Stack Frame 1: factorial(1) → waiting for factorial(0)
Stack Frame 0: factorial(0) → returns 1
```

Then unwinding:

```
factorial(0) returns 1
factorial(1) = 1 × 1 = 1
factorial(2) = 2 × 1 = 2
factorial(3) = 3 × 2 = 6
factorial(4) = 4 × 6 = 24
```

### Edge Cases and Limitations

1. Negative Numbers:
   - Factorial is not defined for negative numbers
   - Input validation should check for this

2. Large Numbers:
   - Factorial grows very quickly
   - For n > 12, result may exceed int range
   - Consider using long or BigInteger for larger values

### Code Flow Example

For input n = 4:
```

factorial(4)
= 4 × factorial(3)
= 4 × (3 × factorial(2))
= 4 × (3 × (2 × factorial(1)))
= 4 × (3 × (2 × (1 × factorial(0))))
= 4 × (3 × (2 × (1 × 1)))
= 4 × (3 × (2 × 1))
= 4 × (3 × 2)
= 4 × 6
= 24
```
