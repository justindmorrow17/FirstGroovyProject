package com.test.demo

//print "Enter your name: "
//def name = System.console().readLine()
//println "Hello $name"
//
//print "Enter first number: "
//def num1 = System.console().readLine().toInteger()
//print "Enter second number: "
//def num2 = System.console().readLine().toInteger()
//
//println "$num1 + $num2 = " (num1+num2)

//Output
def name = "Alex"
println "My name is Alex"

printf "My name is %s \n", name
// printf %s for string | %d for integers | %.2f floating numbers to two places | \n to add a line
printf "%s | %d | %.2f \n", ["Alex", 10, 20.303]

printf "%-10s | %10s | %d | %.2f \n", ["Alex", "Groovy", 10, 20.303]