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
		* @desc:dequeue elements in queue
		* @params:none
		* @return:none
		*/
	//UC 2
		void dequeue() {
			if(head==null && rear==null) {
				System.out.println("EMPTY");
			}
			else if(head == rear) {
				System.out.println(head.data+" is popped");
				head=rear=null;
			}
			else {
				 System.out.println(head.data+" is popped");
				head=head.next;
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
