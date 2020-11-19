package day4;

public class EmployeewageComputation 
{
	public static void main(String args[]) 
	{
		int IS_FULL_TIME=1;
		int result;
		double empCheck=Math.floor(Math.random()*10) % 2;
		result=(empCheck==IS_FULL_TIME)?8*20:0;
		System.out.println("Daily wage of employee is: "+result);
	}
}