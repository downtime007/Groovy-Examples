package com.test.demo

def fruits = ["apple" , "orange", "peach"]

println fruits[1]
println fruits.get(2)

def mylist = [1,2,3,['a','b',"dhrumil"],4]
println mylist[2]
println mylist[3]		//it will give whole list
println mylist[3][2]	//it will give 2nd index from main 3rd index
println mylist[0..2]


mylist.add(10)
println mylist // this will add 10 in the list
