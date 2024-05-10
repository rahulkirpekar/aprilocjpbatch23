package oops.encap;

//POJO - Plain Old Java Object===> Pure Encapspulation---Data Security
public class Student 
{
	private int rno;
	private String name;
	private int std;
	
	
	public Student(int rno, String name, int std) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	
	
	
	
	
//	// setters / Mutators
//	public void setRno(int rno) 
//	{
//		this.rno=rno;
//	}
//	public void setName(String name) 
//	{
//		this.name=name;
//	}
//	public void setStd(int std) 
//	{
//		this.std=std;
//	}
//	// getters / Accessors
//	public int getRno() 
//	{
//		return rno;
//	}
//	public String getName() 
//	{
//		return name;
//	}
//	public int getStd() 
//	{
//		return std;
//	}
}
