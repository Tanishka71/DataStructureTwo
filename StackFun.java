package com.bridgelabz.main.queue;

//class Node{
//	int data;
//	Node next;
//	Node(int data){
//		this.data=data;
//	}
//}

class StackFun{
	Node head;
	StackFun(){
		head=null;
	}
	
	
	/*
	* @desc:push elements in stack
	* @params:Integer data
	* @return:none
	*/

//UC 2
	void pop() {
	   if(head==null) {
		   System.out.println("Empty");
	   }
	   else {
		   System.out.println(head.data+" is popped");
           head=head.next;
	   }
	}
	
	/*
	* @desc:gives the top element
	* @params:Integer data
	* @return:none
	*/
	void peek() {
		   if(head==null) {
			   System.out.println("Empty");
		   }
		   else {
	           System.out.println("top element="+head.data);
		   }
		}
	
	/*
	* @desc:display all the elements
	* @params:Integer data
	* @return:none
	*/
	   void display() {
		   Node curr=head;
		   while(curr.next != null) {
			   System.out.print(curr.data+" --> ");
			   curr=curr.next;
		   }
		   System.out.println(curr.data);
	   }

}
