package top.tamlong.jdk;

public class UserDaoImpl implements UserDao {

	@Override
	public void addUser() {
		System.out.println("add user");
	}

	@Override
	public void deleteUser() {
		System.out.println("delete user");
	}

}
