package com.example.demo;

import com.example.demo.factory.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class DemoApplicationTests {


	//带页面
	@org.junit.jupiter.api.Test
	public void pjsTest() throws InterruptedException {
		System.setProperty("phantomjs.binary.path", "E:\\app\\demo2\\drivers\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();


		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys("phantomJS");

		Thread.sleep(3000);
//        获取title
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
   @org.junit.jupiter.api.Test
	public void test2() throws InterruptedException {
		//加载引擎
		System.setProperty("webdriver.chrome.driver","E:\\app\\demo2\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//进入登入页面
		driver.get("http://192.168.202.12/WebUI/login.html");
	    driver.findElement(By.id("userAccount")).sendKeys("admin");
	    driver.findElement(By.id("password")).sendKeys("1");
        //设置超时时间
	   WebDriverWait wait = new WebDriverWait(driver, 10);
	   wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login")));
	   // 4.获取“百度一下”按钮，进行搜索
	   driver.findElement(By.id("login")).click();
	   wait.until(ExpectedConditions.presenceOfElementLocated(By.id("j1_1_anchor")));
       driver.findElement(By.id("j1_1_anchor")).click();
	   wait.until(ExpectedConditions.presenceOfElementLocated(By.id("j1_4_anchor")));
	   driver.findElement(By.id("j1_4_anchor")).click();

	}
	@org.junit.jupiter.api.Test
	public void teset3(){

		//登录
		new Test().LogAddUser2();
	}

	@org.junit.jupiter.api.Test
	public void test4(){
		String tes="新增用户为,初始密码为：731612";
		String pwdd=tes.substring(tes.length()-6,tes.length());
	}
}
