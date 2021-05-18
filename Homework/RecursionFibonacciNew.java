package exercise;

public class RecursionFibonacciNew {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = new int[n+1];
        Fibonacci fb = new Fibonacci();
        fb.fibonacci(n,arr);
        if(n >= 1){
            System.out.println("整数" + (n+1) + "对应的斐波那契数列输出为：");
            for(int i = 0; i < arr.length;i++){
                System.out.print(arr[i] + " ");
            }
        }else{
            System.out.println("请输入大于1的整数。");
        }
    }
}
class Fibonacci{
    /*
    使用递归的方式求出斐波那契数 1 1 2 3 5 8 13...
    给一个整数n 输出值的一系列斐波那契值 int fb[] = new int[n];
    思路分析：
    1.当n = 1时，斐波那契 = 1；
    2.当n = 2时，斐波那契 = 1；
    3.当n = 3时，斐波那契 = 2；
    4.当 n >= 3时，斐波那契 = 前两个数的和 = arr[n-2] + arr[n-1] = arr[n]
    5.这里就是一个递归的思路
    */

    public int fibonacci(int n,int arr[]){
        if (n == 0||n == 1){
            arr[n] = 1;
            return arr[n];
        }
        else{
            return arr[n] = fibonacci(n-2,arr) + fibonacci(n-1,arr);
        }
    }

}
