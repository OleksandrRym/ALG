package TwoPointers;


import Other.ListNode;

public class PalindromeLinkedList234 {
   /* public boolean isPalindrome(ListNode head) {
        boolean answer = true;

        List<Integer> value = new ArrayList<>();

        while (head != null) {
            value.add(head.val);
            head = head.next;
            System.out.println(head);
        }

        System.out.println(value.toString());
        int l=0 , r = value.size()-1;

        while (l != value.size() /2){
            if (value.get(l) != value.get(r)){
                answer = false;
                break;
            }
            l++;
            r--;
        }

        return answer;
    }*/

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = reverse(slow);
        ListNode firstHalf = head;

        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) return false;

            secondHalf = secondHalf.next;
            firstHalf = firstHalf.next;
        }

        return true;
    }

    ListNode reverse(ListNode slow) {
        ListNode curr =slow;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }


    public static void main(String[] args) {

        ListNode l4 = new ListNode(1);
        ListNode l3 = new ListNode(2, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        PalindromeLinkedList234 palindromeLinkedList234 = new PalindromeLinkedList234();
        boolean palindrome = palindromeLinkedList234.isPalindrome(l1);
        System.out.println(palindrome);

    }
}

