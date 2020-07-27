package day07;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test08 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		
		for(Integer data : list) {
			System.out.println(data + "\t");
			
		}
		
		System.out.println("------forEach Consumer-------------------------");
		
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.print(t+"\t");
			}
		});
		
		System.out.println("\n------람다식-------------------------");
		list.forEach(t -> System.out.print(t + "\t"));
		
		System.out.println("\n------removeIf-------------------------");
		list.removeIf(i -> i % 2 == 0);
		list.forEach(t -> System.out.print(t + "\t"));
		
		System.out.println("\n------replaceAll-------------------------");
		list.replaceAll(i -> i * 10);
		list.forEach(t -> System.out.print(t + "\t"));
	}

}
