package com.hongshu;

import com.hongshu.ba07.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest07
{
    @Test
    public void test01()
    {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeServiceImpl proxy = (SomeServiceImpl) ac.getBean("someService");

        //目标类没有接口，使用cglib动态代理，spring框架会自动应用cglib
        //com.hongshu.ba07.SomeServiceImpl$$EnhancerBySpringCGLIB$$495f2403
        System.out.println("proxy===="+proxy.getClass().getName());
        proxy.doThird();

    }
}
