package com.ns.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ns.beans.Motor;

public class NSTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ns/common/application-context.xml"));
		Motor motor = factory.getBean("motor", Motor.class);
		System.out.println(motor);
	}
}
