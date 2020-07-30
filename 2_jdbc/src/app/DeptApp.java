package app;

import dept.dao.DeptDAO;
import dept.service.DeptService;
import dept.service.DeptServiceImpl;

public class DeptApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeptDAO dao = new DeptDAO();
		
		DeptService service = new DeptServiceImpl(dao);
		
		service.getDeptAll().forEach(i -> System.out.println(i));
		service.deleteDept(91);
		service.getDeptAll().forEach(i -> System.out.println(i));
	}

}
