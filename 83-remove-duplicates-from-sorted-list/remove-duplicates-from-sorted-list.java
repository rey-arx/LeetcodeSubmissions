/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode head1 = head;
        while(head!=null){
            if(head.next ==null) break;
            if(head.val == head.next.val){
                head.next = head.next.next;
            }
            else head = head.next;
        }
        return head1;
    }
}