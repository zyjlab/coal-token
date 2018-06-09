package jylink.coaltoken.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jylink.coaltoken.domain.CoalTokenWallet;
import jylink.coaltoken.service.CoalTokenWalletService;

@Controller
@RequestMapping("test")
public class TestBootController {
	
	@Autowired
	private CoalTokenWalletService coalTokenWalletService;
	//日志记录类
	private final Logger log=LoggerFactory.getLogger(TestBootController.class);

	
	@RequestMapping("/")
	@ResponseBody
	String home()
	{
		return "Hello,I love this world!";
	}
	
	@RequestMapping("/getWallet")
	@ResponseBody
	CoalTokenWallet getWallet(){
		//打印日志
	    log.info("TestBootController getUser info");
		return coalTokenWalletService.get("0x13235634566345");
	}
	
	
	
	



}