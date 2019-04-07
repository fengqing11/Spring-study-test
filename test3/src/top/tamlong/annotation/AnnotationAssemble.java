package top.tamlong.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAssemble {
	public static void main(String[] args) {
		// ���������ļ�·��
		String xmlPath = "top/tamlong/annotation/beans6.xml";
		// ���������ļ�
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext(xmlPath);
		// ��ȡUserControllerʵ��
		UserController userController = 
				(UserController) applicationContext.getBean("userController");
		// ����UserController�е�save����
		userController.save();
	}
}
