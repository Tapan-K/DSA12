package in.ineuron.assignment12;

public class PalindromLinkedlistQ4 {
	public static class ListNode {
		char val;
		ListNode next;

		ListNode(char val) {
			this.val = val;
		}
	}

	public static boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true; // An empty list or a list with only one node is considered a palindrome
		}

		ListNode firstHalfEnd = findFirstHalfEnd(head);
		ListNode secondHalfStart = reverseLinkedList(firstHalfEnd.next);

		ListNode p1 = head;
		ListNode p2 = secondHalfStart;

		while (p1 != null && p2 != null) {
			if (p1.val != p2.val) {
				return false; // If any characters don't match, it's not a palindrome
			}
			p1 = p1.next;
			p2 = p2.next;
		}

		return true;
	}

	private static ListNode findFirstHalfEnd(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	private static ListNode reverseLinkedList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;

		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;
	}

	public static void main(String[] args) {
		// Question 4

		ListNode head1 = new ListNode('R');
		head1.next = new ListNode('A');
		head1.next.next = new ListNode('D');
		head1.next.next.next = new ListNode('A');
		head1.next.next.next.next = new ListNode('R');

		boolean isPalindrome1 = isPalindrome(head1);
		System.out.println("Is the linked list a palindrome? " + isPalindrome1);

		ListNode head2 = new ListNode('C');
		head2.next = new ListNode('O');
		head2.next.next = new ListNode('D');
		head2.next.next.next = new ListNode('E');

		boolean isPalindrome2 = isPalindrome(head2);
		System.out.println("Is the linked list a palindrome? " + isPalindrome2);

	}

}
