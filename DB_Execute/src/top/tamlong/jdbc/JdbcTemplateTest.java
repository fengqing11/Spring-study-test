package top.tamlong.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class JdbcTemplateTest {
	public static void main(String[] args) {
		// ���������ļ�
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// ��ȡJdbcTemplateʵ��
		JdbcTemplate jdbcTemplate = (JdbcTemplate)applicationContext.getBean("jdbcTemplate");
		// ʹ��execute()����ִ��sql��䣬�����û������
		jdbcTemplate.execute("create table account("+
				"id int primary key auto_increment,"+
				"username varchar(50),"+
				"balance double)");
		System.out.println("�˻���account�����ɹ���");
		
	}
}
