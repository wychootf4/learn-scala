package chapter07

/**
 * ClassName: Test10_Tuple
 * Package: chapter07
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/08 - 23:32
 * @Version: v1.0
 *
 */
object Test10_Tuple {
  def main(args: Array[String]): Unit = {
    // 1. 创建元组
    val tuple: (String, Int, Char, Boolean) = ("hello", 100, 'a', true)
    println(tuple)

    // 2. 访问数据
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    println(tuple._4)

    println(tuple.productElement(1))

    println("=====================")

    // 3. 遍历元组数据
    for (elem <- tuple.productIterator)
      println(elem)

    // 4. 嵌套元组
    val mulTuple: (Int, Double, String, (Int, String), Int) = (12, 0.3, "hello", (23, "scala"), 29)
    println(mulTuple._4._2)
  }
}
