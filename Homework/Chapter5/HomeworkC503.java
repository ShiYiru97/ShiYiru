/*编写类Book 定义方法updatePrice 实现更新某本书的价格
具体：如果价格>150,则更改为150，
如果价格>100(100<x<=150) 则更改为100
否则 （0<=x<=100) 不变*/
public class HomeworkC503{
	public static void main(String[] args) {
		Book book1 =  new Book();
		double oriPrice0 = 56;
		book1.updatePrice(oriPrice0);
		System.out.println("原始书本价格为 " + oriPrice0 + "." );
		System.out.println("更新后书本价格为 " + book1.updatePrice(oriPrice0) + "." );
		
	}
}
class Book{
	/*思路
	1.方法的返回类型；double
	2.方法的名字；updatePrice
	3.方法的形参；double oriPrice;
	4.方法体；判断*/
	public double updatePrice(double oriPrice){
		double updatePrice00 = 0.0;
		if(oriPrice > 150){
			updatePrice00 = 150;
		}else if(oriPrice > 100){
			updatePrice00 = 100;
		}else{
			updatePrice00 = oriPrice;
		}
		return updatePrice00;
	}
}