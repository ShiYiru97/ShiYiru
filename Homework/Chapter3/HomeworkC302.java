/*实现判断一个整数，属于那个范围 大于0；小于0；等于0
*/
import java.util.Scanner;
public class HomeworkC302{
	public static void main(String[] args) {
		//输入一个整数 scanner接受一个整数
		//对整数范围进行分级判断
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num = myScanner.nextInt();
		if(num < 0){
			System.out.println(num + "小于0.");
		}else if( num > 0){
			System.out.println(num + "大于0.");
		}else{
			System.out.println(num + "等于0.");
		}

	}
}