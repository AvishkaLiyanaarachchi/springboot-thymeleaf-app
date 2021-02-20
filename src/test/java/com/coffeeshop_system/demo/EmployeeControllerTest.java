package com.coffeeshop_system.demo;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;
import com.coffeeshop_system.demo.controller.EmployeeController;
import com.coffeeshop_system.demo.model.Employee;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = EmployeeController.class)
@SpringBootTest(classes =  DemoApplication.class)
public class EmployeeControllerTest {
	
	@Autowired
	private WebApplicationContext wac;
	
	private MockMvc mockMVC;
	
	@Before
	public void setUP() throws Exception{
		mockMVC = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void verifiesHomePageLoads() throws Exception{
		mockMVC.perform(MockMvcRequestBuilders.get("/employee"))
		       .andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	

}
