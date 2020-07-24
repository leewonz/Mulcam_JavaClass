package day06.exception;

import java.lang.Thread;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end");
	}

}
