package com.vanvalt.spring;

import javax.annotation.Resource;

public class dd {
	@Resource
  WebConfig  config;
  public dd(){
	 WebConfig webConfig=new WebConfig();
	  System.out.println( config.getaString());
  }
   public static void main(String[] args) {
	dd  d=new dd();
	
}
}
