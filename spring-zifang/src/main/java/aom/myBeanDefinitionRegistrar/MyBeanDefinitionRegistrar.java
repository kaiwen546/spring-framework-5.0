package aom.myBeanDefinitionRegistrar;

import aom.service.Dao;
import aom.service.MyFactoryBean;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(Dao.class);
		AbstractBeanDefinition beanDefinition = builder.getBeanDefinition();
		System.out.println(beanDefinition.getBeanClassName());
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(beanDefinition.getBeanClass());
		beanDefinition.setBeanClass(MyFactoryBean.class);
		registry.registerBeanDefinition("dao",beanDefinition);
	}
}
