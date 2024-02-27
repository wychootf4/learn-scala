package chapter06

/**
 * ClassName: Test04_ClassForAccess
 * Package: chapter06
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/04 - 22:10
 * @Version: v1.0
 *
 */
object Test04_ClassForAccess {

}

// 定义一个父类
class Person {
  private var idCard: String = "3523566"
  protected var name: String = "alice"
  var sex: String = "female"
  private[chapter06] var age: Int = 18

  def printInfo(): Unit = {
    println(s"Person: $idCard $name $sex $age")
  }
}
