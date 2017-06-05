package com.spring.hessian.server;

import java.util.ArrayList;
import java.util.List;

import com.caucho.hessian.server.HessianServlet;

import com.spring.hessian.entity.Car;
import com.spring.hessian.service.IService;

public class ServiceImpl extends HessianServlet implements IService {

    /** 
     *  
     */  
    private static final long serialVersionUID = 8385639368192939451L;  
  
    @Override  
    public String getCarDisplay_ByName(String name) {  
        return "Car Name: " + name;  
    }  
  
    @Override  
    public Car getMyCar() {
        Car c = new Car();  
        c.setName("Set Car Name.");  
        return c;  
    }  
  
    @Override  
    public List<String> getList() {  
        List<String> list = new ArrayList<String>();  
        list.add(getCarDisplay_ByName("Honda"));  
        list.add(getCarDisplay_ByName("Nissan"));
        list.add(getCarDisplay_ByName("Toyota"));
        return list;  
    }  

}
