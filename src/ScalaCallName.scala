import java.util.Date

/**
  * Author: tanggaomeng
  * Date: 2020/9/29 17:06
  * Describe: scala的
  * 传名调用 (call-by-name)
  * 传值调用 (call-by-value)
  */
object ScalaCallName {


  def currentTime(): Long = {
    println("打印系统当前时间，单位为纳秒")
    System.nanoTime()
  }

  /**
    * 该方法的参数为一个无参的函数，并且函数的返回值为Long
    *
    * @param f
    */
  def delayed(f: => Long): Unit = {
    println("delayed ==================")
    println("time = " + f)
  }

  def delayed1(time: Long): Unit = {
    println("delayed1 ==================")
    println("time1 = " + time)
  }

  // 可变参数函数
  def methodManayParams(a: String*): Unit = {
    for (q <- a) {
      println(q)
    }

  }

  // 默认参数值函数
  def add(a: Int = 1, b: Int = 7): Int = {
    println(s"${ a } + ${ b } = ${a + b}")
    a + b
  }

  // 高阶函数：将其他函数作为参数或其结果是函数的函数
  // 定义一个方法，参数为带一个整型，参数返回值为整型的函数 f 和一个整型参数v，返回值为一个函数
  def apply(f: Int => String, v: Int): String = f(v)

  // 定义一个方法，参数为一个整型参数，返回值为String
  def layout(x: Int): String = "[" + x.toString + "]"

  // 定义一个输出的方法，参数为data，message
  def log(date: Date, message: String): Unit = {
    println(s"$date: $message")
  }


  // 求两个数的和
  def add1(x: Int, y: Int) = x + y
  // 那么在调用的时候，应该是：add1(1, 2)
  // 现在把这个函数变形一下
  def add2(x: Int)(y: Int) = x + y
  // 那么调用的时候应该是：add2(1)(2)，最后结果都是一样3，这种方式就叫柯里化
  // 经过柯里化之后，函数的通用性有所降低，但是适用性有所提高
  // 分析一下演变过程
  def add3(x: Int) = (y: Int) => x + y
  // (y: Int) => x + y 作为一个匿名函数，也就意味着add方法的返回值为一个匿名函数
  // 那么其调用过程如下：

  def main(args: Array[String]): Unit = {

    // 调用方式1
    delayed(currentTime())

    println("----------------分割线-----------------------")

    // 调用方式2
    val time: Long = currentTime()
    delayed1(time)

    println("----------------分割线-----------------------")
    delayed1(currentTime())

    println("----------------分割线-----------------------")
    // 调用可变参数函数
    methodManayParams("中华", "人民", "共和国")

    println("----------------分割线-----------------------")
    // 调用默认参数值函数
    add(2) // 带有默认值a的参数，调用时可以不传
    add(b = 9, a = 2) // 调用时可以指定具体的参数值
    add(b = 18) // 调用时，如果执行修改某一具体的参数值的话，可以指定参数名称

    println("----------------分割线-----------------------")
    // 高阶函数
    println(apply(layout, 10))

    println("----------------分割线-----------------------")
    val date = new Date()
    // 调用log的时候，传递一个具体的时间参数，message为待定参数
    // logBoundDate成了一个新的函数，只有log的部分参数(message)
    val logBoundDate: String => Unit = log(date, _:String)
    // 调用logBoundDate的时候，只需要传递传的message参数即可
    logBoundDate("hello world")
    logBoundDate("北京欢迎您")

    println("----------------分割线-----------------------")
    val result = add3(2)
    val sum1 = result(3)
    val sum2 = result(8)
    print(s"sum1：$sum1 \n")
    print(s"sum2：$sum2 \n")

  }

}
