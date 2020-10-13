



## HEAP SORT
Steps:
eg: Sort [2, 6, 1, 4, 3, 5] in Ascending order 
Build max heap (Use max heap insertion O(nlog n)) -  ( a complete binary tree where parent >= children )
Steps
A. Build by insertion
 1. 
 2. 
```
Tree form
     6     
   /  \
  5    3
 / \   / 
4   2 1
```
```
level order aray representation => A = [6,5,3,4,2,1]
```
B. Sort by deletion  - (Use max heap deletion O(nlog n))
 1. el = delete root i.e 1st element in A // el = 6
 2. replace A[root] i.e A[0] with last element i.e A[n-1] i.e 1 
 3. heapify : [ *1*, 5 , 3, 4, 2, _ ]
  -  Choose next successor from its children 5 > 3 , so 5 and swap [ 5, *1*, 3, 4, 2, _]
  -  keep comparing 1 to its children until it is greater than children or reaches dead end
 4. place el : 6 in the last available spot as it is free. 
 5. n-- (Next availavle spot is left shifted.
 6. Repeat for next root till n reaches left end

NOTE: 
1. the array is being sorted in place.
2. For descending order, use min heap
3. Java implements heap : Priority Queue :)
    
Ref: [max heap insertion and deletion](https://www.youtube.com/watch?v=NEtwJASLU8Q&t=969s)



