// Java program to detect loop in a linked list
class LinkedList
{
	Node head; // head of list

	/* Linked list Node*/
	class Node
	{
		int data;
		Node next;
		Node(int d) {data = d; next = null; }
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	int detectLoop()
	{
		Node slow_p = head, fast_p = head;
	
		while (slow_p != null && fast_p != null && fast_p.next != null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
				System.out.println(slow_p.data + " "+ fast_p.data);
			if (slow_p == fast_p) {
				System.out.println("Found loop");
				return 1;
			}
		}
		return 0;
	}

	/* Drier program to test above functions */
	public static void main(String args[])
	{
		LinkedList llist = new LinkedList();
		
	    llist.push(2);
		llist.push(4);
		llist.push(6);
		llist.push(8);
		llist.push(15);
		llist.push(100);
		llist.push(900);
		/*Create loop for testing */
		llist.head.next.next.next.next.next.next.next = llist.head.next.next.next;

		llist.detectLoop();
	}
} 
/* This code is contributed by Rajat Mishra. */
