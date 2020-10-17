Just know these and find your ways around solutions rather than learning or rather memorizing 200s of different solutions 

## Depth first search
 - recursion, back tracking (internally a stack solution) // TODO: DFS without recursion?
 - inorder, preorder, post order traversal
 - Enhancements: improve with dynamic programing or caching subproblem solutions
 - When? - string, substring

## Breadth first search
 - Uses queues
 - level order traversal
 - When? - 
 
## Valid parenthesis
 - stack solution
 
## Dynamic programming using HashTables or arrays as needed
 - improves the revisiting probles a 2D matrix traversal encounters
 - Works well for caching subproblem solutions in dynamic programming approach
 - When? Fibonacci
 
 ## manipulate multiple pointers/variables at once
 - slow fast pointers, opposite direction pointers, etc
 - When? Longest palindromic substring ( expand around the palindriome i--, j++ )
 - 3sum problem : 
     - Brute force can be good if done sytematically. 
     - sweeping pointers i++ --> , <-- j-- ( sweeping, you see??, opposite of expanding above)
     - can be done in O(N^2) by looping for 1st number, and then inside it looping for the other 2 members in a single loop using sweeping pointers
     - (pre req: SORTING) Why?
        - AVOID DUPLICATES: incrementing i till a different i is found, and decrementing j till a different j is found 
        - EARLY BREAK: We can stop when we reach a number > 0, because after that nothing can sum to 0
   See [implementation here](https://leetcode.com/problems/3sum/discuss/7380/Concise-O(N2)-Java-solution)
 
 ## 6. Reversing a linked list
 
 ## 7. Sorting fundamentals  (time complexity, functioning, etc.)
   *O(N^2)*
   - Insertion Sort
   - Bubble Sort
   *O(NlogN)*
   - Merge Sort
   - Quick Sort (similar to bibary sort approach)
   
   When to not sort? if overall alorith runs in N, because sorting would unnessesarily increase run time to NlogN 
   
 ## 8. Recursion
   - fancier or more hyped than useful, recursion can be a curse if done without caching subproblem solutions.
   - there is barely anything that "your own stack solution combined with for loop" can not do that recursion can.
   - if your problem does form into a decision tree or graph that needs back tracking, recursion is the go-to.
   - yet, understanding it can be fun, given how its working is a black box when it comes to dry run or debugging
   - This beautiful video explains my feelings about recursion so well. Love this guy for this [Recursion for beginners](https://www.youtube.com/watch?v=AfBqVVKg4GE&t=234s)
    
 ## 9. Custom Data structure (ex. suffix tree )
 
 ## 10. Binary Search
 - divide and conquer, check if desired number *x >, =, < mid*, recursively till either *x=mid* or leftPointer *>* (i.e crosses) rightPointer
 A good video to learn how to basically implement it https://www.youtube.com/watch?v=V_T5NuccwRA
 - Although returning -1 for not found is acceptable, [Java's implementation](https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#binarySearch(java.util.List,%20T)) of binary search returns (- insertionPoint - 1) which is cool
 - When? Find a commit that introduced this feature/bug (because obviously versions/commits are already in order or sequence)
 - O(logN)
 
 ### Reference: https://www.youtube.com/watch?v=r1MXwyiGi_U&t=59s
 #### I started this document as 10 algorithms to know as the channel suggests, then they turned to data structures to know, and then really tricks to know :D
