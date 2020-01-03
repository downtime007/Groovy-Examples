package com.test.demo

import groovyjarjarantlr4.v4.codegen.model.OutputFile

//created file named data1.txt for demo

/**reading files**/

String filepath = "D:/Groovy-Project/test-1/src/com/test/demo/data1.txt"
File myfile = new File(filepath) // use class File

// reading entire content as string
println myfile.text

//collect lines into list
def list = myfile.collect{it} // we are using closure for list 
println "list: $list"

//store file content in array
def array = myfile as String[]
println "array: $array"

//read file into a list of string
def lines = myfile.readLines()
println "lines: $lines"

// read file line by line
myfile.eachLine {line -> println line}

//read file line by line with number
myfile.eachLine {line, lineno -> println "$lineno : $line"}

//read with reader
def line
myfile.withReader { reader -> 
	while((line = reader.readLine()) != null) {
		println "line = $line"
	} 
}

//read with new reader
def outputfile = "data2.txt"
def reader = myfile.newReader()
new File(outputfile).append(reader)
reader.close()

//copy file data to another
def newfile = new File("data3.txt")
newfile << myfile.text 