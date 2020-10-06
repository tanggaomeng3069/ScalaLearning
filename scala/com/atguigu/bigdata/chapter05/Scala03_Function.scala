package com.atguigu.bigdata.chapter05

/**
  * Author: tanggaomeng
  * Date: 2020/10/6 14:47
  * Describe:
  */
object Scala03_Function {

  def main(args: Array[String]): Unit = {
    // TODO scala可以采用自动推断功能来简化函数的声明
    // TODO 至简

    // 1.函数声明时，明确无返回值Unit，那么即使函数体中有return也不起作用
    /*
    def test(): Unit = {
      return "zhangsan"
    }
    */

    // 如果函数体的最后一行代码进行返回，那么return关键字可以省略
    /*
    def test(): String = {
      "zhangsan"
    }
    */

    // 如果可以根据函数的最后一行代码推断类型，那么函数返回值类型可以省略
    /*
    def test() = {
      "zhangsan"
    }
    */

    // 如果明确函数没有返回值，那么等号可以省略，省略后，编译器不会将函数体最后一行代码作为返回值
    /*
    def test() {
      "zhangsan"
    }
    */

    // 如果整个函数体中只有一行代码，那么大括号可以省略
    /*
    def test() = "zhangsan"
    */

    // 如果函数声明中没有参数列表，那么小括号可以省略
    // 但是访问函数时不能增加小括号
    // TODO 声明函数时必须使用def，不然和变量无法区分
    def test = "zhangsan"
    println(test)







  }

}
