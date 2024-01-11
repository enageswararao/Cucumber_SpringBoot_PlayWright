package com.playwright.steps;

import com.microsoft.playwright.Page;
import com.playwright.factory.DriverFactory;
import com.playwright.pages.HRMLoginPage;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class HRMAppLoginSteps {

    public Page page ;
@Autowired
HRMLoginPage hrmLoginPage;
    @When("I login into OrangeHRM App")
    public void i_enter_username_as( ) {
        page = DriverFactory.getPage();
        page .navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         hrmLoginPage.login(page);
    }


}
