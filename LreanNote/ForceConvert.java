//基本数据类型的强制转换
public class ForceConvert {
	public static void main(String[] args) {
		//就是你非要把精度大的转成精度小的数据类型，逆转换，也不是不可以，也有相应的规则
		//这里 精度==容量 转换规则：转换时要加上强制转换符（），但可能造成精度降低或溢出，格外要注意
		//所以在进行强制转换时 一定是你心中明确知道你想这么干
		int i = (int)1.9;
		System.out.println(i);//1  这就是造成数据精度降低的损失
		System.out.println("i="+ i);//"i="+ i   有一方是字符串，+号就表示拼接

		int j = 100;
		byte b1 = (byte)j;
		System.out.println(b1);//100

		int k = 2000;
		byte b2 = (byte)k;
		System.out.println("b2="+b2);//-48????这就是造成数据溢出的损失



		
		
	}



}