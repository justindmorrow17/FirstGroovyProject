package com.test.demo

//http://groovy-lang.org/semantics.html

////for
//for(int i=1; i<=5; i++) {
//	println i
//}
//
////for in - iterate over a range
//for(a in 1..5) {
//	println a
//}

//upto keyword
1.upto(6) { println "$it" } //1 thru 6

//times keyword
5.times { println "$it" } //0 to 4

//step keyword
1.step(10, 2) { println "$it" } //up to 10 incrementing by 2

// iterate over a list
for ( i in [0, 1, 2, 3, 4] ) {
	println i
}

// iterate over the characters in a string
def text = "abc"
def list = []
for (c in text) {
	list.add(c)
	println list
}

//while
int i=1
while (i<5) {
	println i
	i++
}