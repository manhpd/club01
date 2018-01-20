package sg.edu.nus.iss.club;

import java.util.List;

/**
 * 
 */
public class Club {

    /**
     * Default constructor
     */
    public Club() {
    }

    /**
     * 
     */
    private static int ARRAY_SIZE_INCREMENT;

    /**
     * 
     */
    private int numMember;

    /**
     * 
     */
    private int count;

    /**
     * 
     */
    private Member[] members;


    public Club(int numMember) {
		this.ARRAY_SIZE_INCREMENT = 1;
		this.count = 0;
		this.numMember = numMember;
		this.members = new Member[numMember] ;
	}

	/**
     * @param memberNum 
     * @return
     */
    public Member getMember(int memberNum) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Member[] getMembers() {
        // TODO implement here
        return this.members;
    }
    
    public int getCount() {
    	return this.count;
    }
    /**
     * @param surname 
     * @param firstName 
     * @param secondName 
     * @return
     */
    public Member addMember(String surname, String firstName, String secondName) {
        // TODO implement here
    	Member member = new Member(surname, firstName, secondName, this.ARRAY_SIZE_INCREMENT);
    	this.members[count] = member;
    	this.count++;
    	this.ARRAY_SIZE_INCREMENT++;
        return member;
    }

    /**
     * @param memberNum
     */
    public void removeMember(int memberNum) {
        // TODO implement here
    	boolean result = false;
    	for (int i = 0; i < count; i++ ) {
    		if (this.members[i].getMemberNumber() == memberNum) {
    			int index = i;
    			for (int j = index  ; j <= count ; j++) {
    	    		this.members[j] = this.members[j+1] ;
    	    	}
    			this.count--;
    			result = true;
    			break;
    		}
    	}
    	
    	if (!result) {
    		System.out.println("Cannot find the member!!");
    	}
    	
    }

    /**
     * 
     */
    public void showMembers() {
    	for (int i = 0; i < count;i++ ) {
    		this.members[i].show();
    	}
    }

    /**
     * 
     */
    public void ensureArraySize() {
        // TODO implement here
    }

}