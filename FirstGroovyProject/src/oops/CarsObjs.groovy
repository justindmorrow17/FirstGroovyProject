package oops

class CarsObjs {

	static void main(args) {
		
	Cars toyota = new Cars()
	toyota.name = "Toyota"
	toyota.color = "blue"
	toyota.model = 2019
	toyota.getCarDetails()
	toyota.startEngine()
	
	println "===================================="
	
	Cars ford = new Cars()
	ford.name = "Ford"
	ford.color = "black"
	ford.model = 2016
	ford.getCarDetails()
	ford.startEngine()
	}
}
