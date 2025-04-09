# Remove Outermost Parentheses

## Problem Statement
Given a valid parentheses string s, remove the outermost parentheses of every primitive string in the primitive decomposition.

A primitive valid parentheses string is one that cannot be split into two non-empty valid parentheses strings.

## Examples

### Example 1:
```
Input: s = "(()())(())"
Output: "()()()"
Explanation: 
- Primitive decomposition: "(()())" + "(())"
- After removing outer parentheses: "()()" + "()" = "()()()"
```

### Example 2:
```
Input: s = "(()())(())(()(()))"
Output: "()()()()(())"
Explanation:
- Primitive decomposition: "(()())" + "(())" + "(()(()))"
- After removing outer parentheses: "()()" + "()" + "()(())" = "()()()()(())"
```

### Example 3:
```
Input: s = "()()"
Output: ""
Explanation:
- Primitive decomposition: "()" + "()"
- After removing outer parentheses: "" + "" = ""
```

## Intuition
1. We need to identify primitive valid parentheses strings and remove their outermost parentheses.
2. A primitive string always starts with '(' and ends with ')', and the count of opening and closing parentheses is equal.
3. We can use a counter to keep track of opened parentheses:
   - When we encounter '(', increment counter
   - When we encounter ')', decrement counter
4. Key observations:
   - Skip the first opening parenthesis (when count = 0)
   - Skip the matching closing parenthesis (when count = 1)
   - Include all other parentheses in between

## Approach
1. Initialize a StringBuilder to store the result
2. Use a counter 'opened' to track number of open parentheses
3. For each character in string:
   - For '(': append only if opened > 0
   - For ')': append only if opened > 1
4. Return the final string

## Time & Space Complexity
- Time Complexity: O(n), where n is the length of input string
- Space Complexity: O(n) to store the result string
