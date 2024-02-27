package chapter02

/**
 * ClassName: Test04_String
 * Package: chapter02
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/01/30 - 22:08
 * @Version: v1.0
 *
 */
object Test04_String {
  def main(args: Array[String]): Unit = {
    // (1) 字符串，通过+号连接
    val name: String = "alice"
    val age: Int = 18
    println(age + "岁的" + name + "在尚硅谷学习")

    // *用于将一个字符串复制多次并拼接
    println(name * 3)

    // (2) printf用法: 字符串，通过%传值
    printf("%d岁的%s在尚硅谷学习", age, name)
    println()

    // (3) 字符串魔板 (插值字符串): 通过$获取变量值
    println(s"${age}岁的${name}在尚硅谷学习")

    val num: Double = 2.3456
    println(f"The sum is ${num}%2.2f") // 格式化模板字符串
    println(raw"The num is ${num}%2.2f")

    // 三引号表示字符串，保持多行字符串的原格式输出
    val sql = s"""
       |select *
       |from
       |  student
       |where
       |  name = ${name}
       |and
       |  age > ${age}
       |""".stripMargin
    println(sql)
  }
}
