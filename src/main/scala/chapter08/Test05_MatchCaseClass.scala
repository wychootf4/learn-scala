package chapter08

/**
 * ClassName: Test05_MatchCaseClass
 * Package: chapter08
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/12 - 11:27
 * @Version: v1.0
 *
 */
object Test05_MatchCaseClass {
  def main(args: Array[String]): Unit = {
    val student = Student1("alice", 19)

    // 针对对象实例的内容进行匹配
    val result: String = student match {
      case Student1("alice", 19) => "Alice, 18"
      case _ => "Else"
    }

    println(result)
  }
}

// 定义样例类
case class Student1(name: String, age: Int)