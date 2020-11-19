package day4;

public class EmployeewageComputation 
{
	public static void main(String args[]) 
	{
		int IS_FULL_TIME=1,IS_PART_TIME=2;
		int result;
		double empCheck=Math.floor(Math.random() *10) % 3;
		result=(empCheck==IS_FULL_TIME)?8*20:(empCheck==IS_PART_TIME)?4*20:0;
		System.out.println("Daily wage of employee is: "+result);
	}
}