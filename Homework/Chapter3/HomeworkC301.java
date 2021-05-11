/*编程实现如下功能
某人有100，000元，每经过一次路口，需要交费，规则如下：
1）当现金>50，000时，每次交5%；
2）当现金<=50,000元时，每次交1，000元
编程计算该人可以经过多少次路口，要求：使用while break方式完成
*/
public class HomeworkC301{
	public static void main(String[] args) {
		//钱额总数。判断当前钱额剩余，进行相应的扣费，当钱额<1000时，退出大循环
		//记录该人经过路口的次数 int count = 0；
		double money = 100000;
		int count = 0;
		double cur_money = money;
		while(cur_money > 1000){
			count++;
			if(cur_money > 50000){
				cur_money = cur_money - cur_money * 0.05 ;

			}else{
				cur_money = cur_money - 1000;
			}

		}
		System.out.println("该人能经过" + count + "次路口。");//62
	}
}