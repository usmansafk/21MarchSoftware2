package DesignPatterns;

public class Singleton {
	
	static Singleton x;
	int data;
	
	private Singleton() {}
	
	public void msg() {
		System.out.println("Hello");
	}
	
	public static Singleton createObject() {
		if(x==null) {
			x = new Singleton();
		}
		return x;
	}
	
	
}
