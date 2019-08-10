package com.assignment02.qa.HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assgnment02.qa.Base.BaseClass;

public class HomePage1 extends BaseClass{


	//PageFactory or OR
	
	@FindBy(xpath ="//*[@id='scrolle']/main/div[1]/nav/div[2]/button[1]")
	            
	WebElement button;
	
	@FindBy(xpath = "//*[@id='reviews-section']/modal-dialog/div/div/write-review/review-star/div/svg[5]/g/path[1]")
	WebElement star5;

	@FindBy(xpath = "//*[@id='reviews-section']/modal-dialog/div/div/write-review/div/ng-dropdown/div/span")
	WebElement dropdown;

	@FindBy(xpath = "//*[@id='reviews-section']/modal-dialog/div/div/write-review/div/ng-dropdown/div/ul/li[2]")
	WebElement li_health;

	public HomePage1(){
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle(){
		return (driver.getTitle());	
	}

	public page write(){
		button.click();
		return (new page());
	}

	
}
