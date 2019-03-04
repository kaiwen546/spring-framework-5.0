package aom.service;

import com.sun.org.apache.bcel.internal.generic.Select;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

public class MyFactoryBean implements InvocationHandler, FactoryBean {
	Class clazz;

	public MyFactoryBean(Class clazz) {
		this.clazz = clazz;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("proxy");
		return null;
	}

	@Override
	public Object getObject() throws Exception {
		Object proxyInstance = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{clazz}, this);
		return proxyInstance;
	}

	@Override
	public Class<?> getObjectType() {
		return clazz;
	}
}
