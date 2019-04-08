package top.tamlong.aspectjXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import top.tamlong.jdk.UserDao;

// ������
public class TextXmlAspect {
	public static void main(String[] args) {
		String xmlPath = "top/tamlong/aspectjXml/applicationContext.xml";
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext(xmlPath);
		// 1.��spring�����л������
		UserDao userDao = (UserDao)applicationContext.getBean("userDao");
		// 2.ִ�з���
		userDao.addUser();
	}
}
