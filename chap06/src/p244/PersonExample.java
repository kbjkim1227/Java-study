package p244;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("201047-5751155", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		System.out.println();
		
		p1.name ="을지문덕";
//		p1.nation = "USA";
//		p1.ssn = "111111111";

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		

	}

}
