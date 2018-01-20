package sg.edu.nus.iss.club.test;

import static org.junit.Assert.*;
import sg.edu.nus.iss.club.*;

import org.junit.Test;

public class ClubTest {

	@Test
	public void test1() {
		Club club = new Club(20);
		Member member = club.addMember("Manh", "Duc", "Pham");
		int memberNumber = member.getMemberNumber();
		assertEquals(1, memberNumber);
		
		club.removeMember(1);
		assertEquals(0, club.getCount());
	}


}
