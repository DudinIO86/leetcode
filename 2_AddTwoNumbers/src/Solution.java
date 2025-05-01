import java.math.BigInteger;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger n1=converter(l1);
        BigInteger n2=converter(l2);

        ListNode k=conList(n1.add(n2));
        // int k=n1+n2;

        // BigInteger s1=new BigInteger(n1.toString());
        // BigInteger s2=new BigInteger(n2);
        // BigInteger sum=s1.add(s2);

        return k;
    }

    public BigInteger converter (ListNode number){
        StringBuilder num=new StringBuilder();

        ListNode cur=number;
           while (cur!=null){

               num.append(cur.val);
               cur=cur.next;
           }

        BigInteger numbr=new BigInteger((num.reverse().toString()).toString());
        return numbr;
    }

    public ListNode conList(BigInteger number){
        String sum1=number.toString(0);
        char[] chars = sum1.toCharArray();
        int[] arr=new int[chars.length];

        for(int i=0;i<chars.length;i++){
            arr[i]=Character.getNumericValue(chars[i]);
        }

        ListNode node1=new ListNode(arr[chars.length-1]);
        ListNode nextNode;
        nextNode=node1;
        
        for (int j = 1; j <arr.length; j++) {

            ListNode node;
            node = new ListNode(arr[arr.length-1-j]);
            nextNode.next=node;
            nextNode=nextNode.next;
 
         }

        return node1;
    }
}

