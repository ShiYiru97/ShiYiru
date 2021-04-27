public class ArithmeticOperatorExercise02{
	public static void main(String[] args) {
		//1.需求 2.思路分析 变量，变量类型，输出 3.走代码
		
		// 1.假如还有59天放假，问和xx个星期零xx天；
		int total = 59;
		int w = total / 7;
		int d = total % 7;
		System.out.println("距离放假还有" + w + "周零" + d + "天。");//距离放假还有8周零3天。

		// 2.定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为： 5/9*（华氏温度 - 100），请求出华氏温度对应的摄氏温度。[234.5]
		double h = 234.5;
		// XX double c = 5 / 9 * ( h - 100);//直接代公式不行，因为等式右边全是int型，他会先计算结果是int型再
		//转成double，会有数据损失。
		double c = 5.0 / 9 * ( h - 100);
		System.out.println("华氏温度" + h + "转换为摄氏温度为" + c + "摄氏度。");
		//华氏温度234.5转换为摄氏温度为74.72222222222223摄氏度。

	}
}