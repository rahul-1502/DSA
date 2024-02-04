public class SinglyLinkedList {
    // Defining
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        sll.head = first;
        first.next = second;
        second.next = third;
        System.out.println("Linked List");
        System.out.println(sll.length());
        sll.display();
        sll.insertFirst(5);
        sll.display();
        sll.insertAtEnd(40);
        sll.display();
        sll.insert(2,7);
        sll.insert(3,8);
        sll.insert(4,9);
        sll.display();
        sll.deleteFirst();
        sll.display();
        sll.deleteLast();
        sll.display();
        sll.delete(2);
        sll.display();

    }
    // Displaying LinkedList
    public void display(){
        ListNode current = head;
        while(current!=null){
            // Values in LinkedList
            System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.println("null");

    }
    // Finding Length
    public int length(){
        if(head==null) return 0;
        int count = 0;
        ListNode current = head;
        while (current!=null){
            current=current.next;
            count++;
        }
        return count;
    }

    // Inserting at beginning
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
    // Insertion at end
    public void insertAtEnd(int value){
        ListNode newNode = new ListNode(value);
        if(head==null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next = newNode;
    }
    // Insert node at a given position
    public void insert(int position,int value){
        ListNode node = new ListNode(value);
        if(position==1){
            node.next = head;
            head = node;
        }
        else{
            ListNode prev = head;
            int count = 1;
            while(count<position-1){
                prev = prev.next;
                count++;
            }
            ListNode current = prev.next;
            prev.next = node;
            node.next = current;
        }
    }

    // Delete first Node
    public void deleteFirst(){
        if(head==null){
            return ;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
    }

    // Delete Last Node
    public void deleteLast(){
        if(head==null || head.next == null){
            return;
        }
        ListNode current = head;
        ListNode prev = null;
        while (current.next!=null){
            prev = current;
            current = current.next;
        }
        prev.next = null;

    }
    // Delete Node at a given Position
    public void delete(int position){
        if(position==1)  head = head.next;
        else{
            ListNode prev = head;
            int count = 1;
            while(count < position-1){
                prev = prev.next;
                count++;
            }
            ListNode current = prev.next;
            prev.next = current.next;
        }
    }
}