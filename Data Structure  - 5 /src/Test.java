/*************************************************************************
 *
 *  Pace University
 *  Fall 2019
 *  Data Structures and Algorithms
 *
 *  Course: CS 241
 *  Team Authors: Karunos, Medina, Gonzalez
 *  External Collaborators: NONE
 *  References: None
 *
 *  Assignment: Assignment 5
 *  Problem: Compare methods add and search in hash table vs AVL tree
 *  Description: Making assumptions on expected running times for inserting and searching in hash tables and AVL trees. Once those assumptions are made, run an experiment with 5 different test values (n) on  each, AVL and hash table. Figure out if the conjectures were the same as the experimental results.
 *
 *  Input: inter n
 *  Output: HT boolean - containsKey(n+1) + time taken | AVL boolean - containsKey(n+1) + time taken
 *
 *  Visible data fields:
 *  AVL myAvL
 *
 *  Visible methods:
 *  NONE
 *
 *
 *   Remarks
 *   -------
 *

 Question 1:
  For inserting and searching n elements in a separate-chaining hash table the average running time will be O(1) for both operations if the hash function is effective. However, we may come up with a case when we are hashing many items under the same key. This, will make all the items be inserted making a list that will still have O(1) running time for each insertion but that will make the method search a lot more time consuming. If inserting one item takes 0(1) running time, then inserting n items will take O(1) * n = O(n).
  Searching will most likely take O(1) if the hash function was chosen wisely, but if we need to find an item that was inserted in the same key as many other items, then we will need to scan through a list and this takes O(n) time. In addition, if the item we are searching for is not on the hash table, the hash function is not effective and many item are hashed under the same key, we will need to scan through the entire list until we can claim that the item we are searching for is not in the list. However, this situation is unlikely in hash tables implemented properly and the average search time is O(1).
  
  Question 2:
  When we insert on an AVL tree the time complexity of each insertion is O(log n). We also need to take into consideration that the tree needs to balance itself that takes O(1). Therefore inserting one element takes O(log n) + 1, which is still O(log n). If we are inserting n items then the total running time will be n* O(log n) which is O(nlogn).
  Searching one item also takes O(log n) in the case that we have to scan through the tree to conclude that the item is not in the tree. The reason of log(n) complexity is because every time we search we take away half the tree. Starting on the root we know that the item we are looking for is either on the right or the left depending if the value is greater of lower. This will already get rid of either the right or left tree. We keep doing this until either we find the value or we have scanned the whole tree.
  
  
  Question 3:
  (ALL TIMES IN NANOSECONDS)
  
  CONSTRUCTION TIME|  10^2  | 10^3    |  10^4   | 10^5    | 10^6
  HASH TABLE       | 508023 | 3358176 |15057934 |86827752 |860114144 | y = 857.341 x + 2.65487×10^6
  AVL TREE         | 2066758| 5834300 |22759269 |10262916 |100960579 | 
  
  
  
  
  SEARCH TIME |  10^2  |  10^3   |  10^4   | 10^5    | 10^6
  HASH TABLE  | 100003 | 67657   | 72075   |161270   | 92003  | y = 98784.4 - 0.000822637 x (Note: four zeros after period that the input size does not matter)
  AVL         | 88416  | 60494   | 88365   |11053    | 124634 | 
  
  
  Question 4:
  
  In order to prove if our conjectures were actually the experimental results we decided to plot them in different graphs. The construction fit for a hash table matches almost perfectly a linear fit, proving then that the linear time for inserting n items must be O(n). For searching we also proved that it must be O(1) since the slope of the linear fit once we plot is -0.000822637, which basically means that the function is constant.
  
  The AVL was a little trickier because of the assumption of nlogn running time for n insertions. We plugged the points using excel and compared with what the nlogn graph looks like. One of the points we obtained doesn't really match the nlogn function (10000, 22759269). Only by looking at the points we could have guessed this error since the time for 10^4 insertions is greater than the time for 10^5. (Can't happen since running time grows as we inser more items). The rest of the points do not differ that much with the n log n graph. For searching on an AVL we conclude that our assumption was also correct since the points match almost perfectly with a log fit, making the running time for search  O(log n).
  
 *
 *
 *************************************************************************/

import java.util.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        // INSTANCE OF THE OBJECTS
        // 0.75 IS DEFAULT LOAD FACTOR
        Hashtable <Integer, String> myHashTable = new Hashtable<>(1000);
        AvlTree<String> myAVL = new AvlTree<>();
        ArrayMapping mArrayMapping = new ArrayMapping(100);

        //git hub test

        //single object hashtable speed test
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number to add to the hash table!");
        int n = myScanner.nextInt();
        long hashTableStartTime = System.nanoTime();
        for (int i =0; i<n; i++){
            myHashTable.put(i, n+""); 
        }
        long hashTableEndTime = System.nanoTime();
        // Time should be in nanoseconds
        System.out.println("You entered " + n + " in " + ((hashTableEndTime - hashTableStartTime)) + " nanoseconds!");

        //clears some space
        System.out.println();

        //search for a key that isn't there: speed test
        //git
        long hashTableTestStartTime = System.nanoTime();
        System.out.println(myHashTable.containsKey(n));
        long hashTableTestEndTime = System.nanoTime();
        System.out.println("Size of the table: " + myHashTable.size());
        System.out.println("checked for object in " + ((hashTableTestEndTime - hashTableTestStartTime)) + " nanoseconds!");

        //clears some space
        System.out.println();

        //several objects binary tree speed test
        System.out.println("now let's try adding several objects to the binary tree!");
        System.out.println("how many objects do you want to add?");
        n = myScanner.nextInt();
        long binaryTreeMultipleItemsStartTime = System.nanoTime();
        for(int i = 0; i < n; i++){
            myAVL.insert(i+"");
            //this creates an object that will not exist in the tree
        }
        long binaryTreeMultipleItemsEndTime = System.nanoTime();
        System.out.println("Added " + n + " objects in " + ((binaryTreeMultipleItemsEndTime - binaryTreeMultipleItemsStartTime)) + " nanoseconds");

        //clears some space
        System.out.println();

        //search for a key that isn't there speed test
        long binaryTreeTestStartTime = System.nanoTime();
        System.out.println(myAVL.contains(String.valueOf(n+1)));
        long binaryTreeTestEndTime = System.nanoTime();
        //FOR TEST PURPOSES
        //myAVL.printTree();
        System.out.println("checked for object in " + ((binaryTreeTestEndTime - binaryTreeTestStartTime)) + " nanoseconds!");
        // EXTRA CREDIT
        for (int i = 0; i < mArrayMapping.getSize(); i++) {
            mArrayMapping.insert(i);
        }
        
        
        myScanner.close();
    }
}
