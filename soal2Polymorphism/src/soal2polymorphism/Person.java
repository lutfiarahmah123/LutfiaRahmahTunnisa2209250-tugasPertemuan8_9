/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2polymorphism;

/**
 *
 * @author ASUS
 */
public class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;
    private MyDate dateCreated;
    
    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "class Person, name : " +name;
    }
}
   

