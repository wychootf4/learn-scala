package chapter06

/**
 * ClassName: Test16_TraitSelfType
 * Package: chapter06
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/06 - 1:02
 * @Version: v1.0
 *
 */
object Test16_TraitSelfType {
  def main(args: Array[String]): Unit = {
    val user = new RegisterUser("alice", "123456")
    user.insert()
  }
}

// 用户类
class User(val name: String, val password: String)

trait UserDao {
  _: User =>

  // 向数据库插入数据
  def insert(): Unit = {
    println(s"insert into db: ${this.name}")
  }
}

// 定义注册用户类
class RegisterUser(name: String, password: String) extends User(name, password) with UserDao