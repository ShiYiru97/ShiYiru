public class FloatDetail {
	public static void main(String[] args) {
		//java的浮点常量（具体的值）默认为double型，声明float型常量，必须在浮点常量（具体的值）后面加'f'或'F'.
		float n1 = 1.1f;//float n1 = 1.1;是错的，因为1.1默认为double型
		double n2 = 5.6;
		double n3 = 1.3f;//对，短的放进长的里面，可
		double n4 = .123;//对，0.123的0可省略
		//科学计数法 如：5.12e2[]=5.12*10^2 = 512.0,5.12e-2=5.12*10^-2
		//通常情况下用double，double更加精度更高，保留小数位数更多
		double n5 = 5.123456896332;
		float n6 = 5.123456896332f;
		//
		double n7 = 2.7;
		double n8 = 8.1 / 3;
		System.out.println(n7);
		System.out.println(n8);//2.6999999999997是一个接近2.7的小数，不是2.7，以精度的方式
		//由此得到一个重要的使用点：当我们对运算结果是小数的进行相等判断时，要小心
		//应该是以两个数的差值的绝对值，在某个精度范围内判断
		//这是一个浮点整数的使用陷阱*****
		//细节：如果是直接查询得的小数或者是直接赋的值，那么可以判断相等。
		if (n7 == n8) {
			System.out.println("2.7相等于8.1/2");
		}
		//正确的写法 ps: ctrl + / 可以多行注释，再次操作又可取消多行注释
		if (Math.abs(n7 - n8) < 0.000001) {
			System.out.println("2.7与8.1/2的差值非常小，到我的规定精度，认为两值相等。");

		}
		//可以通过java的API
		System.out.println(Math.abs(n7 - n8 ));



		
	}



}