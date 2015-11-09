package com.vanvalt.spring;
import org.springframework.stereotype.Component;
@Component
public class Car {
	
	private String brand;

	private String price;
	
   public String getBrand() {
	   System.out.println(brand);
		return brand;
	}
	public void setBrand(String brand1) {
		this.brand = brand1;
		this.brand="dd";
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void sayHello(){
		System.out.println("zzzz");
	}
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}
/*	public static void main(String[] args) {
		Car  car=new  Car();
		car.setBrand("zz");
		car.getBrand();
	}*/

}
