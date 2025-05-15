/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class Data implements Comparable{
    int number;
    String firstName;
    String lastName;
    int priority;
    
    @Override
    public String toString(){
        return null;
    }
    
    @Override
    public boolean equals(Object o){
        //anything not of type Data is false
        if (! (o instanceof Data))
            return false;
        //add code to properly compare
        
        return true;
        
    }

    @Override
    public int compareTo(Object o) {
        
        return 0;
    }
}
