package chapter06

/**
 * ClassName: Test07_Inherit
 * Package: chapter06
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/04 - 23:18
 * @Version: v1.0
 *
 */
object Test07_Inherit {
  def main(args: Array[String]): Unit = {
    val student1 = new Student7("alice", 18)
    val student2 = new Student7("bob", 20, "std001")

    student1.printInfo()
    student2.printInfo()

    val teacher = new Teacher
    teacher.printInfo()

    def personInfo(person: Person7): Unit = {
      person.printInfo()
    }

    println("============================")

    val person = new Person7
    personInfo(student1)
    personInfo(teacher)
    personInfo(person)
  }
}

// 定义一个父类
class Person7() {
  var name: String = _
  var age: Int = _

  println("1. 父类的主构造器调用")

  def this(name: String, age: Int) {
    this()
    println("2. 父类的辅助构造器调用")
    this.name = name
    this.age = age
  }

  def printInfo(): Unit = {
    println(s"Person: $name $age")
  }
}

// 定义子类
class Student7(name: String, age: Int) extends Person7(name, age) {
  var stuNo: String = _

  println("3. 子类的主构造器调用")

  def this(name: String, age: Int, stdNo: String) {
    this(name, age)
    println("4. 子类的辅助构造器调用")
    this.stuNo = stdNo
  }

  override def printInfo(): Unit = {
    println(s"Student: $name $age $stuNo")
  }
}

class Teacher extends Person7 {
  override def printInfo(): Unit = {
    println("Teacher")
  }
}
