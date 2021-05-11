/*编写类A01，定义方法max，实现求某个double数组的最大值，并返回*/
public class HomeworkC501{
	public static void main(String[] args) {
		A01 a = new A01();
		//double arr1[] = {1,5,8,16,100};
		//double arr1[] = {};
		double arr1[] = null;
		Double res = a.max(arr1);
		if(res != null){
			System.out.println("数组arr的最大元素为" + a.max(arr1));
		}else{
			System.out.println("数组arr为空。" );
		}
		
		

	}
}
class A01{
	/*思路
	1.方法的返回类型； double
	2.方法的名字；max
	3.方法的形参；double arr[]
	4.方法体；循环*/
	public Double max(double arr[]){//Double
		//求数组最大值的思路
		//1.新建double tempMax = 0;存贮当前最大值
		//2.跟每一位元素进行大小比较，更新tempMax，最后输出
		//要考虑arr为空的情况
		if(arr != null && arr.length > 0){
			double tempMax = arr[0];
			for(int i = 0; i < arr.length; i++){
				if(tempMax <= arr[i]){
					tempMax = arr[i];
				}
			

			}
			return tempMax;
		}else{
			return null;
		}
		
	}
}