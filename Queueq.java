package com.bridgelabz.main.queue;


class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}

 class Queueq{
	Node head;
	Node rear;
	 Queueq(){
		 head=null;
		 rear=null;
	 }
		/*
		* @desc:enqueue elements in stack
		* @params:Integer data
		* @return:none
		*/	 
//UC 1
	void enqueue(int ele) {
		Node newNode=new Node(ele);
		if(head==null && rear==null) {
			head=rear=newNode;
		}
		else {
			rear.next=newNode;
			rear=newNode;
		}
	}

	
	/*
	* @desc:display elements in queue
	* @params:none
	* @return:none
	*/
	 void display() {
		 Node curr=head;
		 while(curr.next !=null) {
			 System.out.print(curr.data+" -->");
			 curr=curr.next;
		 }
		 System.out.println(curr.data);
	 }
}
