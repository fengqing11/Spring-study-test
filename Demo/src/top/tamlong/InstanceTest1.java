package top.tamlong;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest1 {
	public static void main(String[] args) {
		// 定义配置文件
		String xmlPath = "top/tamlong/beans.xml";
		// 初始化容器
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext(xmlPath);
		Bean1 bean = (Bean1)applicationContext.getBean("bean1");
		System.out.println(bean);
	}
}
