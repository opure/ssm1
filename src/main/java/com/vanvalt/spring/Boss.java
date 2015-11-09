package com.vanvalt.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boss {
    @Resource
	private Car car;
	@Autowired
	private Office  office;
    
 /*  public Office getOffice() {
		return office;
	}
	public void setOffice(Office office) {
		this.office = office;
	}*/
/*public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}*/
public void Deprecated(){
	car.sayHello();
   }
	
	
	@Override
	public String toString() {
		return "Boss [car=" + car + ", office=" + office + "]";
	}

}
