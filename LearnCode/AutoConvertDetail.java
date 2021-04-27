//自动类型转换细节 6个细节
public class AutoConvertDetail {
	public static void main(String[] args) {
		//有多种类型的数据混合运算时
		// 系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算
		int n1 = 10;
		// float f1 = n1 + 1.1;//会报错，因为1.1是double型，等号右边的结果是double型，double>float
		double d1 = n1 + 1.1;
		float f2 = n1 + 1.1f;
		System.out.println(n1);//int
		System.out.println(d1);//double
		System.out.println(f2);//float

		//(byte,short)和char之间不会相互自动转换
		//当把数赋值给byte时，先判断该数是否在byte范围内[-128,127],（1）计算机是先判断范围，再判断类型
		byte b1 = 10;//对 byte [-128,127]
		// int n2 = 1;//int 4字节4byte
		//(2)如果是变量赋值，计算机会先判断类型
		//byte b2 = n2;//不对，数据类型大小不对
		char c1 = b1;//不对！(3)byte、short不会自动转换为char，编译器规则
		//（4）****byte,short和char可以转换，但是要先转成int类型数据（通用货币类型的感觉？），不管是单独运算（纯byte or 纯char...）
		// 还是混合运算（byte short char）
		byte b2 = 1;
		short s1 = 1;//*错误！因为1是int型，int>short
		// b1 + s1;//*精度会变为short,因为short>int，但是在这里还不会直接变为int XXXXXXXX错误！！！！
		//上一条错误的真实原因是因为short s1 = 1;1是int型
		//short s2 = b1 + s1;错误!因为 b1 + s1 ==>  int
		int s2 = b1 + s1;//可
		// byte b4 = b1 + b2;//不可以！！！只要有byte,short,char,都必须变成int才能运算  int

		//（5）boolean不参与数据类型的自动转换
		boolean pass = true;
		// int num100 = pass;//错误！boolean不参与数据类型的自动转换

		//（6）自动提升原则：表达式结果的类型自动提升为 操作数中最大的类型 eg：int + float ==>   float
		byte b5 = 1;
		short s3 = 100;
		int num200 = 1;
		double num300 = 1.1;
		b5 + s3 + num200 + num300;//整个运算的结果是double

		byte b6 = 1;
		short s4 = 100;
		int num400 = 1;
		float num500 = 1.1f;
		// int num600 = b6 + s4 + num400 + num500;//等式右边整个运算的结果是float，float -->  int  X
		double num700 = b6 + s4 + num400 + num500;//等式右边整个运算的结果是float，float -->  double  √




	}

}