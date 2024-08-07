package br.edu.univas.p8.designpatterns;

public class SingleObject {

	public static SingleObject instance = null;

	private SingleObject() {
	}

	public static SingleObject getInstance() {
		if (SingleObject.instance == null) {
			SingleObject.instance = new SingleObject();
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello Singleton!");
	}
}
