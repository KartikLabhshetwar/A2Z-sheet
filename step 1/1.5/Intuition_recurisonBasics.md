# Print GFG N Times Using Recursion

## Problem Statement
Write a program to print "GFG" N times without using loops, using only recursion.

## Examples
**Input:** N = 5  
**Output:** GFG GFG GFG GFG GFG

## Constraints
- 1 ≤ N ≤ 1000
- Time Complexity: O(N)  
- Space Complexity: O(N)

## Detailed Solution Approach

### 1. Understanding Recursion
- Recursion involves breaking problem into smaller subproblems
- Each recursive call should move towards base case

### 2. Components of Solution
1. **Base Case:**
    - When N = 0, stop recursion
    - Return to previous call

2. **Recursive Case:**
    - Print "GFG"
    - Make recursive call with N-1

### 3. Solution Flow
1. First call prints "GFG" and calls with N-1
2. Process repeats until N reaches 0
3. Base case triggers return sequence

### 4. Implementation Steps
1. Create function `printGFG(int N)`
2. Add base case check
3. Print "GFG"
4. Make recursive call

### 5. Code Implementation
```java
void printGFG(int N) {
     // Base case
     if (N == 0) 
          return;
          
     // Print GFG
     System.out.print("GFG ");
     
     // Recursive call
     printGFG(N-1);
}
```

### 6. Memory Stack Visualization
```
Stack Frame 3: N=3
│
Stack Frame 2: N=2
│
Stack Frame 1: N=1
│
Base Case: N=0
```

### 7. Time & Space Analysis
- **Time Complexity:** O(N)
  - Makes N recursive calls
  - Each call does O(1) work
- **Space Complexity:** O(N)
  - Maximum depth of recursion tree is N
  - Each call stores local variables in stack

# Print Numbers 1 to N Using Recursion

## Problem Statement
Write a program to print numbers from 1 to N in increasing order using recursion, without using any loops.

## Examples
**Input:** N = 5  
**Output:** 1 2 3 4 5

## Constraints
- 1 ≤ N ≤ 1000
- Time Complexity: O(N)
- Space Complexity: O(N)

## Detailed Solution Approach

### 1. Understanding the Pattern
- We need numbers in increasing order (1 to N)
- Each recursive call should contribute one number
- The trick is to print AFTER the recursive call

### 2. Key Insight
- If we print before recursion, we get N to 1
- By printing after recursion, we get 1 to N
- The stack nature of recursion helps achieve this

### 3. Solution Flow
1. Base case: N = 0
2. Recursive call with N-1
3. Print current N
4. This creates sequence: 1,2,3,...,N

### 4. Stack Visualization
For N = 3:
```
Call Stack (Going Down)     Print Sequence (Coming Up)
printNos(3)                 │
└── printNos(2)            │
    └── printNos(1)        │
        └── printNos(0)    │ 
            return         → 1
        return            → 2
    return               → 3
```

### 5. Time & Space Analysis
- **Time Complexity:** O(N)
  - One recursive call for each number
- **Space Complexity:** O(N)
  - Maximum recursion depth is N
