//这是JAVA的快速入门
//1.public class Hello 表示Hello是一个类，是一个public公有的类
//2.Hello{} 表示一个类的开始到结束
//3.public static void main(String[] args)表示一个主方法，即我们程序的入口
//4.mian(){}表示方法的开始和结束
//5.
public class Hello {
	//编写一个mian方法
	public static void main(String[] args) { //这里敲main就可以了 主方法 程序的入口
		System.out.println("Hello,world!");	//表示输出到屏幕	;表示本条语句的结束
	
	}
}
//编译后，每个类，都对应一个.class
class Dog{

	//一个源文件中最多只能有一个public类，其他类个数不限，也可以将main方法写在非public类中
	//然后指定运行非public类，这样入口方法就是非public的main方法
	public static void main (String[] args){
		System.out.println("hello,puppy~");
	}

}

class Cat{
	public static void main (String[] args){
		System.out.println("hello,little tiger~");
	}


}
