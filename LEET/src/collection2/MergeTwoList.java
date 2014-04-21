package collection2;

public class MergeTwoList {


	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 if(l1==null&&l2==null) return null;
	        ListNode head = null;
	        if(l1==null||(l2!=null&&l1.val>l2.val)){
	        	head = l2;
	        	l2 = l2.next;
	        } else if(l2==null||(l1!=null&&l1.val<=l2.val)) {
	        	head = l1;
	        	l1 = l1.next;
	        }
	        ListNode head2 = head;
	        while(l1!=null&&l2!=null) {
	        	if(l1.val>l2.val){
	        		head.next = l2;
	        		head=head.next;
	        		l2=l2.next;
	        	} else {
	        		head.next = l1;
	        		head=head.next;
	        		l1= l1.next;
	        	}
	        }
	        
	        while(l1!=null){
	        	head.next = l1;
	        	head=head.next;
	        	l1=l1.next;
	        }
	        while(l2!=null){
	        	head.next = l2;
	        	head=head.next;
	        	l2=l2.next;
	        }
	        head.next = null;
	        return head2;
	    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode h1 = new ListNode(2);
		ListNode h2 = new ListNode(1);
		ListNode re = mergeTwoLists(h1,h2);
		System.out.println(re.val);
		System.out.println(re.next.val);
	}

}



class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
