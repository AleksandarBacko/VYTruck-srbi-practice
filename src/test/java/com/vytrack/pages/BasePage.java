package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    //djole papan

    @FindBy(id="menu-item-849")
    public WebElement loginBtn;

    @FindBy(xpath = "//a[@href='#']//i[@class='fa-asterisk menu-icon']/..")
    public WebElement fleetModule;

    @FindBy(xpath = "//a[@href='#']//i[@class='fa-users menu-icon']/..")
    public WebElement customersModule;

    @FindBy(xpath = "//a[@href='#']//i[@class='fa-puzzle-piece menu-icon']/..")
    public WebElement activitiesModules;

    @FindBy(xpath = "//a[@href='#']//i[@class='fa-gear menu-icon']/..")
    public WebElement systemModule;

    @FindBy(linkText = "Fleet Management")
    public WebElement fleetManagementMailLinkText;

    @FindBy(xpath = "//i[@class='fa-share-square']")
    public WebElement shortcutsButton;

    @FindBy(xpath = "//input[@placeholder='Enter shortcut action']")
    public WebElement shortcutsSearchBox;

    @FindBy(linkText = "Learn how to use this space")
    public WebElement learnHowToUseThisSpaceButton;

    @FindBy(xpath = "//i[@class='fa-question-circle']")
    public WebElement getHelpButton;

    @FindBy(xpath = "//i[@class='fa-bars']")
    public WebElement historyDropDownButton;

    @FindBy(id = "history-tab")
    public WebElement historyTabDropDownOption;

    @FindBy(id = "mostviewed-tab")
    public WebElement mostviewedTabDropDownOption;

    @FindBy(id = "favorite-tab")
    public WebElement favoriteTabDropDownOption;

    @FindBy(xpath = "//div[@id='mostviewed-content']//li")
    public WebElement mostviewedListOfOptions;

    @FindBy(xpath = "//div[@id='history-content']//li")
    public WebElement historyContentListOfOptions;

    @FindBy(xpath = "//div[@class='dot-menu-empty-message']")
    public WebElement favoriteEmptyListMessage;

    @FindBy(xpath = "//i[@class='mail-icon']")
    public WebElement recentEmailsButton;

    @FindBy(xpath = "//i[@class='fa-caret-down']")
    public WebElement userNameLogOutDropDownMenu;

    @FindBy(linkText = "My Configuration")
    public  WebElement    userNameDropDownMenuMyConfiguration;

    @FindBy(linkText = "My Calendar")
    public  WebElement    userNameDropDownMenuMyCalendar;

    @FindBy(linkText = "Logout")
    public  WebElement    userNameDropDownMenuLogout;

    @FindBy (xpath = "//span[.='Vehicles']")
    public WebElement fleetVehicles;

    @FindBy (xpath = "//span[.='Vehicle Odometer']")
    public WebElement fleetVehiclesOdometer;

    @FindBy (xpath = "//span[.='Vehicle Costs']")
    public WebElement fleetVehicleCosts;

    @FindBy (xpath = "//span[.='Vehicle Contracts']")
    public WebElement fleetVehicleContracts;

    @FindBy (xpath = "//span[.='Vehicles Fuel Logs']")
    public WebElement fleetVehicleFuelLogs;

    @FindBy (xpath = "//span[.='Vehicle Services Logs']")
    public WebElement fleetVehicleServiceLogs;

    @FindBy (xpath = "//span[.='Vehicles Model']")
    public WebElement fleetVehicleModel;

    @FindBy(xpath = "//span[.='Contacts']")
    public WebElement costumersContact;

    @FindBy(xpath = "//span[.='Jobs']")
    public WebElement systemJobs;

    @FindBy(xpath = "//span[.='Menus']")
    public WebElement systemMenus;

    @FindBy(xpath = "//span[.='System Calendars']")
    public WebElement systemSystemCalendars;

    @FindBy (xpath = "//span[.='Calendar Events']")
    public WebElement activitiesCalendarEvents;

    @FindBy(xpath = "//a[.='List']")
    public WebElement listOfContacts;

    @FindBy(xpath = "//a[.='Create Contact']")
    public WebElement createContact;




    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    }

