package top.tamlong.assemble;

import java.util.List;

public class User {
	private String username;
	private Integer password;
	private List<String> list;

	/**
	 * 1.ʹ�ù��췽��ע�� 1.1�ṩ�����в������вι��췽��
	 */
	public User(String username, Integer password, List<String> list) {
		super();
		this.username = username;
		this.password = password;
		this.list = list;
	}

	/**
	 * 2.ʹ����ֵע�� 2.1�ṩĬ�Ͽչ��췽�� 2.2Ϊ���������ṩseeter����
	 */
	public User() {
		super();
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "User [usernape=" + username + ",password=" + password + ",list=" + list + "]";
	}

}
