package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.HelloBean;
import sj.Student;

public class StudentTest {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("helloworld.xml");
		
		HelloBean h1 = (HelloBean) ctx.getBean("helloworld");
		
		h1.sayHello();
		
		System.out.println(h1);
		
		Student myBean = (Student)
				ctx.getBean("StBean");
		
		System.out.println(myBean);
	}
}
