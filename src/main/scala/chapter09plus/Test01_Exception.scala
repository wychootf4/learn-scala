package chapter09plus

/**
 * ClassName: Test01_Exception
 * Package: chapter09plus
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/12 - 11:57
 * @Version: v1.0
 *
 */
object Test01_Exception {
  def main(args: Array[String]): Unit = {
    try {
      val n = 10 / 0
    } catch {
      case e: ArithmeticException => {
        println("发生算术异常")
      }
      case e: Exception => {
        println("发生一般异常")
      }
    } finally {
      println("处理结束")
    }
  }
}
