package chapter09plus

/**
 * ClassName: Test03_Generics
 * Package: chapter09plus
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/12 - 12:24
 * @Version: v1.0
 *
 */
object Test03_Generics {
  def main(args: Array[String]): Unit = {
    // 1. 协变和逆变
    val child: Parent = new Child
    //    val childList: MyCollection[Parent] = new MyCollection[Child]
    val childList: MyCollection[GrandChild] = new MyCollection[Child]

    // 2. 上下限
    def test[A <: Child](a: A): Unit = {
      println(a.getClass.getName)
    }

    test[Child](new GrandChild)
  }
}

// 定义继承关系
class Parent {}

class Child extends Parent {}

class GrandChild extends Child {}

// 定义带泛型的集合类型
class MyCollection[-E] {}