package com.hongshu.ba01;

public class Student
{
    private String name;
    private int age;

    public Student()
    {
        System.out.println("spring会调用类的无参构造方法创建对象");
    }

    public void setName(String name)
    {
        System.out.println("setName:"+name);
        this.name = name;
    }

    public void setAge(int age)
    {
        System.out.println("setAge:"+age);
        this.age = age;
    }

    public void setEmail(String email)
    {
        System.out.println("setEmail="+email);
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
