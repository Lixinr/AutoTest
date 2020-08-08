package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("在测试方法之前运行" );
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("在测试方法之后运行" );
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("这是在类运行之前的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("这是在类运行之后的方法");
    }
    @AfterSuite
    public void aftersuit(){
        System.out.println("aftersuit测试套件");
    }
    @BeforeSuite
    public void beforesuit(){
        System.out.println("beforesuit测试套件");
    }
}
