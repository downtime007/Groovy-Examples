package com.test.demo

//for loop

for (int i=1; i<=5; i++) { // you can use def here instead of int
	println i
}

//for in
for (a in 1..5) {
	println a
}

//upto

1.upto(5) { 
	
	println "$it" // it will print current iteration  
}

5.times {println "$it"}

1.step(10,2) {
	println "$it"
}

////////////////////////////////

for ( i in [0, 1, 2, 3, 4] ) {
	println i
}

// iterate over a map
def map = ["name":"groovy", "subject":"automation"] // map is key:value pair -> 
for ( e in map ) {
	println e
	println e.key+":"
	println e.value
}

//while loop
int i =10
while (i<=15) {
	println i
	i++
}

