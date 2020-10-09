package com.xiaoniu.chapter01

/**
  * Author: tanggaomeng
  * Date: 2020/9/29 16:03
  * Describe: 方法的定义及调用
  *
  * 定义方法的格式为：
  * def methodName([list of parameters]): [return type] = {}
  * 如果不使用等号和方法体，则隐式声明抽象(abstract)方法。
  *
  * 例如：
  * def ml(x: Int, y: Int): Int = x * y
  * def：关键字
  * ml：方法名
  * (x: Int, y: Int)：参数列表
  * : Int：方法返回值类型
  * x * y：方法体
  *
  */
object ScalaMethod {

  // 定义一个sum方法，该方法有两个参数，参数类型为整型，方法的返回值为整型
  def sum(a: Int, b: Int): Int = {
    a + b
  }

  // 该方法没有任何参数，也没有任何返回值
  def sayHello1 = println("Say BB1")

  def sayHello2() = println("Say BB2")

  def main(args: Array[String]): Unit = {

    // 调用
    val result1: Int = sum(1, 5)
    println("sum: " + result1)

    sayHello1
    sayHello2()

  }



}
