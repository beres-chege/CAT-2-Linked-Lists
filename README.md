# CAT-2 Linked-Lists (Beres Chege - 189468)

## Question 1

1. **Dropping constants**

The Big O notation ignores constant factors  since they don’t necessarily affect the the  growth rate .for example if an algorithm has  a time complexity of 2n + 5n , the constants that is 2 and 5 are dropped  this is because as n grows large they become negligible.

1. **Keeping the Dominant terms**

Here only the term that grows the fastest as n increases is kept for example  for a time  complexity of n2 +3n + 2, the dominant term here is n2  hence the Big O is O (n2) since n2 grows faster than 3n  and 2 as n increases.

1. **Ignoring lower order terms**

Lower order terms are dropped  for simplicity and since they have less impact as n becomes very large for example  an algorithm complexity n3 + n2 simplifies to O(n3) the n2 term is ignored since it grows slower than n3.

4 **Analyzing Loops**

for eg;

for(int i= o ;i<n; i++) { } here the loop runs n times hence time complexity is O(n)



## Question 2

1. **Memory Allocation**

Arrays use contiguous memory allocation, meaning all elements are stored in a single block of memory. This makes it easy to access elements using indices but requires a fixed size upfront. Linked lists, on the other hand, use dynamic memory allocation. Each element (node) is stored separately in memory and linked using pointers, allowing for flexible size adjustments.

2. **Performance**

Arrays offer faster access to elements because they use indices, making retrieval operations constant time (O(1)). However, linked lists require traversing nodes to access elements, resulting in linear time (O(n)) for retrieval. Arrays are better for frequent read operations, while linked lists are more efficient for dynamic data structures.

3. **Insertion and Deletion Operations**

Arrays are less efficient for insertion and deletion, especially in the middle, as elements need to be shifted to maintain order, taking O(n) time. Linked lists excel here, as inserting or deleting a node only requires updating pointers, taking O(1) time for the head/tail and O(n) for specific positions. This makes linked lists ideal for frequent modifications.

