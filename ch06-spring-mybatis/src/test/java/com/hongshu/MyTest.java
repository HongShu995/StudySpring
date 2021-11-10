package com.hongshu;

import com.hongshu.dao.StudentDao;
import com.hongshu.entity.Student;
import com.hongshu.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest
{
    @Test
    public void test01()
    {
        String config = "applicationContext.xml" ;
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        String[] names = ac.getBeanDefinitionNames();
        for(String name:names)
        {
            System.out.println("容器中对象的名称:"+name+"||||||"+ac.getBean(name).getClass().getName());
        }
    }

    @Test
    public void testDaoInsert()
    {
        String config = "applicationContext.xml" ;
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的dao对象
        StudentDao dao = (StudentDao) ac.getBean("studentDao");
        Student student = new Student(1007,"王五","wangwu@qq.com",29);
        int num = dao.insertStudent(student);
        System.out.println("num="+num);
    }

    @Test
    public void testServiceInsert()
    {
        String config = "applicationContext.xml" ;
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的dao对象
        StudentService service = (StudentService) ac.getBean("studentService");
        Student student = new Student(1008,"赵四","zhaosi@qq.com",49);
        int num = service.addStudent(student);
        System.out.println("num="+num);
    }

    @Test
    public void testServiceSelect()
    {
        String config = "applicationContext.xml" ;
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的dao对象
        StudentService service = (StudentService) ac.getBean("studentService");
        List<Student> students = service.queryStudent();
        for(Student student:students)
        {
            System.out.println("学生为：：：：：：：："+student);
        }
    }
}
