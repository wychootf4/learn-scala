package chapter01

import chapter01.Student.school

/**
 * ClassName: Student
 * Package: chapter01
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/01/30 - 0:45
 * @Version: v1.0
 *
 */
class Student(name: String, var age: Int) {
  def printInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
  }
}

// 引入伴生对象
object Student {
  val school: String = "atguigu"

  def main(args: Array[String]): Unit = {
    val alice = new Student("alice", 20)
    val bob = new Student("bob", 23)

    alice.printInfo()
    bob.printInfo()
  }
}
