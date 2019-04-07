package top.tamlong.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// 执行目标方法
		Object obj = mi.proceed();
		log();
		return obj;
	}

	@SuppressWarnings("unused")
	private void check_Permissions() {
		System.out.println("模拟检查权限...");
	}
	
	private void log() {
		System.out.println("模拟日志记录...");
	}

}
