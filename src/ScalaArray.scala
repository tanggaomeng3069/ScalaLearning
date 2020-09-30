/**
  * Author: tanggaomeng
  * Date: 2020/9/30 15:12
  * Describe:
  */
object ScalaArray {

  def main(args: Array[String]): Unit = {

    // 数组的定义，定义一个固定长度的数组，长度可变，内容可变
//    var x: Array[String] = new Array[String](3)
    // 或者
//    var y = new Array[String](3)

    // 定义一个定长数组，长度不可变，内容可变
//    val z = Array(1, 2, 3)
//    z(0) = 100

    // 定义一个数组
    val array = Array[Int](2,4,6,9,3)
    // map方法将array数组中的每个元素进行某种映射操作，(x: Int) => x * 2
    // 为一个匿名函数，x就是array中的每个元素
    val y = array map((x: Int) => x * 2)
    println("y: " + y.toBuffer)
    // 或者这样写，编译器会自动推测x的数据类型
    val z = array.map(x => x * 2)
    println("z: " + z.toBuffer)
    // 亦或者，_ 表示入参，表示数组中的每个元素
    val x = array.map(_ * 2)
    println("x: " + x.toBuffer)

    println("-------------------分割线-------------------")
    // 定义一个数组
    val words = Array("hello tom hello jim hello jerry", "hello Hatano")

    // 将数据中的元素进行切分
    // Array(Array(hello, tom, hello, jim, hello, jerry), Array(hello, Hatano))
    val splitWords: Array[Array[String]] = words.map(wd => wd.split(" "))

    // 此时数组中的每个元素经过split之后编程array，flatten是对splitWords里面的元素进行扁平化操作
    // Array(hello, tom, hello, jim, hello, jerry, hello, Hatano)
    val flattenWords = splitWords.flatten

    // 遍历数组
    flattenWords.foreach(println)
    println("-------------------分割线-------------------")

    // 上述的2步骤，可以等价于flatMap，意味着map操作后进行flatten操作
    val result: Array[String] = words.flatMap(wd => wd.split(" "))

    // 遍历数组
    result.foreach(println)



  }

}
