package day4;

public class EmployeewageComputation 
{
	public static void main(String args[]) 
	{
		int IS_FULL_TIME=1;
		String result;
		double empCheck=Math.floor(Math.random() *10) % 2;
		result=(empCheck==IS_FULL_TIME)?"EMPLOYEE IS PRESENT":"EMPLOYEE IS ABSENT";
		System.out.println(result);
	}
}