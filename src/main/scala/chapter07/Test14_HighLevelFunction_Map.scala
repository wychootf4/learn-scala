package chapter07

/**
 * ClassName: Test14_HighLevelFunction_Map
 * Package: chapter07
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/11 - 15:44
 * @Version: v1.0
 *
 */
object Test14_HighLevelFunction_Map {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // 1. 过滤
    // 选取偶数
    val evenList = list.filter((elem: Int) => {
      elem % 2 == 0
    })
    println(evenList)

    println(list.filter(_ % 2 == 0))

    // 选取奇数
    println(list.filter(_ % 2 == 1))

    println("=========================")

    // 2. map
    // 把集合中每个数乘2
    println(list.map(_ * 2))
    println(list.map(x => x * x))

    println("========================")

    // 3. 扁平化
    val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5), List(6, 7, 8, 9))

    val flatList = nestedList(0) ::: nestedList(1) ::: nestedList(2)
    println(flatList)

    val flatList2 = nestedList.flatten
    println(flatList2)

    println("=========================")

    // 4. 扁平映射
    // 将一组字符串进行分词，并保存成分词的列表
    val strings: List[String] = List("hello world", "hello scala", "hello java", "we study")
    val splitList: List[Array[String]] = strings.map(string => string.split(" "))
    val flattenList = splitList.flatten

    println(flattenList)

    val flatmapList: List[String] = strings.flatMap(_.split(" "))
    println(flatmapList)

    println("==========================")

    // 5. 分组groupBy
    // 分成奇偶两组
    val groupMap: Map[Int, List[Int]] = list.groupBy(_ % 2)
    val groupMap2: Map[String, List[Int]] = list.groupBy(data => {
      if (data % 2 == 0) "even" else "odd"
    })
    println(groupMap)
    println(groupMap2)

    // 给定一组词汇，按照单次的首字母进行分组
    val wordList = List("china", "america", "alice", "canada", "cary", "bob", "japan")
    println(wordList.groupBy(_.charAt(0)))
  }
}
