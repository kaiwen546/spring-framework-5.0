package importSelector.dao;

import org.springframework.stereotype.Component;


@Component
public class ImportImpl1 implements ImportDao{

	@Override
	public void query() {
		System.out.println("假装请求了数据库");
	}
}
