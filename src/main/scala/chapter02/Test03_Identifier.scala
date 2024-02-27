package chapter02

/**
 * ClassName: Test03_Identifier
 * Package: chapter02
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/01/30 - 22:03
 * @Version: v1.0
 *
 */
object Test03_Identifier {
  def main(args: Array[String]): Unit = {
    // (1) 以字母或者下划线开头，后接字母、数字、下划线
    val hello: String = ""
    val Hello123 = ""
    val _abc = 123

//    val h-b = ""
//    val 123abc = 234

    // (2) 以操作符开头，且只包含操作符 (+ - * / # !等)
    val -+/% = "hello"
    println(-+/%)

    // (3) 用反引号`....`包含的任意字符串，即使是Scala关键字(39个)也可以
    val `if` = "if"
    println(`if`)
  }
}
