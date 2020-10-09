package com.xiaoniu.chapter02

import scala.collection.mutable.ArrayBuffer

/**
  * Author: tanggaomeng
  * Date: 2020/10/9 18:58
  * Describe:
  */
object Scala01_ArrayTest {

  def main(args: Array[String]): Unit = {

    // TODO 定长数组
    // 初始化一个长度为8的定长数组，其所有元素均为0
    val arr1 = new Array[Int](8)
    // 直接打印定长数组，内容为数组的hashcode值
    println(arr1)
    // 长度固定
    println(arr1.length)
    // 将数组转换为数据缓冲，就可以看到数组中的内容了
    // toBuffer会将数据转换为数组的缓冲
    println(arr1.toBuffer)
    // 数组下标从0开始
    println(arr1(0))
    // 注意：如果new，相当于调用了数组的apply方法，直接为数组赋值

    println("-"*40)

    // 初始化一个长度为 10 的定长数组
    // 不使用new声明数组，不会调用数组的apply方法初始化数组
    val arr2: Array[Int] = Array[Int](10)
    println(arr2.toBuffer)

    println("-"*40)

    // 定义一个长度为3的定长数组
    val arr3 = Array("hadoop", "storm", "spark")
    // 使用数组的下标()来访问数组中的元素
    println(arr3(2))

    println("="*40)
    // TODO 变长数组
    // 如果想使用数组缓冲，需要导入 import scala.collection.mutable.ArrayBuffer包
    val arrb1: ArrayBuffer[Int] = ArrayBuffer[Int]()
    println(arrb1)
    println(arrb1.length)
    // 向数组缓冲的尾部追加一个元素
    // += 尾部追加元素
    arrb1 += 1
    println(arrb1)
    println(arrb1.length)
    // 追加多个元素
    arrb1 += (2, 3, 4, 5)
    println(arrb1)
    // 追加一个数组
    arrb1 ++= Array(6, 7)
    println(arrb1)
    // 追加一个数组缓冲
    arrb1 ++= ArrayBuffer(8, 9)
    println(arrb1)

    println("-"*40)

    // 在数组某个位置插入元素用insert，第一个数字代表插入数组位置，其余数据代表插入数据
    arrb1.insert(1, 10)
    println(arrb1)
    arrb1.insert(0, -1, 0)
    println(arrb1)
    arrb1.insert(1, 11, 12, 13)
    println(arrb1)

    println("-"*40)
    // 删除数组某个位置的元素
    arrb1.remove(0)
    println(arrb1)
    arrb1.remove(0, 3)
    println(arrb1)



  }

}
