package importSelector.myImportSelector;

import importSelector.dao.ImportCustom;
import importSelector.dao.ImportImpl1;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{ImportCustom.class.getName()};
		//return new String[]{ImportImpl1.class.getName()};
	}
}
