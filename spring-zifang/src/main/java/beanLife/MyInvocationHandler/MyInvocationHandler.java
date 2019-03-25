package beanLife.MyInvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	//Object target;
	//
	//public MyInvocationHandler(Object target) {
	//	this.target = target;
	//}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("启用代理");
		//return method.invoke(target,args);
		return null;
	}
}
