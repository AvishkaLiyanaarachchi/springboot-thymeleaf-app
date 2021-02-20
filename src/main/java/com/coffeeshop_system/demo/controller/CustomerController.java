package com.coffeeshop_system.demo.controller;

import com.coffeeshop_system.demo.model.Customer;
import com.coffeeshop_system.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.coffeeshop_system.demo.repository.Customer_repository;
import java.util.List;

//@RestController //mark class as Controller
//@RequestMapping("/customer") //handle the request
@Controller
public class CustomerController {
	@Autowired //Autowired the CustomerService class
    CustomerService customerService;
	
	@GetMapping("")
	public String getAllCustomers(Model model) {
		model.addAttribute("listcustomer",customerService.getAllCustomer());
		return "index";
	}
	
	/*@GetMapping("")
	public String viewHomePage() {
		return "index";
	}*/
	
	@GetMapping("/register")
	public String showRegisterForm(Model model) {
		model.addAttribute("customer",new Customer());
		return "register_form";
	}
	
	@PostMapping("/process_register")
	public String addCustomers(Customer customer) {
		customerService.addCustomers(customer);
		return "register_success";
	}
	
	@GetMapping("/updateCustomer/{id}")
	public String updateCustomerForm(@PathVariable("id") int id, Model model) {
		Customer customer = customerService.getCustomerByID(id);
		model.addAttribute("customer",customer);
		return "update_customer";
	}
	
	@GetMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable("id") int id, Model model) {
		this.customerService.deleteCustomer(id);
		return "index";
	}
	
	
	/*@Autowired //Autowire the CustomerService class
    CustomerService customerService;

    @GetMapping //creating a get mapping that retrieves all the customers detail from the database
    public Iterable<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }
    @GetMapping("/{id}") //creating a get mapping that retrieves the detail of a specific customer
    public Customer getCustomerByID(@PathVariable("id") int id){
        return customerService.getCustomerByID(id);
    }

    /*@PostMapping //creating post mapping that insert the customers to the database
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomers(customer);
    }
    
    @RequestMapping("/add")
    public ModelAndView addCustomer(@ModelAttribute("customer") Customer customer){
    	ModelAndView obj = new ModelAndView("customerList");
        customerService.addCustomers(customer);
        obj.addObject("list",customerService.getAllCustomer());
        return obj;
    }

    @PutMapping //creating put mapping to update the customer detail
    public int updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    //creating a delete mapping that deletes a specified customer
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") int id){
        customerService.deleteCustomer(id);
    }*/
}
