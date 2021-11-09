package com.hongshu;

import com.hongshu.ba01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01
{
    @Test
    public void test01()
    {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeService proxy = (SomeService) ac.getBean("someService");
        //通过代理的对象执行方法，实现目标方法执行时，增强了功能
        proxy.doSome("李四",20);
    }
}
