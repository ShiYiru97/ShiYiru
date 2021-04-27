public class LogicOperator01{
	public static void main(String[] args) {
		//&& 短路与 与 &逻辑与
		// int age = 50;
		// if (age > 20 && age < 90){
		// 	System.out.println("ok100");//T 输出
		// }
		// //& 逻辑与
		// if (age > 20 & age < 90){
		// 	System.out.println("ok200");//t 输出
		// }
		// if (age > 20 & age < 30){
		// 	System.out.println("ok400");//f 不能输出
			
		// }
		//&& 和 & 的区别
		//对于短路与&&， if (a < 1  && ++b < 50){， a<1已经为false了，那么后面的++b将不会再判断，最后结果为false
		//对于逻辑与& ， 不管 & 前的逻辑判断true还是false，&后面的逻辑判断语句都要进行，这就会使得效率低
		//在开发中，使用的基本是 短路与 &&，效率要高一点
		//当第一个判断为真，&&和&就等价
		int a = 4;
		int b = 9;
		// if (a < 1  && ++b < 50){//++b < 50 不会得到执行
		// 	System.out.println("ok300");
		// }
		// System.out.println("a = " + a + "  " + "b = " + b);//输出a = 4  b = 9  因为++b没有执行
		if (a < 1  & ++b < 50){//++b < 50 会得到执行
			System.out.println("ok300");//& 前后语句都会执行
		}
		System.out.println("a = " + a + "  " + "b = " + b);
		//输出 a = 4, b = b + 1 = 9 + 1 = 10 , temp = b = 10 , b = temp = 10;
		//输出 a = 4 , b = 10;


	}
}