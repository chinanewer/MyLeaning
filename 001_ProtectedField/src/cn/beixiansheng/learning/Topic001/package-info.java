/**
 * Topic001：protected字段，它可以被同包的类访问。
 * ***********************************************************************
 * 子类通过继承在，自己类里面访问自己的protected字段，但是不能访问异包的类的protected字段。
 * 示例说明如下：
 * Person是被用来继承的超类；WPerson是与Person同包、继承Person的子类；Tiger是与Person同包、没有继承关系的类；Theater是与Person异包，继承Person的子类。
 * 为了测试，在Person中设计了一个protected类型的变量age；在每个类里面创建了一个方法，叫做doSth()。
 * 在WPerson与Tiger类中，都是直接可以访问Person对象的protected字段（age）的；在Teacher中不能直接访问Person类的protected字段(age)，但是能访问自己继承得到的protected字段。
 */
package cn.beixiansheng.learning.Topic001;