package com.test.demo

//Arithmetic Operator - Normal Arithmetic Operator
// assert will check if the RHS=LHS or not

assert  1  + 2 == 3
assert  4  - 3 == 1
assert  3  * 5 == 15
assert  3  / 2 == 1.5
assert 10  % 3 == 1
assert  2 ** 3 == 8  //if there is anything false then we will get failure
assert 9.intdiv(5) == 1
assert 2.2.plus(1.1) == 3.3

//Unary operators

assert +3 == 3
assert -4 == 0 - 4
assert -(-1) == 1

//Increment ++ and Decrement --  Operator
int i = 10
println i++ //post increment
println i
println (++i)
println "=============================================="
def a = 2
def b = a++ * 3
assert a == 3 && b == 6
def c = 3
def d = c-- * 2
assert c == 2 && d == 6
def e = 1
def f = ++e + 3
assert e == 2 && f == 5
def g = 4
def h = --g + 1
assert g == 3 && h == 4

// Assignment arithmetic operators

def aa = 4
aa += 3 // aa = aa + 3
println aa
def bb = 5
bb -= 3 // bb = bb - 3
println bb
def cc = 5
cc *= 3
assert cc == 15
def dd = 10
dd /= 2
assert dd == 5
def ee = 10
ee %= 3
assert ee == 1
def ff = 3
ff **= 2
assert ff == 9

//Relational operators
assert 1 + 2 == 3
assert 3 != 4
assert -2 < 3
assert 2 <= 2
assert 3 <= 4
assert 5 > 1
assert 5 >= -2

//Logical operators
assert !false
assert true && true
assert true || false

assert (!false && false) == false //The logical "not" has a higher priority than the logical "and".
assert true || true && false // first it will compute && then ||

//short circuiting in && and || -> so if there is true at very start of expression of || it will not compute anything else and directly give answer true
//if we are using && operand and if we find false at during left to right compute it will give answer as false without going to do further computes

//Bitwise operators
println "=============================================="

int a1 = 20
int b1 = 25
println (a1 & b1) //
println Integer.toBinaryString(a1) //10100
println Integer.toBinaryString(b1) //11001
								   //10000
println Integer.parseInt("10000",2)
println "=============================================="

//Conditional operators
assert (!true)    == false
assert (!'foo')   == false //this is not null which will be false
assert (!'')      == true

//Ternary operator
output1 = (1>0) ? "1 is greater" : "1 is not greater" // shorter version of if - else statement
println output1 


	




