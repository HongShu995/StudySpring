package com.hongshu;

import com.hongshu.ba03.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest03
{
    @Test
    public void test01()
    {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeService proxy = (SomeService) ac.getBean("someService");

        String str = proxy.doFirst("李四",20);//myAround()
        System.out.println("str===="+str);

    }
}
