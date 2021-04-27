public class ArithmeticOperatorExercise01{
	public static void main(String[] args) {
		// 1.面试题1
		// int j = 1;
		// j = j++;
		// System.out.println(j);//2  i = i = 1, i = 1 + 1 = 2; X错 结果是1
		// //规则使用临时变量 （1）temp = i = 1;(2) i = i + 1 = 2;*(3) i = temp = 1;

		// // 2.面试题2
		// int i = 1;
		// i = ++i;
		// System.out.println(i);//2  i = i + 1 = 2, i = i = 2;
		// //规则使用临时变量 （1）i = i + 1 = 2;(2) temp = i = 2;*(3) i = temp = 2;

		int i1 = 10;
		int i2 = 20;
		int i = i1++;//i = i1 = 10, i1 = i1 + 1 = 10 + 1 = 11;
		System.out.println("i = " + i);//10
		System.out.println("i2 = " + i2);//20
		i = --i2;// i2 = i2 - 1 = 20 - 1 = 19, k = i2 = 19;
		System.out.println("i = " + i);//19
		System.out.println("i2 = " + i2);//19

	}
}