package com.atguigu.bigdata.chapter04
import scala.collection.immutable
import scala.util.control.Breaks

/**
  * Author: tanggaomeng
  * Date: 2020/10/6 11:34
  * Describe:
  */
object Scala01_for {

  def main(args: Array[String]): Unit = {

    /*
            *
           ***
          *****
         *******
        *********
       ***********
      *************
     ***************
    *****************
     */
    for (i <- Range(1, 18, 2)) {

      println(" " * ((18 - i) / 2) + "*" * i + " " * ((18 - i) / 2))

    }

    for {i <- Range(1, 18, 2)
         j = (18 - i) / 2} {

      println(" " * ((18 - i) / 2) + "*" * i + " " * ((18 - i) / 2))

    }


    val result: immutable.IndexedSeq[Int] = for (i <- 1 to 10) yield i*2
    println(result)

    import scala.util.control.Breaks
    Breaks.breakable{
      for (i <- 1 to 10){
        if (i == 5){
          Breaks.break()
        }
        println(i)
      }
    }

    import scala.util.control.Breaks._
    breakable{
      for (i <- 1 to 10){
        if (i == 5){
          break
        }
        println(i)
      }
    }


    println("循环结束")

  }

}
