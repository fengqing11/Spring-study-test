package top.tamlong.static_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IntanceTest2 {
	public static void main(String[] args) {
		// ���������ļ�·��
		String xmlPath = "top/tamlong/static_factory/beans2.xml";
		// ���������ļ�����Bean��������
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext(xmlPath);
		System.out.println("bean2");
	}
}
