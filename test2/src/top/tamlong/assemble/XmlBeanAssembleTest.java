package top.tamlong.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBeanAssembleTest {
	public static void main(String[] args) {
		// 定义配置文件
		String xmlPath = "top/tamlong/assemble/beans5.xml";
		// 加载配置文件
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext(xmlPath);
		// 构造方式输出结果
		System.out.println(applicationContext.getBean("user1"));
		// 设置方式输出结果
		System.out.println(applicationContext.getBean("user2"));
	}
}
