package chapter06

import scala.beans.BeanProperty

/**
 * ClassName: Test03_Class
 * Package: chapter06
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/04 - 21:58
 * @Version: v1.0
 *
 */
object Test03_Class {
  def main(args: Array[String]): Unit = {
    // 创建一个对象
    val student = new Student()
    //    student.name // error, 不能访问private属性
    println(student.age)
    println(student.sex)
    student.sex = "female"
    println(student.sex)
    student.setAge(18)
    println(student.age)
  }
}

// 定义一个类
class Student {
  // 定义属性
  private var name: String = "alice"
  @BeanProperty
  var age: Int = _
  var sex: String = _
}
