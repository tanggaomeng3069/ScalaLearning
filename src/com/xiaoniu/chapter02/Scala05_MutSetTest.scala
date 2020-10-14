package com.xiaoniu.chapter02

import scala.collection.mutable

/**
  * Author: tanggaomeng
  * Date: 2020/10/14 19:38
  * Describe:
  */
object Scala05_MutSetTest {

  def main(args: Array[String]): Unit = {

    // 创建一个可变的HashSet
    val set1 = new mutable.HashSet[Int]()
    // 向 HashSet中添加元素
    set1 += 2
    // add等价于+=
    set1.add(4)

    set1 ++= Set(1, 3, 5)
    println("set1: " + set1)

    // 删除一个元素，若集合中没有该元素，不报错
    set1 -= 5
    set1.remove(2)
    println("set1: " + set1)

  }

}
