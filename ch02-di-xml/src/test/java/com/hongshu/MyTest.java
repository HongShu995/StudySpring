package com.hongshu;

import com.hongshu.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest
{
    @Test
    public void test02()
    {
        String config="ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取Student对象
        Student student = (Student) ac.getBean("myStudent");
        System.out.println("student对象="+student);

        Date date = (Date) ac.getBean("mydate");
        System.out.println("myDate=========="+date);

    }

}
