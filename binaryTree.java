class node
{
    int data;
    node left;
    node right;
    public node(int data){
        this.data=data;
    }
}

public class binaryTree {
    node root;
    public void insert(int data){
        root=insertRec(root,data);
    }
    public node insertRec(node root,int data){
        if(root==null){
            root = new node(data);
        }
        else if(data<root.data){
            root.left=insertRec(root.left,data);
        }
        else if(data>root.data){
            root.right=insertRec(root.right,data);
        }
        return root;
    }
    public void inorder(){
        inorderRec(root);

    }
    public void inorderRec(node root){
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.data +" ");
            inorderRec(root.right);

        }
    }
    public void preorder(){
        preorderRec(root);

    }
    public void preorderRec(node root){
        if(root != null){
            System.out.print(root.data +" ");
            preorderRec(root.left);
            preorderRec(root.right);

        }
    }
    public void postorder(){
        postorderRec(root);

    }
    public void postorderRec(node root){
        if(root != null){
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data +" ");

        }
    }

    public static void main(String[] args) {

        binaryTree tree = new binaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);

        System.out.println("Inorder Traversal:");
        tree.inorder();
        System.out.println();
        System.out.println("Preorder Traversal:");
        tree.preorder();
        System.out.println();
        System.out.println("Postorder Traversal:");
        tree.postorder();

    }
}

