package com.atguigu.bigdata.chapter05

/**
  * Author: tanggaomeng
  * Date: 2020/10/6 14:47
  * Describe:
  */
object Scala01_Function {

  def main(args: Array[String]): Unit = {
    // TODO java中的方法和scala中的函数都可以进行功能封装，但是方法必须和类型绑定，但是函数不需要

    // 函数声明
    def test(s: String): Unit = {
      // 函数体
      println(s)
    }
    // 调用函数
    test("zhangsan")


  }

}
