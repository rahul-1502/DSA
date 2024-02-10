public class Stack {
    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node top;
    private int length;

    public Stack(){
        top = null;
        length = 0;
    }

    public int length() return length;
    public boolean isEmpty() return length == 0;

    public void push(int data){
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop(){
        if(isEmpty()) throw new EmptyStackException();

        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public int peek(){
        if(isEmpty()) throw new EmptyStackException();
        return top.data;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(20);
        stack.push(30);
        stack.push(10);
        stack.push(40);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
