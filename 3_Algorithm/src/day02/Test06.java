package day02;

import util.Util;

public class Test06 {

	
	
	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList();
		
		for(int i : Util.generateRandomSequence(10, 10)) {
			ll.add(i);
		}
	}
	
}

class MyLinkedList {
	Node head = null;
	
	public void add(int i) {
		Node newNode = new Node(i);{
			if (head == null) {
				head = newNode;
			}else {
				Node cur = head;
				while(cur.next != null) {
					cur = cur.next;
				}
				cur.next = newNode;
			}
		}
	}
	
	public void print() {
		Node cur = head;
		while(cur != null) {
			System.out.printf("[%s] -> ", cur.val);
			cur = cur.next;
		}
	}
}

class Node{
	int val;
	Node next;
	Node(int val){
		this.val = val;
		next = null;
	}
}
