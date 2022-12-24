package com;

public class Question1 {

	public static void main(String[] args) {
		/* for:
		 * What is the use of for of loop ?
           A "For" Loop is used to repeat a specific block of code a known number of times.
           here we know the starting and ending Values
           syntax:
           for(initialization;condition;Updation){
               instructions...
           example print the number from 1 to 10
		 */

		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}


		/*
		 * while:
		 * while loop is used to iterate a part of the program 
		 * repeatedly until the specified Boolean condition is true.
		 * here we know the starting value and we don't know the ending values
		 * syntax
		 *   while (condition){    
              //code to be executed   
              Increment / decrement statement  
          example:print the number from 1 to 10

		 */
		int i=1;  
		while(i<=10){  
			System.out.println(i);  
			i++;  
		}  

		/*
		 * if statement
		 * if statement tests the condition. It executes the if block if condition is true.
		 * */
		//defining an 'age' variable  
		int age=20;  
		//checking the age  
		if(age>18){  
			System.out.print("Age is greater than 18");  
		}  


		/*
		 * if-else statement also tests the condition. 
		 * It executes the if block if condition is true otherwise else block is executed.
		 * 
		 * syntax:
		 * if(condition){  
               //code if condition is true  
               }else{  
                //code if condition is false  
                  }  
		 * 
		 */
		//defining a variable  
		int number=13;  
		//Check if the number is divisible by 2 or not  
		if(number%2==0){  
			System.out.println("even number");  
		}else{  
			System.out.println("odd number");  
		}  

		/*
		 * switch statement executes one statement from multiple conditions. 
		 * It is like if-else-if ladder statement.
		 * The switch statement works with byte, short, int, long, enum types,
		 * String and some wrapper types like Byte, Short, Int, and Long.
		 * switch(expression){    
                 case value1:    
                      		//code to be executed;    
                 break;  //optional  
                 case value2:    
              			//code to be executed;    
              		break;  //optional  
             		......    

             		default:     
               		code to be executed if all cases are not matched;  
             	}  
		 */
		int n=20;  
		//Switch expression  
		switch(n){  
		//Case statements  
		case 10: System.out.println("10");  
		break;  
		case 20: System.out.println("20");  
		break;  
		case 30: System.out.println("30");  
		break;  
		//Default case statement  
		default:System.out.println("Not in 10, 20 or 30");  
		}  


		/*
		 * Recursion
		 * Recursion in any programming  is a process in which a method calls itself continuously.
		 *  A method in program that calls itself is called recursive method.
		 *  
		 *  returntype methodname(){  
					//code to be executed  
				methodname();//calling same method  
				}  
		 */
		//             static int factorial(int n){      
		//                 if (n == 1)      
		//                   return 1;      
		//                 else      
		//                   return(n * factorial(n-1));      
		//           }  

		//Binary Search tree.
		/* A binary search tree follows some order to arrange the elements. 
		 * In a Binary search tree, the value of left node must be smaller than the parent node, 
		 * and the value of right node must be greater than the parent node. 
		 * This rule is applied recursively to the left and right subtrees of the root.
		 * 
		 */
		
		//		Algorithm to search an element in Binary search tree
		//		Search (root, item)  
		//		Step 1 - if (item = root → data) or (root = NULL)  
		//		return root  
		//		else if (item < root → data)  
		//		return Search(root → left, item)  
		//		else  
		//		return Search(root → right, item)  
		//		END if  
		//		Step 2 - END 
		
		
	//Implementation of Binary search tree.	
		//		#include <iostream>  
		//		using namespace std;  
		//		struct Node {  
		//		    int data;  
		//		    Node *left;  
		//		    Node *right;  
		//		};  
		//		Node* create(int item)  
		//		{  
		//		    Node* node = new Node;  
		//		    node->data = item;  
		//		    node->left = node->right = NULL;  
		//		    return node;  
		//		}  
		//		/*Inorder traversal of the tree formed*/  
		//		void inorder(Node *root)  
		//		{  
		//		    if (root == NULL)  
		//		        return;  
		//		    inorder(root->left); //traverse left subtree  
		//		    cout<< root->data << "   "; //traverse root node  
		//		    inorder(root->right); //traverse right subtree  
		//		}  
		//		Node* findMinimum(Node* cur) /*To find the inorder successor*/  
		//		{  
		//		    while(cur->left != NULL) {  
		//		        cur = cur->left;  
		//		    }  
		//		    return cur;  
		//		}  
		//		Node* insertion(Node* root, int item) /*Insert a node*/  
		//		{  
		//		    if (root == NULL)  
		//		        return create(item); /*return new node if tree is empty*/  
		//		    if (item < root->data)  
		//		        root->left = insertion(root->left, item);  
		//		    else  
		//		        root->right = insertion(root->right, item);  
		//		    return root;  
		//		}  
		//		void search(Node* &cur, int item, Node* &parent)  
		//		{  
		//		    while (cur != NULL && cur->data != item)  
		//		    {  
		//		        parent = cur;  
		//		        if (item < cur->data)  
		//		            cur = cur->left;  
		//		        else  
		//		            cur = cur->right;  
		//		    }  
		//		}  
		//		void deletion(Node*& root, int item) /*function to delete a node*/  
		//		{  
		//		    Node* parent = NULL;  
		//		    Node* cur = root;  
		//		    search(cur, item, parent); /*find the node to be deleted*/  
		//		    if (cur == NULL)  
		//		        return;  
		//		    if (cur->left == NULL && cur->right == NULL) /*When node has no children*/  
		//		    {  
		//		        if (cur != root)  
		//		        {  
		//		            if (parent->left == cur)  
		//		                parent->left = NULL;  
		//		            else  
		//		                parent->right = NULL;  
		//		        }  
		//		        else  
		//		            root = NULL;  
		//		        free(cur);       
		//		    }  
		//		    else if (cur->left && cur->right)  
		//		    {  
		//		        Node* succ  = findMinimum(cur->right);  
		//		        int val = succ->data;  
		//		        deletion(root, succ->data);  
		//		        cur->data = val;  
		//		    }  
		//		    else  
		//		    {  
		//		        Node* child = (cur->left)? cur->left: cur->right;  
		//		        if (cur != root)  
		//		        {  
		//		            if (cur == parent->left)  
		//		                parent->left = child;  
		//		            else  
		//		                parent->right = child;  
		//		        }  
		//		        else  
		//		            root = child;  
		//		        free(cur);  
		//		    }  
		//		}  
		//		int main()  
		//		{  
		//		  Node* root = NULL;  
		//		  root = insertion(root, 45);  
		//		  root = insertion(root, 30);  
		//		  root = insertion(root, 50);  
		//		  root = insertion(root, 25);  
		//		  root = insertion(root, 35);  
		//		  root = insertion(root, 45);  
		//		  root = insertion(root, 60);  
		//		  root = insertion(root, 4);  
		//		  printf("The inorder traversal of the given binary tree is - \n");  
		//		  inorder(root);  
		//		  deletion(root, 25);  
		//		  printf("\nAfter deleting node 25, the inorder traversal of the given binary tree is - \n");  
		//		  inorder(root);   
		//		  insertion(root, 2);  
		//		  printf("\nAfter inserting node 2, the inorder traversal of the given binary tree is - \n");  
		//		  inorder(root);  
		//		  return 0;  
		//		}  
		
		
		//Java Closure 
		
		/*
		 * A closure is a function (or method) that refers to free variables in their lexical context. The function is a block of code with parameters.
		 * It may produce a result value (return type).
		 * A free variable is an identifier used but not defined by the closure. 
		 *It can be used without being a method or a class.
		 */
		//Example
		
		//		public interface Operation   
		//		{  
		//		void operate(int n);  
		//		}  
		//		 ClosureExample.java  
		//		package com.javatpoint;  
		//		public class ClosureExample  
		//		{  
		//		public static void main(String args[])  
		//		{  
		//		int x=20;  
		//		int y=90;  
		//		//the method parses two parameters i.e. x and the operate() method of the Operation interface  
		//		//implementation of closure in lambda expression  
		//		doSum(x, new Operation()  
		//		{  
		//		//overrides the operate() method      
		//		@Override  
		//		public void operate(int n)  
		//		{     
		//		//prints the result   
		//		System.out.println("Sum is: "+(n+y));  
		//		}  
		//		});  
		//		}  
		//		private static void doSum(int i, Operation op)  
		//		{  
		//		op.operate(i);  
		//		}  

	}

}
