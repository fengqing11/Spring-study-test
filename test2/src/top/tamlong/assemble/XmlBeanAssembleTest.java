package top.tamlong.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBeanAssembleTest {
	public static void main(String[] args) {
		// ���������ļ�
		String xmlPath = "top/tamlong/assemble/beans5.xml";
		// ���������ļ�
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext(xmlPath);
		// ���췽ʽ������
		System.out.println(applicationContext.getBean("user1"));
		// ���÷�ʽ������
		System.out.println(applicationContext.getBean("user2"));
	}
}