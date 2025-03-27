package com.javaproject;

public class LinkedList {
	
	
	Node head;
	public void add(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			head = newNode;
		}else {
			Node current = head;
			while (current.next!= null) {
				current.next= newNode;
			}
			current.next=newNode;
		}
	}
	public void printList() {
		Node current= head;
		while (current!=null) {
			System.out.print(current.data +"");
			current=current.next;
		}
		System.out.println();
	}
	
	
	public void reverse() {
		Node previous= null;
		Node current = head;
		Node next= null;
		while (current !=null) {
			next= current.next;
			current.next= previous;
			previous= current;
			current= next;
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		System.out.println("Orignal Linked List:");
		list.printList();
		//list.reverse();
		System.out.println("Reverese Linked List:");
		list.printList();
	}
	
}