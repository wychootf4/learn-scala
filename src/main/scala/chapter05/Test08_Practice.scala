package chapter05

/**
 * ClassName: Test08_Practice
 * Package: chapter05
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/04 - 16:28
 * @Version: v1.0
 *
 */
object Test08_Practice {
  def main(args: Array[String]): Unit = {
    // 练习1
    val fun = (i: Int, s: String, c: Char) => {
      if (i == 0 && s == "" && c == '0') false else true
    }

    println(fun(0, "", '0'))
    println(fun(0, "", '1'))
    println(fun(23, "", '0'))
    println(fun(0, "hello", '0'))

    println("===============================")

    // 2.练习2
    def func(i: Int): String => (Char => Boolean) = {
      def f1(s: String): Char => Boolean = {
        def f2(c: Char): Boolean = {
          if (i == 0 && s == "" && c == '0') false else true
        }

        f2
      }

      f1
    }

    println(func(0)("")('0'))
    println(func(0)("")('1'))
    println(func(23)("")('0'))
    println(func(0)("hello")('0'))

    // 匿名函数简写
    def func1(i: Int): String => (Char => Boolean) = {
      s => {
        c => {
          if (i == 0 && s == "" && c == '0') false else true
        }
      }
    }

    // 柯里化
    def func2(i: Int)(s: String)(c: Char): Boolean = {
      if (i == 0 && s == "" && c == '0') false else true
    }
  }
}
