package top.tamlong.aspectjXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import top.tamlong.jdk.UserDao;

// 测试类
public class TextXmlAspect {
	public static void main(String[] args) {
		String xmlPath = "top/tamlong/aspectjXml/applicationContext.xml";
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext(xmlPath);
		// 1.从spring容器中获得内容
		UserDao userDao = (UserDao)applicationContext.getBean("userDao");
		// 2.执行方法
		userDao.addUser();
	}
}
