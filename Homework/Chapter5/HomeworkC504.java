/*编写类A03，实现数组的复制功能copyArr
输入旧数组，返回一个新的数组，元素和旧数组一样*/
public class HomeworkC504{
	public static void main(String[] args) {
		A03 a03= new A03();
		int oriArr[] = {1,5,8,5,1,0,8,2};
		a03.copyArr(oriArr);
		System.out.println("原始数组的元素情况为："  );
		for(int i = 0; i < oriArr.length;i++){
			System.out.print(oriArr[i]+ " ");
		}
		System.out.println( );
		System.out.println("赋值数组的元素情况为："  );
		for(int i = 0; i < oriArr.length;i++){
			System.out.print(a03.copyArr(oriArr)[i] + " ");
		}
		
	}
}
class A03{
	/*思路
	1.方法的返回类型；数组
	2.方法的名字；copyArr
	3.方法的形参；int arr[];
	4.方法体；循环遍历 + 赋值*/
	public int[] copyArr(int arr[]){
		//赋值一个数组思路
		//新建一个数组空间，大小为oriArr.length
		int newArr[] = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			newArr[i] = arr[i];
		}
		return newArr;
	}
}