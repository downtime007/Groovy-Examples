package com.test.demo

def printHello() {
	println "hello...."
}

printHello() // this will call the function OR method - it will go inside function and execute whatever there is inside this function

def sum(int a, int b) { // function with variables to give input
	println "sum is "+(a+b)
}

sum(5,6)

def sub(int c, int d) {
	def e = c-d
	return e
}
def result = sub(10,7) // as we are returning we can store this result and print it later on
println result