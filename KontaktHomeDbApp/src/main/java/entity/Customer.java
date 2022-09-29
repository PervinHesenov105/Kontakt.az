/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author user
 */
public class Customer {
    private int customer_number;
    private String first_name;
    private String last_name;
    private String birthdate;

    public Customer() {
    }

    public Customer(int customer_number, String first_name, String last_name, String birthdate) {
        this.customer_number = customer_number;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birthdate = birthdate;
    }

    public int getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number(int customer_number) {
        this.customer_number = customer_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Customer{" + "customer_number=" + customer_number + ", first_name=" + first_name + ", last_name=" + last_name + ", birthdate=" + birthdate + '}';
    }
    
    
    
    
}
