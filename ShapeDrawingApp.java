package com.sat.tmf.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class ShapeDrawingApp {

	public static void main(String[] args) {
		//Regular way of creating object
		//Triangle t = new Triangle();
		
		//using bean factory
		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triangle t1 = (Triangle)beanFactory.getBean("triangle");
		
		//using application context
		//the xml file must be present in the class path where our java file is present
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle t1 = (Triangle)context.getBean("triangle");
		
		t1.draw();

	}

}
