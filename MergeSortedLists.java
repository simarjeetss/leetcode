public class MergeSortedLists {
    public static void main(String[] args) {

    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode res = new ListNode(-1);
        ListNode temp = res;
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        while(head1 != null && head2 != null){
            if(head1.val > head2.val){
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            else{
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return res.next;
    }
}
