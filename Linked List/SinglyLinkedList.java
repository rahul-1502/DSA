public class SinglyLinkedList {
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

    }
    public void display(){
        ListNode current = head;
        while(current!=null){
            // Values in LinkedList
            System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.println("null");

    }
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
}