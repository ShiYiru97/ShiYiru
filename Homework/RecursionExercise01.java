package exercise;

public class RecursionExercise01 {
    public static void main(String[] args) {
        T t1 =new T();
        int n = 3;
        int res = t1.fibonacci(n);
        if(res != -1) {
            System.out.println("当n = " + n + "时，对应的斐波那契数为" + res);
        }else{
            System.out.println("需要输入大于1的整数。");
        }

    }
}
class T{
    /*
    使用递归的方式求出斐波那契数 1 1 2 3 5 8 13...
    给一个整数n 求出他的值是多少
    思路分析：
    1.当n = 1时，斐波那契 = 1；
    2.当n = 2时，斐波那契 = 1；
    3.当n = 3时，斐波那契 = 2；
    4.当 n >= 3时，斐波那契 = 前两个数的和 = arr[n-2] + arr[n-1] = arr[n]
    5.这里就是一个递归的思路
    */
    public int fibonacci(int n){
        if(n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            }else{
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }else{
//            System.out.println("要求传入的整数n大于等于1.");
            return -1;
        }
    }
}
