//基本数据类型和string类型的转换
public class StringToBasic{
	public static void main(String[] args) {
		//基本数据类型==>string 将基本类型转成String类型，加" "就可以
		int n1 = 100;
		float f1 = .123f;
		double d1 = 3.4;
		boolean b1 = true;
		String str1 = n1 + "";
		String str2 = f1 + "";
		String str3 = d1 + "";
		String str4 = b1 + "";
		System.out.println(str1 + " " + str2 + " " + str3 + " " + str4 + " ");//""什么都不是，" "一个空格

		//反过来有时候我们需要把string==>基本数据类型
		//需要用到包装类调用 parseXxx 方法即可；每一个基本数据类型都对应有一个包装类，
		//包装类提供一个 parseXxx （eg：parseInt,parseFloat...),用包装类就可以将string转化成对应的基本数据类型
		String s5 = "123";
		//会在OOP面向对象方法的时候，详细讲解
		//解读 使用 基本数据类型的包装类的相应方法，得到基本数据类型
		int num1 = Integer.parseInt(s5);//123
		double num2 = Double.parseDouble(s5);//123.0
		float num3 = Float.parseFloat(s5);//123.0
		long num4 = Long.parseLong(s5);//123
		byte num5 = Byte.parseByte(s5);//123 < 127
		short num6 = Short.parseShort(s5);//123
		boolean b = Boolean.parseBoolean("true");//true

		// System.out.println(num1);
		// System.out.println(num2);
		// System.out.println(num3);
		// System.out.println(num4);
		// System.out.println(num5);
		// System.out.println(num6);
		// System.out.println(b);

		//怎么把字符串string转成字符char？这个通常意义只能是指提取出字符串的第几个字符，通常默认提取字符串的第一个字符
		//
		System.out.println(s5.charAt(0));//这句话表示输出s5字符串中的第一个字符 输出了 1
		



		
	}
}