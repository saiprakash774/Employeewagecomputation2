package day4;

public class EmployeewageComputation 
{
	public static final int IS_FULL_TIME=1,IS_PART_TIME=2;
	public static int dailywage(int empCheck)
	{
		switch(empCheck)
		{
		    case 1:
			        return 8*20;
		    case 2:
			        return 4*20;
		    default:
			        return 0;
		 }
	 }
	public static void main(String[] args)
	{
		int result;
		int empCheck= (int)Math.floor(Math.random() *10) % 3;
		result=dailywage(empCheck);
		System.out.println("Daily wage of employee is: "+result);
	}
}