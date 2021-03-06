package top.tamlong.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import top.tamlong.jdk.UserDao;

// 测试类
public class ProxyFactoryBeanTest {
	public static void main(String[] args) {
		String xmlPath = "top/tamlong/factorybean/applicationContext.xml";
		ApplicationContext applicationConetext =
				new ClassPathXmlApplicationContext(xmlPath);
		// 从spring容器中获取内容
		UserDao userDao =
				(UserDao)applicationConetext.getBean("userDaoProxy");
		// 执行方法
		userDao.addUser();
		userDao.deleteUser();
	}
}
