package com.test.demo

//int i = 1/0

try {
	a = 1/0 // if 1/1 it will go to finally block - finally block will be executed everytime	
}

catch(ArithmeticException exp1) {// we can write multiple catch blocks as well 
	println "Catch block for Arithmetic Exception"
}

catch (Exception exp) {
	println "exception called"
	println exp.getCause()
	println exp.getMessage()
}finally {
	println "this is finally exception"
}

// we can directly write finally block after try
try {
	int b = 1/1
}finally {
	println "this is finally block"
}
