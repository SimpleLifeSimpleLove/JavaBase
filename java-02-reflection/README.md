## 反射

* 反射：Reflection
  * 反射是Java被视为动态语言的关键，反射机制允许程序在执行期间借助Reflection API 可以得到任何类的内部信息，并能直接操作任意对象的内部属性及方法。
  * 加载（这里的加载是指(加载，链接(验证、准备、解析)，初始化)中的加载）完类之后，在堆内存中产生一个Class类型对象（存储在堆中，这个Class实例对应的类模板存储在方法区中(JDK8之前叫做永久代，JDK8及以后叫做元空间)），这个对象包含了完整的类的结构信息。我们可以通过这个对象看到类的结构。这个对象就像一面镜子，透过这个镜子我们可以看到类的结构，所以，我们形象的称之为：反射
* 反射提供的功能
  * 在运行时判断任意一个对象所属的类
  * 在运行时构造任意一个类的对象
  * 在运行时判断一个类所具有的成员变量和方法
  * 在运行时获取泛型类型
  * 在运行时调用任意一个对象的成员变量和方法
  * <font color=red>**在运行时处理注释**</font>
  * <font color=red>**生成动态代理**</font>
  * ......
* 反射的优缺点
  * 优点
    * 可以实现动态创建对象，体现出很大的灵活性
  * 缺点
    * 对性能有影响。使用反射基本上是一种解释操作，我们可以告诉JVM，我们希望做出什么并且满足我们的要求。这类操作总是慢于直接执行相同的操作。
* 反射相关API
  * java.lang.Class 	代表一个类
  * java.lang.reflect.Constructor       代表类的构造器
  * java.lang.reflect.Method      代表类的方法
  * java.lang.reflect.Field     代表类的成员变量
  * ......

* Class类
  * 通过Class可以得到的信息：
    * 属性
    * 方法
    * 构造器
    * 实现了哪些接口
  * 对于每个类而言，JRE都为其保留了一个不变的Class类型的对象。一个Class对象包含了特定某个结构（class / interface / enum / annotation / primitive type / void / []）的有关信息。
  * Class本身也是一个类
  * Class对象只能由系统建立对象
  * 一个Class对象对应的是一个加载到JVM中的class文件
  * 每个类的实例都会记得自己是由哪一个Class实例所生成
  * 通过Class可以完整地得到一个类中的所有被加载的结构
  * Class是Reflection的根源，针对任何你想动态加载、运行的类，唯有先获得相应的Class对象，才能操作

* 哪些类型可以有Class对象
  * class：外部类，成员（成员内部类、静态内部类），局部内部类，匿名内部类
  * interface：接口
  * []：数组
  * enum：枚举
  * annotation：注解@interface
  * primitive type：基本数据类型
  * void

---

* 反射操作泛型
  * Java采用泛型擦除机制来引入泛型，Java中泛型仅仅是给编译器javac使用的，确保数据的安全性和免除强制类型转换问题，但是，一旦编译完成，所有和泛型有关的类型全部被擦除。
  * 为了通过反射操作这些类型，Java新增了ParameterizedType，GenericArrayType，TypeVariable和WildcardType几种类型来代表不能被归一到Class类中的类型但是又和远类型齐名的类型
    * ParameterizedType：表示一种参数化类型，比如Collection\<String>
    * GenericArrayType：表示一种元素类型是参数化类型或者类型变量的数组类型
    * TypeVariable：是各种类型变量的公共父接口
    * WildcardType：代表一种通配符类型表达式





















