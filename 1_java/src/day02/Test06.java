package day02;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("App Start");
		
		String msg = "종료";
		
		if(msg.equalsIgnoreCase("종료")){
			System.out.println("종료합니다.");
			System.out.println("Bye...");
			return;
		}
		
		if(msg.equalsIgnoreCase("quit")){
			System.out.println("quit입니다.");
		}else {
			System.out.println("continue입니다.");
		}
		
		System.out.println("App End");
	}

}
