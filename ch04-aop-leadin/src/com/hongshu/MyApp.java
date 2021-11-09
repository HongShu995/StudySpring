package com.hongshu;

import com.hongshu.handler.MyInvocationHandler;
import com.hongshu.service.SomeService;
import com.hongshu.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyApp
{
    public static void main(String[] args)
    {
        //调用doSome，doOther
        //SomeService service = new SomeServiceImpl();
        //service.doSome();
        //System.out.println("===================================");
        //service.doOther();

        //使用jdk的Proxy创建对象
        //创建目标对象
        SomeService service = new SomeServiceImpl();

        //创建InvocationHandler对象
        InvocationHandler handler = new MyInvocationHandler(service);

        //使用Proxy创建代理
        SomeService proxy = (SomeService) Proxy.newProxyInstance(service.getClass().getClassLoader()
                ,service.getClass().getInterfaces(),handler);

        //通过代理执行方法，会调用handler中的invoke()
        proxy.doSome();
        System.out.println("====================");
        proxy.doOther();

    }
}
