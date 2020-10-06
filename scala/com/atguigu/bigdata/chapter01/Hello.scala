package com.atguigu.bigdata.chapter01

/**
  * Author: tanggaomeng
  * Date: 2020/10/5 11:03
  * Describe:
  */
object Hello {

  // Scala源码中包含了main方法，在编译后自动形成了 public static void main
  // Scala在编译时，回生成两个字节码文件，静态main方法执行另外一个字节码文件中的成员main方法
  // Scala是完全面向对象的语言，没有静态语法，只能通过模拟生成静态方法
  // 编译时把当前类生成一个特殊的类 ==> Hello$，然后创建对象来调用这个对象的main方法

  // 一般情况下，将加$的类的对象，称之为“伴生对象”
  // 伴生对象中的内容，都可以通过类名访问，来模拟java中的静态语法
  // 伴生对象的语法规则：使用object声明

  // scala中没有public关键字，默认所有的访问权限都是公共的
  // scala中没有void关键字，采用特殊的对象模拟：Unit

  // scala中声明方法采用关键字：def
  // 方法后面的小括号，是参数列表
  // scala中参数列表的声明方式和java不一样
  // java：参数类型 参数名
  // scala：参数名: 参数类型
  // java中方法的声明和方法体是直接连接的
  // scala中方法的声明和方法体是通过等号连接的
  // scala中将方法的返回值类型放置在方法声明的后面使用冒号连接

  def main(args: Array[String]): Unit = {

    println("Hello World!!")

  }

}
