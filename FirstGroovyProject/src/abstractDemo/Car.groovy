package abstractDemo;

package abstractDemo;

abstract class Car {
	
	String name;
	String color;
	int model;
	
	def startEngine() {
		println "Starting engine for $name"
	}
	
	abstract def topSpeed() {
		
	}
}
