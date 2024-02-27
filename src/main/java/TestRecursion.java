/**
 * ClassName: TestRecursion
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: wang.y
 * @Create: 2024/02/04 - 17:21
 * @Version: v1.0
 */
public class TestRecursion {
    public static void main(String[] args) {
        // 计算阶乘
        System.out.println(factorial(5));
        System.out.println(fact(5));
    }

    // 1. 循环实现
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 2. 递归实现
    public static int fact(int n) {
        // 基准情形
        if (n == 0) return 1;
        return n * fact(n - 1);
    }
}
