package com.example.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class logDemo {

//	private static final Logger log = LoggerFactory.getLogger(logDemo.class);
	
	@RequestMapping("/query")
	@ResponseBody
	public void queryActive() {
		log.trace("logback的--trace日志--输出了");
		log.debug("logback的--debug日志--输出了");
		log.info("logback的--info日志--输出了");
		log.warn("logback的--warn日志--输出了");
		log.error("logback的--error日志--输出了");
	}
	
}
