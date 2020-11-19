package day4;

public class EmployeewageComputation 
{
	public static final int IS_FULL_TIME=1,IS_PART_TIME=2;
	private int numofcompany=0;
	private CompanyEmpWage[] companyempwagearray;
	public EmployeewageComputation() 
	{
		companyempwagearray=new CompanyEmpWage[5];
	}
	private void addCompanyEmpWage(String company, int emprateprhr,int numofworkingdays,int maxhrprmonth) 
	{
		companyempwagearray[numofcompany]=new CompanyEmpWage(company,emprateprhr,numofworkingdays,maxhrprmonth);
		numofcompany++;
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
	private void computeEmpwage() 
	{
		for(int index=0;index<numofcompany;index++) 
		{
			companyempwagearray[index].setTotalempwage(this.computeEmpwage(companyempwagearray[index]));
			System.out.println(companyempwagearray[index]);
		}
	}
	private int computeEmpwage(CompanyEmpWage companyempwage ) 
	{
		int totalemphrs=0,totalworkingdays=0;
		while( totalemphrs < companyempwage.maxhrprmonth && totalworkingdays <companyempwage.numofworkingdays)
		{
			totalworkingdays++;
			int empCheck= (int)Math.floor(Math.random() *10) % 3;
			totalemphrs+=dailywage(empCheck);
			System.out.println("Day: " + totalworkingdays + "  Emp hr "+ totalemphrs );
		}
		totalemphrs+=totalemphrs;
		return totalemphrs*companyempwage.emprateprhr;
	}
	
	public static void main(String[] args)
	{
		EmployeewageComputation employeewagecomputation=new EmployeewageComputation();
		employeewagecomputation.addCompanyEmpWage("Trends",20,20,100);
		employeewagecomputation.addCompanyEmpWage("Twills",20,25,100);
		employeewagecomputation.computeEmpwage();
	}
}