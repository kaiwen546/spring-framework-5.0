package com.test;


import com.beanfactcoryprocessor.MyBeanFactoryPostProcessor;
import com.conf.AppConfig;
import com.dao.Dao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Kevin on 2019/1/29
 */
public class SpringTest {
	public static void main(String[] args) {
		//AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(AppConfig.class);
		annotationConfigApplicationContext.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
		annotationConfigApplicationContext.refresh();
		/**
		 * BeanFactoryPostProcessor 插手beanFactory实例化过程
		 * 通过实现BeanFactoryPostProcessor接口修改bean为prototype
		 * 注意实现类必须加@Component注解 并被配置类扫描到
		 */
		Dao dao = (Dao) annotationConfigApplicationContext.getBean("dao");
		Dao dao1 = (Dao) annotationConfigApplicationContext.getBean("dao");
		System.out.println("dao:" + dao.hashCode() + "============" + "dao1:" + dao1.hashCode());
		dao.query();
	}
}
