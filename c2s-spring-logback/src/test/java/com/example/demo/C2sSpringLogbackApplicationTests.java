package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class C2sSpringLogbackApplicationTests {

	@Test
	public void contextLoads() {
		log.debug("debug...");
		log.info("info...");
		log.error("error...");
	}
	
	@Test
	public void testLogBack() {
		log.debug("sl4j.debug...");
		log.info("sl4j.info...");
		log.error("sl4j.error...");
	}

}
