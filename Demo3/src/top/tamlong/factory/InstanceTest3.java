package top.tamlong.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest3 {
	public static void main(String[] args) {
		// �ƶ������ļ�·��
		String xmlPath = "top/tamlong/factory/beans3.xml";
		// ���������ļ�����ʼ��Bean
		ApplicationContext application = new ClassPathXmlApplicationContext(xmlPath);
		System.out.println("bean3");
	}
}