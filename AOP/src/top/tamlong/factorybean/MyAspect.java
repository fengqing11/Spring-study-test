package top.tamlong.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// ִ��Ŀ�귽��
		Object obj = mi.proceed();
		log();
		return obj;
	}

	@SuppressWarnings("unused")
	private void check_Permissions() {
		System.out.println("ģ����Ȩ��...");
	}
	
	private void log() {
		System.out.println("ģ����־��¼...");
	}

}
