package top.tamlong.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import top.tamlong.aspect.MyAspect;

/**
 * 
 * @ClassName:  JdkProxy   
 * @Description: JDK������ 
 * @author: fengqing
 * @date:   2019��4��7�� ����12:44:22   
 *     
 * @Copyright: 2019 www.tamlong.top Inc. All rights reserved.
 */
public class JdkProxy implements InvocationHandler {
	
	// ����Ŀ����ӿ�
	private UserDao userDao;
	// ����������
	public Object createProxy(UserDao userDao) {
		this.userDao = userDao;
		// 1.�������
		ClassLoader classLoader = JdkProxy.class.getClassLoader();
		// 2.���������ʵ�ֵ����нӿ�
		Class[] clazz = userDao.getClass().getInterfaces();
		// 3.ʹ�ô����࣬������ǿ�����ص��Ǵ����Ķ���
		return Proxy.newProxyInstance(classLoader, clazz, this);
	}
	
	
	/**
	 * 
	 * <p>Title: invoke</p>   
	 * <p>Description: ���д�����ķ������ã����ύ��invole����ȥ����</p>   
	 * @param proxy �������Ķ���
	 * @param method ��Ҫִ�еķ�����Ϣ
	 * @param args ִ�з�������Ҫ�Ĳ���
	 * @return
	 * @throws Throwable   
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		// ��������
		MyAspect myAspect = new MyAspect();
		// ǰ��ǿ
		myAspect.check_Permissions();
		// ��Ŀ�����ϵ��÷��������������
		Object obj = method.invoke(userDao, args);
		// ����ǿ
		myAspect.log();
		return obj;
	}

}
