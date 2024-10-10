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

        Node node = new Node(data);
        Node current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(node);
        length++;
    }

    /**
     * Obtains an element by index
     * @param index the index of the element
     * @return the element
     */
    public Object get(int index) {

        //throw new UnsupportedOperationException();
        Node current = head;
        int i = 0;

        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return current.data;
    }

    /**
     * Returns the index of the element in the list
     * @param data element to search for
     * @return the index of the element, or -1 if the list does not contain element
     */
    public int indexOf(Object data) {

        //throw new UnsupportedOperationException();
            Node current = head; // Initialize current node to the head
            int index = 0; // Initialize index to 0

            // Iterate through the linked list until the end is reached
            while (current.getNext() != null){
                // Check if the current node's data matches the target data
                if(current.data == data){
                    System.out.println("Element found at index: " + index);
                    return index; // If found, return the index
                }

                current = current.next; // Move to the next node
                index++;
            }
            System.out.println("Element not found in the list.");
            return -1; // If not found, return -1
        }

    /**
     * Removes an element from the list
     * @param data the element to remove
     * @return true if element was removed
     */
    public boolean remove(Object data) {

        throw new UnsupportedOperationException();

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