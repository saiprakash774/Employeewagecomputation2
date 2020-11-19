package day4;

public class EmployeewageComputation 
{
	public static final int IS_FULL_TIME=1,IS_PART_TIME=2,emprateprhr=20,numofworkingdays=20,maxhrprmonth=100;
	public static int dailywage(int empCheck)
    {
		int emphr=0;
		switch(empCheck)
		{
			case 1:
					emphr=8;//full-time
					return emphr;
			case 2:
					emphr=4; //part-time
					return emphr;        
			default:
					return emphr;
		}
    }
	public static void main(String[] args)
	{
		int totalemphrs=0,totalworkingdays=0;
		while( totalemphrs < maxhrprmonth && totalworkingdays <20)
		{
			totalworkingdays++;
			int empCheck= (int)Math.floor(Math.random() *10) % 3;
			totalemphrs+=dailywage(empCheck);
		}
		System.out.println("Employee working days: "+totalworkingdays);
		System.out.println("Employee total working hours: "+totalemphrs);
		System.out.println("Employee Wage per month: "+totalemphrs*emprateprhr);
	}
}