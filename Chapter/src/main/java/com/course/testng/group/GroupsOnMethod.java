package com.course.testng.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("运行服务端组test1");
    }
    @Test(groups = "server")
    public void test21(){
        System.out.println("运行服务端组test2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("运行客户端组test3");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("运行客户端组test4");
    }
    @BeforeGroups("server")
    public void beforeOnServer(){
        System.out.println("before server");
    }
    @BeforeGroups("server")
    public void beforeGroup(){
        System.out.println("before server");
    }
    @AfterGroups("server")
    public void afterGroup(){
        System.out.println("after server");
    }

}
