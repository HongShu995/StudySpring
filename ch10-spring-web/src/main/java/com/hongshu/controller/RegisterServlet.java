package com.hongshu.controller;

import com.hongshu.entity.Student;
import com.hongshu.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.setCharacterEncoding("utf-8");
        String strId = request.getParameter("id");
        String strName = request.getParameter("name");
        String strEmail = request.getParameter("email");
        String strAge = request.getParameter("age");

        //创建spring的容器对象
        //String config= "spring.xml";
        //ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //org.springframework.context.support.ClassPathXmlApplicationContext@3fc37184, started on Thu Nov 11 22:50:01 CST 2021
        WebApplicationContext wac = null;
        //获取ServletContext中的容器对象，创建好的容器对象，拿来就用
        //String key =  WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
        //Object attr  = getServletContext().getAttribute(key);
        //if( attr != null){
        //    wac = (WebApplicationContext)attr;
        //}

        //使用框架中的方法，获取容器对象
        ServletContext sc= getServletContext();
        wac = WebApplicationContextUtils.getRequiredWebApplicationContext(sc);
        System.out.println("容器对象的信息============"+wac);

        //获取Service
        StudentService service = (StudentService) wac.getBean("studentService");
        Student student = new Student();
        student.setId(Integer.parseInt(strId));
        student.setName(strName);
        student.setEmail(strEmail);
        student.setAge(Integer.valueOf(strAge));
        service.addStudent(student);


        //给一个页面
        request.getRequestDispatcher("/result.jsp").forward(request,response);
    }
}
