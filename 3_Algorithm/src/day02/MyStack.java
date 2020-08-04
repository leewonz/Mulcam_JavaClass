package day02;

public class MyStack {
	private int[] list;
	private int index;
	
	public MyStack() {
		list = new int[16];
		index = -1;
	}
	
	public void push(int value) {
		if(index >= list.length - 1) {
			int[] temp = new int[list.length * 2];
			System.arraycopy(list, 0, temp, 0, list.length);
			list = temp;
		}
		list[++index] = value;
		
	}
	
	public int pop() {
		if(!isEmpty()) {
			return list[index--];
		}else {
			return -1;
		}
		
	}
	
	public int peek() {
		return list[index];
	}
	
	public boolean isEmpty() {
		return (index == -1);
	}
}
