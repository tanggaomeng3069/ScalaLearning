package com.xiaoniu.chapter02

import scala.collection.mutable

/**
  * Author: tanggaomeng
  * Date: 2020/10/14 19:43
  * Describe:
  */
object Scala06_MutMapTest {

  def main(args: Array[String]): Unit = {

    val map1 = new mutable.HashMap[String, Int]()
    // 向map中添加元素
    map1("spark") = 1
    map1 += (("hadoop", 2))
    map1.put("storm", 3)
    println("map1: " + map1)

    // 取值 get getOrElse()

    println(map1.get("spark"))
    println(map1.getOrElse("hive", 4))
    println(map1.getOrElse("storm", 5))

    // 从map中移除数据
    map1 -= "spark"
    map1.remove("hadoop")
    println(map1)

  }

}
