package com.vanvalt.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vanvalt.spring.Boss;
import com.vanvalt.spring.Office;

public class SpringTest {
	private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	@Test
	public void testGetName(){
		
		Boss boss =(Boss) ac.getBean("boss");
	    boss.Deprecated();
		System.out.println(boss);
	/*	Office office =(Office) ac.getBean("office");
	    System.out.println(office);	*/
	}

}
