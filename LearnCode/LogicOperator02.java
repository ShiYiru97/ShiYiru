public class LogicOperator02{
	public static void main(String[] args) {
		//短路或|| 和 逻辑或| 的讲解
		//参照短路与&& 和 逻辑与&，都是根据第一个判断为true时是否对第二条判断进行执行的区别
		//短路或|| 第一个为true，即逻辑T成立，则不会对第二个判断执行
		//逻辑或| 第一个为true，仍然会对第二个判断执行
		//效率的区别 短路或|| 效率更高
		// int age = 50;
		// if (age > 20 || age < 30){
		// 	System.out.println("ok100");//T 输出
		// }
		// //| 逻辑或
		// if (age > 20 | age < 30){
		// 	System.out.println("ok200");//t 输出
		// }
		
		int a = 4;
		int b = 9;
		// if (a > 1  || ++b < 5){//++b < 5 不会得到执行
		// 	System.out.print("ok300");
		// }
		// System.out.println("a = " + a + "  " + "b = " + b);//输出a = 4  b = 9  因为++b没有执行
		//输出 ok300a = 4  b = 9

		
		if (a > 1  | ++b < 5){//++b < 5 会得到执行
			System.out.println("ok300");//& 前后语句都会执行
		}
		System.out.println("a = " + a + "  " + "b = " + b);
		// 输出 a = 4, b = b + 1 = 9 + 1 = 10 , temp = b = 10 , b = temp = 10;
		// 输出 a = 4 , b = 10;
		//输出 ok300a = 4  b = 10
	}
}