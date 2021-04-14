package DesignPatterns;

public class Main {

	public static void main(String[] args) {
		
		Singleton x1 = Singleton.createObject();
		Singleton x2 = Singleton.createObject();
		Singleton x3 = Singleton.createObject();
		
		x1.data = 99;
		x2.data = 98;
		System.out.println(x1.data);
		System.out.println(x2.data);
		System.out.println(x3.data);

	}

}
