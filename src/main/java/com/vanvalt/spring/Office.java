package com.vanvalt.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Office {
	private String officeNo="001";
    private String officeNO1="--";
/*  public String getOfficeNo() {
		return officeNo;
	}
	public void setOfficeNo(String officeNo) {
		this.officeNo = officeNo;
	}*/
	@Override
	public String toString() {
		return "Office [officeNo=" + officeNo + ", officeNO1=" + officeNO1 + "]";
	}


}
