package top.tamlong.jdk;

public class JdkTest {
	public static void main(String[] args) {
		// �����������
		JdkProxy jdkProxy = new JdkProxy();
		// ����Ŀ�����
		UserDao userDao = new UserDaoImpl();
		// �Ӵ�������л�ȡ��ǿ���Ŀ�����
		UserDao useDao1= (UserDao)jdkProxy.createProxy(userDao);
		// ִ�з���
		useDao1.addUser();
		useDao1.deleteUser();
	}
}
