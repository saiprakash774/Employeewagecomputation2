package day4;

public class EmployeewageComputation 
{
	public static final int IS_FULL_TIME=1,IS_PART_TIME=2;
	private final String company;
	private final int emprateprhr;
	private final int numofworkingdays;
	private final int maxhrprmonth;
	private int totalempwage;
	
	public EmployeewageComputation(String company, int emprateprhr,int numofworkingdays,int maxhrprmonth) 
	{
		this.company=company;
		this.emprateprhr=emprateprhr;
		this.numofworkingdays=numofworkingdays;
		this.maxhrprmonth=maxhrprmonth;
	}
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
	public void computeEmpwage( ) 
	{
		int totalemphrs=0,totalworkingdays=0;
		while( totalemphrs < maxhrprmonth && totalworkingdays <numofworkingdays)
		{
			totalworkingdays++;
			int empCheck= (int)Math.floor(Math.random() *10) % 3;
			totalemphrs+=dailywage(empCheck);
			System.out.println("Day: " + totalworkingdays + "  Emp hr "+ totalemphrs );
		}
		totalempwage=totalemphrs*emprateprhr;
	}
	public String toString()
	{
		return "Total Employee wage for Company: " + company + " is:" +totalempwage;
	}
	public static void main(String[] args)
	{
		EmployeewageComputation Trends=new EmployeewageComputation("Trends",20,20,100);
		EmployeewageComputation Twills=new EmployeewageComputation("Twills",20,25,100);
		Trends.computeEmpwage();
		System.out.println(Trends);
		Twills.computeEmpwage();
		System.out.println(Twills);
	}
}