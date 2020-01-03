package com.test.demo

print "enter your name: "
def name = System.console().readLine()
println "hello $name"
//this needs to be performed on CMD - go to properties - open file ocation - file folder type CMD open file and run that file

print "enter first number: "
def n1 = System.console().readLine().toInteger()
print "enter second number: "
def n2 = System.console().readLine().toInteger()

println "$n1 + $n2 = " +(n1+n2)

//output
//print
//println
//printf
