package oops

class Toyota extends Cars2{
	
	int topSpeed
	
	def topSpeed() {
		println "Top speed is $topSpeed"
	}
	
	static void main(args) {
		
		Toyota car1 = new Toyota();
		car1.name = "Toyota"
		car1.color = "blue"
		car1.model = 2019
		car1.topSpeed = 200
		car1.startEngine()
		car1.accelerate()
		car1.topSpeed()
		car1.stopEngine()
	}
}
