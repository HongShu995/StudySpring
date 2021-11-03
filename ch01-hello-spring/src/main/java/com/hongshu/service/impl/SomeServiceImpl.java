package com.hongshu.service.impl;

import com.hongshu.service.SomeService;

public class SomeServiceImpl implements SomeService
{
    public SomeServiceImpl()
    {
        System.out.println("SomeServiceImpl的无参构造方法");
    }

    @Override
    public void doSome()
    {
        System.out.println("执行了SomeServiceImpl的doSome()方法");
    }
}
