package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("sql");
		list.add("spring");
		list.add("html5");
		list.add("sql");
		list.add("sql");
		list.add("sql");
		list.add("sql");
		list.add("sql");
		list.add("sql");
		
		System.out.println(list);
		list.add(2, "~~~~");
		System.out.println(list);
		list.remove("sql");
		
		Object[] obj = new Object[list.size()];
		obj = list.toArray();
		System.out.println(Arrays.toString(obj));
		System.out.println(((String)obj[0]).charAt(0));
		
		String[] slist = new String[list.size()];
		slist = list.toArray(slist);
		System.out.println(Arrays.toString(slist));
		System.out.println(slist[0].charAt(0));
		
		System.out.println("======Arraylist======");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
