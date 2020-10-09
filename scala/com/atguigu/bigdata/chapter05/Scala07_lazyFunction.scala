package com.atguigu.bigdata.chapter05

/**
  * Author: tanggaomeng
  * Date: 2020/10/6 14:47
  * Describe:
  */
object Scala07_lazyFunction {


  def sum(x: Int, y: Int): Int = {

    println("sum()函数执行了。。。。")
    x + y

  }

  def main(args: Array[String]): Unit = {
    // TODO 惰性函数

    val res1: Int = sum(10, 20)
    println("==========================")
    println("==========================")
    println("==========================")
    println("==========================")
    println("==========================")
    println("==========================")
    println("==========================")
    println("res1 = " + res1)


    lazy val res2: Int = sum(10, 20)
    println("---------------------------")
    println("---------------------------")
    println("---------------------------")
    println("---------------------------")
    println("---------------------------")
    println("res2 = " + res2)




  }

}
