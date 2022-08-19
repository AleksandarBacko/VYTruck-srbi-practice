package com.vytrack.step_definitions;

import com.github.javafaker.Faker;
import com.vytrack.pages.BasePage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class login_StepDef extends BasePage {
    LoginPage loginPage = new LoginPage();

    @When("User enter login module")
    public void user_enter_login_module() {
        Driver.get().get(ConfigurationReader.get("url"));
        loginBtn.click();
    }

    @When("User enter driver credentials and click login button")
    public void user_enter_driver_credentials_and_click_login_button() {
        loginPage.usernameBox.sendKeys(ConfigurationReader.get("driver_username"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.get("driver_password"));
        loginPage.submitBtn.click();
    }


    @When("User enter salesManager credentials and click login button")
    public void user_enter_salesManager_credentials_and_click_login_button() {
        loginPage.usernameBox.sendKeys(ConfigurationReader.get("sales_manager_username"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.get("sales_manager_password"));
        loginPage.submitBtn.click();

    }

    @When("User enter storeManager credentials and click login button")
    public void user_enter_storeManager_credentials_and_click_login_button() {
        loginPage.usernameBox.sendKeys(ConfigurationReader.get("store_manager_username"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.get("store_manager_password"));
        loginPage.submitBtn.click();

    }

    @Then("User should be on dashboard page")
    public void user_should_be_on_dashboard_page() {
        Assert.assertEquals("Dashboard",Driver.get().getTitle());
    }



    @And("user enters wrong {string} and {string}")
    public void userEntersWrongAnd(String username, String password)  {
        loginPage.usernameBox.sendKeys(ConfigurationReader.get(username));
        loginPage.passwordBox.sendKeys(ConfigurationReader.get(password));
        loginPage.submitBtn.click();
    }

    @Then("user should see error message")
    public void userShouldSeeErrorMessage() {
        Assert.assertTrue(loginPage.errorMsgInvalidLogin.isDisplayed());
    }






    @And("User click forget passsword button")
    public void userClickForgetPassswordButton() {
        loginPage.forgetYourPassBtn.click();
    }

    @And("User enter wrong {string}")
    public void userEnterWrong(String fakeUser) {
        Faker faker = new Faker();
        fakeUser = faker.name().username();
        loginPage.forgetYourPassInputUsername.sendKeys(fakeUser);
        loginPage.forgetYourPassSubmitBtn.click();
    }

    @Then("User should see wrong username error message")
    public void userShouldSeeWrongUsernameErrorMessage() {
    Assert.assertTrue(loginPage.forgetYourPassErrorMsg.isDisplayed());

    }
}
