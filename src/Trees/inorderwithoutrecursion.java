package Trees;

import java.util.Stack;

/**
 * Created by srujithpoondla on 12/3/16.
 */
public class inorderwithoutrecursion {
    Node root;
    public static void main(String[] args) {
        inorderwithoutrecursion tree1 = new inorderwithoutrecursion();
        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(4);
        tree1.root.left.left=new Node(5);
        tree1.root.left.right=new Node(6);

        tree1.inorder_recursion(tree1.root);
    }

    private void inorder_recursion(Node node){
        if (node==null)
            return;
        Stack<Node> stack = new Stack<>();
        while (node!=null){
            stack.push(node);
            node=node.left;
        }
        while (stack.size()>0){
            node=stack.pop();
            System.out.println(node.key+" ");
            if(node.right!=null){
                stack.push(node.right);
            }
        }


    }
}
