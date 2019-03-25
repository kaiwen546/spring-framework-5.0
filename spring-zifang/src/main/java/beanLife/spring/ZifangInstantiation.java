package beanLife.spring;

import beanLife.MyInvocationHandler.MyInvocationHandler;
import beanLife.service.CityService;
import beanLife.service.Service;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

@Component
public class ZifangInstantiation implements InstantiationAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		/**
		 * 此时返回不为空时, 下面两个方法都不会再去执行(看源码 第一次调用后置处理器
		 * 但是会执行BeanPostProcessor的后置处理器的方法  postProcessAfterInitialization
		 * AbstractAutowireCapableBeanFactory  第1102行
		 */
		return Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class[]{Service.class},new MyInvocationHandler());
		//return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("AfterInstantiation---" + beanName);
		/**
		 * 返回值为false的时候 不会执行第三个方法  不去设置属性和自动装配
		 * 也就是说不会去设置service中的自己注入属性 报空指针异常
		 *  @Autowired
		 * 	ZifangDao dao;
		 */
		return true;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		return null;
	}
}
