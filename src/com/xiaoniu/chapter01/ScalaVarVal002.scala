package com.xiaoniu.chapter01

/**
  * Author: tanggaomeng
  * Date: 2020/9/28 14:43
  * Describe:
  */
object ScalaVarVal002 {

  def main(args: Array[String]): Unit = {

    /**
      * 变量的定义
      * 可以是 var 和 val 修饰
      * var 修饰的变量，可以更改
      * val 修饰的变量，不可以更改，相当于 java 中的 final 修饰的变量
      *
      * var|val 变量名称(:变量类型) = 变量值
      *
      * Unit 数据类型相当于 java 中的 void 关键字，但是在 scala 中它的标识是一对括号()
      * 表示，没有返回值
      */

    // 使用 val 修饰的变量，值不能修改
    val name = "张三"

    // 使用 var 修饰的变量，值可以修改
    var age = 18

    age = 20

    // 定义变量时，可以指定数据类型，也可以不指定，不指定时编译器会自动推测变量的数据类型
    val nickName: String = "zhangsan"

    println("name = " + name, " age = " + age, " nickName = " + nickName)
    // (name = 张三, age = 20, nickName = zhangsan)

  }

}
