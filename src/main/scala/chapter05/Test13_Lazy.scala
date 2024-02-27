package chapter05

/**
 * ClassName: Test13_Lazy
 * Package: chapter05
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/04 - 18:17
 * @Version: v1.0
 *
 */
object Test13_Lazy {
  def main(args: Array[String]): Unit = {
    lazy val result: Int = sum(13, 47)

    println("1. 函数调用")
    println("2. result = " + result)
    println("4. result = " + result)
  }

  def sum(a: Int, b: Int): Int = {
    println("3. sum调用")
    a + b
  }
}
