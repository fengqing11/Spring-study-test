package top.tamlong.aspectjXml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 
 * @ClassName: MyAspect
 * @Description: 切面类
 * @author: fengqing
 * @date: 2019年4月7日 下午7:43:17
 * 
 * @Copyright: 2019 www.tamlong.top Inc. All rights reserved.
 */
public class MyAspect {
	// 前置通知
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("前置通知：模拟权限检查...");
		System.out.println("目标类是：" + joinPoint.getTarget());
		System.out.println("，被植入增强处理的目标方法为：" + joinPoint.getSignature().getName());
	}

	// 后置通知
	public void myAfterReturning(JoinPoint joinPoint) {
		System.out.println("后置通知：模拟记录日志...");
		System.out.println("被植入增强处理的目标方法为：" + joinPoint.getSignature().getName());
	}
	
	/**
	 * 
	 * @Title: myAround   
	 * @Description: 环绕通知 
	 * @param: @param proceedingJoinPoint
	 * @param: @return
	 * @param: @throws Throwable      
	 * @return: Object      
	 * @throws
	 */
	public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		// 开始
		System.out.println("环绕开始：执行目标方法之前，模拟开启事务...");
		// 执行当前目标方法
		Object obj = proceedingJoinPoint.proceed();
		// 结束
		System.out.println("环绕结束：执行目标方法之后，模拟关闭事务...");
		return obj;
	}
	
	// 异常通知
	public void myAfterThrowing(JoinPoint joinPoint,Throwable e) {
		System.out.println("异常通知："+"出错了"+e.getMessage());
	}
	
	// 最终通知
	public void myAfter() {
		System.out.println("最终通知：模拟方法结束后的释放资源...");
	}

}
