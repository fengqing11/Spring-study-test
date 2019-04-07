package com.itheima.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestloC {
	
	public static void main(String[] args) {
		// ���������ļ�·��
		String xmlPath = "com/itheima/ioc/applicationContext.xml"; 
		// 1.��ʼ��spring����
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext(xmlPath);
		// 2.ͨ��������ȡuserDaoʵ��
		UserDao userDao = (UserDao)applicationContext.getBean("userDao");
		// 3.����ʵ���е�say()����
		userDao.say();
	}
	
}