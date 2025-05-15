/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class Data implements Comparable<Data>{
    int number;
    String firstName;
    String lastName;
    int priority;
    
    @Override
    public String toString(){
        return firstName + " " + lastName;
    }
    
    @Override
    public boolean equals(Object o){
        //anything not of type Data is false
        if (! (o instanceof Data))
            return false;
        //add code to properly compare
        
        if(this.number == ((Data)o).number && this.firstName.equals(((Data)o).firstName) && this.lastName.equals(((Data)o).lastName) && this.priority == ((Data)o).priority){
            return true;
        }
        return false;
        
    }

    @Override
    public int compareTo(Data o) {
        return this.priority - o.priority;
    }
}
