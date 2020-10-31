## [QUICK SORT](https://leetcode.com/submissions/detail/401452867/)
Quick sort creates 2 groups iteratively on a pivot (any position of choice, mostly last)
Left half is group with elements smaller than pivot
Right half is group with elements larger than or equal to pivot


## [HEAP SORT](https://www.youtube.com/watch?v=Q_eia3jC9Ts)
Steps:
eg: Sort [2, 6, 1, 4, 3, 5] in Ascending order 
A. Create/Build max heap -  ( a complete binary tree where parent >= children )
 2 ways: 
 - [ ] create from scratch - insert each element - O(n log n) 
 - [x] Heapify existing complete binary tree - O(n)
      
A. Heapify - Start with non leaf node at highest index, say k & heapify, then k--
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
 3. heapify : See A.
 4. place el : 6 in the last available spot as it is free. 
 5. n-- (Next availavle spot is left shifted.
 6. Repeat for next root till n reaches left end

NOTE: 
1. the array is being sorted in place.
2. For descending order, use min heap
3. Java implements heap : Priority Queue :)
    
Also Ref: [max heap insertion and deletion](https://www.youtube.com/watch?v=NEtwJASLU8Q&t=969s)

## [Radix/Bucket sort](https://www.youtube.com/watch?v=JMlYkE8hGJM)
1. create 10 buckets and categorize by digit place, starting with Least significant digit.
2. if the max number has 3 digits do the categorization 3 times.



