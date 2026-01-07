package linkedList;

public class Cycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

        public int lengthCycle(ListNode head) {

            ListNode slow = head;
            ListNode fast = head;
            int lenght =0;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    ListNode temp = slow;
                    do {
                        temp = temp.next;
                        lenght++;
                    }while (temp != slow);

                }
            }
            return lenght;
        }

    public ListNode detectCycle(ListNode head) {

        if (head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        // No cycle
        if (fast == null || fast.next == null) {
            return null;
        }

        // Step 2: Find cycle start
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow; // cycle start
    }

    public boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do {
            slow = findSquareDigits(n);
            fast = findSquareDigits(findSquareDigits(n));
        }while( slow != fast);

        if(slow == 1){
            return true;
        }
        return false;
    }

    private int findSquareDigits(int num){
        int ans =0;
        while(num >0){
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }

    public ListNode middleNode(ListNode head){
        ListNode s = head;
        ListNode f = head;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public void reverse(ListNode head){
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        head = prev;
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
