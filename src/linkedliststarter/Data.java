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
    private String firstName;
    private String lastName;
    int priority;

    public Data(int number, String firstName, String lastName, int priority) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.priority = priority;
    }
    
    @Override
    public String toString(){
        return getFirstName() + " " + getLastName();
    }
    
    @Override
    public boolean equals(Object o){
        //anything not of type Data is false
        if (! (o instanceof Data))
            return false;
        //add code to properly compare
        
        if(this.number == ((Data)o).number && this.getFirstName().equals(((Data)o).getFirstName()) && this.getLastName().equals(((Data)o).getLastName()) && this.priority == ((Data)o).priority){
            return true;
        }
        return false;
        
    }

    @Override
    public int compareTo(Data o) {
        return this.priority - o.priority;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }
}
