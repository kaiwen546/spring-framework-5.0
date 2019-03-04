package aom.service;

import java.util.List;

public class AomDaoImpl implements Dao {
	@Override
	public List test() {
		System.out.println("假装请求了数据库");
		return null;
	}
}
