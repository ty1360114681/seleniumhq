package com.example.demo.op;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class UserOp {
    private WebDriver driver;
    private WebDriverWait wait;
    private String password="";
    public UserOp(WebDriver driver) {
        this.driver=driver;
    }
 //新增用户
    public UserOp addBulid(String name,String pwd){
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.findElement(By.id("add_user_btn")).click();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.findElement(By.id("useraccount")).sendKeys(name);
        this.driver.findElement(By.id("username")).sendKeys(pwd);
        this.driver.findElement(By.id("useremail")).sendKeys("1@1qq.com");
        this.driver.findElement(By.id("usertelephone")).sendKeys("17821823721");
        this.driver.findElement(By.id("save")).click();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement webElement=this.driver.findElement(By.xpath("//*[@id=\"layui-layer5\"]/div[2]"));
        String test= webElement.getAttribute("innerHTML");
        password=test.substring(test.length()-6,test.length());
        return this;
    }

    //查询用户
    public UserOp queryBulid(){
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.findElement(By.id("account")).sendKeys("test");
        this.driver.findElement(By.id("name")).sendKeys("test");
        this.driver.findElement(By.id("user_search_btn")).click();
        return this;
    }

    //检查
    public void  check(){


    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public void setWait(WebDriverWait wait) {
        this.wait = wait;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
