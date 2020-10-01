### TOPOLOGICAL ORDERING

#### Deinition:
- A topological sort or topological ordering of a directed graph is a linear ordering of its vertices such that for every directed edge uv from vertex u to vertex v, u comes before v in the ordering.
```
1 ---* 2 ----* 3
 \     |     *
  \    |    /
   \   |   /
    \  |  /  
     * * /
       4 ----* 5
 ```
       
       In the solution 5 can not come before 4, 3 can not come before 4, 2 can not come before 1, etc
       So convering above to edges
       
       [1,2], [2,3], [2,4], [1,4], [4,3], [4,5]
       
       All these individual orders have to be maintained
       
 The best way to represent and visually tell if it is topologically sorted is to draw a linear graph like so
 
  
 1       2        3        4        5
 
 ( See [diagram here](https://leetcode.com/problems/find-eventual-safe-states/) )
 
 If all the edges are in the right direction ( ---> ) it is topologically sorted or ordered. The above is not as 3 <----- 4 will be seen
 
 1       2        4        3        5
 
 
 1       2        4        5        3   
 
 These are both possible
 
 
 Also, love this Indian instructor : Jenny Lamba
 Check out her explanation [here]( https://www.youtube.com/watch?v=dis_c84ejhQ)
 
 Example application : [Course Schedule](https://leetcode.com/problems/course-schedule/) as it also helps detect cycle in graph by telling you that there is no topological ordering available for the graph.
 
 
 
       
   
       
