package com.test.demo

def name = "dhrumil"
println name
println "my name is " + name // Concatenation of string
println "my name is -- ".concat(name)
println "my name is == $name"
println 'my name is ** $name' // in single quoted string we can not refer name variable like this

def s1 = """this is a groovy lecture
and we are learning string""" // to print string in multiple lines 
println s1

def s2 = '''this is a groovy lecture ##
and we are learning string##''' //single triple quotes
println s2

println name.length()
println name[2]
println name [-2]
println name.indexOf('m')
println name[0..2]
println name[6..4]
println name[0,2,4]


def s3 = "This is a test STring"
println s3.split(" ")
println s3-("test")
println s3.replace("test", "updated test")
println s3.toLowerCase()
println s3.toUpperCase()
println s3.toList()

println "Groovy " * 3
// we can use this as multiple line as well 
def s4 = /see the blue 
sky/
def s5 = $/ see the blue 
water/$
println s4
println s5

def s6 = "this is a \"jungle\"" //use of slashy OR $slashy string
println s6
def s7 = /this is "beautiful"/
println s7

//slashy and dollar slashy things used in regular expression 