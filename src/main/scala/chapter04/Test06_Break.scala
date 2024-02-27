package chapter04

import scala.util.control.Breaks

/**
 * ClassName: Test06_Break
 * Package: chapter04
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/01 - 23:06
 * @Version: v1.0
 *
 */
object Test06_Break {
  def main(args: Array[String]): Unit = {
    // 1. 采用抛出异常的方式，退出循环
    try {
      for (i <- 0 until 5) {
        if (i == 3)
          throw new RuntimeException
        println(i)
      }
    } catch {
      case e: Exception => //什么都不做，只是退出循环
    }

    // 2. 使用Scala中的Breaks类的break方法，实现异常的抛出和捕捉
    Breaks.breakable(
      for (i <- 0 until 5) {
        if (i == 3)
          Breaks.break()
        println(i)
      }
    )
  }
}
