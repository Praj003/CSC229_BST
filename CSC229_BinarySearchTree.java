package com.mycompany.csc229_bst_example;
/**
 *
 * @author MoaathAlrajab
 */
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private BstNode root;

    public boolean isEmpty() {
        return (this.root == null);
    }

    public void insert(Integer data) {

        System.out.print("[input: " + data + "]");
        if (root == null) {
            this.root = new BstNode(data);
            System.out.println(" -> inserted: " + data);
            return;
        }
        insertNode(this.root, data);
        System.out.print(" -> inserted: " + data);
        System.out.println();
    }

    private BstNode insertNode(BstNode root, Integer data) {

        BstNode tmpNode = null;
        System.out.print(" ->" + root.getData());
        if (root.getData() >= data) {
            System.out.print(" [L]");
            if (root.getLeft() == null) {
                root.setLeft(new BstNode(data));
                return root.getLeft();
            } else {
                tmpNode = root.getLeft();
            }
        } else {
            System.out.print(" [R]");
            if (root.getRight() == null) {
                root.setRight(new BstNode(data));
                return root.getRight();
            } else {
                tmpNode = root.getRight();
            }
        }
        return insertNode(tmpNode, data);
    }

    public void inOrderTraversal() {
        doInOrder(this.root);
    }

    private void doInOrder(BstNode root) {
        if (root != null) {
            doInOrder(root.getLeft());
            System.out.print(root.getData() + " ");
            doInOrder(root.getRight());
        }
    }

    public void preOrderTraversal() {
        doPreOrder(this.root);
    }

    private void doPreOrder(BstNode root) {
        if (root != null) {
            System.out.print(root.getData() + " ");
            doPreOrder(root.getLeft());
            doPreOrder(root.getRight());
        }
    }

    public Integer findHeight() {
        return getHeight(this.root);
    }

    private Integer getHeight(BstNode node) {
        if (node == null) {
            return -1;
        }
        int leftSubtreeHeight = getHeight(node.getLeft());
        int rightSubtreeHeight = getHeight(node.getRight());
        return Math.max(leftSubtreeHeight, rightSubtreeHeight) + 1;
    }

    public int getDepth(BstNode node) {
        return getDepth(this.root, node, 0);
    }

    private int getDepth(BstNode currentNode, BstNode node, int currentDepth) {
        if (currentNode == null) {
            return -1;
        }
        if (currentNode == node) {
            return currentDepth;
        }
        int leftDepth = getDepth(currentNode.getLeft(), node, currentDepth + 1);
        if (leftDepth != -1) {
            return leftDepth;
        }
        int rightDepth = getDepth(currentNode.getRight(), node, currentDepth + 1);
        if (rightDepth != -1) {
            return rightDepth;
        }
        return -1;
    }
    
    public void print() {
        print("", root, false);
    }

    private void print(String prefix, BstNode node, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "   " : "   ") + node.getData());
            print(prefix + (isLeft ? "    " : "    "), node.getLeft(), true);
            print(prefix + (isLeft ? "    " : "    "), node.getRight(), false);

        }
    }
}