import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.Test;
	

public class EventTestClass {
	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.Test;

	class EventTest {
		
		public int type;
	    public String title;
	    public String location;
	    public String description;
	    public String comments;
	    public int ageRestrict;
	    public int rating;
		
		
		Event event = new Event(2, "Star Wars" , "Regal" , "The Rise of Skywalker" , "What just happened?", 13, 2);
		
		
		@Test 
		public void testgetAgeRestrict() {
			
			ageRestrict = event.getAgeRestrict();
			int age = 13;
			assertEquals(ageRestrict, age);
		}
		
		
		@Test 
		public void testsetAgeRestrict() {
		 	event.setAgeRestrict(13);
			int age = 13;
			assertSame(ageRestrict, age);
		}
		
		@Test
		public void testgetDescription() {
			String description = event.getDescription();
			String actual_descript = "The Rise of Skywalker";
			assertEquals("The Rise of Skywalker", actual_descript);
			
		}
	
		@Test 
		public void testsetDescription() {
			event.setDescription("The Rise of Skywalker");
			String actual_descript = "The Rise of Skywalker";
			assertEquals("The Rise of Skywalker", actual_descript);
			
		}
		
		@Test
		public void testgetLocation() {
			location = event.getLocation();
			String actual_loc = "Regal";
			assertEquals(location, actual_loc);
		}
		
		@Test
		public void testsetLocation() { 
			event.setLocation("Regal");
			String actual_loc = "Regal";
			assertEquals(location, actual_loc);
		}
		
		@Test
		public void testgetRating() {
			rating = event.getRating();
			int rated = 1; 
			assertEquals(rating, rated);
		}
}