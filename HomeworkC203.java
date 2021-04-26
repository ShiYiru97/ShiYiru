//第二章作业 作业三
//3.编程 保存两本书名，用+拼接起来，看效果。保存两个性别，用+拼接起来，看效果。保存两本书的价格，用+拼接起来，看效果。
//加号的不同效果，加不同的东西
public class HomeworkC203{
	public static void main(String[] args) {
		String s1 = "百年孤独";
		String s2 = "亲亲我的宝贝";
		String ss = s1 + s2;
		System.out.println(ss);
		System.out.println("-----------");
		System.out.println(s1 + " " + s2);
		System.out.println("===========");


		//应该用char
		String c1 = "男";
		String c2 = "女";
		String sc = c1 + c2;
		System.out.println(sc);
		System.out.println("-----------");
		System.out.println(c1 + " " + c2);
		System.out.println("===========");
		//应该用char
		char c3 = '男';
		char c4 = '女';
		System.out.println(c3 + c4);//得到的 男 字符码值 + 女 字符码值 一个数  52906



		double d1 = 25.8;
		double d2 = 89.9;
		double dd = d1 + d2;
		System.out.println(dd);
		System.out.println("-----------");
		System.out.println(d1 + " " + d2);
		System.out.println(d1 + d2);







			
		
	}
}