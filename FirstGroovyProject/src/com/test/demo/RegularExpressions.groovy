package com.test.demo

//regex - patterns used to find substrings in a text
// ~"expression"


def regex = /(?:[^Groovy]*)/
def match = "This is Groovy" =~ regex

if(match) {
	def i=0
	while(match) {
		println match[i]
		i++
	}
}else {
	println "No match found"
}



//println match = "Groovy" =~ "123"
//
//if(match) {
//	println match[0]
//}else {
//	println "No match found"
//}
