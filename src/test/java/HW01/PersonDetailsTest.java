package HW01;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonDetailsTest {

	
	PersonDetails personDetails = new PersonDetails();
	

	@Test
	public final void test() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		ByteArrayInputStream in = new ByteArrayInputStream("Roi\nIsrael\n".getBytes());
		System.setIn(in);
		
		personDetails.getPrintDetails();
		String expected = new String("What is your name? : \r\nWhere are you from (Roi)? : \r\nHi Roi, you are from Israel.\r\n");
		String actual = outContent.toString();
		assertEquals(expected, actual);
		
		System.setOut(null);
		System.setIn(System.in);
	}

}
