package main;

public class MatthewChoi {
	
//String getFullName(). This method returns your full name, with spacing, as a string.
//	String getFirstName(). This method returns your first name as a string.
	//String getLastName(). This method returns your last name as a string.
//	String getUCInetID(). This method returns your UCInetID as a string.
//	int getStudentNumber(). This method returns your UCI student number.
//	String getRotatedFullName(int shift). This method returns your name, rotated (with wrap-around), by ’shift’ characters. Positive numbers rotate to the left, and negative numbers rotate to the right. For example, for my name “Jim Jones”, if I executed:	
	
	private String fullName = "Matthew Choi";
	private String firstName = "Matthew";
	private String lastName = "Choi";
	private String uciID = "matthyc1";
	private int idNumber = 67221734;
	
	
	public MatthewChoi() {
		
	}
	
	

	public String getFullName() {
		return this.fullName ;
	}
	
	
	public String getFirstName() {
		return this.firstName ;
	}
	
	
	public String getLastName() {
		return this.lastName ;
	}
	
	
	public String getUCInetID() {
		return this.uciID ;
	}
	
	
	public int getStudentNumber() {
		return this.idNumber;
	}
	
	
	public String getRotatedFullName( int shift) {
		
		String result = "";
		
		if( shift > 0 ) {
		
			String nameBreak = this.fullName.substring(0, shift);
			result = this.fullName.substring(shift);	
			result += nameBreak;
					
			
		} else if ( shift < 0 ) {
			
			
			result = this.fullName.substring( this.fullName.length()+shift);
			String partedName = this.fullName.substring(0, this.fullName.length()+shift);
			
			result += partedName;
			
		}
		
		
		return result;
	}
	
	




}



