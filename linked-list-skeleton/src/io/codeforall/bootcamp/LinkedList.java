package io.codeforall.bootcamp;

public class LinkedList {

    private Node head;
    private int length = 0;

    public LinkedList() {
        this.head = new Node(null);
    }

    public int size() {
        return length;
    }

    /**
     * Adds an element to the end of the list
     * @param data the element to add
     */
    public void add(Object data)  {

        // Node class constructor
        Node node = new Node(data); // Create a new node with the given data

        Node current = head; // Initialize current node to the head - attributes head to a local variable called current
        // The while loop iterates through the linked list until current.getNext() is null,
        //which means current is pointing to the last node.
        while (current.getNext() != null){
            current = current.getNext(); // Traverse to the last node - moves current to the next node until reach the last
        }
        // Once the last node is found, the setNext method of current is called to set its next node to the newly created node.
        current.setNext(node); // Set the next node of the last node to the newly created node
        //The length variable (assuming it's a member of the linked list class) is incremented to reflect the increased size of the list.
        length++; // Increment the length of the linked list
    }

    /**
     * Obtains an element by index
     * @param index the index of the element
     * @return the element
     */
    public Object get(int index) {

        //throw new UnsupportedOperationException();
        if(length == 0){ // Return null if the list is empty
            return null;
        }
        Node node = head.getNext(); //Store the next node

        for (int i = 0; i < length; i++) {
            if(index == i){
                return node.getData();
            }
            node = node.getNext(); //If index is not found, move to the next node
        }
        return null;
    }

    /**
     * Returns the index of the element in the list
     * @param data element to search for
     * @return the index of the element, or -1 if the list does not contain element
     */
    public int indexOf(Object data) {

        //throw new UnsupportedOperationException();
            Node iterator = head;// Initialize the iterator to the head of the linked list
            int index = 0; // Initialize the index to 0 to keep track of the current index.

        // The while loop iterates through the linked list until the end is reached.
        while (iterator.getNext() != null){
                //Method getNext indicates the reference to the next node
                iterator = iterator.getNext(); // Move the iterator to the next node
            // If the data of the current node (iterator.getData()) doesn't match the target data,
            // the index is incremented and the loop continues to the next iteration.
            if(iterator.getData() != data){
                    index++; // Increment the index if the current node's data doesn't match
                    continue;
                }
                return index; // Return the index if the data is found
            }
            return -1; // Return -1 if the data is not found
        }

    /**
     * Removes an element from the list
     * @param data the element to remove
     * @return true if element was removed
     */
    /** The provided method remove(Object data) removes the first occurrence of a given element from a linked list.*/
    public boolean remove(Object data) {

        //throw new UnsupportedOperationException();
        Node previousIterator = head; // Initialize the previous iterator to the head
        Node iterator = head; // Initialize the iterator to the head

        // The while loop iterates through the linked list until the end is reached.
        while(iterator.getNext() != null){
            iterator = iterator.getNext(); // Move the iterator to the next node
            if(data == iterator.getData()){
                // The previousIterator node's setNext method is called to set its next node to the node after the current node (iterator.getNext()).
                // This effectively removes the current node from the linked list.
                previousIterator.setNext(iterator.getNext()); // Remove the current node by linking the previous node to the next node
                length--; // Decrement the length of the linked list to reflect the removal of the element.
                return true; // Indicate that the element was removed
            }
            // If the data of the current node doesn't match the target data, previousIterator is moved to the next node using previousIterator = previousIterator.getNext().
            // The loop then continues to the next iteration.
            previousIterator = previousIterator.getNext(); // Move the previous iterator to the next node
        }
        // If the loop completes without finding a match, the method returns false to indicate that the element was not found in the linked list.
        return false; // Indicate that the element was not found
    }

    private class Node {

        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            next = null;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}