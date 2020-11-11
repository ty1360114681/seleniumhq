package com.example.demo.menu;

import com.example.demo.ui.BomUI;
import com.example.demo.ui.ProcessUi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ProcessManagement {
    private WebDriver driver;
    private String  url="http://192.168.202.12/WebUI/index.html";
    private WebDriverWait wait = null;



    public ProcessManagement(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("j1_1_anchor")));
        this.driver.findElement(By.id("j1_1_anchor")).click();
    }

    public BomUI goBomUi(){
        return new BomUI(driver);
    }

    public ProcessUi gorocessUi(){
        return new ProcessUi(driver);
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
