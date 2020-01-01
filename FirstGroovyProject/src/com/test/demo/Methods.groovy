package com.test.demo

def printHello() {
	println "Hello... :)"
}

printHello()

def sum(int a, int b) {
	println "Sum is "+(a+b)
}

sum(2, 4)

def sub(int x, int y) {
	def c = x - y;
	return c;
}

def result = sub(10, 5)
println "Result is "+result