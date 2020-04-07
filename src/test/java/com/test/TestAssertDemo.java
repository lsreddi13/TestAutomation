package com.test;

import org.testng.annotations.Test;

public class TestAssertDemo {

	@Test
	public void verifyLastName() {
		String m_lastName = "Beust";
	  assert "Beust".equals(m_lastName) : "Expected name Beust, for  " + m_lastName;
	  
	  
	}

	
}
