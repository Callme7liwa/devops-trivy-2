package com.javatechie.cicd;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GithubCicdActionsApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testAddition() {
		int a = 2+3;
		assertEquals(5, a);
	}

	@Test
	void testSubtraction() {
		int a  = 4-3;
		assertEquals(1, a);
	}

}
