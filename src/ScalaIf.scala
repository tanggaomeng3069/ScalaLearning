/**
  * Author: tanggaomeng
  * Date: 2020/9/29 14:49
  * Describe:
  */
object ScalaIf {

  def main(args: Array[String]): Unit = {

    // if语句的使用
    val faceValue: Int = 99
    val res1: String = if(faceValue > 90) "青蛙" else "恐龙"
    println(res1)

    // 8 > 8 不成立，且代码没有else分支，res2是什么呢？()
    val i = 8
    val res2: AnyVal = if(i > 8) i
    println(res2)

    val res3: Any = if(i > 8) i else "前面是整型，这里是字符串，那这个res3是什么呢？Any"
    println(res3)

    // if...else if...else 代码较多时可以使用代码块
    val score: Int = 76
    val res4 = {
      if (score >= 60 && score < 70) "及格"
      else if (score >= 70 && score < 80) "良好"
      else "优秀"
    }
    println(res4)



  }

}
