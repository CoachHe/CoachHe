package ioc.annotation;

import ioc.annotation.po.Student;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestIoCAnno {

	@Test
	public void test() {
		// AnnotationConfigWebApplicationContext（web版本）
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ioc.annotation.po");
		Student student = context.getBean(Student.class);
		System.out.println(student);
		context.close();
	}

	@Test
	public void test2() {
		// 一般都是针对@Configuration配置的类进行扫描
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Student.class);
		Student student = context.getBean(Student.class);
		System.out.println(student);
		context.close();
	}

}
