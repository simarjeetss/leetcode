public class ReverseLinkedList {
    public static void main(String[] args) {

    }
    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp;

        while(curr != null){                            //   null  1 -> 2 -> 3 -> 4 -> 5 -> null
            temp = curr.next;                           //         p    c    t
            curr.next = prev;                           //              p    c    t

            prev = curr;
            curr = temp;
        }
        return prev;
    }

}
