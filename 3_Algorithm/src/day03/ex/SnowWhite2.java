package day03.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnowWhite2 {
	static List<Integer> input = new ArrayList<Integer>();
	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new FileInputStream("src\\input\\snowwhite.txt"));
		//Scanner sc = new Scanner(System.in);
		//List<Integer> input = new ArrayList<Integer>();
		while (sc.hasNextLine()) {
			input.add(Integer.parseInt(sc.nextLine().trim()));
		}
		calc(0, 0, 0, 0);

	}

	private static void calc(int bitmask, int ind, int sum, int cnt) {
		
		if(ind >= input.size()) {
//			System.out.print(ind + " / " + sum +" / "+cnt + "\t");
//			for(int i = 0; i < input.size(); i++) {
//				System.out.print(((bitmask & (1 << i)) != 0)?"1":"0");
//			}
//			System.out.println();
			if(sum == 100 && cnt == 7) {
				for(int i = 0; i < input.size(); i++) {
					if((bitmask & (1 << i)) != 0){
						System.out.println(input.get(i));
					}
				}
			}
			return;
		}
		bitmask = bitmask | (1 << ind);
		calc(bitmask, ind + 1, sum + input.get(ind), cnt + 1);
		bitmask = bitmask & ~(1 << ind);
		calc(bitmask, ind + 1, sum, cnt);
	}
}

