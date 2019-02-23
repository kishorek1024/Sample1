package com.qshore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CRM_LoginPage {
	
	public @FindBy(xpath="//*[@id='loginForm']/div/input[1]") WebElement uid;
	public @FindBy(xpath="//*[@id='loginForm']/div/input[2]") WebElement pwd;
	public @FindBy(xpath="//*[@id='loginForm']/div/div/input") WebElement loginbutton;

}
