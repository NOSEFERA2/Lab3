
public class Grade 
{
	private char letterGrade;
	private  double GPA; 
	/**
	 * default constructor
	 */
	Grade()
	{
		letterGrade = 'N';
		GPA = 0.0;
	}
	/**
	 * Overloaded constructor
	 * to be used in main tester
	 * @param lg
	 * @param gpa
	 */
	Grade(char lg, double gpa)
	{
		letterGrade = lg;
		GPA = gpa;
	}
	/**
	 * returns letterGrade for Display function in Student class
	 * @return
	 */
	//getters
	public char getLetterGrade()
	{
		return letterGrade;
	}
	/**
	 * returns GPA for Display function in Student class
	 * @return
	 */
	public double getGPA()
	{
		return GPA;
	}
}
