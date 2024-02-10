public class BinarySearchTree {
    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }
    public TreeNode root;

    public TreeNode insert(TreeNode root,int value){
        if(root == null){
            root =  new TreeNode(value);
            return root;
        }
        if(value<root.data){
            root.left = insert(root.left,value);
        }
        else{
            root.right = insert(root.right,value);
        }
        return root;
    }
    public  TreeNode search(TreeNode root,int key){
        if(root == null || root.data == key) return root;
        if(key< root.data) return search(root.left,key);
        else return search(root.right,key);
    }
    
}
