package com.hongshu;

import com.hongshu.ba06.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest06
{
    @Test
    public void test02()
    {
        //加载总配置文件
        String config= "ba06/total.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取Student对象
        Student student = (Student) ac.getBean("myStudent");
        System.out.println("student对象="+student);


    }


}
