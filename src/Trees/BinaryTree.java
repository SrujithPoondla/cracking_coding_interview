package Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by srujithpoondla on 12/1/16.
 */
public class BinaryTree {
    Node root;
    List<Integer> list = new ArrayList<>();

    BinaryTree(){
        root= null;
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(4);
        tree.root.left.left=new Node(5);
        tree.root.left.right=new Node(6);

        tree.inordertraversal(tree.root);
        System.out.println();
        tree.preordertraversal(tree.root);
        System.out.println();
        tree.postordertraversal(tree.root);
        System.out.println();
        tree.levelordertraversal(tree.root);



    }

    private void postordertraversal(Node node) {
        if (node != null) {
            postordertraversal(node.left);
            postordertraversal(node.right);
            System.out.print(node.key);
            list.add(node.key);

        }

    }

    private  void preordertraversal(Node node) {
        if (node != null) {
            System.out.print(node.key);
            preordertraversal(node.left);
            preordertraversal(node.right);
        }

    }

    private  void inordertraversal(Node node) {
        if (node != null) {
            inordertraversal(node.left);
            System.out.print(node.key);
            inordertraversal(node.right);
        }
    }

    private void levelordertraversal(Node node){
        int h= height(node);
        for(int i=1;i<=h;i++){
            printgivenlevel(node,i);
        }
    }

    private void printgivenlevel(Node node, int i) {
        if (node!=null){
            if (i==1){
                System.out.println(node.key + " ");
            }else if(i>1) {
                printgivenlevel(node.left,i-1);
                printgivenlevel(node.right,i-1);
            }
        }
    }

    int height(Node node){
            if (node==null)
                return 0;
            int lheight =height(node.left);
            int rhieght = height(node.right);
            if (lheight>rhieght){
                return (lheight+1);
            }else {
                return (rhieght+1);
            }


    }



}
