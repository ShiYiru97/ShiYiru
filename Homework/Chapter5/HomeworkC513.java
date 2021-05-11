/*将对象作为参数传递给方法*/
public class HomeworkC513{
	public static void main(String[] args) {
		Circle c1 = new Circle();
		PassObject p1 = new PassObject();
		p1.printAreas(c1,5);

	}
}
class Circle{
	double radius;
	public double findArea(double radius){
		this.radius= radius;
		return radius*radius*Math.PI;
	}
	//添加方法setRadius，修改对象的半径???不写这个写可以出结果 有什么不好的影响吗？
	public void setRadius(double radius){
		this.radius = radius;
	}
}
class PassObject{
	public void printAreas(Circle c, int times){
		//打印输出1-times之间的每个整数半径值，已经对应的面积
		System.out.println("Radius" + "\t" + "Area");
		for(int i = 1; i <= times; i++){
			System.out.println(i + "\t" + c.findArea(i));
		}
	}
}