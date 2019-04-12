package top.tamlong.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class JdbcTemplateTest {
	public static void main(String[] args) {
		// 加载配置文件
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// 获取JdbcTemplate实例
		JdbcTemplate jdbcTemplate = (JdbcTemplate)applicationContext.getBean("jdbcTemplate");
		// 使用execute()方法执行sql语句，创建用户管理表
		jdbcTemplate.execute("create table account("+
				"id int primary key auto_increment,"+
				"username varchar(50),"+
				"balance double)");
		System.out.println("账户表account创建成功！");
		
	}
}
