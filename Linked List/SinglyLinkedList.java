public class SinglyLinkedList {
    // Defining
    private static ListNode head;
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
        System.out.println(sll.find(20));
        //sll.reverse(head);
        sll.getMiddle();
        sll.insert(2,9);
        sll.insert(5,20);
        sll.display();
        sll.removeDeplicate();
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
    // Search element in SinglyLinkedList
    public  boolean find(int key){
        if(head==null){
            return false;
        }
        ListNode current = head;
        while(current!=null){
            if(current.data==key){
                return true;
            }
            current = current.next;
        }
        return false;

    }
    // Reverse SinglyLikedList
    public ListNode reverse(ListNode head){
        if(head == null) return head;
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        // Displaying after reverse
        ListNode Node = prev;
        while(Node!=null){
            // Values in LinkedList
            System.out.print(Node.data+"->");
            Node = Node.next;
        }
        System.out.println("null");
        return  prev;
    }
    // Middle element in LinkedList
    public ListNode getMiddle(){
         if(head == null) return null;
         ListNode slowPtr = head;
         ListNode fastPtr = head;
         while(fastPtr!=null && fastPtr.next!=null){
             slowPtr = slowPtr.next;
             fastPtr = fastPtr.next.next;
         }
         System.out.println(slowPtr.data);
         return slowPtr;

    }
    // Find nth element from end
    public ListNode getnthFromEnd(int n){
         if(head == null){
             return null;
         }
         if(n<=0){
             System.out.println("Invalid Input");
             return null;
         }
         ListNode mainPtr = head;
         ListNode refPtr = head;
         int count = 0;
         while (count<n){
             if(refPtr==null){
                 return null;
             }
             refPtr = refPtr.next;
             count++;

         }
         while (refPtr!=null){
             refPtr=refPtr.next;
             mainPtr = mainPtr.next;
         }

         return mainPtr;
    }
    // Remove duplicate from sorted LinkedList
    public void removeDeplicate(){
         if(head==null) return;
         ListNode current = head;
         while(current!=null && current.next!=null){
             if(current.data==current.next.data){
                 current.next = current.next.next;
             }
             else{
                 current = current.next;
             }
         }
    }

    // Detect loop in singly linked list
    public boolean isLoop(){
         ListNode fastPtr = head;
         ListNode slowPtr = head;
         while (fastPtr!=null && fastPtr.next!=null){
             fastPtr = fastPtr.next.next;
             slowPtr = slowPtr.next;
             if(slowPtr == fastPtr) return true;
         }
         return false;
    }
}