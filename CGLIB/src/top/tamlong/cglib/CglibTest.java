package top.tamlong.cglib;

public class CglibTest {
	public static void main(String[] args) {
		// �����������
		CglibProxy cglibProxy = new CglibProxy();
		// ����Ŀ�����
		UserDao userDao = new UserDao();
		// ��ȡ��ǿ֮��Ķ���
		UserDao userDao1 = (UserDao)cglibProxy.createProxy(userDao);
		// ִ�з���
		userDao1.addUser();
		userDao1.deleteUser();
	}
}
