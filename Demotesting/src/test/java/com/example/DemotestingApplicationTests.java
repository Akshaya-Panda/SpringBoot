package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import junit.framework.Assert;

@SpringBootTest
class DemotestingApplicationTests {

	@Test
	void contextLoads() {
		Assert.assertEquals(33,Calc.add(22,11));
	}

}
