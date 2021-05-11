/*设计一个Dog类 有姓名、颜色和年龄属性，定义输出方法show()显示其信息
并创建对象 进行测试【提示：this、属性】*/
public class HomeworkC507{
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.name = "Bobby";
		dog1.color = "white";
		dog1.age = 2;
		dog1.show(dog1.name,dog1.color,dog1.age);
		Dog dog2 = new Dog();
		dog2.show("coco","black",3);
		
	}
}
class Dog{
	String name;
	String color;
	int age;
	public void show(String name,String color,int age){
		this.name = name;
		this.color = color;
		this.age = age;
		System.out.println("狗狗" + this.name + "的颜色为" + this.color 
			+ ",年龄为" + this.age + "岁.");
	}


}