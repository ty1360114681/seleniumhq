package com.example.demo.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpIndexHtml extends Html {
    private WebDriver driver;
    private String  url="http://192.168.202.12/WebUI/OperateIndex.html";



    public OpIndexHtml(WebDriver driver) {
        this.driver = driver;
        this.driver.get(url);
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
