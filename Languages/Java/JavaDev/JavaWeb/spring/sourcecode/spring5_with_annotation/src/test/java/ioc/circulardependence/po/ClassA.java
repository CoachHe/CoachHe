package ioc.circulardependence.po;

public class ClassA {
	private ClassB classB;

	public ClassB getClassB() {
		return classB;
	}

	public void setClassB(ClassB classB) {
		this.classB = classB;
	}
}
