/*创建一个Employee类
属性有（姓名，性别，年龄，职位，薪水）
提供三个构造方法可以初始化
（1）姓名，性别，年龄，职位，薪水
（2）姓名，性别，年龄
（3）职位，薪水
要求充分复用构造器*/
//重载
public class HomeworkC512{
	public static void main(String[] args) {
		Employee p1 = new Employee("Flora","女",25);
		
	}
}
class Employee{
	String name;
	char gender;
	int age;
	String job;
	double salary;
	//因为要求可以复用构造器，因此老韩写的时候先写属性少的构造器
	//构造器
	/*public getInfo(String name,char gender,int age,String job,double salary){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.job = job;
		this.salary = salary;
	}*/
	public getInfo(String name,char gender,int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public getInfo(String name,char gender,int age,String job,double salary){
		this.job = job;
		this.salary = salary;
	}
	public getInfo(String name,char gender,int age,String job,double salary){
		this(name,gender,age);//达到复用构造器的要求 使用到 前面的构造器
		this.job = job;
		this.salary = salary;
	}
}