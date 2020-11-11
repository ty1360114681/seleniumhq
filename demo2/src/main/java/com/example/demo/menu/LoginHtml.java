package com.example.demo.menu;

import com.example.demo.op.LogInOp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginHtml extends Html{
    private WebDriver driver;
    private String  url="http://192.168.202.12/WebUI/login.html";

    public LoginHtml() {
        this.driver=new ChromeDriver();
        this.driver.get(url);
    }

    //获取登录操作
     public LogInOp getloginOp(){
      return new LogInOp(driver);
     }





    //获取修改密码操作


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
}
