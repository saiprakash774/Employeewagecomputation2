package day4;

public class EmployeewageComputation 
{
	public static final int IS_FULL_TIME=1,IS_PART_TIME=2,emprateprhr=20,numofworkingdays=20;
	public static int dailywage(int empCheck)
    {
		int emphr=0;
	    switch(empCheck)
	    {
		    case 1:
					emphr=8; //full-time
			        return emphr*emprateprhr;
		    case 2:
					emphr=4; //part-time
					return emphr*emprateprhr;
		    default:
			        return emphr*emprateprhr;
		 }
    }
	public static void main(String[] args)
	{
		int result=0;
		for(int i=1;i<=numofworkingdays;i++)
		{
			int empCheck= (int)Math.floor(Math.random() *10) % 3;
			result+=dailywage(empCheck);
		}
	System.out.println("Employee Wage per month: "+result);
	}
}