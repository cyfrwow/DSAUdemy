package com.ds;

/**
 * Created by RS on 04-Oct-17.
 */
public class LinkedList<T> {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void add(Object value){
        Node newNode = new Node(value,null);
        if(head==null){
            head = newNode;
        }else{
            newNode.next = head;
            head =newNode;
        }
    }

    public void delete(){
        head = head.next;

    }

    public void display(){
        Node newNode = head;
        while(newNode!=null){
            System.out.println((T)newNode.value);
            newNode = newNode.next;
        }
    }
}
