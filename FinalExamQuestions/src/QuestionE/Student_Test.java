package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbos@udel.edu","MIS");
		Student stu2 = new Student("abf", "Randsdfsall", "Gibsdsbons", dBirthDate, "22214 Labrador Lane", "362-893-6889", "bgibbons@udel.edu","MIS");
		Student stu3 = new Student("Besfdrt", "Rafsndall", "Gibbons", dBirthDate, "25514 Labrador Lane", "352-893-6889", "bibbons@udel.edu","MIS");
		Student stu4 = new Student("Bfsdert", "Rafdsndall", "Gibbons", dBirthDate, "214 Labrador Lane", "382-893-6889", "bgibons@udel.edu","MIS");
		Student stu5 = new Student("Befdsfrt", "Ransdfdall", "Gibxcvbons", dBirthDate, "25514 Labrador Lane", "372-893-6889", "bgbbons@udel.edu","MIS");
		
		HashMap<UUID, Student> map = new HashMap<UUID, Student>();
		
		map.put(stu1.getPersonID(), stu1);
		map.put(stu2.getPersonID(), stu2);
		map.put(stu3.getPersonID(), stu3);
		map.put(stu4.getPersonID(), stu4);
		map.put(stu5.getPersonID(), stu5);
		


		assertTrue(5==5);
		assertTrue(map.size()==5);
	}

}
