package chapter07
import scala.collection.immutable
import scala.collection.parallel.immutable.ParSeq

/**
 * ClassName: Test20_Parallel
 * Package: chapter07
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/11 - 18:06
 * @Version: v1.0
 *
 */
object Test20_Parallel {
  def main(args: Array[String]): Unit = {
    val result: immutable.IndexedSeq[Long] = (1 to 100).map(
      x => Thread.currentThread().getId
    )
    println(result)

    val result2: ParSeq[Long] = (1 to 100).par.map(
      x => Thread.currentThread().getId
    )
    println(result2)
  }
}
