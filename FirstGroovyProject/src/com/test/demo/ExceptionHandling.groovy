package com.test.demo

try {
	
int i = 1/1

}catch(Exception exp) {
	println "I am inside exception block"
	println exp.getCause()
	println exp.getMessage()
//	exp.printStackTrace()
}finally {
	println "I am inside finally block"
}

println "I am past the try-catch"