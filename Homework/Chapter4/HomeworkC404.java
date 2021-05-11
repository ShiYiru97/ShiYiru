public class HomeworkC404{
	public static void main(String[] args) {
		/*思路分析：
		1.创建初始数组 int arr[] = {10,12,45,90};
		2.确定插入的数字 insertNum = 23;
		3.创建扩容后的新数组 int arrNew[] = new int[arr.length + 1];
		4.冒泡排序 用插入值 从左到右 跟arr的值比较，依次把小的值放入 arrNew里面
		*/
		int arr[] = {10,12,45,90};
		int insertNum =100;
		int maxNum = insertNum;//用于记录当前最大值
		int arrNew[] = new int[arr.length + 1];//4
		System.out.println("arr.length = " + arr.length);
		for(int i = 0; i < arr.length; i++ ){
			// System.out.println("i = " + i);
			if(arr[i] >= maxNum){
				arrNew[i] = maxNum;
				maxNum = arr[i];
				// j++;

			}else{
				arrNew[i] = arr[i];
			}
			
			System.out.println("arrNew[" + i + "] = " + arrNew[i]);
			// j++;
		}
		arrNew[arr.length] = maxNum;
		System.out.println("arrNew[" +arr.length+ "] = " + arrNew[arr.length]);
		arr = arrNew;//重要！！让arr指向arrNew，原来的数组就成为垃圾，被销毁
		System.out.println("=====插入新值后，arr数组的元素情况=====");
		for(int i = 0; i < arr.length;i++){
			System.out.print(arr[i] + "\t");
		}





	}
}