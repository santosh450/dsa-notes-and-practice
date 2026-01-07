package linkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void display (){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void insertEnd(int val){
        if(tail == null){
            insertFirst(val);
        } else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
        }
    }

    // insert using recursion

    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index--, node.next);
        return node;

    }

    public void insertAtIndex(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertEnd(val);
            return;
        }

        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return val;
    }

    public int deleteEnd(){
        if(size <=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail =  secondLast;
        tail.next = null;
        return val;

    }

    public int delete (int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteEnd();
        }

        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }

    public Node find(int val){
        Node node = head;
        while(node != null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node = head;
        for(int i=0; i< index; i++){
            node = node.next;
        }
        return node;
    }

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

    public void merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();

        while(f != null && s != null){
            if(f.value < s.value){
                ans.insertEnd(f.value);
                f = f.next;
            }else {
                ans.insertEnd(s.value);
                s = s.next;
            }
        }

        while (f != null){
            ans.insertEnd(f.value);
            f = f.next;
        }
        while (s != null){
            ans.insertEnd(s.value);
            s = s.next;
        }
    }

    public void reverseRecursion(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverseRecursion(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }



}
