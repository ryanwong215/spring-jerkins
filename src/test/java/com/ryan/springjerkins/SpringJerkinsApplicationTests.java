package com.ryan.springjerkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJerkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJerkinsApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Test case executing ...");
		boolean expected = true;
		boolean actual = true;
		assertEquals(expected, actual);
	}

}
