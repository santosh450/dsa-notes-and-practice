### Implementation

Single LL - [Implementation](src/main/java/linkedList/LL.java)  
Double LL - [Implementation](src/main/java/linkedList/DLL.java)  
Circular LL - [Implementation](src/main/java/linkedList/CLL.java)  

### Remove duplicates from sorted List

[LeetCode#83](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)  
[Solution](src/main/java/linkedList/LL.java)

```java
public void removeDuplicates() {
        Node temp = head;

        while (temp != null && temp.next != null) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next; // remove duplicate
                size--;
            } else {
                temp = temp.next; // move forward only if no duplicate
            }
        }
        tail = temp;
        tail.next = null;
    }
```

### Merge two sorted lists
[LeetCode#21](https://leetcode.com/problems/merge-two-sorted-lists/)  
[Solution](src/main/java/linkedList/LL.java)

```java
public Node mergeTwoLists(Node l1, Node l2) {

    Node dummy = new Node(-1); // dummy head
    Node tail = dummy;

    while (l1 != null && l2 != null) {
        if (l1.value <= l2.value) {
            tail.next = l1;
            l1 = l1.next;
        } else {
            tail.next = l2;
            l2 = l2.next;
        }
        tail = tail.next;
    }

    // attach remaining nodes
    if (l1 != null) {
        tail.next = l1;
    } else {
        tail.next = l2;
    }

    return dummy.next;
}
```

## Fast Slow Pointer - cycle detection

1. Has Cycle in linked list  
   [LeetCode#141](https://leetcode.com/problems/linked-list-cycle/)  
   [Solution](src/main/java/linkedList/Cycle.java)
```java
public boolean hasCycle(Node head) {
if (head == null) return false;

    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            return true;
        }
    }
    return false;
}
```
2. Find lenght of cycle

```java
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
```

### Cycle begins
[LeetCode#142](https://leetcode.com/problems/linked-list-cycle-ii/description/)  
[Solution](src/main/java/linkedList/Cycle.java)  
Let  
a = distance from head to cycle start  
b = distance from cycle start to meeting point  
c = remaining cycle length  
then a == c  
So:  
One pointer from head  
One pointer from meeting point  
Both move 1 step → meet at cycle start  
```java
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
```

### Happy Number

[LeetCode#202](https://leetcode.com/problems/happy-number/description/)  
[Solution](src/main/java/linkedList/Cycle.java)  

- The sequence of numbers will either:
    - Reach `1`, OR
    - Enter a **cycle**
- This is a **cycle detection problem**
```java
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
```

### Middle of LL

[LeetCode#876](https://leetcode.com/problems/middle-of-the-linked-list/description/)  
[Solution](src/main/java/linkedList/Cycle.java)  

 When fast reaches the end, slow is at the **middle**.
```java
public ListNode middleNode(ListNode head){
    ListNode s = head;
    ListNode f = head;
    while(f != null && f.next != null){
        s = s.next;
        f = f.next.next;
    }
    return s;
}
```
# Sorting

## Reverse LinkedList
```java
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
```

## Reverse Between
[LeetCode#92](https://leetcode.com/problems/reverse-linked-list-ii/description/)  

## Palindrome
[LeetCode#234](https://leetcode.com/problems/palindrome-linked-list/description/)

- Use slow & fast pointers to find the middle
- Reverse second half of the list
- Compare first half and reversed second half
- (Optional) Restore the list

## Recorder List
[LeetCode#143](https://leetcode.com/problems/reorder-list/description/)
- Find the middle of the list (slow & fast pointer)
- Reverse the second half
- Merge two halves alternately

## Reverse Nodes in k-Group
[LeetCode#25](https://leetcode.com/problems/reverse-nodes-in-k-group/description/)

## Rotate List
[LeetCode#61](https://leetcode.com/problems/rotate-list/description/)
- Find length of the list
- Make list circular (tail → head)
- Find new tail
- Break the circle