package com.questions.interview.ust;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;

public class SingletonFunctionBean {

	@Autowired
	private Function<String, PrototypeBean> beanFactory;

	public PrototypeBean getPrototypeInstance(String name) {
		PrototypeBean bean = beanFactory.apply(name);
		return bean;
	}

}