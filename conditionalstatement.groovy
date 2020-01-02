package com.test.demo

def num = 11

if (num == 10)  // as we have single statement {} is not required - if we have multiple statements then {} is required
	println "num is 10"
else 
	println "num is NOT 10"
	
// to check if number is +ve OR -ve
if (num > 0)  	// if num = 0 it will go to else block and print number is negative which is not true
	println "num is POSITIVE"
else
	println "num is NEGATIVE"
	
//nested if else
def num1 = 0
if (num1 > 0)
	println "+VE"
else if(num1 == 0)
	println "number is ZERO"
else 
	println "number is negative"
	
//instead of nested if else switch in such case is very useful
	
//switch-case
def x=10
def result = ""
switch(x) {
	case 0:
		result = "x is zero"
		break
	case {x>0}:
		result = "x is +ve"
		break
	case {x<0}:
		result = "x is -ve"
		break
	default:
		result = "Invalid"	
} 	
println result
	
