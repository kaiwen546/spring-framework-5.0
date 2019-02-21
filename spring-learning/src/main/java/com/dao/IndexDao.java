package com.dao;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;


/**
 * Created by Kevin on 2019/2/12
 */
@Repository("dao")
public class IndexDao implements Dao {
	public IndexDao() {
		System.out.println("构造");
	}
	@PostConstruct
	void init(){
		System.out.println("init");
	}
	@Override
	public void query() {
		System.out.println("query");
	}
}
