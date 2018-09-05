package cap.dao;

import java.util.List;

import cap.bean.Test;

/**
* @author ����:
* @createDate ����ʱ�䣺2018��7��5�� ����3:33:27
*/
public interface TestDAO {
	public int addTest(Test test);
	public int updateTest(Test test);
	public int delById(int id);
	public Test findById(int id);
	public int getTotalRecords();
	public List<Test> findByPage(int pageNo,int pageSize);

}
 