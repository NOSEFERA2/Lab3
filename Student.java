import java.util.ArrayList;
import java.util.Calendar;

public class Student 
{
	private String name;
	private Calendar birthDate;
	private String IDnum;
	private char gender;
	private int courseGradeAmount;
	private ArrayList<Course> classes = new ArrayList<Course>();
	private ArrayList<Grade> grades = new ArrayList<Grade>();
	
	/**
	 * Default constructor. instead of setting things to null. Just make strings read null so that if the string null appears
	 * You can debug as to why it never changed from default status
	 */
	Student()
	{
		name = "NULL";
		IDnum = "NULL";
		gender = 'N';
		courseGradeAmount = 0;
		birthDate.set(1950,0,0);
	}
	/**
	 * Overloaded constructor Sets name, birthdate, IdNumber, sex, and amount of Classes for the student
	 * @param nam
	 * @param yr
	 * @param mon
	 * @param day
	 * @param id
	 * @param gen
	 * @param cA
	 */
	Student(String nam, int yr, int mon, int day, String id, char gen, int cA, String dept, String num, String courseName, char lg, double gpa)
	{
		name = nam;
		birthDate.set(yr, mon, day);
		IDnum = id;
		gender = gen;
		courseGradeAmount = cA;
		for (int i = 0; i<courseGradeAmount; i++)
		{
			classes.add(new Course(dept, courseName, num));
			grades.add(new Grade(lg, gpa));
		}
		
	}
	/**
	 * returns the OverallGPA from each class student is taking that semester. ArrayList has an accumulator that adds
	 * all individual class GPA's
	 * @return
	 */
	public double calculateGPA()
	{
		double GPAcalc = 0;
		for (int i=0; i<courseGradeAmount; i++)
		{
			GPAcalc = grades.get(i).getGPA() + GPAcalc;
		}
		GPAcalc = GPAcalc/courseGradeAmount;
		return GPAcalc;
	}
	/**
	 * Void function displays all student report card info. Uses 
	 */
	public void displayInfo()
	{
		System.out.print("Name: " + name + "Birth Date" +  getBirthDate() + "ID number: " + IDnum + "Sex: " + gender);
		for(int i =0; i<courseGradeAmount; i++)
		{
			System.out.print(classes.get(i).getDEPTname() + classes.get(i).getNum() + classes.get(i));
			System.out.println("Grade: " + grades.get(i).getLetterGrade() + "Indiv GPA for class: " + grades.get(i).getGPA());
		}
		System.out.println("Overall GPA for semster: " + calculateGPA());
	}
	/**
	 * gets the Array of classes. Would be used in the main tester to then individually set the name of classes via a for loop
	 * @return
	 */
    //getters
	public ArrayList<Course> getCourse()
	{
		return classes;
		
	}
	/**
	 * gets the array of grades. Would be used in the main tester to then individually set the letter grades and their corresponding gpa 
	 * via a for loop
	 * @return
	 */
	public ArrayList<Grade> getGrade()
	{
		return grades;
	}
	/**
	 * makes birthDate be in United States Date format of Month/Day/Year in type String
	 * to be used in the void Display function
	 * @return
	 */
	public String getBirthDate() {
		return birthDate.get(Calendar.MONTH) + "/" 
			    + birthDate.get(Calendar.DAY_OF_MONTH) + "/"  + birthDate.get(Calendar.YEAR);
	}
}