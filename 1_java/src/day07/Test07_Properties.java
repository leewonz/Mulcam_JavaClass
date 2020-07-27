package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test07_Properties {
	public static void main(String[] args) 
			throws FileNotFoundException, IOException {
		Properties p = new Properties();
		p.load(new FileInputStream("input/dbinfo.txt"));
		
		String driver = p.getProperty("driver");
		String url = p.getProperty("url");
		String user= p.getProperty("user");
		String pw = p.getProperty("pw");
		
		System.out.println(driver);
		System.out.println(url);
		System.out.println(user);
		System.out.println(pw);
	}
}
