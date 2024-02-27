package chapter05

import scala.annotation.tailrec

/**
 * ClassName: Test10_Recursion
 * Package: chapter05
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/04 - 17:26
 * @Version: v1.0
 *
 */
object Test10_Recursion {
  def main(args: Array[String]): Unit = {
    println(fact(5))
    println(tailFact(5))
  }

  // 递归实现计算阶乘
  def fact(n: Int): Int = {
    if (n == 0) return 1
    n * fact(n - 1)
  }

  // 尾递归实现
  def tailFact(n: Int): Int = {
    @tailrec
    def loop(n: Int, currRes: Int): Int = {
      if (n == 0) return currRes
      loop(n - 1, currRes * n)
    }
    loop(n, 1)
  }
}
