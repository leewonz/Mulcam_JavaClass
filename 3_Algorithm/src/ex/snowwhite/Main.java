package ex.snowwhite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		//Scanner sc = new Scanner(new FileInputStream("src\\input\\snowwhite.txt"));
		Scanner sc = new Scanner(System.in);
		List<Integer> input = new ArrayList<Integer>();
		while (sc.hasNextLine()) {
			input.add(Integer.parseInt(sc.nextLine().trim()));
		}
		//input.forEach(i -> System.out.println(i.toString()));

		calc2(input).forEach(i -> System.out.println(i));

	}

	private static List<Integer> calc2(List<Integer> input) {
		int cLen = input.size();
		for (int i = 0; i < (1 << cLen); i++) {
			//System.out.print("{");
			int count = 0;
			int sum = 0;
			List<Integer> output = new ArrayList();
			for (int j = 0; j < cLen; j++) {
				if ((i & (1 << j)) != 0) {
					int res = input.get(j);
					sum += res;
					count++;
					output.add(res);
					//System.out.printf("%s ", res);
				}
			}
			//System.out.println("}");
			if (sum == 100 && count == 7) {
				return output;
			}
		}
		return new ArrayList();
	}
}
	/*
	 * static int calc(List<Integer> input) { boolean backward = false; int sel = 0;
	 * int sum = 0; int count = 0; int index = 0;
	 * 
	 * while(sum != 100 || count != 7) {
	 * 
	 * boolean currentRes = (sel & (1 << index)) != 0; System.out.println(index +
	 * " " + currentRes + " "); if((sum == 100 && count == 7) || index < 0) { return
	 * sel; }
	 * 
	 * if(!backward) { if (sum > 100 || count > 7) { backward = true; index--;
	 * System.out.println("	forward -> back"); continue; } else { sel = sel | (1 <<
	 * index); sum += input.get(index); count++; index++;
	 * System.out.println("	forward"); continue; } } else { if(currentRes) {
	 * backward = false; sel = sel & ~(1 << index); sum -= input.get(index);
	 * count--; index++; System.out.println("	back -> forward"); continue; } else
	 * { index--; System.out.println("	back"); continue; } } } return sel; }
	 */
