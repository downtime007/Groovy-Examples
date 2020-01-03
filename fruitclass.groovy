package com.fruitclass.demo

class Example { // here class is example - attributes are color and name and functions are set get color and name
static void main(args) {
		Example apple = new Example();
		apple.setfruitcolor("red")
		apple.setfruitname("apple")
		apple.getfruitcolor()
		apple.getfruitname()		
	}	
	private String fruitname
	private String fruitcolor
	
	public void setfruitname(String name) {
		fruitname = name;
	}  	
	public void setfruitcolor(String color) {
		fruitcolor = color;
	}	
	public void getfruitname() {
		println "name of the fruit is $fruitname";
	}	
	public void getfruitcolor() {
		println "color of the fruit is $fruitcolor";
	}		
}
