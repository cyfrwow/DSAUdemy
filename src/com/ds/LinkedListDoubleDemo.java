package com.ds;

/**
 * Created by RS on 04-Oct-17.
 */
public class LinkedListDoubleDemo {
    public static void main(String[] args) {
        LinkedListDouble<String> ls = new LinkedListDouble<String>();
        ls.add("Raj");
        ls.add("Iti");
        ls.add("Jaffa");
        ls.add("Daffa");
        ls.delete();
        ls.display();
    }
}
