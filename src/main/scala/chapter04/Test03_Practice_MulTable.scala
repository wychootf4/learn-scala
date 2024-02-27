package chapter04

/**
 * ClassName: Test03_Practice_MulTable
 * Package: chapter04
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/01 - 22:35
 * @Version: v1.0
 *
 */

// 输出九九乘法表
object Test03_Practice_MulTable {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        print(s"$j * $i = ${i * j} \t")
      }
      println()
    }

    // 简写
    for (i <- 1 to 9; j <- 1 to i) {
      print(s"$j * $i = ${i * j} \t")
      if (i == j) println()
    }
  }
}
