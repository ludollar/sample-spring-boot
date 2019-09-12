package com.example;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertTrue;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Test
	public void myTest() {
		assertTrue(true);
	}

	@Test
	public void calculate_methods_first_param_should_not_be_null() throws Exception {
		try {
			DemoApplication.additionner(null,2);
			DemoApplication.soustraire(null,2);
			DemoApplication.multiplier(null,2);
			assertTrue(false);
		}
		catch (Exception e) {
			assertTrue(true);
		}
	}

	@Test
	public void calculate_methods_second_param_should_not_be_null() throws Exception {
		try {
			DemoApplication.additionner(1,null);
			DemoApplication.soustraire(1,null);
			DemoApplication.multiplier(1,null);
			assertTrue(false);
		}
		catch (Exception e) {
			assertTrue(true);
		}
	}
}
