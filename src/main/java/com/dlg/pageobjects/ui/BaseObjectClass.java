package com.dlg.pageobjects.ui;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Coordinates;

public class BaseObjectClass implements Element {

	public BaseObjectClass(){
		super();
		System.out.println("Hello");
	}
	public void clear() {
		// TODO Auto-generated method stub
		
	}

    
    public void click() {
    	System.out.println("Click method");
       
    }

	public WebElement findElement(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<WebElement> findElements(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAttribute(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCssValue(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Point getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	public Rectangle getRect() {
		// TODO Auto-generated method stub
		return null;
	}

	public Dimension getSize() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTagName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}

	public void sendKeys(CharSequence... arg0) {
		// TODO Auto-generated method stub
		System.out.println("Sendkeys method" + arg0);
		
	}

	public void submit() {
		// TODO Auto-generated method stub
		
	}

	public <X> X getScreenshotAs(OutputType<X> arg0) throws WebDriverException {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getWrappedElement() {
		// TODO Auto-generated method stub
		return null;
	}

	public Coordinates getCoordinates() {
		// TODO Auto-generated method stub
		return null;
	}


}
