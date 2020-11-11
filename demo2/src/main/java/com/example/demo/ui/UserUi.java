package com.example.demo.ui;

import com.example.demo.op.UserOp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UserUi {
    private WebDriver driver;
    private String  url="http://192.168.202.12/WebUI/business/user-new/new-user.html";
    private WebDriverWait wait = null;



    public UserUi(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        this.driver.manage().window().maximize();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("j1_60_anchor")));
        this.driver.findElement(By.id("j1_60_anchor")).click();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement element=driver.findElement(By.xpath("//*[@id=\"admin-body\"]/div/div/div[3]/iframe"));
        this.driver.switchTo().frame(element);

    }

    //获取用户操作
    public UserOp UserOp(){
        return new UserOp(driver);
    }

}
