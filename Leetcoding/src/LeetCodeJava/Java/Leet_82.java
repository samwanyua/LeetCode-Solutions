

// import Easy Problems.ListNode;

public class Leet_82 {
    
//   Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode previous = dummy, current = head;

        while(current != null){
            if(current.next != null && current.val == current.next.val){
                while(current.next != null && current.val == current.next.val){
                    current = current.next;
                }
                previous.next = current.next;
            }
            else{
                previous = current;
            }
            current = current.next;
        }
        return dummy.next;
    }
}
}
