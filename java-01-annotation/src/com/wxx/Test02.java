package com.wxx;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Date: 2020/11/24 18:31
 * Content: 自定义注解
 */
public class Test02 {

    // 注解可以显式赋值，如果没有默认值，我们就必须给注解赋值
    // 注解赋值顺序没有要求
    @MyAnnotation1(age = 18, name = "王肖肖")
    public void test1() {

    }

    // 如果注解里面只有一个属性，并且属性变量名为value，则赋值时不需要显式写出
    @MyAnnotation2("王肖肖")
    public void test2() {

    }

}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation1 {

    // 参数类型 参数名();
    String name();

    int id() default -1;  // 如果默认值为-1，代表不存在

    int age();

    String[] schools() default {"杨寨小学", "大连理工大学"};
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {

    String value();
}

