## 1. If you have the INDEX

Fastest access: Array(no hashCoding, etc) > HashMap > HashTable (slower due to synchronising)
E.g : see difference between array and hashMap [in this trie implementation](https://leetcode.com/problems/implement-trie-prefix-tree/submissions/) referred 
from [this solution](https://leetcode.com/problems/implement-trie-prefix-tree/discuss/58832/AC-JAVA-solution-simple-using-single-array)

## 2. Array comparisons, or sub groups of a single array
e.g. 2 sum, fair candy swap
Use HashMap & HashSet respectively
- For a 2 sum, using a map, check if `complement ( target - b )` of b is found in map when i = b
- For candy swap check while looping B if A's set has any candy that can be exchanged to meet the `diff (b + diff)`

## 3. Kth largest, 
e.g Use heap aka priority queue versus sorting totally because... ?

## String iteration
- For a string w, Use w.toCharArray() instead of w.charAt(i)
- StringBuilder instead of c1 + c2 + c3.

## Caching
- LinkedHashMap
- Splay trees
