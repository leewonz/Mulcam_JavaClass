package day06.inner;

public class Test03 {

	public static void main(String[] args) {
		Command2 delete = () -> {
				System.out.println("delete 작업 수행");
			};
		
		Command2 insert = () -> {
				System.out.println("insert 작업 수행");
			};
		
		Command2 update = () -> {
				System.out.println("update 작업 수행");
			};
		
		Command2 list = () -> {
				System.out.println("list 작업 수행");
			};
		
		delete.exec();
		insert.exec();
		update.exec();
		list.exec();
	}
}

interface Command2 {
	void exec();
}