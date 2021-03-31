package com.spring.main;
 
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.spring.model.Assignment;
 
public class Demo {
 
    public static void main(String[] args) {
 
        // Reading configuration from the spring configuration file.
        ConfigurableApplicationContext   context = new ClassPathXmlApplicationContext("spring-config.xml");
 
        Assignment myassign = context.getBean("assignmentBean", Assignment.class);
 
        System.out.println("Name= " + myassign.getName());
 
        // Closing the context object.
        context.close();
    }
}