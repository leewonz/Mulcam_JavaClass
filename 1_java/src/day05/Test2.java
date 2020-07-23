package day05;
//Static variable 사용
//Static variable 사용
//Static variable 사용
//Static variable 사용
//Static variable 사용
//Static variable 사용
//Static variable 사용
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
	}
}
class Product{
	static int count;
	int serialNo;
	{
		++count;
		serialNo = count;
		System.out.println("초기화 블럭");
	}
	
	public Product() {
		System.out.println("Product() 생성자");
	}
}