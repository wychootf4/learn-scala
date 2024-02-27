package chapter07

import scala.collection.mutable

/**
 * ClassName: Test07_MutableSet
 * Package: chapter07
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/08 - 22:56
 * @Version: v1.0
 *
 */
object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    // 1. 创建set
    val set1: mutable.Set[Int] = mutable.Set(13, 23, 53, 12, 13, 23, 78)
    println(set1)

    println("===========================")

    // 2. 添加元素
    val set2: mutable.Set[Int] = set1 + 11
    println(set1)
    println(set2)

    set1 += 11
    println(set1)

    val flag1 = set1.add(10)
    println(flag1)
    println(set1)
    val flag2 = set1.add(10)
    println(flag2)
    println(set1)

    println("===========================")

    // 3. 删除元素
    set1 -= 11
    println(set1)

    val flag3 = set1.remove(10)
    println(flag3)
    println(set1)
    val flag4 = set1.remove(10)
    println(flag4)
    println(set1)

    println("============================")

    // 4. 合并两个Set
    val set3 = mutable.Set(13, 12, 13, 27, 98, 29)
    println(set1)
    println(set3)

    println("=================================")
    val set4 = set1 ++ set3
    println(set1)
    println(set3)
    println(set4)

    set1 ++= set3
    println(set1)
    println(set3)
  }
}
