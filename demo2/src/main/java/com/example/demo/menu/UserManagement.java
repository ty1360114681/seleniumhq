package com.example.demo.menu;

import com.example.demo.ui.BomUI;
import com.example.demo.ui.UserUi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserManagement {
    private WebDriver driver;
    private String  url="http://192.168.202.12/WebUI/index.html";
    private WebDriverWait wait = null;

    public UserManagement(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("j1_54_anchor")));
        this.driver.findElement(By.id("j1_54_anchor")).click();
    }

    public UserUi goUserUi(){
        return new UserUi(driver);

    }



    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public void setWait(WebDriverWait wait) {
        this.wait = wait;
    }
}
