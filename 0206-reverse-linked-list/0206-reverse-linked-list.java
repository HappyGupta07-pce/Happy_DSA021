class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        int[] st = new int[10000];
        int top = 0;
        ListNode temp = head;
        while (temp != null) {
            st[top++] = temp.val;
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            temp.val = st[--top];
            temp = temp.next;
        }
        return head;
    }
}