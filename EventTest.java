import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EventTest {
	
	Event event = new Event(3, "Jumanji" , "AMC" , "jumanji the next level" , "Not better than the 1st one", 13, 3);

	
	@Test
	public void testgetTitleUpperCase()
	{
		
		String title = event.getTitle();
		String actualOutput = event.title.toUpperCase();
		String expectedOutput = "JUMANJI";
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void testgetTitlowerCase()
	{
		String title = event.getTitle();
		String actualOutput = title.toLowerCase();
		String expectedOutput = "Jumanji";
		assertEquals(expectedOutput, actualOutput);
	}
	

	@Test
	public void testgetType()
	{
		int type = event.getType();
		int actualOutput = 3;
		int expectedOutput = 3;
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void testgetComments()
	{
		String Comments = event.getTitle();
		String actualOutput = Comments;
		String expectedOutput = "Not better than the 1st one";
		assertEquals(expectedOutput, actualOutput);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
