import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        // ListNode l12 = new ListNode(4);
        // ListNode l123 = new ListNode(9);

        // l1.next = l12;
        // l12.next = l123;

        ListNode l2 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l223 = new ListNode(4);
        ListNode l224 = new ListNode(9);

        l2.next = l22;
        l22.next = l223;
        l223.next = l224;

        Solution q=new Solution();

        ListNode w=q.addTwoNumbers(l1, l2);

        
        ListNode cur=w;
           while (cur!=null){

              System.out.println(cur.val);
              cur=cur.next;
           }
    // System.out.println(w);

    };
    

}
