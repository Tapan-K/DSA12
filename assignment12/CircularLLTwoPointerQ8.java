package in.ineuron.assignment12;

public class CircularLLTwoPointerQ8 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

	public static boolean isCircular(ListNode head) {
		if (head == null) {
			return false; // An empty list cannot be circular
		}

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		// Question 8
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(2);
		head1.next.next = new ListNode(3);
		head1.next.next.next = new ListNode(4);
		head1.next.next.next.next = head1; // Connect the last node to the head

		boolean isCircular1 = isCircular(head1);
		System.out.println("Is the linked list circular? " + isCircular1); // Output: Is the linked list circular? true

		ListNode head2 = new ListNode(1);
		head2.next = new ListNode(2);
		head2.next.next = new ListNode(3);
		head2.next.next.next = new ListNode(4);

		boolean isCircular2 = isCircular(head2);
		System.out.println("Is the linked list circular? " + isCircular2); // Output: Is the linked list circular? false

	}

}
