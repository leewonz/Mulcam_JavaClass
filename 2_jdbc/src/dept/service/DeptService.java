package dept.service;

import java.util.List;

import vo.DeptVo;

public interface DeptService {
	void updateDept(DeptVo vo);
	void deleteDept(int deptno);
	void insertDept(int deptno, String dname, String loc);
	void insertDept(DeptVo vo);
	DeptVo getDept(int deptno);
	List<DeptVo> getDeptAll();
}
