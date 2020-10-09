package com.atguigu.bigdata.chapter05

/**
  * Author: tanggaomeng
  * Date: 2020/10/6 14:47
  * Describe:
  */
object Scala06_Function {

  def main(args: Array[String]): Unit = {
    // TODO 递归
    // 1.函数的逻辑代码中调用自身
    // 2.函数在调用自身时，传递的参数应该有规律
    // 3.函数应该有跳出递归的逻辑，否则死循环

    // 阶乘 = 一个大于1的数的阶乘 = 这个数 * （数-1）阶乘

    def !!(i: Int): Int = {
      if (i == 1) {
        1
      } else {
        i * !!(i-1)
      }
    }

    println(!!(3))

  }

}
