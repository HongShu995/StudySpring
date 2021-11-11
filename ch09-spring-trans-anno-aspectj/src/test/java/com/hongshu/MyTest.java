package com.hongshu;

import com.hongshu.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest
{
    @Test
    public void Test01()
    {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        BuyGoodsService service = (BuyGoodsService) ac.getBean("buyGoodsService");
        //service是代理：com.sun.proxy.$Proxy12:jdk动态代理对象
        System.out.println("service是代理："+service.getClass().getName());
        service.buy(1005,10);

    }
}
