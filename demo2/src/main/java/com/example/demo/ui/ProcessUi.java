package com.example.demo.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProcessUi {
    private WebDriver driver;
    private String  url="http://192.168.202.12/WebUI/index.html";
    private WebDriverWait wait = null;

    public ProcessUi() {
    }

    public ProcessUi(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("j1_1_anchor")));
        this.driver.findElement(By.id("j1_1_anchor")).click();
    }

    public void getAddBom(){

    }
}
