//演示算术运算符的使用
public class ArithmeticOperator{
	public static void main(String[] args) {
		//除
		// System.out.println(10/4);//2  两个整数相除，精度会保持整数，小数点直接cut掉
		// System.out.println(10.0/4);//2.5  因为10.0是小数型 浮点型
		// double d = 10/4;//2.5 X 错误 10/4（整数）=2  2（int）-->double 2.0  最后结果是2.0
		// System.out.println(d);

		//取模（取余数）的使用 %
		//取模的本质!!!!!
		// a % b = a - a / b * b
		// 10 % -3 = 10 - 10 / -3 * -3 = 10 - (-3) * -3 = 10 - 9 = 1
		// System.out.println(10 % 3);//1
		// System.out.println(-10 % 3);//-1   -10 % 3 = -10 + 10 / 3 * 3 = -1
		// System.out.println(10 % -3);//1 *** 10 % -3 = 10 - 10 / -3 * -3 = 10 - (-3) * -3 = 10 - 9 = 1
		// System.out.println(-10 % -3);// -1 *** -10 % -3 = -10 - (-10) / -3 * -3 = -10 - 3 * (-3) = -10 + 9 = -1

		// ++的使用
		// int i = 10;
		// //（1）如果是作为独立语句使用时，前++ 和 后++ 都完全等价于 i = i + 1 ;
		// i++;//自增 等价于 i = i + 1 ; i = 10 + 1 = 11;
		// ++i;//自增 等价于 i = i + 1 ; i = 11 + 1 =12;
		// System.out.println("i=" + i);//12
		/*
		（2）作为表达式使用
		前++ ： ++i表示先自增后赋值
		后++ ： i++表示先赋值后自增
		*/
		int j = 8 ;
		int k = ++j;//等价于 j = j + 1 , k = j; j = 8 + 1 = 9 , k = j = 9;
		System.out.println("j = " + j);//9
		System.out.println("k = " + k);//9
		int m = j++;//等价于 k = j , j = j + 1; k = j = 9, j = 9 + 1 = 10;
		System.out.println("==============");
		System.out.println("j = " + j);//10
		System.out.println("k = " + k);//9


	}
}