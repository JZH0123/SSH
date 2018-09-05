package cap.service;


import cap.bean.Test;
import cap.util.PageBean;

/**
* @author ����:
* @createDate ����ʱ�䣺2018��7��5�� ����4:05:59
*/
public interface TestService {
	public int addTest(Test test);
	public int updateTest(Test test);
	public int delById(int id);
	public Test findById(int id);
	public PageBean findByPage(int pageNo,int pageSize);
}
 