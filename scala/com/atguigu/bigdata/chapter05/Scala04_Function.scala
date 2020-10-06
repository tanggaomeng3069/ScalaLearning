package com.atguigu.bigdata.chapter05

/**
  * Author: tanggaomeng
  * Date: 2020/10/6 14:47
  * Describe:
  */
object Scala04_Function {

  def main(args: Array[String]): Unit = {
    // TODO 函数式编程 - 扩展
    // TODO 可变参数

    def test(s: String*): Unit = {
      println(s)
    }
    // 调用参数时，可以传递多个值，也可以不传
    test()
    test("zhansan", "lisi", "wangwu")

    // TODO 默认参数
    def test1(name: String, age: Int = 20): Unit = {
      println(s"${name} - ${age}")
    }
    test1("zhangsan")
    test1("zhangsan",30)

    // TODO 带名参数
    // 传参时，带上参数的名称





  }

}
