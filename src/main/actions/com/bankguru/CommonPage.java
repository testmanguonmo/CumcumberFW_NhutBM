package com.bankguru;

import org.openqa.selenium.WebDriver;

import com.bankguru.ui.CommonPageUI;

import commons.commonFunction;

public class CommonPage extends commonFunction {
	public CommonPage(WebDriver driver) {
		super(driver);
	}

	public String getDynamicText(String value) {
		waitVisible(CommonPageUI.DYNAMIC_MSG, value);
		return getTextDynamicElement(CommonPageUI.DYNAMIC_MSG, value);

	}

	public boolean isDisplayed_DynamicMessage(String value) {
		waitVisible(CommonPageUI.DYNAMIC_MSG, value);
		return isDisplayed(CommonPageUI.DYNAMIC_MSG, value);
	}

	
	public void openPage_Dynamic(String dynamic) {
		waitVisibleDynamicElement(CommonPageUI.DYNAMIC_LINK, dynamic);
		clickDynamicElement(CommonPageUI.DYNAMIC_LINK, dynamic);
	}
}
