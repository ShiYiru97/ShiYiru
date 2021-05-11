public class HomeworkC405{
	public static void main(String[] args) {
		/*随机生成10个整数（1-100）保存到数组，并倒序打印以及求平均值
		求最大值和最小值下标，并查找里面是否有8*/
		/*思路分析：
		1.创建大小为10的一维数组 int arr[] = new int[10];
		2.产生随机数**(int)(Math.random()*100) + 1  生成100个（1-100）的随机整数
		3.倒序打印 循环 for(int j = arr.length - 1 ;j >= 0; j--){}
		4.求平均值 创建一个sum 累加 数组里面的值 输出 sum/arr.length
		5.对数组进行排序产生arrNew 冒泡 输出arrNew[0] arrNew[arrNew.length - 1]
		6.查找是否有8 int findNum = 8; 6.1 判断是否有值 == 8
		*/
		int arr[] = new int[10];
		double sum = 0;//用于统计数组和 要用double!!!!

		//(int)(Math.random()*100) + 1  生成100个（1-100）的随机整数
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100) + 1;
			sum += (double)(arr[i]);//记得强转！

		}
		//正序打印
		for(int i = 0; i < arr.length; i++){
		
			System.out.print(arr[i] + "\t");
		}
		System.out.println(" ");
		//逆序打印
		for(int i = arr.length - 1; i >=0; i--){
		
			System.out.print(arr[i] + "\t");
		}
		System.out.println(" ");
		//输出数组平均值
		System.out.println( "数组arr的平均值为 = " + (sum / arr.length));
		//输出最大值、最小值下标
		int min_index = 0;//用于记录最小值下标
		int max_index = 0;//用于记录最大值下标
		int min = arr[0];//用于记录最小值
		int max = 0;//用于记录最大值
		for(int i = 0; i < arr.length; i++){
			if(max <= arr[i]){
				max = arr[i];
				max_index = i;
			}
		}
		System.out.println("max = " + max + ",max_index = " + max_index);
		for(int i = 0; i < arr.length; i++){
			if(min >= arr[i]){
				min = arr[i];
				min_index = i;
			}
		}
		System.out.println("min = " + min + ",min_index = " + min_index);

		//查找数组中是否有8
		int findNum = 8;
		int findNum_index = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == 8){
				findNum_index = i;
				System.out.println("数组中有" + findNum + ",其下标为" + findNum_index);
				break;
			}
			if(i == (arr.length - 1)){
				System.out.println("数组中没有"+ findNum );
			}
		}



	}
}