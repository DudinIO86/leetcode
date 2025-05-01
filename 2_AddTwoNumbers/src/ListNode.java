public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
    //    ListNode s3 = new ListNode(6);
    //    ListNode s2 = new ListNode(4);
    //    ListNode s = new ListNode(3);

    //    s.next=s2;
    //    s2.next=s3;

    //    ListNode cur=s;
    //    while (cur!=null){
    //        System.out.println(cur.val);
    //        cur=cur.next;
    //    }