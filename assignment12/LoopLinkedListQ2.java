package in.ineuron.assignment12;

public class LoopLinkedListQ2 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

	public static boolean hasLoop(ListNode head) {
		if (head == null || head.next == null) {
			return false; // If the list is empty or has only 1 node, there can be no loop
		}

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true; // If the slow pointer meets the fast pointer, there is a loop
			}
		}

		return false; // If the fast pointer reaches the end of the list, there is no loop
	}

	public static void main(String[] args) {
		// Question 2
		ListNode head = new ListNode(1);
		head.next = new ListNode(3);
		head.next.next = new ListNode(4);
		head.next.next.next = head.next; // Connect the last node to the second node

		boolean hasLoop = hasLoop(head);
		System.out.println("Has loop: " + hasLoop); // Output: Has loop: true

	}

}
