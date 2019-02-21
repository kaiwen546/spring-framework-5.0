package com.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * Created by Kevin on 2019/2/12
 */
@Component
public class TestBeanPostProcessor1 implements BeanPostProcessor, PriorityOrdered {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("com/dao")){
			System.out.println("postProcessBeforeInitialization1");
		}
		/**
		 * 插手bean实例化过程
		 * 如返回一个代理对象
		 * Proxy.newInstance()
		 */
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("com/dao")){
			System.out.println("postProcessAfterInitialization1");
		}
		return null;
	}

	@Override
	public int getOrder() {
		return 9;
	}
}
