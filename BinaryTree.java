
class Node
{
    int data;
    Node left;
    Node right;

public Node(int data){
this.data = data;
}

}

public class BinaryTree {
    Node root;


    public void insert(int data) {
        root = insertRecur(root,data);
        
    }
    public Node insertRecur(Node root,int data){
        if(root==null)
            root = new Node(data);
        else if(data<root.data)
            root.left = insertRecur(root.left, data);
        else if(data>root.data)
            root.right = insertRecur(root.right, data);
            return root;
    

    }
    public void inorder(){
         inorderRecur(root);
    }
    public void inorderRecur(Node root){
        if(root != null){
            inorderRecur(root.left);
            System.out.print(root.data + "  ");
            inorderRecur(root.right);
        }


    }
      public void preorder(){
         preorderRecur(root);
    }
    public void preorderRecur(Node root){
        if(root != null){
            System.out.print(root.data + "  ");
            preorderRecur(root.left);
            preorderRecur(root.right);
        }

    }

}
