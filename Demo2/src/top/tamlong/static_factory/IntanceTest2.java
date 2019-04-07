package top.tamlong.static_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IntanceTest2 {
	public static void main(String[] args) {
		// 定义配置文件路径
		String xmlPath = "top/tamlong/static_factory/beans2.xml";
		// 加载配置文件，对Bean进行配置
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext(xmlPath);
		System.out.println("bean2");
	}
}
