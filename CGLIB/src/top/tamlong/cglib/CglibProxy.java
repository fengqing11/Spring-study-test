package top.tamlong.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import top.tamlong.aspect.MyAspect;

// 代理类
public class CglibProxy implements MethodInterceptor {
	// 代理方法
	public Object createProxy(Object target) {
		// 创建一个动态类对象
		Enhancer enhancer = new Enhancer();
		// 确定需要增强的类，设置其父类
		enhancer.setSuperclass(target.getClass());
		// 添加回调函数
		enhancer.setCallback(this);
		// 返回创建的代理类
		return enhancer.create();
	}

	/**
	 * 
	 * <p>
	 * Title: intercept
	 * </p>
	 * <p>
	 * Description: 根据指定父类生成代理类
	 * </p>
	 * 
	 * @param proxy
	 * @param method      拦截的方法
	 * @param args        拦截方法的参数数组
	 * @param methodProxy 方法的代理对象，用户执行父类的方法
	 * @return
	 * @throws Throwable
	 * @see org.springframework.cglib.proxy.MethodInterceptor#intercept(java.lang.Object,
	 *      java.lang.reflect.Method, java.lang.Object[],
	 *      org.springframework.cglib.proxy.MethodProxy)
	 */
	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		// 声明切面
		MyAspect myAspect = new MyAspect();
		// 前增强
		myAspect.check_Permissions();
		// 在目标类上调用方法，并传入参数
		Object obj = methodProxy.invokeSuper(proxy, args);
		// 后增强
		myAspect.log();
		return obj;
	}

}
