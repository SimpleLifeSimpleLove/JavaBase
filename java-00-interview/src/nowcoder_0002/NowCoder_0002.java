package nowcoder_0002;

import org.junit.Test;

/**
 * Date: 2020/12/11 14:01
 * Content:
 */
public class NowCoder_0002 {

    @Test
    public void test01() {

        // 报错 ： java.lang.NumberFormatException: For input string: "123456a"
        String str = "123456a";
        int i = Integer.parseInt(str);
    }

    /*
    (单选题)与未加访问控制符的缺省情况相比，public和protected修饰符扩大了属性和方法的访问范围，
           private修饰符则缩小了这种范围(A)。
           A.正确      B.错误
     */

    /*
    (单选题)对于非运行时异常，程序一般可不做处理，由Java虚拟机自动进行处理(B)
           A.正确      B.错误

           分析：
           运行异常，可以通过Java虚拟机来自行处理；非运行时异常，我们应该捕获或者抛出。
     */

    /*
    (单选题)关于C++/Java类中static成员和对象成员的说法正确的是(C)
           A.static成员变量在对象构造时生成
           B.static成员函数在对象成员函数中无法调用
           C.虚成员函数不可能是static成员函数
           C.static成员函数不能访问static成员变量

           分析：
           https://blog.csdn.net/wuqiuping695/article/details/49069779
     */

    /*
    (单选题)下列哪个对象访问修饰符作用范围是由大到小排列是正确的(D)
           A.private > default > protected > public
           B.public > default > protected > private
           C.private > protected > default > public
           C.public > protected > default > private

           分析：
           public : 可以被当前类，子类，包，其他包 访问
           protected : 可以被当前类，子类，包 访问
           default : 可以被当前类，包 访问
           private : 只能被当前类访问
     */

    /*
        TestObj
     */

    /*
        Test
     */

    @Test
    public void test02() {

        String str = "Hello World";

//        str += ' a';  // 编译直接报错，因为是两个字符
//        int len = str.length;  // 编译直接报错
//        str = 100;  // 编译直接报错
        str = str + 100;
    }

    /*
    (不定项选择题)下列说法错误的是(ABCD)
        A.Java面向对象语言允许单独的过程和函数存在
        B.Java面向对象语言允许单独的方法存在
        C.Java语言中的非静态方法属于类中成员(member)
        D.Java语言中的方法必定隶属于某一类(对象)，调用方法与C语言的过程和C++语言的函数相同
     */

}
