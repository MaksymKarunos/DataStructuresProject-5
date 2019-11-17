import java.util.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        // INSTANCE OF THE OBJECTS
        // 0.75 IS DEFAULT LOAD FACTOR
        Hashtable <Integer, String> myHashTable = new Hashtable<>(1000);
        AvlTree<String> myAVL = new AvlTree<>();


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



        
        myScanner.close();
    }
}