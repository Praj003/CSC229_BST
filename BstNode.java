/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc229_bst_example;

/**
 *
 * @author MoaathAlrajab
 */
public class BstNode {

    private BstNode left;
    private BstNode right;
    private Integer data;

    public BstNode(Integer data) {
        this.data = data;
    }

    public BstNode getLeft() {
        return left;
    }

    public void setLeft(BstNode left) {
        this.left = left;
    }

    public BstNode getRight() {
        return right;
    }

    public void setRight(BstNode right) {
        this.right = right;
    }

    public Integer getData() {
        return data;
    }


}
