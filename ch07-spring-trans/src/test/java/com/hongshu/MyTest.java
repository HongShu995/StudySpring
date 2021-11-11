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
        service.buy(1001,200);

    }
}
