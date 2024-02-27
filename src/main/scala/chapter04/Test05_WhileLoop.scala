package chapter04

/**
 * ClassName: Test05_WhileLoop
 * Package: chapter04
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/01 - 23:00
 * @Version: v1.0
 *
 */
object Test05_WhileLoop {
  def main(args: Array[String]): Unit = {
    // while
    var a: Int = 10
    while (a >= 1) {
      println("this is a while loop: " + a)
      a -= 1
    }

    var b: Int = 0
    do {
      println("this is a do-while loop: " + b)
      b -= 1
    } while (b > 0)
  }
}
