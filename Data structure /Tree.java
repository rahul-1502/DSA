public class Tree {
    private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data = data;
        }
    }
    public void createTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = second;
        first.right = third;
        second.left = four;
        second.right = fifth;
    }

    // Preorder Traversal = Root->Left->Right
    // Recursive Approach
    public void preOrder(TreeNode root){
        if(root == null) return;
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Iterative Approach
    public void iterativePreOrder(){
        if(root == null) return;
        Stack<TreeNode> new Stack<>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode temp = stack.pop();
            System.out.println(temp.data);
            if(temp.right!=null) stack.push(temp.right);
            if(temp.left!=null) stack.push(temp.left);
        }
    }

    // Inorder Traversal = Left->Root->Right
    // Recursive Approach
    public void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

    // Iterative Approach
    public void intrativeInorder(){
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp = temp.left;
            }else{
                temp = Stack.pop();
                System.out.println(temp.data + " ");
                temp = temp.right;
            }
        }
    }
    // PostOrder Traversal => Left->Right->Root
    // Recursive Approach
    public void postOrder(TreeNode root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");
    }
    public void iterativePostOrder(){
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while (current!=null || !stack.isEmpty()){
            if(current!=null){
                stack.push(current);
                current = current.left;
            }
            else{
                TreeNode temp = Stack.peek().right;
                if(temp==null){
                    temp = stack.poll();
                    System.out.println(temp.data + " ");
                    while (!stack.isEmpty() && temp == stack.peek().right){
                        temp = stack.poll();
                        System.out.println(temp.data + " ");
                    }
                }
                else{
                    current = temp;
                }
            }
        }
    }

    // Level Order Traversal
    public void levelTraversal(){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.println(temp.data + " ");
            if(temp.left!=null) queue.offer(temp.left);
            if (temp.right) queue.offer(temp.right);
        }
    }

    // Max Value in tree
    public int maxValue(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;
        int result = root.data;
        int left = maxValue(root.left);
        int right = maxValue(root.right);
        if(left>right) result = left;
        if(right>left) result = right;
        return result;
    }
    
}
