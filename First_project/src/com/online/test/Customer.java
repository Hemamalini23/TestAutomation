package com.online.test;

import org.testng.annotations.Test;

public class Customer {

	@Test
	public void test1(){
		bank bank1=new SBI();
		bank bank2=new ICICI();
		bank bank3=new HDFC();
		bank1.interest();
		bank2.interest();
		bank3.interest();
	}
}
