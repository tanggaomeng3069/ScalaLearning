package com.atguigu.bigdata.chapter03

/**
  * Author: tanggaomeng
  * Date: 2020/10/6 10:44
  * Describe:
  */
object Scala01_Swap {

  def main(args: Array[String]): Unit = {

    var a = 10
    var b = 20
    println(s"${a} = ${b}")

    /*
    // 第一种交换方式
    var c = a
    a = b
    b = c
    println(s"${a} = ${b}")
    */

    /*
    // 第二种交换方式
    a = a + b
    b = a - b
    a = a - b
    println(s"${a} = ${b}")
    */

    // 第三种交换方式
    a = a ^ b
    b = a ^ b
    a = a ^ b
    println(s"${a} = ${b}")


  }

}
