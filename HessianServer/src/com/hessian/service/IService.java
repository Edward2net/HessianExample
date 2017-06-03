package com.hessian.service;

import java.util.List;

import com.hessian.entity.Car;

public interface  IService {

    /** 
     * @param name 
     * @return 
     */  
    public String getCarDisplay_ByName(String name);  
      
    /** 
     * @return 
     */  
    public Car getMyCar();  
      
    /** 
     * @return 
     */  
    public List<String> getList();  

}
