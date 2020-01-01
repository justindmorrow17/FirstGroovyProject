package com.test.demo

/* RANGES
 * 
 * creates a list of sequential values
 * denoted by first and last value of the sequence 
 * 
 * 1..10
 * 'a'..'z'
 * 10..1
 * 
 * 2 types > inclusive & exclusive
 * 1..10 inclusive
 * 1..<10 excludes 10
 */

def range = 1..10
println range

println range.size()
println range.getFrom()
println range.getTo()

assert range.from == 1
assert range.to == 10

println range.get(3)
println range[3]

println range.contains(8)
println range.reverse()
println range.isReverse()

def range2 = range.subList(3, 7)
println range2

//iterate on a range use a for loop
for(i in 1..10) {
	println i
}
for(i in range2) {
	println i
}
range2.each { i ->
	println "Value = $i"
}

println range instanceof java.util.List




















