package day06.inner;

public class Test02 {

	public static void main(String[] args) {
		Command delete = new Command() {
			@Override
			public void exec() {
				System.out.println("delete 작업 수행");
			}
		};
		
		Command insert = new Command() {
			@Override
			public void exec() {
				System.out.println("insert 작업 수행");
				
			}
		};
		
		Command update = new Command() {
			@Override
			public void exec() {
				System.out.println("update 작업 수행");
			}
		};
		
		Command list = new Command() {
			@Override
			public void exec() {
				System.out.println("list 작업 수행");
			}
		};
		
		delete.exec();
		insert.exec();
		update.exec();
		list.exec();
	}

}

interface Command {
	void exec();
}