package com.ds;

/**
 * Created by RS on 04-Oct-17.
 */
public class LinkedListDouble<T> {
    NodeDouble head;
    public LinkedListDouble() {
        head = null;
    }

    public void add(Object value){
        NodeDouble newNode = new NodeDouble(value,null, null);
        if(head==null){
            head = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = null;
            head = newNode;
        }
    }

    public void delete(){
        head = head.next;
        head.prev = null;
    }

    public void display(){
        NodeDouble newNode = head;
        while(newNode!=null){
            System.out.println((T)newNode.value);
            newNode = newNode.next;
        }
    }
}
