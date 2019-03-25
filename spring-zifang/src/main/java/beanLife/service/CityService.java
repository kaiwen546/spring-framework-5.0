package beanLife.service;

import beanLife.Dao.ZifangDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CityService implements Service {
	@Autowired
	ZifangDao dao;
	@Override
	public void query() {
		System.out.println(dao.getClass().getSimpleName());
	}
}
