package sg.edu.nus.iss.club;

public class Member extends Person {
	private int memberNumber;

	public Member(int memberNumber) {
		super();
		this.memberNumber = memberNumber;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public Member(String surname, String firstName, String secondName, int memberNumber) {
		super(surname, firstName, secondName);
		this.memberNumber = memberNumber;
	}
	
	public String toString() {
		return "Surname: " + this.getSurname() +
				"\nFirstname: " + this.getFirstName() + "\nSecondName: " + this.getSecondName() +"\nMemberNumber:" + this.memberNumber;
	}
	
    public void show() {
        // TODO implement here
    	System.out.println(this.toString());
    }
}
