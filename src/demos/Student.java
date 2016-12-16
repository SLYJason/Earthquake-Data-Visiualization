package demos;

/** A class to store information about a Student
 *  Used in module 4 of the UC San Diego MOOC Object Oriented Programming in Java
 *
 * @author UC San Diego Intermediate Software Development MOOC team
 *
 */
public class Student
{
	public Student(String name)  {

	}

	public boolean isAsleep( int hr ) // override
	{
		return 2 < hr && 8 > hr;
	}

	public static void main(String[] args)
	{
		System.out.print("wpca");
	}
}
