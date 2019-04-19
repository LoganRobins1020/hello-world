package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.HelloBean;
import sj.Student;

public class TestHelloBean {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("helloworld.xml");
		
		//HelloBean h1 = (HelloBean) ctx.getBean("helloworld");
		
		//h1.sayHello();
		
		//System.out.println(h1);
		
		Student myBean = (Student)
				ctx.getBean("StBean");
		
		System.out.println(myBean);
		
		Student myBean2 = (Student)
				ctx.getBean("StBean2");
		
		System.out.println(myBean2);
	}
	
}
