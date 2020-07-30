package dept.service;

import java.util.List;

import dept.dao.DeptDAO;
import vo.DeptVo;

public class DeptServiceImpl implements DeptService {
	
	private DeptDAO dao;
	
	public DeptServiceImpl(DeptDAO dao) {
		super();
		this.dao = dao;
	}
	
	@Override
	public void updateDept(DeptVo vo) {
		dao.updateDept(vo);
	}

	@Override
	public void deleteDept(int deptno) {
		dao.deleteDept(deptno);
	}

	@Override
	public void insertDept(int deptno, String dname, String loc) {
		dao.insertDept(deptno, dname, loc);
	}

	@Override
	public void insertDept(DeptVo vo) {
		dao.insertDept(vo);
	}

	@Override
	public DeptVo getDept(int deptno) {
		return dao.getDept(deptno);
	}

	@Override
	public List<DeptVo> getDeptAll() {
		return dao.getDeptAll();
	}

}
