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


		/**
		 * 这里面证明当配置类加上@Configuration注解的时候 使用了cglib代理
		 * 不加@Configuration注解的时候不使用
		 */
		//ImportConfig importConfig = (ImportConfig) annotationConfigApplicationContext.getBean("importConfig");
	}
}
