package com.test.demo

class variables1 {

	static void main(args) {
		def name = "Dhrumil" 		//to define variable use def
		def name1 = "abc"			// you can use _ digit as variable - groovy is case sensitive for variable name
		def _name2 = "pqr"
		println name1
		println _name2
		println "=================================================================================="
		
		println name
		println 'Name is '+ name 	
		println 'Name is ${name}'
		println "Name is ${name}"
		println "=================================================================================="		
		def x = 10
		def X = 20 					//GROOVY is case sensitive 
		println x 
		println X	
		println "=================================================================================="
		def abc = 'dhrumil'
		abc = '100' 				// GROOVY is dynamically typed so variable abc's value has been changed on run time
		println abc
		println "=================================================================================="
		
		def (String a,int b,Double c, int d, String e) = [11,12,13,11111]
		println a
		println b
		println c
		println d
		println e
	}
}
