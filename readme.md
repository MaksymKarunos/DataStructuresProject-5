/*************************************************************************
 *
 *  Pace University
 *  Fall 2019
 *  Data Structures and Algorithms
 *
 *  Course: CS 241
 *  Team Authors: PUT THE NAMES OF YOUR TEAM MEMBERS HERE
 *  External Collaborators: PUT THE NAMES OF YOUR COLLABORATORS OUTSIDE YOUR TEAM HERE, IF NONE, PUT NONE
 *  References: PUT THE LINKS TO YOUR SOURCES HERE
 *
 *  Assignment: Assignment 5
 *  Problem: Compare methods add and search in hash table vs AVL tree
 *  Description: Making assumptions on expected running times for inserting and searching in hash tables and AVL trees. Once those assumptions are made, run an experiment with 5 different test values (n) on  each, AVL and hash table. Figure out if the conjectures were the same as the experimental results.
 *
 *  Input: 
 *  Output: 
 *
 *  Visible data fields:
 *  COPY DECLARATION OF VISIBLE DATA FIELDS HERE
 *
 *  Visible methods:
 *  COPY SIGNATURE OF VISIBLE METHODS HERE
 *
 *
 *   Remarks
 *   -------
 *
 *   PUT ALL NON-CODING ANSWERS HERE
 
 Question 1:
  For inserting and searching n elements in a separate-chaining hash table the average running time will be O(1) for both operations if the hash function is effective. However, we may come up with a case when we are hashing many items under the same key. This, will make all the items be inserted making a list that will still have O(1) running time for each insertion but that will make the method search a lot more time consuming. If inserting one item takes 0(1) running time, then inserting n items will take O(1) * n = O(n).
  Searching will most likely take O(1) if the hash function was chosen wisely, but if we need to find an item that was inserted in the same key as many other items, then we will need to scan through a list and this takes O(n) time. In addition, if the item we are searching for is not on the hash table, the hash function is not effective and many item are hashed under the same key, we will need to scan through the entire list until we can claim that the item we are searching for is not in the list. However, this situation is unlikely in hash tables implemented properly and the average search time is O(1).
  
  Question 2:
  When we insert on an AVL tree the time complexity of each insertion is O(log n). We also need to take into consideration that the tree needs to balance itself that takes O(1). Therefore inserting one element takes O(log n) + 1, which is still O(log n). If we are inserting n items then the total running time will be n* O(log n) which is O(nlogn).
  Searching one item also takes O(log n) in the case that we have to scan through the tree to conclude that the item is not in the tree. The reason of logn complexity is because every time we search we take away half the tree. Starting on the root we know that the item we are looking for is either on the right or the left depending if the value is greater of lower. This will already get rid of either the right or left tree. We keep doing this until either we find the value or we have scanned the whole tree.
  
  
  Question 3:
  
  (ALL TIMES IN NANOSECONDS)
  
  CONSTRUCTION TIME|  10^2  | 10^3    |  10^4   | 10^5    | 10^6
  HASH TABLE       | 508023 | 3358176 |15057934 |86827752 |860114144
  AVL TREE         | 2066758| 5834300 |22759269 |105262916|100960579
  
  
  
  
  SEARCH TIME |  10^2  |  10^3   |  10^4   | 10^5    | 10^6
  HASH TABLE  | 100003 | 67657   | 72075   |161270   | 92003
  AVL         | 88416  | 60494   | 88365   |11053    | 124634
  
  
  Question 4:
  
  I love snakes
 *
 *
 *************************************************************************/
