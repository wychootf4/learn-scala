package chapter05

/**
 * ClassName: Test01_FunctionAndMethod
 * Package: chapter05
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/01 - 23:22
 * @Version: v1.0
 *
 */
object Test01_FunctionAndMethod {
  def main(args: Array[String]): Unit = {
    // 定义函数
    def sayHi(name: String): Unit = {
      println("hi, " + name)
    }

    // 调用函数
    sayHi("alice")

    // 调用对象方法
    Test01_FunctionAndMethod.sayHi("bob")

    // 获取方法返回值
    val result = Test01_FunctionAndMethod.sayHello("cary")
    println(result)
  }

  // 定义对象的方法
  def sayHi(name: String): Unit = {
    println("Hi, " + name)
  }

  def sayHello(name: String): String = {
    println("Hi, " + name)
    return "Hello"
  }
}
