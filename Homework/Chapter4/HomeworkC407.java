public class HomeworkC407{
	public static void main(String[] args) {
		//冒泡排序 双重for嵌套
		int arr[] = { 20,-1,89,2,890,7};
		System.out.println("=====冒泡排序前数组元素情况=====");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println( " ");
		//要求从小到大排序
		int maxNum = arr[0];
		int temp = 0;

		for(int i = 0; i < (arr.length - 1); i++){//外层循环 轮
			for(int j = 0; j < arr.length -1 -i;j++ ){//内层循环 每轮的比较次数
				if(arr[j] >arr[j + 1]){
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
		//循环输出
		System.out.println("=====冒泡排序后数组元素情况=====");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		
	}
}