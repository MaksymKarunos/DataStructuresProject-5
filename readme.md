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
  For inserting and searching n elements in a separate-chaining hash table the average running time will be O(1) for both operations if the hash function is effective. However, we may come up with a case when we are hashing many items under the same key. This, will make all the items be inserted making a list that will still have O(1) running time for insertions but that will make the method search a lot more time consuming. If inserting one item takes 0(1) time then inserting n items will take O(1) * n.
  Searching will most likely take O(1) if the hash function was chosen wisely, but if we need to find an item that was inserted in the same key as many other items, then we will need to scan through a list and this takes O(n) time. In addition, if the item we are searching for is not on the hash table, the hash function is not effective and many item are hashed under the same key, we will need to scan through the entire list until we can claim that the item we are searching for is not in the list. However, this situation is unlikely in hash tables implemented properly and the average search time is O(1).
  
  Question 2:
  
 *
 *
 *************************************************************************/
