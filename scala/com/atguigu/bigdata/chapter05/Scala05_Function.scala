package com.atguigu.bigdata.chapter05

/**
  * Author: tanggaomeng
  * Date: 2020/10/6 14:47
  * Describe:
  */
object Scala05_Function {

  def main(args: Array[String]): Unit = {
    // TODO 函数式编程 - 地狱
    // TODO Scala是完全面向函数式编程语言
    // 函数可以赋值给变量
    // 函数可以作为函数的参数
    // 函数可以作为函数的返回值

    /*
    def f(): Unit = {
      println("function")
    }

    def f0() = {
      // 返回函数，有问题，需要增加特殊符号，下划线
      f _
    }

    f0()()
    */

    // TODO 函数柯里化
    def f3(i: Int)(j: Int): Int = {
      i * j
    }
    println(f3(3)(4))

    // TODO 闭包
    // 一个函数在实现逻辑时，将外部的变量引入到函数的内部，改变了这个变量的生命周期，称之为闭包
    def f1(i: Int) = {
      def f2(j: Int): Int = {
        i * j
      }
      f2 _
    }
    println(f1(2)(3))

    // 将函数作为参数传递给另外一个函数
    // ()=>Unit
    // 参数列表 => 返回值类型
    def f4(f:() => Int):Int = {
      f() + 10
    }
    def f5(): Int = {
      5
    }
    println(f4(f5))

    // TODO 匿名函数改善代码
    def f6(f: () => Unit): Unit = {
      f()
    }
    f6(()=>{println("xxxxxxxxx")})






  }

}
