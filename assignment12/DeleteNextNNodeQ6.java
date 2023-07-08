package in.ineuron.assignment12;

public class DeleteNextNNodeQ6 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}

	public static ListNode retainAndDelete(ListNode head, int M, int N) {
		if (head == null) {
			return null;
		}

		ListNode curr = head;
		ListNode prev = null;

		while (curr != null) {

			for (int i = 0; i < M && curr != null; i++) {
				prev = curr;
				curr = curr.next;
			}

			for (int i = 0; i < N && curr != null; i++) {
				curr = curr.next;
			}

			prev.next = curr;
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
		// Question 6
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(2);
		head1.next.next = new ListNode(3);
		head1.next.next.next = new ListNode(4);
		head1.next.next.next.next = new ListNode(5);
		head1.next.next.next.next.next = new ListNode(6);
		head1.next.next.next.next.next.next = new ListNode(7);
		head1.next.next.next.next.next.next.next = new ListNode(8);

		int M1 = 2;
		int N1 = 2;
		System.out.print("Original Linked List: ");
		printList(head1); // Output: Original Linked List: 1 2 3 4 5 6 7 8
		head1 = retainAndDelete(head1, M1, N1);
		System.out.print("Modified Linked List: ");
		printList(head1); // Output: Modified Linked List: 1 2 5 6

		ListNode head2 = new ListNode(1);
		head2.next = new ListNode(2);
		head2.next.next = new ListNode(3);
		head2.next.next.next = new ListNode(4);
		head2.next.next.next.next = new ListNode(5);
		head2.next.next.next.next.next = new ListNode(6);
		head2.next.next.next.next.next.next = new ListNode(7);
		head2.next.next.next.next.next.next.next = new ListNode(8);
		head2.next.next.next.next.next.next.next.next = new ListNode(9);
		head2.next.next.next.next.next.next.next.next.next = new ListNode(10);

		int M2 = 3;
		int N2 = 2;
		System.out.print("Original Linked List: ");
		printList(head2); // Output: Original Linked List: 1 2 3 4 5 6 7 8 9 10
		head2 = retainAndDelete(head2, M2, N2);
		System.out.print("Modified Linked List: ");
		printList(head2); // Output: Modified Linked List: 1 2 3 6 7 8

		ListNode head3 = new ListNode(1);
		head3.next = new ListNode(2);
		head3.next.next = new ListNode(3);
		head3.next.next.next = new ListNode(4);
		head3.next.next.next.next = new ListNode(5);
		head3.next.next.next.next.next = new ListNode(6);
		head3.next.next.next.next.next.next = new ListNode(7);
		head3.next.next.next.next.next.next.next = new ListNode(8);
		head3.next.next.next.next.next.next.next.next = new ListNode(9);
		head3.next.next.next.next.next.next.next.next.next = new ListNode(10);

		int M3 = 1;
		int N3 = 1;
		System.out.print("Original Linked List: ");
		printList(head3); // Output: Original Linked List: 1 2 3 4 5 6 7 8 9 10
		head3 = retainAndDelete(head3, M3, N3);
		System.out.print("Modified Linked List: ");
		printList(head3); // Output: Modified Linked List: 1 3 5 7 9

	}

}
