package com.dlg.pageobjects.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.internal.WrapsElement;

public interface Element extends WebElement, WrapsElement, Locatable {}