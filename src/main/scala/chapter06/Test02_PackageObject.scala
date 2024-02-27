//package chapter06
//
///**
// * ClassName: Test02_PackageObject
// * Package: chapter06
// * Description:
// *
// * @Author: wang.y
// * @Create: 2024/02/04 - 21:40
// * @Version: v1.0
// *
// */
//object Test02_PackageObject {
//  def main(args: Array[String]): Unit = {
//    commonMethod()
//    println(commonValue)
//  }
//}

package chapter06 {
  object Test02_PackageObject {
    def main(args: Array[String]): Unit = {
      commonMethod()
      println(commonValue)
    }
  }
}

package ccc {
  package ddd {
    object Test02_PackageObject {
      def main(args: Array[String]): Unit = {
        println(school)
      }
    }
  }

  // 定义一个包对象
//  package object ddd {
//    val school: String = "atguigu"
//  }
}

// 定义一个包对象
package object ccc {
  val school: String = "atguigu"
}