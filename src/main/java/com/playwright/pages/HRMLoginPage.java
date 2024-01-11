package com.playwright.pages;

 import com.microsoft.playwright.Page;
 import com.playwright.factory.DriverFactory;
 import org.springframework.stereotype.Component;

@Component
public class HRMLoginPage  {

    public static Page page;
    String userName_xpath = "//input[@name='username']";
    String passWord_xpath = "//input[@name='password']";
    String submit_xpath = "button[type='submit']";

    public void login(Page page){
        this.page = page;
        page.locator(userName_xpath).fill("Admin");
        page.locator(passWord_xpath).fill("admin123");
        page.click(submit_xpath);
     }

}



