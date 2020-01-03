package com.test.demo

def employee = [
	'name' : 'john', 
	'age' : 40 
	]
println employee
println employee.name
println employee.get('age') //this will give value of key age
employee.put('city', 'london')
println employee