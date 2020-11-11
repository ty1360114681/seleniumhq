package com.example.demo.menu;

import com.example.demo.ui.ProcessUi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexHtml extends Html {

    private WebDriver driver;
    private String  url="http://192.168.202.12/WebUI/index.html";

    public IndexHtml() {
        this.driver=new ChromeDriver();
        this.driver.get(url);
    }

    public IndexHtml(WebDriver driver) {
        this.driver = driver;
    }

    public ProcessManagement goProcessManagement() {
        return new ProcessManagement(driver);
    }

    public UserManagement goUserManagement(){
        return new UserManagement(driver);
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
}
