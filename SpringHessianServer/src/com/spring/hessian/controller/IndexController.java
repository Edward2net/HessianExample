package com.spring.hessian.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.hessian.entity.Car;
import com.spring.hessian.service.IService;


@Controller
public class IndexController {
	
	public IndexController() {
	}

	private static final Logger logger = LoggerFactory
			.getLogger(IndexController.class);
	
	private ApplicationContext context;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		
		logger.info("function -> index");
		
		StringBuilder sbResult = new StringBuilder();
		
		// 使用 XML 配置的 Bean 作為連線
		context = new ClassPathXmlApplicationContext("/remoting-client.xml");  
		
		// 使用 Bean 當 Hessian 通道介面使用
		IService newCar = (IService) context.getBean("myServiceClient");
		
		sbResult.append(newCar.getCarDisplay_ByName("The car name") + "<br><br>");
		
		sbResult.append("Get class:<br>");
		Car c = newCar.getMyCar(); 
		sbResult.append(c.getName() + "<br><br>");
		
		List<String> listString = newCar.getList();
		
		for(String item : listString)
		{
			sbResult.append(item + "<br><br>");
		}

		model.addAttribute("returnSpringMessage", sbResult.toString());

		return "index";
	}

}
