class Nodes{
	int data;
	Node next;
	Nodes(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class MyLL {
	
	static void print(Node head) {
		while(head != null)
		{
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	
	static Node insertAtHead(Node head, int data)
	{
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
		return head;
	}
	
	static Node insertAtEnd(Node head, int data)
	{
		if(head == null) return new Node(data);
		Node temp = new Node(data);
//		temp.next = head;
		Node last = head;
		while(last.next != null) 
		{
			last = last.next;
		}
		last.next = temp;
		return head;
	}
	
	public static void main(String[] args) {
		Node head = new Node(5);
		Node second = new Node(6);
		head.next = second;
		Node third = new Node(7);
		second.next = third;
		Node fourth = new Node(8);
		third.next = fourth;
		Node fifth = new Node(9);
		fourth.next = fifth;
//		System.out.println(head.data);
//		System.out.println(head.next.data);
//		System.out.println(head.next.next.data);
//		System.out.println(head.next.next.next.data);
//		System.out.println(head.next.next.next.next.data);
		
		while(head != null)
		{
			System.out.println(head.data);
			head = head.next;
		}
		System.out.println(head);
		
		print(head);
		print(head);
		
		insertAtHead(head, 4);
		print(head);
		
		head = insertAtEnd(head, 10);
	}
}
