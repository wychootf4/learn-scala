/**
 * ClassName: package
 * Package: chapter06
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/04 - 21:38
 * @Version: v1.0
 *
 */
package object chapter06 {
  // 定义当前包共享的属性和方法
  val commonValue = "尚硅谷"
  def commonMethod(): Unit = {
    println(s"我们在${commonValue}学习")
  }
}
