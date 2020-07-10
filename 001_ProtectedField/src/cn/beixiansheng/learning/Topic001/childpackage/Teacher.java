package cn.beixiansheng.learning.Topic001.childpackage;

import cn.beixiansheng.learning.Topic001.Person;

public class Teacher extends Person {
    public void doSth() {
        this.age = 15;
        Person student = new Person();
        // 错误使用，不能获取到
        // student.age = 12;
        // 正确使用方法
        student.setAge(12);
    }
}
