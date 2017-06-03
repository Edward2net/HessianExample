package com.hessian.client;

import java.net.MalformedURLException;
import java.util.List;

import com.caucho.hessian.client.HessianProxyFactory;
import com.hessian.entity.Car;
import com.hessian.service.IService;

public class MainProg {

	public MainProg() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Server URL
        String url = "http://localhost:7001/HessianServer/Car";  
        HessianProxyFactory factory = new HessianProxyFactory();  
        try {  
        	// get interface
            IService hello = (IService) factory.create(IService.class, url);
            
            System.out.println("Post value:"); 
            System.out.println(hello.getCarDisplay_ByName("The car name by post."));  
            System.out.println(""); 
            
            
            System.out.println("Get class:"); 
            Car c = hello.getMyCar();  
            System.out.println(c.getName());  
            System.out.println(""); 
            
            
            System.out.println("Get List:"); 
            List<String> list = hello.getList();  
            for (String string : list) {  
                System.out.println(string);  
            }
            
        } catch (MalformedURLException e) {  
            e.printStackTrace();  
        }
	}

}
