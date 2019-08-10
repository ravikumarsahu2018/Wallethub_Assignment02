package com.assignment02.qa.HomeTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assignment02.qa.HomePage.HomePage1;
import com.assignment02.qa.HomePage.page;

public class HomePageTest extends HomePage1 {

	static public HomePage1 hm;
	static public page p1;

	public HomePageTest (){
		super();

	}

	@BeforeMethod
	public void setup(){
		initialization();
		hm = new HomePage1();
	}


	@Test

	public void page_displayed(){
		String sr = hm.validateLoginPageTitle();
		System.out.println ( sr);

	}

	@Test
	
	public void review(){
		p1= hm.write();
	}
	
	
	
	@AfterMethod
	public void teardown(){
		//driver.close();

	}

}
