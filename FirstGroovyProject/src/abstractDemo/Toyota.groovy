package abstractDemo

class Toyota extends Car {
	
	int topSpeed;
	
	@Override
	public Object topSpeed() {
		println "Top speed for $name is $topSpeed"
	}

	static void main(args) {
		Toyota car1 = new Toyota();
	}
		
}
