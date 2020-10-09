package com.xiaoniu.chapter01

/**
  * Author: tanggaomeng
  * Date: 2020/9/28 15:38
  * Describe:
  */
object ScalaPring003 {

  def main(args: Array[String]): Unit = {

    val name = "小牛学课堂"
    val parice = 998.88d
    val url = "www.edu360.com"

    // 普通输出
    println("name = " + name, " parice = " + parice, " url = " + url)

    // 文字‘f’插值器允许创建一个格式化的字符串，类似于C语言的printf
    // 在使用‘f’插值器时，所有变量引用都应该是printf样式格式说明符，如d%，i%，f%等
    // 这里$name s%打印String
    println(f"name = $name%s, parice = $parice%1.2f, url = $url")
    printf("name = %s, parice = %1.2f, url = %s", name, parice, url)

    // 's'允许在处理字符串时直接使用变量
    // 在println语句中将String变量($name)附加到普通字符串中
    println("\n")
    println(s"name = $name, parice = $parice, url = $url")

    // 字符串插入器还可以处理任意表达式
    // 使用‘s’字符串插入器处理具有任意表达式(${ 1 + 1 })的字符串( 1 + 1 )的
    println(s"1 + 1 = ${1 + 1}")

  }

}
