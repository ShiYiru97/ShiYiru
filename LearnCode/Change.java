//演示转义字符的使用
public class Change{
	public static void main(String[] args) {
		//控制台按下tab键可以自动补齐
		// \t:一个制表位，实现对齐功能
		System.out.println("北京\t天津\t南京");
		// \n:换行符
		System.out.println("北京\n天津\n南京");
		// \\:一个\
		System.out.println("\\projects\\TabuSearch");
		// \":一个"
		System.out.println("小王说:\"那是彩虹。\"");
		// \':一个'
		System.out.println("小王说:\'那是彩虹。\'");
		// \r:一个回车 System.out.println
		//解读：1.输出  上海交通大学  2.\r表示回车 顶格替换上→北，海→京 3.最终输出 北京交通大学
		System.out.println("上海交通大学\r北京");
		System.out.println("上海交通大学\r\n北京");

	}





}