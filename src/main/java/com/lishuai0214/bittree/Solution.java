package com.lishuai0214.bittree;

import java.util.LinkedList;

public class Solution{
    public static void main( String[] args )
    {
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(5);
        treeNode.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(10);
        treeNode.right.right = new TreeNode(6);
        treeNode.left.left = new TreeNode(8);

        LaywerTraversal(treeNode);
        System.out.println( "Hello World!" );
    }
    public static void LaywerTraversal(TreeNode root){
        if(root==null) return;
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        list.add(root);
        TreeNode currentNode;
        while(!list.isEmpty()){
            currentNode=list.poll();
            System.out.println(currentNode.val);
            if(currentNode.left!=null){
                list.add(currentNode.left);
            }
            if(currentNode.right!=null){
                list.add(currentNode.right);
            }
        }
    }
}