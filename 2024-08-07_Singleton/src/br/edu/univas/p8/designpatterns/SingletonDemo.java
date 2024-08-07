package br.edu.univas.p8.designpatterns;

public class SingletonDemo {
	
	public static void main(String[] args) {
		
		SingleObject object1 = SingleObject.getInstance();
		SingleObject object2 = SingleObject.getInstance();
		
		object1.showMessage();
		object2.showMessage();
		
		if (object1 == object2) {
			System.out.println(object1);
			System.out.println(object2);
			System.out.println("Singleton Funcionou! :)");
		} else {
			System.out.println("Singleton Falhou! :(");
		}
	}
}
