package ioc.circulardependence;


import ioc.circulardependence.po.ClassA;
import ioc.circulardependence.po.ClassB;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCyclicDependency {
	/**
	 * 循环依赖演示
	 */
	@Test
	public void test() throws Exception {
		// 创建IoC容器，并进行初始化
		String resource = "spring/spring-ioc-circular-dependency.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(resource);
		// 获取ClassA的实例（此时会发生循环依赖）
		ClassA classA = (ClassA) context.getBean(ClassA.class);
	}
	@Test
	public void test2() throws Exception {
		// 创建IoC容器，并进行初始化
		ClassA classA = new ClassA();
		ClassB classB = new ClassB();
		classA.setClassB(classB);
		classB.setClassA(classA);
	}
}
