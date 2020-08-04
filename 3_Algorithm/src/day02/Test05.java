package day02;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import util.Util;

public class Test05 {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i : Util.generateRandomSequence(10, 10)) {
			System.out.printf("%d ", i);
			queue.offer(i);
		}
		System.out.println();

		while (!queue.isEmpty()) {
			System.out.printf("%d ", queue.poll());
		}
		System.out.println();
	}
}
