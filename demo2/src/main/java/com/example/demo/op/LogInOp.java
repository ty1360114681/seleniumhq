package com.example.demo.op;

import com.example.demo.menu.Html;
import com.example.demo.menu.IndexHtml;
import com.example.demo.menu.OpIndexHtml;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LogInOp   {
       private WebDriver driver;
       private WebDriverWait wait;
       public LogInOp(WebDriver driver) {
        this.driver=driver;
    }

    public Html bulid(int type){
        this.driver.findElement(By.id("userAccount")).sendKeys("admin");
        this.driver.findElement(By.id("password")).sendKeys("1");
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //设置超时时间
        // 4.获取“百度一下”按钮，进行搜索
        this.driver.findElement(By.id("login")).click();
        if(type==1){
            return new IndexHtml(driver);
        }else{
            return new OpIndexHtml(driver);
        }
    }
    public Html bulid(String name,String pwd,int type){
        this.driver.findElement(By.id("userAccount")).sendKeys(name);
        this.driver.findElement(By.id("password")).sendKeys(pwd);
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //设置超时时间
        // 4.获取“百度一下”按钮，进行搜索
        this.driver.findElement(By.id("login")).click();


          //正常登入情况
              //选择终端
              //默认终端
          //异常登入情况
            //无权限
            //密码错误
            //用户不存在
            //密码有效期
            //用户失效
            //用户锁定
         this.driver.findElement(By.xpath("//*[@id=\"layui-layer3\"]/div[2]"));
//        if(type==1){
           return new IndexHtml(driver);
//        }else{
//            return new OpIndexHtml(driver);
//        }

    }


}
