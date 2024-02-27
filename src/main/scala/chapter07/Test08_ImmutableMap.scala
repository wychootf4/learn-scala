package chapter07

/**
 * ClassName: Test08_ImmutableMap
 * Package: chapter07
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/08 - 23:10
 * @Version: v1.0
 *
 */
object Test08_ImmutableMap {
  def main(args: Array[String]): Unit = {
    // 1. 创建map
    val map1: Map[String, Int] = Map("a" -> 13, "b" -> 25, "hello" -> 3)
    println(map1)
    println(map1.getClass)

    println("============================")

    // 2. 遍历元素
    map1.foreach(println)
    map1.foreach( (kv: (String, Int)) => println(kv))

    println("============================")

    // 3. 取map中所有的key或者value
    for (key <- map1.keys) {
      println(s"$key ---> ${map1.get(key)}")
    }

    // 4. 访问某一个key的value
    println("a: " + map1.get("a").get)
    println("c: " + map1.get("c"))
    println("c: " + map1.getOrElse("c", 0))

    println(map1("a"))
  }
}
