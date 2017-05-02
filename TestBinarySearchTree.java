package lab7;

/**
 * CSCI C202
 * Lab 7 - Binary Search Trees
 * Purpose: build a class of binary search trees to manipulate them using basic
 *          methods such as inserting an element, deleting an element, and 
 *          searching for an element
 * 
 * @author Thomas Wiles
 * @version 1.0  5/1/17
 */

import java.util.*;
import java.io.*;

public class TestBinarySearchTree {
    
    public static void main(String[] args) {
        
        System.out.println("***TREE 1***");
        Integer[] num = {67, 87, 55, 43, 48, 73, 91, 39, 59, 92, 34, 95, 81, 66, 40, 53, 84, 77};
        BinarySearchTree<Integer> tree1 = new BinarySearchTree<>(num);
        
        Scanner input = new Scanner(System.in);
        Integer key = 0;
        
        while (key != -1) {
            System.out.print("\nEnter an element to search:  ");
            key = input.nextInt();
            if (key != -1) {
                if (tree1.search(key))
                    System.out.println(key + " is an element of the BST.");
                else
                    System.out.println(key + " is NOT an element in the BST.");
            } //if
        } //while
        key = 0;
        System.out.println("");
        
        System.out.print("Preorder:   ");
        tree1.preorder();
        System.out.println("");
        System.out.print("Inorder:    ");
        tree1.inorder();
        System.out.println("");
        System.out.print("Postorder:  ");
        tree1.postorder();
        System.out.println("\n");
        
        System.out.println("Path to 95:  " + tree1.path(95));
        System.out.println("Path to 77:  " + tree1.path(77));
        System.out.println("Path to 54:  " + tree1.path(54));
        System.out.println("");
        
        System.out.println("Number of Leaves:  " + tree1.getNumberOfLeaves());
        System.out.println("");
        
        System.out.println("Left Subtree for 43:  " + tree1.leftSubTree(43));
        System.out.println("Left Subtree for 59:  " + tree1.leftSubTree(59));
        System.out.println("Left Subtree for 81:  " + tree1.leftSubTree(81));
        System.out.println("");
        
        System.out.println("Right Subtree for 55:  " + tree1.rightSubTree(55));
        System.out.println("Right Subtree for 67:  " + tree1.rightSubTree(67));
        System.out.println("Right Subtree for 84:  " + tree1.rightSubTree(84));
        
        while (key != -1) {
            System.out.print("\nEnter an element to delete:  ");
            key = input.nextInt();
            if (key != -1) {
                if (tree1.delete(key))
                    System.out.println(key + " was deleted from the BST.");
                else
                    System.out.println(key + " was never in the BST.");
            } //if
        } //while
        key = 0;
        
        while (key != -1) {
            System.out.print("\nEnter an element to insert:  ");
            key = input.nextInt();
            if (key != -1) {
                if (tree1.insert(key))
                    System.out.println(key + " was inserted into the BST.");
                else
                    System.out.println(key + " was already in the BST.");
            } //if
        } //while
        key = 0;
        System.out.println("");
        
        
        System.out.println("\n***TREE 2***");
        Integer[] num2 = {45, 33, 111, 85, 20, 46, 52, 71, 19, 49, 89, 1};
        BinarySearchTree<Integer> tree2 = new BinarySearchTree<>(num2);
        
        while (key != -1) {
            System.out.print("\nEnter an element to search:  ");
            key = input.nextInt();
            if (key != -1) {
                if (tree2.search(key))
                    System.out.println(key + " is an element of the BST.");
                else
                    System.out.println(key + " is NOT an element in the BST.");
            } //if
        } //while
        key = 0;
        System.out.println("");
        
        System.out.print("Preorder:   ");
        tree2.preorder();
        System.out.println("");
        System.out.print("Inorder:    ");
        tree2.inorder();
        System.out.println("");
        System.out.print("Postorder:  ");
        tree2.postorder();
        System.out.println("\n");
        
        System.out.println("Path to 89:  " + tree2.path(89));
        System.out.println("Path to  1:  " + tree2.path(1));
        System.out.println("Path to 88:  " + tree2.path(88));
        System.out.println("");
        
        System.out.println("Number of Leaves:  " + tree2.getNumberOfLeaves());
        System.out.println("");
        
        System.out.println("Left Subtree for  33:  " + tree2.leftSubTree(33));
        System.out.println("Left Subtree for  46:  " + tree2.leftSubTree(46));
        System.out.println("Left Subtree for 111:  " + tree2.leftSubTree(111));
        System.out.println("");
        
        System.out.println("Right Subtree for  33:  " + tree2.rightSubTree(33));
        System.out.println("Right Subtree for  46:  " + tree2.rightSubTree(46));
        System.out.println("Right Subtree for 111:  " + tree2.rightSubTree(111));
        
        while (key != -1) {
            System.out.print("\nEnter an element to delete:  ");
            key = input.nextInt();
            if (key != -1) {
                if (tree2.delete(key))
                    System.out.println(key + " was deleted from the BST.");
                else
                    System.out.println(key + " was never in the BST.");
            } //if
        } //while
        key = 0;
        
        while (key != -1) {
            System.out.print("\nEnter an element to insert:  ");
            key = input.nextInt();
            if (key != -1) {
                if (tree2.insert(key))
                    System.out.println(key + " was inserted into the BST.");
                else
                    System.out.println(key + " was already in the BST.");
            } //if
        } //while
        key = 0;
        System.out.println("");
        
        
        System.out.println("\n***TREE 3***");
        Integer[] num3 = {45, 111, 85, 20, 46, 52, 71, 19, 49, 89, 1, 144};
        BinarySearchTree<Integer> tree3 = new BinarySearchTree<>(num3);
        
        System.out.print("Preorder:   ");
        tree3.preorder();
        System.out.println("");
        System.out.print("Inorder:    ");
        tree3.inorder();
        System.out.println("");
        System.out.print("Postorder:  ");
        tree3.postorder();
        System.out.println("\n");
        
        if (tree1.sameTree(tree2))
            System.out.println("Tree 1 and Tree 2 are the same.");
        else
            System.out.println("Tree 1 and Tree 2 are different.");
        
        if (tree1.sameTree(tree3))
            System.out.println("Tree 1 and Tree 3 are the same.");
        else
            System.out.println("Tree 1 and Tree 3 are different.");
        
        if (tree2.sameTree(tree3))
            System.out.println("Tree 2 and Tree 3 are the same.");
        else
            System.out.println("Tree 2 and Tree 3 are different.");
    } //main
} //class


/*

run:
***TREE 1***

Enter an element to search:  66
66 is an element of the BST.

Enter an element to search:  73
73 is an element of the BST.

Enter an element to search:  35
35 is NOT an element in the BST.

Enter an element to search:  -1

Preorder:   67 55 43 39 34 40 48 53 59 66 87 73 81 77 84 91 92 95 
Inorder:    34 39 40 43 48 53 55 59 66 67 73 77 81 84 87 91 92 95 
Postorder:  34 40 39 53 48 43 66 59 55 77 84 81 73 95 92 91 87 67 

Path to 95:  [67, 87, 91, 92, 95]
Path to 77:  [67, 87, 73, 81, 77]
Path to 54:  []

Number of Leaves:  7

Left Subtree for 43:  [39, 34, 40]
Left Subtree for 59:  []
Left Subtree for 81:  [77]

Right Subtree for 55:  [59, 66]
Right Subtree for 67:  [87, 73, 81, 77, 84, 91, 92, 95]
Right Subtree for 84:  []

Enter an element to delete:  40
40 was deleted from the BST.

Enter an element to delete:  87
87 was deleted from the BST.

Enter an element to delete:  102
102 was never in the BST.

Enter an element to delete:  -1

Enter an element to insert:  70
70 was inserted into the BST.

Enter an element to insert:  25
25 was inserted into the BST.

Enter an element to insert:  91
91 was already in the BST.

Enter an element to insert:  -1


***TREE 2***

Enter an element to search:  85
85 is an element of the BST.

Enter an element to search:  44
44 is NOT an element in the BST.

Enter an element to search:  -1

Preorder:   45 33 20 19 1 111 85 46 52 49 71 89 
Inorder:    1 19 20 33 45 46 49 52 71 85 89 111 
Postorder:  1 19 20 33 49 71 52 46 89 85 111 45 

Path to 89:  [45, 111, 85, 89]
Path to  1:  [45, 33, 20, 19, 1]
Path to 88:  []

Number of Leaves:  4

Left Subtree for  33:  [20, 19, 1]
Left Subtree for  46:  []
Left Subtree for 111:  [85, 46, 52, 49, 71, 89]

Right Subtree for  33:  []
Right Subtree for  46:  [52, 49, 71]
Right Subtree for 111:  []

Enter an element to delete:  33
33 was deleted from the BST.

Enter an element to delete:  42
42 was never in the BST.

Enter an element to delete:  -1

Enter an element to insert:  144
144 was inserted into the BST.

Enter an element to insert:  45
45 was already in the BST.

Enter an element to insert:  -1


***TREE 3***
Preorder:   45 20 19 1 111 85 46 52 49 71 89 144 
Inorder:    1 19 20 45 46 49 52 71 85 89 111 144 
Postorder:  1 19 20 49 71 52 46 89 85 144 111 45 

Tree 1 and Tree 2 are different.
Tree 1 and Tree 3 are different.
Tree 2 and Tree 3 are the same.
BUILD SUCCESSFUL (total time: 1 minute 10 seconds)

*/
