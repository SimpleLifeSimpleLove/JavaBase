package com.wxx;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * Date: 2020/11/24 21:06
 * Content: 反射操作注解
 */
public class Test08 {

    public static void main(String[] args) throws Exception {

        Class c = Class.forName("com.wxx.Customer");

        // 通过类上反射获得注解
        Annotation[] annotations = c.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        // 获取类上注解中value的值
        MyTable myTable = (MyTable) c.getAnnotation(MyTable.class);
        String value = myTable.value();
        System.out.println(value);

        // 获取类中字段的注解
        System.out.println("========================================");
        Field name = c.getDeclaredField("name");  // 获取字段
        MyField myField = name.getAnnotation(MyField.class);  // 获取字段上的注解
        System.out.println(myField.columnName());
        System.out.println(myField.type());
        System.out.println(myField.length());
    }
}


@MyTable("db_customer")
class Customer {

    @MyField(columnName = "db_id", type = "int", length = 10)
    private int id;
    @MyField(columnName = "db_age", type = "int", length = 3)
    private int age;
    @MyField(columnName = "db_name", type = "varchar", length = 10)
    private String name;

    public Customer() {
    }

    public Customer(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

// 类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyTable {
    String value();
}

// 属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyField {
    String columnName();

    String type();

    int length();
}

