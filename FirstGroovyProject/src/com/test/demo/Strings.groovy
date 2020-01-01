package com.test.demo
 

/* single quoted '....'
 * double quoted "..."
 * triple single quoted '''....'''
 * triple double quoted """..."""
 * slashy /.../
 * dollar slashy $/.../$
 */

//def name = "Justin"
//println name
//println "My name is " + name
//println "My name is ".concat(name)
//
//def name1 = "Alex"
//println "My name is $name1"
//
//def s1 = """This is a Groovy class
//and we are learning strings"""
//println s1

//def name = "Alex"
//println name.length()
//println name[2]
//println name[-1]
//println name.indexOf('x')
//println name[0..2]
//println name[3..0]
//println name[0,2,3]
//
//println name.substring(2)
//println name.subSequence(1,3)

//def str = "This is a groovy class"
//println str.split(" ")
//println str-("groovy ")
//println str.replace("class", "session")
//
//println str.toLowerCase()
//println str.toUpperCase()
//
//println str.toList()
//println "Groovy" * 3

println "Abc".equals("Abc")//true
println "Abc".equals("abc")//false
println "Abc".equalsIgnoreCase("abc")//true

def name = "Alex"
def s2 = /a blue sky $name/
def s3 = $/a green tree $name /$
println s2
println s3

def s4 = "My name is \"Justin\""
println s4
def s5 = /My name is "Justin"/
println s5





