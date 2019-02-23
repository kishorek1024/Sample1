package com.qshore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CRM_HomePage {
	
	@FindBy(xpath="//*[@id='quickSearchPanel']/select") WebElement SavedSearches;

}
