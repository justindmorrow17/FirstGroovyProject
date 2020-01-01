package com.test.demo

/*LIST
 * 
 * structure to store a collection of data items
 * 
 * syntax : [obj1, obj2, obj3,...]
 *  
 */

def fruits = ["apples", "oranges", "limes", "mangoes"]

println fruits[1]
println fruits.get(3)

def myList = [1,2,3,["A", "B", "Groovy"],4,5]
println myList[2]
println myList.get(3)
println myList[3][2]
println myList.get(3).get(1)

println myList[0..3]
println myList[5..3]
println myList.contains(3)
println myList[3].contains("Groovy")
println myList[3].size()

println myList.add(10)
println myList<<20

myList.add(2, 22)
println myList

myList.remove(2)
println myList

myList = myList + [30, 40]
println myList

myList = myList.plus([50])
println myList

myList = myList - [30, 40]
println myList

myList = myList.minus([50])
println myList

myList.pop()
println myList

myList.removeLast()
println myList

println myList.intersect([1,2,3])

myList = myList.reverse()
println myList

myList = myList.sort()
println myList

println myList.isEmpty()