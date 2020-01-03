package opps

class Student { // class name must start with upper case 
	String name;
	int sub1Marks;
	int sub2Marks;
	
	public void printTotal() {
		println"$name has total masks = "+(sub1Marks+sub2Marks)
	}
	static void main(args) {
		Student student1 = new Student(); // this is called creating object
		student1.name = "raamlo"
		student1.sub1Marks = 45
		student1.sub2Marks = 50
		student1.printTotal()
		
		Student student2 = new Student();
		student2.name = "chhagan"
		student2.sub1Marks = 89
		student2.sub2Marks = 50
		student2.printTotal()
	}
}
