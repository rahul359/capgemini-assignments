package com.concretepage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringTest {
	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("app-conf.xml");
		ApplicationContextAwareTest appcontext= (ApplicationContextAwareTest)context.getBean("appcontext");
		ApplicationContext appCon =appcontext.getContext();
		ABC abc= (ABC)appCon.getBean("testA");
		abc.doTask();
		context.registerShutdownHook();
	}
} 