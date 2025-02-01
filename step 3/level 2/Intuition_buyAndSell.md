# Best Time to Buy and Sell Stock

## Problem Statement
You are given an array `prices` where `prices[i]` is the price of a given stock on the `ith` day. The goal is to maximize profit by choosing a single day to buy stock and a different future day to sell it.

## Examples

### Example 1:
```
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
```

### Example 2:
```
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
```

## Constraints
- 1 <= prices.length <= 10^5
- 0 <= prices[i] <= 10^4

## Intuition
The problem can be solved using a simple one-pass approach. Here's how:

1. **Track Minimum Buy Price**: 
   - Keep track of the minimum price seen so far
   - This represents the best day to buy stock up to the current point

2. **Calculate Maximum Profit**:
   - For each price, calculate potential profit if we sell on that day
   - Profit = Current Price - Minimum Buy Price seen so far
   - Keep track of the maximum profit seen

3. **Why This Works**:
   - By tracking the minimum price, we ensure we're always considering buying at the lowest possible price
   - For each day, we check if selling on that day gives better profit than what we've seen before
   - We don't need to compare every pair of days because:
     - If we find a new minimum price, any future higher price will be compared against this new minimum
     - If current price is higher than minimum, we automatically calculate the profit

4. **Time Complexity**: O(n) - single pass through the array
   **Space Complexity**: O(1) - only using two variables (minPrice and maxProfit)

## Code Implementation
The solution maintains two variables:
- `buy`: Tracks the minimum price seen so far
- `profit`: Tracks the maximum profit achievable

For each price in the array:
1. Update the minimum buy price if current price is lower
2. Calculate potential profit if we sell at current price
3. Update maximum profit if current profit is higher
