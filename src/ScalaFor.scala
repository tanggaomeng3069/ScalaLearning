/**
  * Author: tanggaomeng
  * Date: 2020/9/29 15:19
  * Describe:
  */
object ScalaFor {

  def main(args: Array[String]): Unit = {

    // 定义一个数组，元素 1到6
    val array = Array(1, 2, 3, 4, 5, 6)
    // 遍历打印数组中的元素
    for (ele <- array) { // 类似java中的增强for
      println("ele: " + ele)
    }

    // 通过角标获取数组中的元素
    // 定义一个0到5的角标范围
    for (i <- 0 to 5) { //0 to 5 会生成一个范围集合 Range(0,1,2,3,4,5)
      println("i: " + i + ", ele: " + array(i))
    }

    for (i <- 0 until 6) { // 0 until 6 会生成一个范围集合 Range(0,1,2,3,4,5)
      println("i: " + i + ", ele: " + array(i))
    }
    // to 和 until 的区别就是to包含为前后都为闭区间，until为前闭后开区间

    // 打印数组中的偶数
    for (ele <- array if ele % 2 == 0) { // for 表达式可以增加守卫
      println("ele: " + ele)
    }

    // 观察下面代码输出结果
    for (i <- 1 to 3; j <- 1 to 3; if i != j) {
      println(i + ", " + j)
      println((10 * i + j) + " ")
    }

//    for (e <- array if e % 2 == 0) yeild e


  }

}
