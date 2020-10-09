package com.xiaoniu.chapter02

import scala.collection.mutable.ListBuffer

/**
  * Author: tanggaomeng
  * Date: 2020/10/9 20:01
  * Describe:
  */
object Scala03_MutListTest {

  def main(args: Array[String]): Unit = {

    // 构建一个可变列表，初始有三个元素1，2，3
    val list0: ListBuffer[Int] = ListBuffer[Int](1, 2, 3)
    // 创建一个空的可变列表
    val list1 = new ListBuffer[Int]
    // 向list1中追加元素，注意：没有新生成的集合
    list1 += 4
    list1.append(5)
    println(list1)

    println("-"*40)
    // 将list1中的元素插入到list0中，注意没有新生成的集合
    list0 ++= list1
    println(list0)

    println("-"*40)

    // 将list0和list1合并成为一个新的ListBuffer，注意：新生成了一个新的集合
    val list2: ListBuffer[Int] = list0 ++ list1
    println(list2)

    println("-"*40)

    // 将元素追加到list0的后面生成一个新的集合
    println(list0)
    val list3: ListBuffer[Int] = list0 :+ 6
    println(list0)
    println(list3)



  }

}
