package com.wxx;

import com.wxx.pojo.User;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * Date: 2020/11/24 20:51
 * Content: 通过反射获取泛型
 */
public class Test07 {

    public void test01(Map<String, User> map, List<User> list) {

        System.out.println("test01");
    }

    public Map<String, User> test02() {

        System.out.println("test02");
        return null;
    }

    public static void main(String[] args) throws Exception {
        Class c = Test07.class;

        // 获取泛型参数
        Method test01 = c.getDeclaredMethod("test01", Map.class, List.class);  // 获取方法
        Type[] types = test01.getGenericParameterTypes();  // 获取方法的参数
        for (Type type : types) {
            // System.out.println(type);
            /*
             * java.util.Map<java.lang.String, com.wxx.pojo.User>
             * java.util.List<com.wxx.pojo.User>
             */
            if (type instanceof ParameterizedType) {
                Type[] arguments = ((ParameterizedType) type).getActualTypeArguments();
                for (Type argument : arguments) {
                    System.out.println(argument);
                    /*
                     * class java.lang.String
                     * class com.wxx.pojo.User
                     *
                     * class com.wxx.pojo.User
                     */
                }
            }
        }

        // 获取泛型返回值
        System.out.println("========================================");
        Method test02 = c.getDeclaredMethod("test02", null);  // 获取方法
        Type type = test02.getGenericReturnType();  // 获取方法的返回值
        // System.out.println(type);
        /*
         * java.util.Map<java.lang.String, com.wxx.pojo.User>
         */
        if (type instanceof ParameterizedType) {
            Type[] arguments = ((ParameterizedType) type).getActualTypeArguments();
            for (Type argument : arguments) {
                System.out.println(argument);
                /*
                 * class java.lang.String
                 * class com.wxx.pojo.User
                 */
            }
        }

    }

}
