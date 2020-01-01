package com.test.demo

/*
 * What are closures?
 * How to use closures?
 * Why do we need closures?
 * 
 * block of code that can take:
 * -take parameters
 * -refer variables
 * -return values
 * -can be passed as parameter in a method 
 */

def str = "Hello"

def myClosure1 = { name -> println "$str ${name}..." }
myClosure1.call("Alex")

def myClosure2 = { name -> println "Hello $name..." }
myClosure2.call("Alex")

def myMethod(clos) {
	clos.call("Groovy")
}
myMethod(myClosure1)

def myClosure3 = {
	a,b,c ->
	return (a+b+c)
}
println myClosure3(10,20,30)

def myList1 = ["Apples", "Orange", "Grape"]
println myList1.each { it }

def myMap = [
	'subject' : 'groovy',
	'topic' : 'closures'
	]
println myMap.each{ it }

def myList = [1,2,3,4,5]
println myList.find { item -> item == 3 }
println myList.findAll { item -> item >= 4 }
println myList.any { item -> item > 5 }
println myList.every { item -> item > 3 }
println myList.collect { item -> item*3 }






