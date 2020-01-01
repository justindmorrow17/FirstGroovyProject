package com.test.demo

/* MAPS
 * 
 * key-value pair
 * unordered collection
 * 
 * [key:value]
 * ['name' : 'Alex']
 * [:] = empty map
 */

def employee =  [
	'name' : 'Alex',
	'age' : 5,
	'city' : 'Garden City'
]

println employee
println employee.name
println employee['age']
println employee.get('name')
println employee.getAt('age')

println employee.size()
employee.put('state', 'MI')
println employee

println employee.containsKey('city')
println employee.containsValue('MI')

println employee.getClass()

def emp2 = employee.clone()
println emp2

employee.each { key, value ->

	println "$key : $value"
}
employee.eachWithIndex { key, value, i ->

	println "$i | $key : $value"
}

employee.each { entry ->

	println "$entry.key : $entry.value"
}

def map1 = ['a': 1, 'b':2]
def entries = map1.entrySet()
entries.each { entry ->
	assert entry.key in ['a', 'b']
	assert entry.value in [1,2]
}

println entries

