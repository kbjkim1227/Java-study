package p294;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //부모의 기본생성자
		this.studentNo = studentNo;
	}

}
