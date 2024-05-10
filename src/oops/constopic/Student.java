package oops.constopic;

public class Student 
{
	// 1) Data members
	 int rno;
	 String name;
	 int std;
	 // private / default / public
	 Student()
	 {
		 System.out.println("START :: Default Constructor----"+rno + " " +name + " " + std);
		 System.out.println("END :: Default Constructor----"+rno + " " +name + " " + std);
	 }
	 Student(int rno,String name)
	 {
		 this();
		 this.rno = rno;
		 this.name = name;
		 System.out.println("END :: PARA(TWO) Constructor----"+rno + " " +name + " " + std);
	 }
	 Student(int rno,String name , int std)
	 {
		 this(rno,name);
		 this.std = std;
		 System.out.println("END :: PARA(THREE) Constructor----"+rno + " " +name + " " + std);
	 }
	 // Para / COPY
	 Student(Student s)
	 {
		 System.out.println("START :: COPY Constructor----"+rno + " " +name + " " + std);
		 this.rno = s.rno;
		 this.name = s.name;
		 this.std = s.std;
		 System.out.println("END :: COPY Constructor----"+rno + " " +name + " " + std);
	 }
	 
	 public static void main(String[] args) 
	 {
		 Student s1 = new Student(2,"Kunnu",12);
		 
		 System.out.println(s1+"---"+s1.rno + " " + s1.name + " " +s1.std);
	 }
}