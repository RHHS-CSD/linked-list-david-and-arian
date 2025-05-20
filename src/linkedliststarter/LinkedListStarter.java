/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class LinkedListStarter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This is a shared space for you to do some testing  It will also likely be the source of lots of conflicts if you're not careful.
        SinglyLinkedList sli1 = new SinglyLinkedList();
        
        sli1.add(new Data(0, "David", "H.", 1));
        sli1.add(new Data(0, "bob", "d", 0));
        sli1.add(new Data(0, "da", "j", 0));
        sli1.add(new Data(0, "jo", "a", 0));

        sli1.swapArian(0, 3);
        System.out.println(sli1.get(0));
        System.out.println(sli1.get(1));
        System.out.println(sli1.get(2));
        System.out.println(sli1.get(3));
        
        sli1.add(new Data(0, "bob", "d", 0), 0);
        sli1.swapArian(0, 2);
        System.out.println(sli1.get(0));
        
    }
    
}
