package chapter01

/**
 * ClassName: HelloWorld
 * Package: chapter01
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/01/30 - 0:06
 * @Version: v1.0
 *
 */

/*
  object: 关键字，声明一个单例对象(伴生对象)
 */
object HelloWorld {
  /*
    main方法：从外部可以直接调用执行的方法
    def 方法名称(参数名称:参数类型): 返回值类型 = { 方法体 }
   */
  def main(args: Array[String]): Unit = {
    println("hello world")
    System.out.println("hello scala from java")
  }
}
