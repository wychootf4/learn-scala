package chapter07

import scala.collection.immutable.Queue
import scala.collection.mutable

/**
 * ClassName: Test19_Queue
 * Package: chapter07
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/11 - 18:01
 * @Version: v1.0
 *
 */
object Test19_Queue {
  def main(args: Array[String]): Unit = {
    // 创建一个可变队列
    val queue: mutable.Queue[String] = new mutable.Queue[String]()

    queue.enqueue("a", "b", "c")

    println(queue)
    println(queue.dequeue())
    println(queue)
    println(queue.dequeue())
    println(queue)

    queue.enqueue("d", "e")

    println(queue)
    println(queue.dequeue())
    println(queue)

    // 不可变队列
    val queue2: Queue[String] = Queue("a", "b", "c")
    val queue3: Queue[String] = queue2.enqueue("d")
    println(queue2)
    println(queue3)
  }
}
