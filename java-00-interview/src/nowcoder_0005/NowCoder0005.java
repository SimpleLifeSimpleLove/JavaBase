package nowcoder_0005;

import org.junit.Test;

/**
 * Date: 2020/12/24 11:00
 * Content:
 */
public class NowCoder0005 {

    /*
    (单选题) 静态内部类不可以直接访问外围类的非静态数据，而非静态内部类可以直接访问外围类的数据，
    包括私有数据。(A)
        A 正确
        B 错误

        分析：InnerTest
     */

    /*
    (单选题) instanceof运算符能够用来判断一个对象是否为：(C)
        A 一个类的实例
        B 一个实现指定接口的类的实例
        C 全部正确
        D 一个子类的实例

        分析：InstanceofTest
     */

    /*
    (单选题) JDK中提供的java、javac、jar等开发工具也是用Java编写的。(A)
        A 正确
        B 错误
     */

    /*
    (单选题) 下列不属于Java语言特点的是：(D)
        A Java致力于检查程序在编译和运行时的错误
        B Java能运行虚拟机实现扩平台
        C Java自己操纵内存减少了内存出错的可能性
        D Java还实现了真数组，避免了覆盖数据类型的可能

        分析：Java还实现了真数组，避免了覆盖数据的可能，不是数据类型
            https://blog.csdn.net/riskys/article/details/56494649
     */

    /*
    以下程序段执行后将有(C)个字节被写入到文件file.txt中
        try {
            FileOutputStream fos = new FileOutputStream("file.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(3);
            dos.writeChar(1);
            dos.close();
            fos.close();
        } catch (IOException e) { }

        A 3
        B 5
        C 6
        D 不确定，与软硬件环境有关
     */

    /*
    (单选题) 以下哪一个不是赋值符号：(D)
        A +=
        B <<=
        C <<<=
        D >>>=

        分析：不存在<<<=
     */
    @Test
    public void test01() {
        int a = 1;
        a += 1;
        a <<= 1;
//        a <<<= 1;  // 编译错误，不存在<<<=
        a >>>= 1;
    }
}
