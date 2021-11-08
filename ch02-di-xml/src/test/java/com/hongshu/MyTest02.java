package com.hongshu;

import com.hongshu.ba02.School;
import com.hongshu.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest02
{
    @Test
    public void test02()
    {
        String config="ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取Student对象
        Student student = (Student) ac.getBean("myStudent");
        System.out.println("student对象="+student);


    }

    @Test
    public void test03()
    {
        School school = new School();
        school.setName("凑弟弟学院");
        school.setAddress("云南");
        Student student = new Student();
        student.setName("李四");
        student.setAge(20);
        student.setSchool(school);
        System.out.println("student========="+student);
    }

}
