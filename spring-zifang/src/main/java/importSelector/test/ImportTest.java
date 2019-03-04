package importSelector.test;

import importSelector.config.ImportConfig;
import importSelector.dao.ImportDao;
import importSelector.dao.ImportImpl1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ImportConfig.class);
		//annotationConfigApplicationContext.getBean(ImportImpl1.class).query();
		ImportDao bean = (ImportDao) annotationConfigApplicationContext.getBean("importImpl1");
		bean.query();
	}
}
