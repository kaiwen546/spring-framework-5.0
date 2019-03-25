package beanLife.test;

import beanLife.config.AppConfig;
import beanLife.service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InstantiationAwareBeanPostProcessorTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Service cityService = (Service) annotationConfigApplicationContext.getBean("cityService");
		cityService.query();
	}
}
