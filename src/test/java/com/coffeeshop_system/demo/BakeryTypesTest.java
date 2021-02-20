package com.coffeeshop_system.demo;
import org.junit.runner.RunWith;
import com.coffeeshop_system.demo.controller.BakeryTypesController;
import org.springframework.boot.test.autoconfigure.web.servlet.
WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import com.coffeeshop_system.demo.model.BakeryTypes;
import org.junit.jupiter.api.Test;
import com.coffeeshop_system.demo.service.BakeryTypesService;


/*@RunWith(SpringRunner.class)
@WebMvcTest(BakeryTypesController.class)
public class BakeryTypesTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	BakeryTypesService bakeryTypesservice;
	
	@Test
	public void getApplications() throws Exception{
		mockMvc.perform(get("/bakeryTypes"))
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
		.andExpect(content().json(jsonContent: "[]"));
		
		verify(bakeryTypesservice, times(1)).listApplication();
	}


	
	
	

}*/
