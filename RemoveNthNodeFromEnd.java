public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {

    }
    public int length(ListNode head, int n){
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int len = length(head, n);

        int size = len - n ;

        if(size == 0){
            head = head.next;
            return head;
        }

        while(size - 1 > 0){
            temp = temp.next;
            size--;
        }
        temp.next = temp.next.next;

        return head;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
