package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.MatthewChoi;

class TestMatthewChoi {

	@Test
	public void testFullName() {
		MatthewChoi m = new MatthewChoi();
		String result = m.getFullName();
		
		assertEquals("Matthew Choi", result);
	}
	
	
	@Test
	public void testFirstName() {
		MatthewChoi m = new MatthewChoi();
		String result = m.getFirstName();
		
		assertEquals("Matthew", result);
	}
	
	
	@Test
	public void testLastName() {
		MatthewChoi m = new MatthewChoi();
		String result = m.getLastName();
		
		assertEquals("Choi", result);
	}
	
	
	@Test
	public void testStudentNumber() {
		MatthewChoi m = new MatthewChoi();
		int result = m.getStudentNumber();
		
		assertEquals(67221734, result);
	}
	
	@Test
	public void testUCInetID() {
		MatthewChoi m = new MatthewChoi();
		String result = m.getUCInetID();
		
		assertEquals("matthyc1", result);
	}
	
	
	@Test
	public void testRotatedFullName() {
		MatthewChoi m = new MatthewChoi();
		String result = m.getRotatedFullName( 5 );
		
		assertEquals("ew ChoiMatth", result);
	}
	
	
	@Test
	public void testRotatedFullName1() {
		MatthewChoi m = new MatthewChoi();
		String result = m.getRotatedFullName( -8 );
		
		assertEquals("hew ChoiMatt", result);
	}
	

}
