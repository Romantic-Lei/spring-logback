package com.example.log;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class logLevelOff {
	
	@RequestMapping("/logOff")
	@ResponseBody
	public void logOff() {
		log.trace("logOff的--trace日志--输出了");
		log.debug("logOff的--debug日志--输出了");
		log.info("logOff的--info日志--输出了");
		log.warn("logOff的--warn日志--输出了");
		log.error("logOff的--error日志--输出了");
	}

}
