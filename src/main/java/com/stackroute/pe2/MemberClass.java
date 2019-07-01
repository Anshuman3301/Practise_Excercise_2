package com.stackroute.pe2;

public class MemberClass
{
    String name;
    int age;
    float salary;

    public MemberClass(String name, int age, float salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public String name()
    {
        return "Member's name: "+name;
    }

    public String age()
    {
        return "age: "+age;
    }

    public String salary()
    {
        return "salary: "+salary;
    }
}

class MemberVariables
{
    MemberClass ob=new MemberClass("Harry", 20, 10);
}
