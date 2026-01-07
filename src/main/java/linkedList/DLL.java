package linkedList;

public class DLL {

    private Node head;

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void display (){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.print("END");

        System.out.print("In Reverse");
        while(last != null){
            System.out.println(last.value +" -> ");
            last = last.prev;
        }
        System.out.print("START");
    }


    public void insertEnd(int val){
        Node node = new Node(val);
        Node last = node;

        node.next = null;

        if(head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;

    }

    public void insert(int after, int val){
        Node p = find(after);

        if(p == null){
            System.out.println("does not exists");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }

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
}

