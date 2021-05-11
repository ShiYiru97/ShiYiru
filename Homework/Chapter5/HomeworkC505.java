/*定义一个圆类Circle 定义属性：半径
提供显示圆周长功能的方法
提供显示圆的面积的方法*/
public class HomeworkC505{
	public static void main(String[] args) {
		Circle cir = new Circle();
		cir.radius = 1;
		cir.perimeter(cir.radius);
		cir.area(cir.radius);
		System.out.println("半径为" + cir.radius + "的圆周长为 " 
			+ cir.perimeter(cir.radius)+  ",面积为 " + cir.area(cir.radius));
	}
}
class Circle{
	double radius;
	public double perimeter(double rad){
		double perimeter = 2 * rad * 3.14;
		return  perimeter;

	}
	public double area(double rad){
		double area = rad * rad * 3.14;
		return  area;
	}

}