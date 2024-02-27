/**
 * ClassName: TestOperator
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/01/31 - 23:18
 * @Version: v1.0
 */
public class TestOperator {
    public static void main(String[] args) {
        // 比较运算符
        String s1 = "hello";
        String s2 = new String("hello");

        Boolean isEqual = s1 == s2;
        System.out.println(isEqual);
        System.out.println(s1.equals(s2));

        System.out.println("=============================");

        // 赋值运算符
        byte b = 10;
        b = (byte)(b + 1);
        b += 1;
        System.out.println(b);

        // 自增自减
        int x = 15;
        int y = ++ x;
        System.out.println("x = " + x + ", y = " + y);

        x = 23;
        x = x++;
        System.out.println(x);
    }
}
