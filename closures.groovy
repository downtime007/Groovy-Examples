package com.test.demo

def myClosure1 = {println "hello world"}
myClosure1.call()


def str = "hello"
def myClosure2 = {name -> println "$str ${name}"} // Closure using variables name also curly bracket and non curly bracket will work fine
myClosure2.call("Dhrumil") //passing this value via function

def mymethod(clos) {
	clos.call("Groovy")
}
mymethod(myClosure2) // this will call mymethod and from that myClosure2 and give variable name = Groovy

def myClosure3 = { //this is one way to use closure
	a,b,c ->
	return (a+b+c)
}
println myClosure3(1,2,3)

def mylist1 = ["apple", "orange", "grape"] // this is list we will go deep later on
println mylist1.each{it}

def mymap1 = [
	'subject' : 'groovy', 
	'topic'   : 'closures'
	]
println mymap1.each{it} //with each command we are using curly bracket for closure