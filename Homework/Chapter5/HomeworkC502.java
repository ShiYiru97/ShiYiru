/*编写类A02，定义方法find，实现查找某字符串数组中的元素查找，并返回索引
	如果找不到，返回 -1 */
public class HomeworkC502{
	public static void main(String[] args) {
		A02 a02 = new A02();
		String arr[] = {"今天","Today","天气","好吗"};
		String str01 = "好吗";
		a02.find(arr,str01);
		System.out.println("数组中字符串(" + str01 + ")的index为：" 
			+ a02.find(arr,str01) + "(如果index为-1，则说明数组里没有该str.)" );
		
	}
}
class A02{
	/*思路
	1.方法的返回类型；int
	2.方法的名字；find
	3.方法的形参；String arr[],String str
	4.方法体；循环*/
	public int find(String arr[],String str){
		//字符串数组中元素查找思路
		//1.创建 int index =-1;用于记录查找的字符串索引
		//2.用循环遍历 + 判断 的方式 查找字符串数组
		int index =-1;
		//str = str;
		for(int i = 0;i < arr.length; i++){
			if(str.equals(arr[i])){
				index = i;
			}
		}
		return index;
	}
}