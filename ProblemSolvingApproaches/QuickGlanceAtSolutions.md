### LRU cache	
HashMap with doubly linked list.  OR.         LinkedHashMap

See also - [Splay trees](https://www.youtube.com/watch?v=qMmqOHr75b8) for Most frequently used ( amortized O(log n), best O(1))
### Rotate matrix	
reverse upside down and then swap with diagonally opposite cells

### kth smallest or largest integer	
1.sort & then traverse.     
2.Priority Queue with limit ( A min heap / max heap implementation by java )
TC: O(Nlogk). logk is constant
#### kth smallest in BST: 
- in order traversal till count = k

### wiggle sort, wave
- Arrays.sort(array)
- [1, 1, 2, 2, 3, 6, 7]
   s  s  s  M  l  l  l 
   
  l's in  _ 7 _ 6 _ 3 _ -> odd places reverse order
  s's in  <- _ _ 2 _ 1 _ 1  
  0 1 2 3 4 5 6
  2 7 2 6 1 3 1
  
### Merge k sorted lists
- 3 lists - add the 3 lists to a priority queue
  - 123
  - 3457
  - 68
- poll node (1) and attach to tail.next (result) & add its next 2,3 to queue
  23 <- new
  3457
  68
- repeat
 
see solution [here](https://leetcode.com/submissions/detail/400237437/)

### Median of 2 sorted arrays
[0, 1, 2,  3,  4]

m [1, 3,: 5, 20, 50] divide into 2 for starters right in the middle into lowx, highx
n [4, 6, 7,:  8, 80] divide into 2 divide into 2 such that lowx + lowy == highx + highY make it fair

check:
3 (higest in lowx) < 8 (lowest in highY) ? yes, good
 AND
7 (highest in lowY) > 5 (lowest in hightX) ? no, change partitionX x++ , consecutively y changes too, to maintain balance

do check until maxX <= minY && maxY <= minX i.e until both the above are true.
once found, return max(maxX, maxY) if odd
else average of max(maxes), min(mins)
see [solution here](https://leetcode.com/submissions/detail/397235915/)

### islands, floodfill	
1. DFS drown/mark

### battleships	
1.same as island (in place).                        
2.count heads only (no mutation)

### island perimeter	
islands x4 - neighbor x2

### Floyd warshall distances	
Dij = min(Dij ,Dik + Dkj)

### can course be completed given pre reqs	
floyd warshal variant

### unique paths, number of paths in matrix	
dp[i][j] = dp[i-1][j] + dp[i][j-1] 
i.e 
current = left + top.       
DO NOT do this recursively, lol
check [this](https://leetcode.com/submissions/detail/408056637/) out

### palindromic substring
1. expand palindrome 
Steps: 
- start with one letter (i=j) or 2 adjacent letters (j-i = 1)
- i--, j++
2. boolean[][] dp where dp[i][j] is true if i to j is a palindrome
   anywhere if ith and jth match, check what it encloses
   if 
   (j - i == 1) i.e they are adjacent 'aa'
      OR 
   dp[i + 1][j - 1]) i.e in case of b...b is a palindrome itself due to enclosing a palindrome,  ab.....ba would be too
 
### Longest valid parentheses
- stack
  insert indices of '('
- DP
  s : [( ,) ,( ,( ,) ,) ]
  DP:[0,2,0,0,2,6]
  
### Swap integers without temp
        int x = 10;
        int y = 5;
        x = x + y;
        y = x - y;
        x = x - y;
        
## Also check [the ppt here](https://www.linkedin.com/posts/jayati-tiwari_data-strucutre-problem-solving-techniques-activity-6684391136074715137-z80V/) for different approaches to use for solving problems of different categories
