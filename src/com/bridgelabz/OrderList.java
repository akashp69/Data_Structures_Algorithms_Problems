package com.bridgelabz;

public class OrderList {

    Node head;

    /**
     * Create the class for Create a Node
     */
    class Node {
        int data;
        Node next;

        Node (int data) {
            this.data=data;
            this.next=null;
        }
    }

    /**
     * Create a mrthod for Adding elements in Node
     */
    public void add(int data) {
        Node newNode=new Node(data);
        newNode.next = head;
        head = newNode;
        return;
    }
    public void sortByNumber() {
        Node currentNode = head,  index = null;
        int temp;
        if (head == null) {
            return;
        }
        else {
            while (currentNode != null) {
                index = currentNode.next;

                while (index != null) {
                    if (currentNode.data > index.data) {
                        temp = currentNode.data;
                        currentNode.data = index.data;
                        index.data = temp;
                    }

                    index = index.next;
                }
                currentNode = currentNode.next;
            }
        }
    }

    /**
     * Create a method for showing elements in list
     */
    public void show() {
        if (head == null) {
            System.out.println("List is Empty");
        }
        Node currNode = head;
        while (currNode != null)  {
            System.out.print(currNode.data +"->" );
            currNode = currNode.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {

        OrderList list=new OrderList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Elements Before The Sorting");
        list.show();
        list.sortByNumber();
        System.out.println("Elements After The Sorting");
        list.show();

    }


}
