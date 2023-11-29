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
//UC 1
	void push(int ele) {
		Node newNode =new Node(ele);
		if(head ==null) {
			head=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
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
