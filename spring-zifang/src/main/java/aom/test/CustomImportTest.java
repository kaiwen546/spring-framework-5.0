package aom.test;

import aom.conf.Appconfig;
import aom.service.Dao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomImportTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		Dao dao = (Dao) annotationConfigApplicationContext.getBean("dao");
		dao.test();
	}
}
