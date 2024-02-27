package chapter06

/**
 * ClassName: Test04_Access
 * Package: chapter06
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/04 - 22:09
 * @Version: v1.0
 *
 */
object Test04_Access {
  def main(args: Array[String]): Unit = {
    // 创建对象
    val person: Person = new Person()
    //    person.idCard // error
    //    person.name // error
    println(person.age)
    println(person.sex)

    person.printInfo()

    var worker: Worker = new Worker()
    //    worker = new Worker()
    worker.age = 23
    worker.printInfo()
  }
}

// 定义一个子类
class Worker extends Person {
  override def printInfo(): Unit = {
    println("Worker: ")
    //    println(idCard) // error
    name = "bob"
    age = 25
    sex = "male"

    println(s"Worker: $name $sex $age")
  }
}