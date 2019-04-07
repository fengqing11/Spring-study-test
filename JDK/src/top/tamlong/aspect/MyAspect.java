package top.tamlong.aspect;
// 切面类：可以存在多个通知Advice（即增强的方法）
public class MyAspect {
	public void check_Permissions() {
		System.out.println("模拟权限检查...");
	}
	public void log() {
		System.out.println("模拟记录日志...");
	}
}
