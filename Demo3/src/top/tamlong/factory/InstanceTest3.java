package top.tamlong.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest3 {
	public static void main(String[] args) {
		// 制定配置文件路径
		String xmlPath = "top/tamlong/factory/beans3.xml";
		// 加载配置文件，初始化Bean
		ApplicationContext application = new ClassPathXmlApplicationContext(xmlPath);
		System.out.println("bean3");
	}
}
