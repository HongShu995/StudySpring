package com.hongshu.ba07;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


//省略value
@Component("myStudent")

public class Student
{
    private String name;
    private Integer age;

    /**
     * 引用类型
     * @Resource: 来自jdk中的注解，spring框架提供了对这个注解的功能支持，可以使用它给引用类型赋值
     *            使用的也是自动注入原理，支持byName， byType .默认是byName
     *  位置： 1.在属性定义的上面，无需set方法，推荐使用。
     *        2.在set方法的上面
     *
     * @Resource只使用byName方式，需要增加一个属性 name
     *   name的值是bean的id（名称）
     */
    //只使用byName
    @Resource(name = "mySchool")
    private School school;


    public Student()
    {
        System.out.println("student的无参数构造方法");
    }
    @Value("张三")
    public void setName(String name)
    {
        this.name = name;
    }
    @Value("515")
    public void setAge(Integer age)
    {
        System.out.println("setAge===="+age);
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
