package top.tamlong.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import top.tamlong.aspect.MyAspect;

/**
 * 
 * @ClassName:  JdkProxy   
 * @Description: JDK代理类 
 * @author: fengqing
 * @date:   2019年4月7日 下午12:44:22   
 *     
 * @Copyright: 2019 www.tamlong.top Inc. All rights reserved.
 */
public class JdkProxy implements InvocationHandler {
	
	// 声明目标类接口
	private UserDao userDao;
	// 创建代理方法
	public Object createProxy(UserDao userDao) {
		this.userDao = userDao;
		// 1.类加载器
		ClassLoader classLoader = JdkProxy.class.getClassLoader();
		// 2.被代理对象实现的所有接口
		Class[] clazz = userDao.getClass().getInterfaces();
		// 3.使用代理类，进行增强，返回的是代理后的对象
		return Proxy.newProxyInstance(classLoader, clazz, this);
	}
	
	
	/**
	 * 
	 * <p>Title: invoke</p>   
	 * <p>Description: 所有代理类的方法调用，都会交由invole方法去处理</p>   
	 * @param proxy 被代理后的对象
	 * @param method 将要执行的方法信息
	 * @param args 执行方法所需要的参数
	 * @return
	 * @throws Throwable   
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		// 声明切面
		MyAspect myAspect = new MyAspect();
		// 前增强
		myAspect.check_Permissions();
		// 在目标类上调用方法，并传入参数
		Object obj = method.invoke(userDao, args);
		// 后增强
		myAspect.log();
		return obj;
	}

}
