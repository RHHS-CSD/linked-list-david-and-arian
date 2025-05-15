/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class Node {
    Data d;
    Node next;
    
    public Node(Data d) {
        this.d = d;
        next = null;
    }
    public Node(Data d, Node n) {
        this.d = d;
        next = n;
    }
    
    public void setNode(Node n){
        next = n;
    }
    public Node getNext(){
        return next;
    }
    public Data getD(){
        return d;
    }
    public void setD(Data d){
        this.d = d;
    }
}
