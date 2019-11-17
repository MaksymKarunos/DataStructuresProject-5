import java.util.*;
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        // INSTANCE OF THE OBJECTS
        // 0.75 IS DEFAULT LOAD FACTOR
        Hashtable <String, Integer> myHashTable = new Hashtable<String, Integer>(1000);
        BinarySearchTree<String> myAVL = new BinarySearchTree<>();

        
        /* TO DO FOR PAULA 
        COMPLETE PARTS 1 AND 2
        COMPLETE THE HEADER OF THIS CLASS: NAME, PROJECT, OUTPUT, INPUT ETC.
         //DEADLINE FOR YOU:
        //=======================
        // SAT, NOV 16, 23:59:59=
        //======================
        

        //TO-DO ALEJANDRO GONZALEZ
        //DEADLINE FOR YOU:
        //=======================
        // SAT, NOV 16, 23:59:59=
        //======================
        //
        // MEASURE TIME AND COMPLETE THE TABLE ABOVE
        // WHEN YOU START A CALL USE 
            //long startTime = System.nanoTime();
        // WHEN YOU FINISH A CALL USE 
            //long ENDTime = System.nanoTime();
        // USE OUTPUT TO OUTPUT END-START;
        // FOLLOW THE ASSIGNMENT
        // REACH ME OUT FOR QUESTIONS
        */

        //single object hashtable speed test
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number to add to the hash table!");
        int n = myScanner.nextInt();
        long hashTableStartTime = System.nanoTime();
        myHashTable.put("n", n);
        long hashTableEndTime = System.nanoTime();
        System.out.println("You entered " + n + " in " + ((hashTableEndTime - hashTableStartTime)/1000000) + " milliseconds!");

        //clears some space
        System.out.println();

        //several objects hashtable speed test
        System.out.println("now let's try adding several objects to the hash table!");
        System.out.println("how many objects do you want to add?");
        int y = myScanner.nextInt();
        long hashTableMultipleItemsStartTime = System.nanoTime();
        int keyForHashTableSearch = 1;
        for(int s = 0; s < y; s++){
            myHashTable.put(String.valueOf(s), 4);
            //this creates a key that will not exist in the table
            keyForHashTableSearch = s*2;
        }
        long hashTableMultipleItemsEndTime = System.nanoTime();
        System.out.println("Added " + y + " objects in " + ((hashTableMultipleItemsEndTime - hashTableMultipleItemsStartTime)/1000000) + " milliseconds");

        //clears some space
        System.out.println();

        //search for a key that isn't there speed test
        long hashTableTestStartTime = System.nanoTime();
        System.out.println(myHashTable.contains(keyForHashTableSearch));
        long hashTableTestEndTime = System.nanoTime();
        System.out.println("checked for object in " + ((hashTableTestEndTime - hashTableTestStartTime) / 1000000) + " milliseconds!");

        //clears some space
        System.out.println();

        //single object binary tree speed test
        System.out.println("Enter a string to add it to the Binary Tree!");
        myScanner.nextLine();
        String x = myScanner.nextLine();
        long binaryTreeStartTime = System.nanoTime();
        myAVL.insert(x);
        long binaryTreeEndTime = System.nanoTime();
        System.out.println("You entered '" + x + "' in " + ((binaryTreeEndTime - binaryTreeStartTime)/1000000) + " milliseconds!");


        //clears some space
        System.out.println();

        //several objects binary tree speed test
        System.out.println("now let's try adding several objects to the binary tree!");
        System.out.println("how many objects do you want to add?");
        int g = myScanner.nextInt();
        long binaryTreeMultipleItemsStartTime = System.nanoTime();
        int keyForBinaryTreeSearch = 1;
        for(int s = 0; s < g; s++){
            myAVL.insert(String.valueOf(s));
            //this creates an object that will not exist in the tree
            keyForBinaryTreeSearch = s*2;
        }
        long binaryTreeMultipleItemsEndTime = System.nanoTime();
        System.out.println("Added " + g + " objects in " + ((binaryTreeMultipleItemsEndTime - binaryTreeMultipleItemsStartTime)/1000000) + " milliseconds");

        //clears some space
        System.out.println();

        //search for a key that isn't there speed test
        long binaryTreeTestStartTime = System.nanoTime();
        System.out.println(myAVL.contains(String.valueOf(keyForBinaryTreeSearch)));
        long binaryTreeTestEndTime = System.nanoTime();
        System.out.println("checked for object in " + ((binaryTreeTestEndTime - binaryTreeTestStartTime) / 1000000) + " milliseconds!");
        
        myScanner.close();
    }
}