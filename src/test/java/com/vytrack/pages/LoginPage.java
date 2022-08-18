package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "prependedInput")
    public WebElement usernameBox;

    @FindBy(id = "prependedInput2")
    public WebElement passwordBox;

    @FindBy(id = "_submit")
    public WebElement submitBtn;

    @FindBy(xpath = "//div[.='Invalid user name or password.']")
    public WebElement errorMsgInvalidLogin;
}
