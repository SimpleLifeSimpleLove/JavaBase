## 注解

* 元注解

  * 元注解的作用就是负责注解其他注解，Java定义了4个标准的 meta-annotation类型，他们被用来提供对其他注解类型的说明

  * 元注解和他们所支持的类在java.lang包中可以找到，包含四个**@Target、@Retention、@Documented、@Inherited**

    * **@Target**：用于描述注解的使用范围（即：被描述的注解可以用什么地方）

      ```java
      public enum ElementType {
          /** Class, interface (including annotation type), or enum declaration */
          TYPE,
      
          /** Field declaration (includes enum constants) */
          FIELD,
      
          /** Method declaration */
          METHOD,
      
          /** Formal parameter declaration */
          PARAMETER,
      
          /** Constructor declaration */
          CONSTRUCTOR,
      
          /** Local variable declaration */
          LOCAL_VARIABLE,
      
          /** Annotation type declaration */
          ANNOTATION_TYPE,
      
          /** Package declaration */
          PACKAGE,
      
          /**
           * Type parameter declaration
           *
           * @since 1.8
           */
          TYPE_PARAMETER,
      
          /**
           * Use of a type
           *
           * @since 1.8
           */
          TYPE_USE
      }
      ```

      

    * **@Retention**：表示需要在什么级别保存注释信息，用于描述注解生命周期

      source < class < runto=ime

    * **@Documented**：说明该注解将被包含在javadoc中

    * **@Inherited**：说明子类可以继承父类中的注解

* Annotation是从JDK1.5开始引入的技术
  * Annotation的作用
    * 不是程序本身，可以对程序作出解释（这一点和注释没有什么区别）
    * <font color=red>**可以被其他程序读取**</font>
  * Annotation在哪里使用？
    * 可以附加在package，class，method，field等上面，相当于给他们添加了额外的信息，<font color=red>**我们可以通过反射机制编程实现这些元数据的访问**</font>