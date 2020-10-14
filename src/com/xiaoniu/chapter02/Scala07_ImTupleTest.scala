package com.xiaoniu.chapter02

/**
  * Author: tanggaomeng
  * Date: 2020/10/14 19:48
  * Describe:
  */
object Scala07_ImTupleTest {

  def main(args: Array[String]): Unit = {

    // 定义元组
    var t = (1, "hello", true)
    println("t: " + t)
    // 或者
    val tuple3 = new Tuple3(1, "hello", true)
    println("tuple3: " + tuple3)

    // 访问tuple中的元素
    println(t._1)
    println(t._2) // 访问元素总的第二个元素
    println(t._3)

    // 迭代元组
    t.productIterator.foreach(println)

    // 对偶元组
    val tuple2 = (1, 3)
    println("tuple2: " + tuple2)
    // 交换元组的元素位置，tuple2元组没有变化，生成了一个新的元组
    val swap = tuple2.swap
    println("swap: " + swap)



  }

}
