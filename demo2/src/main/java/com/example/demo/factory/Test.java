package com.example.demo.factory;

import com.example.demo.menu.IndexHtml;
import com.example.demo.menu.LoginHtml;
import com.example.demo.menu.OpIndexHtml;
import com.example.demo.op.UserOp;

public class Test {

    public Test() {
        System.setProperty("webdriver.chrome.driver","E:\\app\\demo2\\drivers\\chromedriver.exe");
    }

    //登入进入管理终端步骤管理
    public void LogAddUser(){
        IndexHtml indexHtml= (IndexHtml) new LoginHtml().getloginOp().bulid(1);
        indexHtml.goProcessManagement().gorocessUi();
        new OpIndexHtml(indexHtml.getDriver());
    }

    public void  LogAddUser2(){
        String name="test5";
        String pwd="1";
       //登入进入首页
        IndexHtml indexHtml= (IndexHtml) new LoginHtml().getloginOp().bulid(1);
        //创建用户
        UserOp userOp= indexHtml.goUserManagement().goUserUi().UserOp().addBulid(name,pwd);

        try {
            Thread.sleep(1000); // 休眠3秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        IndexHtml indexHtml2= (IndexHtml) new LoginHtml().getloginOp().bulid(name,userOp.getPassword(),1);


    }




}
