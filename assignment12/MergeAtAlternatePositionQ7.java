package in.ineuron.assignment12;

public class MergeAtAlternatePositionQ7 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}

	public static void mergeLists(ListNode first, ListNode second) {
		while (first != null && second != null) {
			ListNode firstNext = first.next;
			ListNode secondNext = second.next;

			first.next = second;
			second.next = firstNext;

			first = firstNext;
			second = secondNext;
		}
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
		// Question 7
		ListNode first1 = new ListNode(5);
		first1.next = new ListNode(7);
		first1.next.next = new ListNode(17);
		first1.next.next.next = new ListNode(13);
		first1.next.next.next.next = new ListNode(11);

		ListNode second1 = new ListNode(12);
		second1.next = new ListNode(10);
		second1.next.next = new ListNode(2);
		second1.next.next.next = new ListNode(4);
		second1.next.next.next.next = new ListNode(6);

		System.out.print("First List: ");
		printList(first1); // Output: First List: 5 7 17 13 11
		System.out.print("Second List: ");
		printList(second1); // Output: Second List: 12 10 2 4 6

		mergeLists(first1, second1);

		System.out.print("Modified First List: ");
		printList(first1); // Output: Modified First List: 5 12 7 10 17 2 13 4 11 6
		System.out.print("Modified Second List: ");
		printList(second1); // Output: Modified Second List:

	}

}
