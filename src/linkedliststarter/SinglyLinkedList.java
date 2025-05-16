/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class SinglyLinkedList implements ILinkedList{
    private Node head;
    private Node tail;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }
    
    public SinglyLinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }
    /**
     * Return the size of the Linked List
     * @return an int representing the size
     */
    @Override
    public int size() {
        if(head == null) {
            return 0;
        }
        
        Node temp = head;
        int count = 1;
        while(temp.next != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    /**
     * Reset / Empty the LinkedList
     * 
     * @author Arian H.
     */
    @Override
    public void clear() {
        tail = null;
        head = null;
    }

    /**
     * Remove the first instance of item from the linked list
     * @param item The item to be removed
     * @return true: if the item was found and removed
     *         false otherwise
     * 
     * @author Arian H.
     */
    @Override
    public boolean remove(Data item) {
        int index = this.indexOf(item);
        if(index == -1) return false;
        else return remove(index);
    }

    /**
     * Remove the item from the particular index
     * @param index The index of the item to remove
     * @return true: if the item was found and removed
     *         false otherwise
     * 
     * @author Arian H.
     */
    @Override
    public boolean remove(int index) {
        int size = size();
        if(index < 0 && index > size - 1)
            return false;
        if(index == 0){
            head = head.getNext();
            return true;
        }
        if(index == size - 1){
            Node item = head;
            for (int i = 0; i < index; i++){
                item = item.getNext();
            }
            item.setNext(item.getNext().getNext());
            tail = item;
            return true;
        }
        Node item = head;
        for (int i = 1; i < index - 1; i++){
            item = item.getNext();
        }
        item.setNext(item.getNext().getNext());
        return true;
    }

    /**
     * Returns the first found index of the given item
     * @param item The item to find
     * @return The index of the found item, or -1
     * 
     * @author Arian H.
     */
    @Override
    public int indexOf(Data item) {
        int size = size();
        Node pointer = head;
        for(int i = 0; i < size; i++){
            if(pointer.getD().equals(item)){
                return i;
            }
            pointer = pointer.getNext();
        }
        
        return -1;
    }

    /**
     * Retrieves the Data at the given index
     * @param index The index to be retrieved
     * @return The data item, null if bad index
     * 
     * @author Arian H.
     */
    @Override
    public Data get(int index) {
        Node pointer = head;
        if(index > size()-1 && index < 0) return null;
        for(int i = 0; i < index; i++){
            pointer = pointer.getNext();
        }
        return pointer != null ?pointer.getD():null;
    }

    /**
     * Add the gen item to the end of the linked list
     * @param item Item to add
     * @return true if successfuuly added, false otherwise
     * @author David
     */
    @Override
    public boolean add(Data item) {
        return add(item, this.size()-1);
    }

    /**
     * Add the gen item to  the linked list at the given position
     * @param item Item to add
     * @param index The position to add the item
     * @return true if successfuuly added, false otherwise
     * @author David
     */
    @Override
    public boolean add(Data item, int index) {
        if(index < 0 || item == null) {
            return false;
        }
        
        Node add = new Node(item);
        if(index == 0) {
            add.next = head;
            head = add;
            return true;
        }
        
        Node temp = head;
        for(int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        add.next = temp.next;
        temp.next = add;
        return true;
        
        
        
    }
    
    
}
