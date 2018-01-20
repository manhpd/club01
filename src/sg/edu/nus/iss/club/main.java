package sg.edu.nus.iss.club;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Facility facility = new Facility("Software Development","");
//		Person person = new Person("Pham","Manh","Duc");
//		Person manh ;
//		
//		manh = new Member("Pham", "Duc", "Manh", 101);
//		facility.show();
//		System.out.println(person.toString());
//		System.out.println(manh.toString());
//		
		
		Club kendoClub = new Club(20);
		Club codingClub = new Club(10);
		
		Member manh = kendoClub.addMember("Pham", "Manh", "Duc");
		Member nhat = codingClub.addMember("Dinh", "Xuan", "Nhat");
		
		kendoClub.showMembers();
		codingClub.showMembers();
	}

}
