package com.wxx;

import com.wxx.pojo.Person;
import com.wxx.pojo.Student;

/**
 * Date: 2020/11/24 19:16
 * Content: 测试Class类的创建方式有哪些
 */
public class Test02 {

    public static void main(String[] args) throws Exception {

        Person person = new Student();
        System.out.println("这个人是：" + person.name);

        // 方式一：通过对象获得
        Class c1 = person.getClass();
        // 方式二：forName获得
        Class c2 = Class.forName("com.wxx.pojo.Student");
        // 方式三：通过.class获得
        Class c3 = Student.class;
        // 方式四：基本内置类型的包装类都有一个Type属性
        Class c4 = Integer.TYPE;

        // 获取父类类型
        Class c5 = c1.getSuperclass();
    }
}
