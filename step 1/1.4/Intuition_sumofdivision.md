# Sum of All Divisors

## Problem Statement
Given an integer N, find the sum of sumOfDivisors(i) for all numbers i from 1 to N.
- For each number i (1 to N), find all its divisors and sum them
- Return the total sum of all these divisor sums

## Examples

### Example 1
- Input: `n = 3`
- Output: `8`
- Explanation: 
```sumOfDivisors(1) = 1 sumOfDivisors(2) = 1 + 2 = 3 ```

```sumOfDivisors(3) = 1 + 3 = 4 Total = 1 + 3 + 4 = 8 ```


### Example 2
- Input: `n = 5`
- Output: `21`
- Explanation:

```
sumOfDivisors(1) = 1 sumOfDivisors(2) = 1 + 2 = 3

```
```
sumOfDivisors(3) = 1 + 3 = 4 sumOfDivisors(4) = 1 + 2 + 4 = 7
```
```
sumOfDivisors(5) = 1 + 5 = 6 Total = 1 + 3 + 4 + 7 + 6 = 21
```



## Intuition
1. **For each number i from 1 to n:**
 - Find all divisors of i
 - Sum these divisors
 - Add to running total

2. **Efficient divisor finding:**
 - Check factors up to sqrt(n)
 - If x is a factor, both x and n/x are factors
 - Skip duplicates when n is perfect square

## Constraints
- 1 ≤ n ≤ 3×10⁴
- Expected Time Complexity: O(n×sqrt(n))
- Space Complexity: O(1)