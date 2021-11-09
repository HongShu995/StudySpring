package com.hongshu.service.impl;

import com.hongshu.service.SomeService;
import com.hongshu.util.ServiceTools;

import java.util.Date;

// service类的代码不修改，也能够增加 输出时间， 事务。
public class SomeServiceImpl implements SomeService
{
    @Override
    public void doSome()
    {
        System.out.println("执行业务方法doSome");
    }

    @Override
    public void doOther()
    {
        System.out.println("执行业务方法doOther");
    }
}
