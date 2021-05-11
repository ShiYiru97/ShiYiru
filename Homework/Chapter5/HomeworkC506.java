/*编程创建一个Cale计算类
在其中定义2个变量表示两个操作数
定义四个方法实现求和、差、乘、除（要求除数为0的时候要提示）
并创建两个对象，分别测试*/
public class HomeworkC506{
	public static void main(String[] args) {
		Cale a = new Cale();
		a.add(1.2,2);
		a.sub(1.2,2);
		a.mul(1.2,2);
		a.quotient(1.2,0);
		Cale b = new Cale();
		b.quotient(9,3);

	}
}
class Cale{
	double num1;
	double num2;
	public void add(double num1,double num2){
		this.num1 = num1;
		this.num2 = num2;
		System.out.println(this.num1 + "和" + this.num2 +"和为 " 
			+ ((double)(this.num1) + this.num2));

	}
	public void sub(double num1,double num2){
		this.num1 = num1;
		this.num2 = num2;
		System.out.println(this.num1 + "和" + this.num2 +"差为 " 
			+ ((double)(this.num1)  - this.num2));

	}
	public void mul(double num1,double num2){
		this.num1 = num1;
		this.num2 = num2;
		System.out.println(this.num1 + "和" + this.num2 +"积为 " 
			+ ((double)(this.num1)  * this.num2));

	}
	public void quotient(double num1,double num2){
		this.num1 = num1;
		this.num2 = num2;
		if(this.num2 != 0 ){
			System.out.println(this.num1 + "和" + this.num2 +"商为 " 
			+ ((double)(this.num1)  / this.num2));
		}else{
			System.out.println("除数不能为0！");
		}
		

	}
}