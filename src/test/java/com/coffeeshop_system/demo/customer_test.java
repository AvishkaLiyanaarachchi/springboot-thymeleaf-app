package com.coffeeshop_system.demo;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.
DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.
AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;
import org.springframework.beans.factory.annotation.Autowired;

import com.coffeeshop_system.demo.model.Customer;
import com.coffeeshop_system.demo.repository.Customer_repository;
import org.springframework.boot.test.autoconfigure.orm.jpa.
TestEntityManager;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class customer_test {
	
	@Autowired
	Customer_repository repo;
	
	@Autowired 
	private TestEntityManager entityManager;
	
	@Test
	public void testCustomer() {
		Customer cus = new Customer();
		cus.setCustomer_id(8);
		cus.setCustomer_name("dss");
		cus.setEmail_address("kgkg");
		cus.setConatact_num("akaka");
		cus.setAddress("apapa");
		cus.setTbl_coffee_shop_coffee_shop_ID(1);
		
		Customer addCus = repo.save(cus);
		
		Customer existCus = entityManager.find(Customer.class, addCus.getCustomer_id());
		
		assertThat(existCus.getEmail_address()).isEqualTo(cus.getEmail_address());
	}
   
}
