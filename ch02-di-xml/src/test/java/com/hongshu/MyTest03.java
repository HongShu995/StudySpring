package com.hongshu;

import com.hongshu.ba03.School;
import com.hongshu.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;


public class MyTest03
{
    @Test
    public void test02()
    {
        String config="ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取Student对象
        Student student = (Student) ac.getBean("myStudent2");
        System.out.println("student对象="+student);

        File file = (File) ac.getBean("myfile");
        System.out.println("myfile=========="+file);


    }


}
