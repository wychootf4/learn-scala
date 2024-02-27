package chapter06

/**
 * ClassName: Test10_AnonymousClass
 * Package: chapter06
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/05 - 23:39
 * @Version: v1.0
 *
 */
object Test10_AnonymousClass {
  def main(args: Array[String]): Unit = {
    val person: Person10 = new Person10 {
      override var name: String = "alice"

      override def eat(): Unit = println("person eat")
    }
    println(person.name)
    person.eat()
  }
}

// 定义抽象类
abstract class Person10 {
  var name: String
  def eat(): Unit
}
