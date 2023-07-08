package in.ineuron.assignment12;

public class RemoveLoopLLQ5 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

	public static void removeLoop(ListNode head) {
		if (head == null || head.next == null) {
			return; // If the list is empty or has only one node, there can be no loop
		}

		ListNode slow = head;
		ListNode fast = head;

		// Detect the loop using Floyd's Cycle Detection Algorithm
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				break; // If the slow pointer meets the fast pointer, there is a loop
			}
		}

		// If there is no loop, return
		if (slow != fast) {
			return;
		}

		// Move one pointer to the head of the list and another at the meeting point
		slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}

		// Break the loop by setting the next pointer of the last node to null
		fast.next = null;
	}

	public static void printList(ListNode head) {
		ListNode curr = head;
		while (curr != null) {
			System.out.print(curr.val + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Question 5
		ListNode head = new ListNode(1);
		head.next = new ListNode(3);
		head.next.next = new ListNode(4);
		head.next.next.next = head.next;

		System.out.print("Original Linked List: ");
		printList(head); // Output: 1 3 4 3 4 3 4...

		removeLoop(head);

		System.out.print("Linked List after removing loop: ");
		printList(head); // Output: 1 3 4

	}

}
