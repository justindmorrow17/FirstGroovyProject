package com.test.demo

def num = -10 

if (num>0) 
	println "num is +ve"
else if (num == 0)
	println "num is zero"
else 
	println "num is -ve"

//switch-case
def x=0
def result = ""

switch(x) {
	case 0:
		result = "x is zero"
		break
	case {x>0}:
		result = "x ix +ve"
		break
	case {x<0}:
		result = "x is -ve"
		break
	default:
		result = "Invalid number"	
}
println result