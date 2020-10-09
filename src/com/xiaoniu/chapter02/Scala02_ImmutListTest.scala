package com.xiaoniu.chapter02

/**
  * Author: tanggaomeng
  * Date: 2020/10/9 19:28
  * Describe:
  */
object Scala02_ImmutListTest {

  def main(args: Array[String]): Unit = {

    // 创建一个不可变的集合
    val list1 = List(1, 2, 3)
    println(list1)
    println(list1.length)

    println("-" * 40)

    // 将0插入到list1的前面生成一个新的集合
    val list2: List[Int] = 0 :: list1
    println(list1)
    println(list2)

    val list3: List[Int] = list1.::(0)
    println(list3)

    val list4: List[Int] = 0 +: list1
    println(list4)

    val list5: List[Int] = list1.+:(0)
    println(list5)

    println("-"*40)

    // 将一个元素添加到list1的后面产生一个新的集合
    val list6: List[Int] = list1.:+(4)
    println(list6)

    println("-"*40)
    val list0 = List(4, 5, 6)
    // 将两个list合并成为一个list
    // 两个集合合并时，谁在前面，谁就会在合并后生成的集合的前面
    val list7: List[Int] = list1 ++ list0
    println(list7)
    val list8: List[Int] = list0 ++ list1
    println(list8)

    println("-"*40)
    // 将list0插入到list1前面生成一个新的集合
    val list9: List[Any] = list0 +: list1
    println(list9)
    val list10: List[Any] = list0 ++: list1
    println(list10)
    val list11: List[Int] = list1.:::(list0)
    println(list11)

    // 注意：:: 操作符是右结合的，如 9::5::2::Nil 相当于 9::(5::(2::Nil))

  }

}
