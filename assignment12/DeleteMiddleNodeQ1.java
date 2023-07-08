package in.ineuron.assignment12;

public class DeleteMiddleNodeQ1 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}

	public static ListNode deleteMiddle(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}

		ListNode slow = head;
		ListNode fast = head;
		ListNode prev = null;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			prev = slow;
			slow = slow.next;
		}

		if (prev != null) {
			prev.next = slow.next;
		} else {
			head = slow.next;
		}

		return head;
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
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		System.out.print("Original Linked List: ");
		printList(head); // Output: Original Linked List: 1 2 3 4 5

		head = deleteMiddle(head);

		System.out.print("Modified Linked List: ");
		printList(head); // Output: Modified Linked List: 1 2 4 5

	}

}
