//基本数据类型的强制转换细节 
public class ForceConvertDetail {
	public static void main(String[] args) {
		//（1）强转符号只针对最近的操作数（具体的数据）有效，往往会使用小括号提升优先级
		// int x = (int)10*3.5 + 6*1.5;//等号右边是 int*double+int*double  ==>  double  编译错误
		// System.out.println("x="+x);//会报错！
		int x = (int)(10*3.5 + 6*1.5);//会先算运算的小括号，再算（int）强制转换double-->int，最后赋值给int x
		System.out.println("x="+x);//okk  x=44

		// char类型可以保存int的常量值，但不能保存int的变量值，要保存变量值的话需要强制转换，因为int>char
		char v1 = 100;//ok 这个100是字符类型
		int m = 100;
		//char c2 = m;//不可 int>char
		char c3 = (char)m;//可 char类型
		//System.out.println("c2="+ c2);
		System.out.println("c3="+ c3);// c3 = d char类型

		//基本数据类型转换类型练习题
		// 1.
		// short s = 12;
		// s = s - 9;//不可以，9是int型，等号右边是int，int>short
		// 2.
		// byte b = 10;
		// b = b + 1;//int不可赋值给byte
		// b = (byte)(b + 1);//可以，int -->强制转换为byte
		// 3.
		// char c = 'a';
		// int i = 16;
		// float d = .314f;
		// double result = c + i + d;//可以，混合运算的最高级double yyds
		// 4.
		// byte b = 16;
		// short s = 14;
		// short t = s + b;//不可以，byte，short，char单纯/混合运算，都必须转为int再进行运算，所以等号右边是int型数据		
		
	}

}