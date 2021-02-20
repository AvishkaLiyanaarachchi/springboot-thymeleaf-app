package com.coffeeshop_system.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import com.coffeeshop_system.demo.controller.EmployeeController;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private EmployeeController employeeController;
    @Test
    void contextLoads() throws Exception{
    	assertThat(employeeController).isNotNull();
    }

}
