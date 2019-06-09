/**
 * 
 */
package com.questions.interview.ust;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

/**
 * @author govindaraju.v
 *
 */
/*
 * Injecting Prototype Beans into a Singleton Instance in Spring
 * 
 */
public class InjectingPrototypeToSingleton {
	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		SingletonBean firstSingleton = context.getBean(SingletonBean.class);
		PrototypeBean firstPrototype = firstSingleton.getPrototypeBean();

		// get singleton bean instance one more time
		SingletonBean secondSingleton = context.getBean(SingletonBean.class);
		PrototypeBean secondPrototype = secondSingleton.getPrototypeBean();

		 //isTrue(firstPrototype.equals(secondPrototype), "The same instanceshould be returned");
		Assert.isTrue(firstPrototype.equals(secondPrototype), "The same instanceshould be returned");
	}
}
