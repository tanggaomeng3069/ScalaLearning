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


  }

}
