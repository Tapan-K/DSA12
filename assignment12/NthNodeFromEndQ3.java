package in.ineuron.assignment12;

public class NthNodeFromEndQ3 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}

	public static ListNode findNthFromEnd(ListNode head, int N) {
		ListNode first = head;
		ListNode second = head;

		// Move the first pointer N positions ahead of the second pointer
		for (int i = 0; i < N; i++) {
			if (first == null) {
				return null; // If N is greater than the length of the list, return null
			}
			first = first.next;
		}

		// Move both pointers until the first pointer reaches the end of the list
		while (first != null) {
			first = first.next;
			second = second.next;
		}

		return second;
	}

	public static void main(String[] args) {
		// Question 3
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next = new ListNode(7);
		head.next.next.next.next.next.next.next = new ListNode(8);
		head.next.next.next.next.next.next.next.next = new ListNode(9);

		int N = 2;
		ListNode nthNode = findNthFromEnd(head, N);
		if (nthNode != null) {
			System.out.println("Nth node from the end: " + nthNode.val); // Output: Nth node from the end: 8
		} else {
			System.out.println("Invalid input");
		}

	}

}
