package importSelector.dao;

import importSelector.myImportSelector.MyInvocationHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

/**
 * 不需要加@Component注解   动态启用
 */
public class ImportCustom implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		/**
		 * 当spring容器中有importImpl1 	这个bean的时候   就启用代理
		 */
		if(beanName.equals("importImpl1")){
			bean = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{ImportDao.class}, new MyInvocationHandler(bean));
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}

}
