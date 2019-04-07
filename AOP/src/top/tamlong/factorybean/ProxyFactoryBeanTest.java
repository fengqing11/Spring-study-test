package top.tamlong.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import top.tamlong.jdk.UserDao;

// ������
public class ProxyFactoryBeanTest {
	public static void main(String[] args) {
		String xmlPath = "top/tamlong/factorybean/applicationContext.xml";
		ApplicationContext applicationConetext =
				new ClassPathXmlApplicationContext(xmlPath);
		// ��spring�����л�ȡ����
		UserDao userDao =
				(UserDao)applicationConetext.getBean("userDaoProxy");
		// ִ�з���
		userDao.addUser();
		userDao.deleteUser();
	}
}