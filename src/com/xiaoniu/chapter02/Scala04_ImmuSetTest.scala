package com.xiaoniu.chapter02

import scala.collection.immutable.HashSet


/**
  * Author: tanggaomeng
  * Date: 2020/10/14 19:30
  * Describe:
  */
object Scala04_ImmuSetTest {

  def main(args: Array[String]): Unit = {

    val set1 = new HashSet[Int]()
    println("set1: " + set1)
    // 将元素和set1合并生成一个新的set，原set不变
    val set2 = set1 + 4
    println("set2: " + set2)
    println("set1: "+ set1)
    // set中元素不能重复
    val set3 = set1 ++ Set(4, 5, 6, 7)
    println("set3: " + set3)
    val set0 = Set(1, 2, 3) ++ set3
    println("set0: " + set0)
    println(set0.getClass)

  }

}
