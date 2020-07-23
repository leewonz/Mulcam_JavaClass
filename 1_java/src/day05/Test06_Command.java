package day05;

public class Test06_Command {
	public static void main(String[] args) {
		Command cmd = null;
		String msg = "delete";
		
		switch("msg") {
		case "delete":
			cmd = new DeleteCommand();
			break;
			
		case "list":
			cmd = new ListCommand();
			break;
			
		case "update":
			cmd = new UpdateCommand();
			break;
			
		case "insert":
			cmd = new InsertCommand();
			break;
		}
		
		if(cmd != null) {
			
		}
	}
}
