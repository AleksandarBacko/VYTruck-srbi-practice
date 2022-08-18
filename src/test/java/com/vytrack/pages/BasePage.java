package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @FindBy(id="menu-item-849")
    public WebElement loginBtn;


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    }

