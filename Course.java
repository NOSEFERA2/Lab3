
public class Course 
{
	private String DEPTname;
	private String number;
	private String name;
/**
 * Default constructor
 */
	Course()
	{
		DEPTname = "NULL";
		number = "NULL";
		name = "NULL";
	}
	/**
	 * Overloaded constructor to be used in main
	 * @param dept
	 * @param num
	 * @param nam
	 */
	Course(String dept, String num, String nam)
	{
		DEPTname = dept;
		number = num;
		name = nam;
	}
	/**
	 * Gets department name for Student class use
	 * @return
	 */
	//getters
	public String getDEPTname()
	{
		return DEPTname;
	}
	/**
	 * String gets Number for Student class use
	 * @return
	 */
	public String getNum()
	{
		return number;
	}
	/**
	 * gets name for Student class use
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
}
