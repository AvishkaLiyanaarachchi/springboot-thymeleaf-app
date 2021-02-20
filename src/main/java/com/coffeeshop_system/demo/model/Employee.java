package com.coffeeshop_system.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity(name = "tbl_employee") //Specify the class is an entity and map to the database table
public class Employee {
    @Id //specify the primary key of an entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto incremented database column to generate the primary key
    private int employee_ID;
    private String employee_name;
    private String email_address;
    private String phone_number;
    private String address;
    private int tbl_coffee_shop_coffee_shop_ID;
    
   /* @ManyToOne
    @JoinColumn(name="coffee_shop_ID", nullable=false)
    private Coffeeshop coffeeshop;*/

    public Employee(){

    }
    
    

    public Employee(int employee_ID, String employee_name, String email_address, String phone_number, String address, int tbl_coffee_shop_coffee_shop_ID) {
        this.employee_ID = employee_ID;
        this.employee_name = employee_name;
        this.email_address = email_address;
        this.phone_number = phone_number;
        this.address = address;
        this.tbl_coffee_shop_coffee_shop_ID = tbl_coffee_shop_coffee_shop_ID;
    }
    

	

	/*public Coffeeshop getCoffeeshop() {
		return coffeeshop;
	}



	public void setCoffeeshop(Coffeeshop coffeeshop) {
		this.coffeeshop = coffeeshop;
	}*/



	public int getEmployee_ID() {
        return employee_ID;
    }

    public void setEmployee_ID(int employee_ID) {
        this.employee_ID = employee_ID;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTbl_coffee_shop_coffee_shop_ID() {
        return tbl_coffee_shop_coffee_shop_ID;
    }

    public void setTbl_coffee_shop_coffee_shop_ID(int tbl_coffee_shop_coffee_shop_ID) {
        this.tbl_coffee_shop_coffee_shop_ID = tbl_coffee_shop_coffee_shop_ID;
    }
}
