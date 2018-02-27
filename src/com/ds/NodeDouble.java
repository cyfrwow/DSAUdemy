package com.ds;

/**
 * Created by RS on 04-Oct-17.
 */
public class NodeDouble {
    Object value;
    NodeDouble next;
    NodeDouble prev;
    public NodeDouble(Object value, NodeDouble next, NodeDouble prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}
